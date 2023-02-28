/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1ejercicionumero1;

import java.util.Scanner;

public class Actividad1EjercicioNumero1 {

    public static void main(String[] args) {
      int EdAlberto,EdAna,EdMama;
      Scanner leer = new Scanner(System.in);
      System.out.println("Escriba la edad de juan");
      int EdJuan = leer.nextInt();
      EdAlberto = 2*EdJuan/3;
      EdAna = 4*EdJuan/3;
      EdMama = EdAlberto + EdAna + EdJuan;
      System.out.println("la edad de Juan es: "+EdJuan);
      System.out.println("la edad de Alberto es: "+EdAlberto);
      System.out.println("la edad de Ana es: "+EdAna);
      System.out.println("la edad de la mama es: "+EdMama);
    }
}
