package pe.com.entel.reportetransaccionescb.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class ReporteTransaccionesCBServiceTest {

    Logger logger = Logger.getLogger(ReporteTransaccionesCBServiceTest.class);

    @Autowired
    private ReporteTransaccionesCBService reporteTransaccionesCBService;

    @Test
    public void mainTest() throws Exception {
        reporteTransaccionesCBService.generarReporteTrxCB();
    }
}
