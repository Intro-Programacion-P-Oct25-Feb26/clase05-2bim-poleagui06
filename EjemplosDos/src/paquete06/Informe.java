/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Pole
 */
public class Informe {
    public static void imprimir(String n,String a,String c,String nE,String dE,
            double [] notas, double promedio) {
        String cadena = "";
        cadena = String.format("%sLos datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la Empresa: %s\n"
                + "Dirección de la Empresa: %s\n"
                + "Notas: %s\n",
                cadena,
                n,
                a,
                c,
                nE,
                dE,
                notas);
        for (int i = 0; i < notas.length; i++) {
            cadena = String.format("%s %.2f ",cadena , notas[i]);
        }
        cadena = String.format("%s\nPromedio: %.2f\n", cadena, promedio);
        System.out.printf(cadena);
        
    }
    
}
