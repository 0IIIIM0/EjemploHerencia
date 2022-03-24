import java.util.ArrayList;

public class Mounstruo extends Personaje {
        //tieneCUernos 
        //tieneTentaculos
        // colores
        // habilidades

        //espantar
        //trabajar
        //hacerReir
        
        private boolean tieneCuernos;
        private boolean tieneTentaculos;
        private String color;
        private ArrayList<String> habilidades;
        
        public Mounstruo(String nombre, double estatura, double peso){
            super(nombre,estatura,peso);
        }

        public boolean isTieneCuernos() {
            return tieneCuernos;
        }

        public void setTieneCuernos(boolean tieneCuernos) {
            this.tieneCuernos = tieneCuernos;
        }

        public boolean isTieneTentaculos() {
            return tieneTentaculos;
        }

        public void setTieneTentaculos(boolean tieneTentaculos) {
            this.tieneTentaculos = tieneTentaculos;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public ArrayList<String> getHabilidades() {
            return habilidades;
        }

        public void setHabilidades(ArrayList<String> habilidades) {
            this.habilidades = habilidades;
    
        }

        public void espantar (){
            System.out.println("boooo!!");
        }
        public void trabajar(){
            System.out.println("estoy trabajando");
        }
        public void hacerReir(){
            System.out.println("JAJAJA");

        }

        public Mounstruo(String nombre, double estatura, double peso, boolean tieneCuernos, boolean tieneTentaculos, String color, ArrayList<String> habilidades) {
            super(nombre, estatura, peso);
            this.tieneCuernos = tieneCuernos;
            this.tieneTentaculos = tieneTentaculos;
            this.color = color;
            this.habilidades = habilidades;
            System.out.println("Soy el constructor mounstruo");
        }
    }
    
    

