package pe.com.entel.reportetransaccionescb.domain;

public class TransaccionCB {

    private Long codTransaccion;
    private String tipoCobro;
    private String idOperacion;
    private String nombre;
    private String msisdn;
    private String estado;
    private String aplicacion;
    private String tipoContenido;
    private String moneda;
    private Double valor;
    private String producto;
    private Long occId;
    private String fecVencimiento;
    private String creadoPor;
    private String fecCreacion;
    private String modificadoPor;
    private String fecModificacion;
    private Long occIdDevuelto;

    public TransaccionCB() {
    }

    public Long getCodTransaccion() {
        return codTransaccion;
    }

    public void setCodTransaccion(Long codTransaccion) {
        this.codTransaccion = codTransaccion;
    }

    public String getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(String tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public String getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(String idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Long getOccId() {
        return occId;
    }

    public void setOccId(Long occId) {
        this.occId = occId;
    }

    public String getFecVencimiento() {
        return fecVencimiento;
    }

    public void setFecVencimiento(String fecVencimiento) {
        this.fecVencimiento = fecVencimiento;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public String getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(String fecModificacion) {
        this.fecModificacion = fecModificacion;
    }

    public Long getOccIdDevuelto() {
        return occIdDevuelto;
    }

    public void setOccIdDevuelto(Long occIdDevuelto) {
        this.occIdDevuelto = occIdDevuelto;
    }

    @Override
    public String toString() {
        return "TransaccionCB{" +
                "codTransaccion=" + codTransaccion +
                ", tipoCobro='" + tipoCobro + '\'' +
                ", idOperacion='" + idOperacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", estado='" + estado + '\'' +
                ", aplicacion='" + aplicacion + '\'' +
                ", tipoContenido='" + tipoContenido + '\'' +
                ", moneda='" + moneda + '\'' +
                ", valor=" + valor +
                ", producto='" + producto + '\'' +
                ", occId=" + occId +
                ", fecVencimiento='" + fecVencimiento + '\'' +
                ", creadoPor='" + creadoPor + '\'' +
                ", fecCreacion='" + fecCreacion + '\'' +
                ", modificadoPor='" + modificadoPor + '\'' +
                ", fecModificacion='" + fecModificacion + '\'' +
                ", occIdDevuelto=" + occIdDevuelto +
                '}';
    }
}
