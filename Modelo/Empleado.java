public class Empleado extends Persona {

    private int CodigoTrabajo;
    private String LugarTrabajo;
    public Empleado(String nombrel, int edad, double altura, int codigoTrabajo, String lugarTrabajo) {
        super(nombrel, edad, altura);
        CodigoTrabajo = codigoTrabajo;
        LugarTrabajo = lugarTrabajo;
    }
    public int getCodigoTrabajo() {
        return CodigoTrabajo;
    }
    public void setCodigoTrabajo(int codigoTrabajo) {
        CodigoTrabajo = codigoTrabajo;
    }
    public String getLugarTrabajo() {
        return LugarTrabajo;
    }
    public void setLugarTrabajo(String lugarTrabajo) {
        LugarTrabajo = lugarTrabajo;
    }

    
}
