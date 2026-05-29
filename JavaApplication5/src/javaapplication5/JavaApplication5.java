/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ASUS TUF GAMING
 */
public class JavaApplication5 {
    public static void main(String[] args) {
        String [] producto = { "lapiz", "lapicero", "borrador", "corrector" };
        int []  cantidad = {12, 30, 40, 50};
        double [] precio = {1.5, 1.0, 1.6, 4.0};
        
        double totalgeneral = 0;
        
        StringBuilder linea= new StringBuilder();
        
        linea.append("############################################\n");
        linea.append(String.format("%-14s %-10s %-10s %-10s\n", "Nombre", "Cantidad", "Precio", "Total"));
        linea.append("############################################\n");
        
        for(int i=0; i<producto.length;i++){
            double total= cantidad[i]*precio[i];
            totalgeneral+=total;
            linea.append(String.format("%-14s %-10d %-10.1f %-10.1f\n", producto[i], cantidad[i], precio[i],total));
        }
        linea.append("############################################\n");
        linea.append(String.format("Total General:                       %.1f\n",totalgeneral));
        linea.append("############################################\n");
        System.out.println(linea);
    }
    
}
