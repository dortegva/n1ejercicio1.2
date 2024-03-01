public class Cotxe {

    private static String model;
    private final int potencia;
    private static final String marca="OPEL";

    public Cotxe (String marca, String model, int potencia){

        this.model=model;
        this.potencia=potencia;
    }
     public static String frenar()  {
        return "El vehicle està frenant";
    }
    public String accelerant(){
        return "El vehicle està accelerant";
    }
}
