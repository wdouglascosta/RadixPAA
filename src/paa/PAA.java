/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paa;

import Utilitarios.AppValues;
import Utilitarios.ArvoreBusca;

import java.util.*;


/**
 * @author andre
 */
public class PAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        paa.Radix radix = new paa.Radix();
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Número máximo de digitos:");
//        int d = leitor.nextInt();
//        System.out.println("Tamanho do vetor:");
//        Integer[] A = new Integer[leitor.nextInt()];
//
//        for(int i=0;i<A.length;i++){
//            System.out.println("Posicao "+i +": " );
//            A[i] = leitor.nextInt();
//        }
        System.out.println("---- RADIX ----");
        Integer[] entrada = AppValues.getVetor(); // pega o vetor passado na função
        int a = ArvoreBusca.buscaMaior(entrada);

        System.out.println("o maior número do vetor: " + a);

        String as = String.valueOf(a); // essa variável é só pra saber quantos digitos tem o maior elemento

        Integer[] ordenado = paa.Radix.sortRadix(entrada, as.length());
        String print = "";
        for (int i = 0; i < ordenado.length; i++) {
            print = print + " " + ordenado[i];
        }
        System.out.println("*** FINAL ***");
        System.out.println("Vetor ordenado: " + print);
//        leitor.close();
    }

}
