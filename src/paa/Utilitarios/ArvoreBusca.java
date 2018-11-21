package Utilitarios;

public class ArvoreBusca {

    public static Integer buscaMaior(Integer[] vet) {
        if (vet.length == 1) {
            return vet[0];
        } else {
            int index = vet.length / 2;
            Integer[] subvet1 = getSubVet(0, index, vet);
            Integer[] subvet2 = getSubVet(index, vet.length, vet);

            return buscaMaior(getVetorPrincipal(subvet1, subvet2));
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

    private static Integer[] getVetorPrincipal(Integer[] vet1, Integer[] vet2) {
        int indiceVet1 = 0;

        if (vet1.length > 1) {
            indiceVet1 = vet1.length - 1;
        }

        if (vet1[indiceVet1] < vet2[0]) {
            return vet2;
        } else {
            return vet1;
        }
    }
}



