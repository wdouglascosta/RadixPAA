package Utilitarios;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

public class AppValues {
    public static Integer[] getVetor() {
        String[] vet;
        String linha = "1,3,8,12,14,18,27,58,90,135,125,114,99,85,77,69,50,44,32,24,20,19,15,11,2";
        vet = linha.split(",");
        int i = 0;
        Integer[] vetor = new Integer[vet.length];
        for (String s : vet) {
            vetor[i] = Integer.parseInt(s);
            i++;
        }
        return vetor;
    }


}
