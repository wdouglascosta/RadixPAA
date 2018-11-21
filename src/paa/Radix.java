/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paa;

/**
 * @author andre
 */
public class Radix {
    public static Integer[] Parametro;

    public static paa.Counting counting = new paa.Counting();


    public static Integer[] sortRadix(Integer[] A, int d) {
        Parametro = new Integer[A.length];


        for (int i = (d); i >= 0; i--) {
            for (int j = 0; j < A.length; j++) {
                String valor = insereZeroAEsquerda(A[j], d);
                Parametro[j] = Integer.parseInt(Character.toString(valor.charAt(i)));
//                System.out.println("Digito da coluna " + i + 1 + " : " + Parametro[j]);
            }
            A = counting.sortCounting(Parametro, A);
        }
        return A;
    }

    private static String insereZeroAEsquerda(Integer valor, int d) {
        String retorno = valor.toString();
        for (int i = valor.toString().length(); i <= d; i++) {
            retorno = "0" + retorno;
        }
        return retorno;
    }
}
