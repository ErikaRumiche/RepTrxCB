package pe.com.entel.reportetransaccionescb.repository;

import oracle.jdbc.OracleTypes;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import pe.com.entel.reportetransaccionescb.domain.TransaccionCB;
import pe.com.entel.reportetransaccionescb.exception.RepositoryException;
import pe.com.entel.reportetransaccionescb.mapper.TransaccionCBMapper;
import pe.com.entel.reportetransaccionescb.util.Configuration;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class TransaccionCBRepository {

    private Logger logger = Logger.getLogger(TransaccionCBRepository.class);

    @Autowired
    private DataSource dataSourcePCarBill;

    @Autowired
    private Configuration configuration;


    public List<TransaccionCB> obtenerTrxCBMes() throws RepositoryException {

        List<TransaccionCB> trxList = null;

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSourcePCarBill);
        jdbcCall.withSchemaName(configuration.getCarbillSchema());
        jdbcCall.withCatalogName(configuration.getCarrierbillingPackage());
        jdbcCall.withProcedureName(configuration.getReptrxcommitSp());

        jdbcCall.addDeclaredParameter(new SqlOutParameter("AC_TRANSACCIONES_LST", OracleTypes.CURSOR, new TransaccionCBMapper()));
        jdbcCall.addDeclaredParameter(new SqlOutParameter("AVCH_MESSAGE", OracleTypes.VARCHAR));

        Map<String,Object> result=  jdbcCall.execute();
        String message= (String)result.get("AVCH_MESSAGE");

        if (message!=null){
            throw new RepositoryException(message);
        }

        trxList = (List<TransaccionCB>) result.get("AC_TRANSACCIONES_LST");

        if (trxList == null || trxList.isEmpty()) {
            throw new RepositoryException("No se encontraron transacciones carrier billing para el mes actual");
        }
        return trxList;
    }
}
