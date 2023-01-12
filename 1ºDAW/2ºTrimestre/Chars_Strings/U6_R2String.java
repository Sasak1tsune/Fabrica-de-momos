import java.util.Scanner;

public class U6_R2String{
    public static void main(String[]args) {
    //Defino variables

    Scanner entrada = new Scanner(System.in);
    byte seleccionMenu;
    boolean salirMenu=false;

    //Programa principal
    do{
        mostrarMenu();
        seleccionMenu= entrada.nextByte();
        switch(seleccionMenu){
            case 1:
                String frase1 = entrada.next();
                String frase2 = entrada.next();
                compararStrings(frase1, frase2);
                break;
            case 2:
                String contado = entrada.next();
                contarEspacios(contado);
                break;
            case 3:
                break;
            case 0:
                System.out.println("Seguro que quiere salir?\n(s/n)");
                char salida = entrada.next().charAt(0);
                confirmarSalida(salida);
                break;

            default:
                break;         
        }               
    }while(salirMenu==true);
    }
public static void mostrarMenu() {
    System.out.println("____________________________________________\n* Bienvenido pibe, selecciona algúna opción*\n*                                          *\n*    Opción 1: Comparación de carácteres   *\n*    Opción 2: ____________________________*\n*    Opción 3: ____________________________*\n*__________________________________________*");
}
public static boolean confirmarSalida(char x){
    Character.toLowerCase(x);
    if(x=='s'){
        return true;
    }else{
        return false;
    }
}
public static void contarEspacios(String contado){
    int tamaño = contado.length();
    int i = 0;
    int espacios = 0;
    while(tamaño!=i){ 
        char letra = contado.charAt(i);
        boolean esEspacio=Character.isWhitespace(letra);
        if(esEspacio==true){
        espacios++;
        }
        i++;
    }System.out.println(espacios);
} 
public static void compararStrings(String string1, String string2){
    int frase1 = string1.length();
    int frase2 = string2.length();
    if(frase1 > frase2){
        System.out.println("La frase:\n"+string1+"\nes más grande que\n"+string2);
    }else if(frase1==frase2){
        System.out.println("Las dos frases tienen la misma cantidad de carácteres");
    }else{
        System.out.println("La frase:\n"+string2+"\nes más grande que\n"+string1);
    }
}

}
