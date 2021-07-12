package GitHub_Prueba;
import java.util.Scanner;
import java.io.IOException;


public class Ejercicios {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in); 
        System.out.println("Por favor ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fn = sc.nextLine();
        String[] fn1 = fn.split("/");           //Se divide la fecha en tres partes: dias, mes y año.
        int dia = Integer.parseInt(fn1[0]);
        int mes = Integer.parseInt(fn1[1]);     //Transforma en enteros las 3 cadenas resultantes.
        int año = Integer.parseInt(fn1[2]);
        var sum = dia + mes + año;              //Se suman los 3 números.
        
        var res = 0;
        while(sum > 0){
            res = res + sum % 10;               //A través de la operación módulo se separan y suman suman los numeros.
            sum /= 10;
        }
        System.out.println("Su número de la suerte es: " + res);
    }

    
}
