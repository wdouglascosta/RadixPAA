package Utilitarios;

public class ArvoreBusca {

    public static Integer buscaMaior(Integer[] vet) {
        if (vet.length < 2) {
            return vet[0];
        } else {
            int index = vet.length / 2;
            Integer[] subvet;
            if (vet[index - 1] < vet[index]) {
                subvet = getSubVet(index, vet.length, vet);
            } else {
                subvet = getSubVet(0, index, vet);
            }
            return buscaMaior(subvet);
        }
    }

    private static Integer[] getSubVet(int inicio, int fim, Integer[] vet) {
        Integer[] subVet = new Integer[fim - inicio];
        int j = 0;
        for (int i = inicio; i < fim; i++) {
            subVet[j] = vet[i];
            j++;
        }
        return subVet;
    }

//    private static Integer[] getVetorPrincipal(Integer[] vet1, Integer[] vet2) {
//        int indiceVet1 = 0;
//
//        if (vet1.length > 1) {
//            indiceVet1 = vet1.length - 1;
//        }
//
//        if (vet1[indiceVet1] < vet2[0]) {
//            return vet2;
//        } else {
//            return vet1;
//        }
//    }
}



