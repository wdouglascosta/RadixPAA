/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paa;

/**
 * @author andre
 */
public class Counting {


    public Integer[] sortCounting(Integer[] P, Integer[] A) {
        System.out.println("--- COUNTING ---");
        //k é o mior valor do vetor A
        int k = 0;
        for (int i = 0; i < P.length; i++) {
            if (P[i] > k) {
                k = P[i];
            }
        }

        System.out.println("O maior número do vetor é: " + k);

        //Criar vetor auxiliar com k+1 elementos e inicializa com zeros
        int[] C = new int[k + 1];
        for (int i = 0; i < k; i++) {
            C[i] = 0;
        }

        //o array C na possição do número possui a quantidade de elementos iguais ao número
        for (int i = 0; i < P.length; i++) {
            C[P[i]] = C[P[i]] + 1;
        }
        //Agora C[i] contem o numero de elementos igual a i.

        for (int i = 0; i < C.length; i++) {
            System.out.println("O valor " + i + " contem " + C[i] + " elementos iguais");
        }

        for (int i = 1; i <= k; i++) {
            C[i] = C[i] + C[i - 1];
        }
        //Agora C[i] contem o numero de elementos menor que ou igual a i.

        for (int i = 0; i < C.length; i++) {
            System.out.println("O valor " + i + " contém " + C[i] + " elementos menor ou iguais");
        }

        Integer[] B = new Integer[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.println("O valor " + A[i] + " vai para a posição " + (C[P[i]] - 1));
            B[C[P[i]] - 1] = A[i];
            C[P[i]] = C[P[i]] - 1;
        }

        return B;
    }

}
