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
public class practica2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        Pattern correo=Pattern.compile("^[A-Za-z0-9+._-]+@[a-z+._-]+$");
        int intentos=1;
        String email, contra;
        Matcher matchercorreo;
        while(intentos<=5){
            System.out.println("Ingrese el correo: ");
            email=lector.nextLine();
            System.out.println("Ingrese la clave: ");
            contra=lector.nextLine();
            matchercorreo= correo.matcher(email);
            if (matchercorreo.matches() && contra.equals("123456")){
                System.out.println("Bienvenido Al Sistema");
                break;
            }else{
                System.out.println("Acceso denegado");
                intentos++;
            }

            if (intentos>5){
                System.out.println("Cuenta suspendida");
                
            }
            
        }
        
        
        
        
    }
    
}
