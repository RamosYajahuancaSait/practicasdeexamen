/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author ASUS TUF GAMING
 */
public class ejercicio3 {
    public static void main(String [] args){
        Scanner lector=new Scanner(System.in);
        Pattern usuario=Pattern.compile("^[A-Za-z0-9+.-_]+$");
        Pattern contra=Pattern.compile("^[quiero keke]+$");
        String correo, clave;
        int pruebas=0;
        Matcher matcherusuario;
        Matcher matchercontra;
        while(pruebas<5){
            System.out.println("Ingrese su nombre de ususario: ");
            correo=lector.nextLine();
            System.out.println("Ingrese su contraseña: ");
            clave=lector.nextLine();
            matcherusuario=usuario.matcher(correo);
            matchercontra=contra.matcher(clave);
            if (matcherusuario.matches()&& matchercontra.matches()){
                System.out.println("Welcome to the world");
                break;
                
                
            }else{
                System.out.println("Usuario o Clave incorrecta");
                pruebas++;
            }
            if (pruebas>=5){
                System.out.println("Cuenta suspendida");
            }
        }
        
    }
    
}
