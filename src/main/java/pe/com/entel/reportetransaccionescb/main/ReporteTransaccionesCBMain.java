package pe.com.entel.reportetransaccionescb.main;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pe.com.entel.reportetransaccionescb.service.ReporteTransaccionesCBService;

@Component
public class ReporteTransaccionesCBMain {

    @Autowired
    private ReporteTransaccionesCBService reporteTransaccionesCBService;

    static Logger logger = Logger.getLogger(ReporteTransaccionesCBMain.class);

    public static void main(String[] args) {

        logger.info("Inicio ReporteTransaccionesCBMain");
        ClassPathXmlApplicationContext ctx = null;
        try {
            ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            ctx.registerShutdownHook();

            ReporteTransaccionesCBMain main = ctx.getBean(ReporteTransaccionesCBMain.class);
            main.inicio();

        } catch (Exception e) {
            logger.error(e);
        } finally {
            if (ctx != null) {
                ctx.close();
            }
        }
        logger.info("Fin ReporteTransaccionesCBMain");
    }

    public void inicio() throws Exception {
        reporteTransaccionesCBService.generarReporteTrxCB();

    }
}
