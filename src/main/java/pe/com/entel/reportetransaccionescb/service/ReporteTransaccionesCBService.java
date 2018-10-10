package pe.com.entel.reportetransaccionescb.service;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pe.com.entel.reportetransaccionescb.domain.TransaccionCB;
import pe.com.entel.reportetransaccionescb.repository.TransaccionCBRepository;
import pe.com.entel.reportetransaccionescb.util.Constantes;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ReporteTransaccionesCBService {

    public static Logger logger = Logger.getLogger(ReporteTransaccionesCBService.class);

    @Autowired
    private TransaccionCBRepository transaccionCBRepository;

    @Value("${reporteTrxCB.dir.tmp}")
    private String dirTmp;

    public void generarReporteTrxCB() throws IOException {

        String rutaReporte = dirTmp + Constantes.ARCHIVO_REP_TRX_CB;
        File archivoReporte = new File(rutaReporte);
        /*
        //Obtiene las ordenes del dia anterior
        List<TransaccionCB> transaccionCBList = transaccionCBRepository.obtenerTrxCBMes();
        logger.info("generarReporteTrxCB cantidad de registros " + transaccionCBList.size());

        //Construye cadena con el contenido del archivo
        escribirRepTrxCBCsv(transaccionCBList, archivoReporte);
        */
    }

    private void escribirRepTrxCBCsv(List<TransaccionCB> transaccionCBList,File archivoReporte) throws IOException {
        //Se prepara Csv
        StringBuilder sbContenido = new StringBuilder();
        if(transaccionCBList.size()>0){
            sbContenido.append("COD_TRANSACCION"+ Constantes.SEPARADOR);
            sbContenido.append("TIPO_COBRO"+ Constantes.SEPARADOR);
            sbContenido.append("ID_OPERACION"+ Constantes.SEPARADOR);
            sbContenido.append("NOMBRE"+ Constantes.SEPARADOR);
            sbContenido.append("MSISDN"+ Constantes.SEPARADOR);
            sbContenido.append("ESTADO"+ Constantes.SEPARADOR);
            sbContenido.append("APLICACION"+ Constantes.SEPARADOR);
            sbContenido.append("TIPO_CONTENIDO"+ Constantes.SEPARADOR);
            sbContenido.append("MONEDA"+ Constantes.SEPARADOR);
            sbContenido.append("VALOR"+ Constantes.SEPARADOR);
            sbContenido.append("PRODUCTO"+ Constantes.SEPARADOR);
            sbContenido.append("OCC_ID"+ Constantes.SEPARADOR);
            sbContenido.append("VENCIMIENTO"+ Constantes.SEPARADOR);
            sbContenido.append("CREADO_POR"+ Constantes.SEPARADOR);
            sbContenido.append("CREACION"+ Constantes.SEPARADOR);
            sbContenido.append("MODIFICADO_POR"+ Constantes.SEPARADOR);
            sbContenido.append("MODIFICACION"+ Constantes.SEPARADOR);
            sbContenido.append("OCC_ID_DEVUELTO");
            sbContenido.append("\n");
            for(int i=0;i< transaccionCBList.size();i++){
                sbContenido.append(transaccionCBList.get(i).getCodTransaccion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getCodTransaccion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getTipoCobro()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getIdOperacion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getNombre()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getMsisdn()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getEstado()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getAplicacion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getTipoContenido()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getMoneda()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getValor()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getProducto()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getOccId()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getFecVencimiento()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getCreadoPor()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getFecCreacion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getModificadoPor()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getFecModificacion()+Constantes.SEPARADOR);
                sbContenido.append(transaccionCBList.get(i).getOccIdDevuelto());
                if(i<transaccionCBList.size()-1){
                    sbContenido.append("\n");
                }
            }
            FileUtils.writeStringToFile(archivoReporte, sbContenido.toString(), Constantes.ENCODING_UTF_8);
            logger.info("Se genero reporte de Transacciones Carrier Billing");
        }else{
            logger.info("No se genera reporte de Transacciones Carrier Billing porque no hay datos");
        }

    }
}
