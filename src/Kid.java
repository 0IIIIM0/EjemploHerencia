public class Kid  extends Personaje {
    // colorPuerta
    private String colorPuerta;

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    //reir
    //llorar
    public void reir(){
        System.out.println("JAJA");
    }
    public void llorar(){
        System.out.println("cuñaa cuñaaa");
    }

    public Kid(String nombre, double estatura, double peso, String colorPuerta) {
        super(nombre, estatura, peso);
        this.colorPuerta = colorPuerta;
        System.out.println("estoy en constructor de niño");
    }
}
