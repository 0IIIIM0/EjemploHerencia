public class Personaje { //clase padre quien hereda
    //Atributos
    // nombre
    // estatura
    //peso
    //Metodos
    //comer dormir pensar

    protected String nombre;
    protected double estatura;
    protected double peso;


    public void comer(){
        System.out.println("comiendo");
    }

    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void pensar(){
        System.out.println("Pensando");
    }


    public Personaje(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        System.out.println("este es el constructor padre");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
