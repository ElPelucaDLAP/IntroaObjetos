public class Main {
    public static void main (String[] args){

        Persona perso = new Persona();

        System.out.println("El nombre de la persona es "+perso.getNombre());

        Persona perso2 = new Persona("Juan","Gutierrez","10/05/1990",35,38934567);
        System.out.println("El nombre de la persona es "+perso2.getNombre());
        Persona perso3 = new Persona("Miguel","Diaz","10/05/1990",35,38934567);
        System.out.println("El nombre de la persona es "+perso3.getNombre());
        perso.setNombre("Jose");
        System.out.println("--------------------------------------------");
        System.out.println("El nombre de la persona es "+perso.getNombre());
        System.out.println("El nombre de la persona es "+perso2.getNombre());
        System.out.println("El nombre de la persona es "+perso3.getNombre());
        System.out.println(perso2.toString());

        System.out.println("ses");
        System.out.println("ses");
        System.out.println("ses");
        





    }
}
