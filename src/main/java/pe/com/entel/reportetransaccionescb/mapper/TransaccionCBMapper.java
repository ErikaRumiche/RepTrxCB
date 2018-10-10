package pe.com.entel.reportetransaccionescb.mapper;

import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.apache.log4j.Logger;
import org.springframework.data.jdbc.support.oracle.StructMapper;
import pe.com.entel.reportetransaccionescb.domain.TransaccionCB;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class TransaccionCBMapper implements RowMapper  {

    private static Logger logger = Logger.getLogger(TransaccionCBMapper.class);

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {

        TransaccionCB transaccionCB = new TransaccionCB();
        transaccionCB.setCodTransaccion(rs.getLong("codTransaccion"));
        transaccionCB.setTipoCobro(rs.getString("tipoCobro"));
        transaccionCB.setIdOperacion(rs.getString("idOperacion"));
        transaccionCB.setNombre(rs.getString("nombre"));
        transaccionCB.setMsisdn(rs.getString("msisdn"));
        transaccionCB.setEstado(rs.getString("estado"));
        transaccionCB.setAplicacion(rs.getString("aplicacion"));
        transaccionCB.setTipoContenido(rs.getString("tipoContenido"));
        transaccionCB.setMoneda(rs.getString("moneda"));
        transaccionCB.setValor(rs.getDouble("valor"));
        transaccionCB.setProducto(rs.getString("producto"));
        transaccionCB.setOccId(rs.getLong("occId"));
        transaccionCB.setFecVencimiento(rs.getString("fecVencimiento"));
        transaccionCB.setCreadoPor(rs.getString("creadoPor"));
        transaccionCB.setFecCreacion(rs.getString("fecCreacion"));
        transaccionCB.setModificadoPor(rs.getString("modificadoPor"));
        transaccionCB.setFecModificacion(rs.getString("fecModificacion"));
        transaccionCB.setOccIdDevuelto(rs.getLong("occIdDevuelto"));

        return transaccionCB;
    }
}
