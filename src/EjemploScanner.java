

public class EjemploScanner{
    
    public static void  main (String args[]) {
        String numeros = "1,2,3,4,5,6";
        int numerosenteros[] = new int[10];
        String[] numerosComoArray = numeros.split(",");
        for (int i = 0; i < numerosComoArray.length; i++) {
            numerosenteros[i]=Integer.parseInt(numerosComoArray[i]);
            System.out.print(numerosenteros[i]);
        }
    }
}
