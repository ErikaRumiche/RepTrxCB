package pe.com.entel.reportetransaccionescb.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Value("${carbill.schema}")
    private String carbillSchema;

    @Value("${carrierbilling.package}")
    private String carrierbillingPackage;

    @Value("${reptrxcommit.sp}")
    private String reptrxcommitSp;

    public String getCarbillSchema() {
        return carbillSchema;
    }

    public void setCarbillSchema(String carbillSchema) {
        this.carbillSchema = carbillSchema;
    }

    public String getCarrierbillingPackage() {
        return carrierbillingPackage;
    }

    public void setCarrierbillingPackage(String carrierbillingPackage) {
        this.carrierbillingPackage = carrierbillingPackage;
    }

    public String getReptrxcommitSp() {
        return reptrxcommitSp;
    }

    public void setReptrxcommitSp(String reptrxcommitSp) {
        this.reptrxcommitSp = reptrxcommitSp;
    }
}
