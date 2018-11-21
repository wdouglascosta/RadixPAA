# Radix - PAA
## *William Douglas - RA 89239*
## *André Luan - RA 90857*

## **Função de Recorrência** 
O algoritmo para a busca do maior elemento utiliza o paradigma "Dividir para Conquistar"
a função **buscaMaior()** recebe um vetor *vet* de n elementos, caso o número de elementos de n seja menor que 2, temos que o vetor *vet[0]* contém o maior elemento do vetor;
```
n = 1 : T(n) = θ(1)
```


Caso contrário, dividimos o vetor por 2 e obtemos um índice médio, a partir daí verificamos o maior valor entre os possíveis subvetores nas posições:
**vet[indice - 1]** e **vet[indice]** Segue o algoritmo abaixo:
```java
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
```




Sabendo qual a parcela possui o maior valor, precisamos obter o subvetor de interesse, chamando a função **getSubVet()**. Ela recebe como parâmetro a metade do vetor inicial, e considerando que seu tempo de execução é linear, podemos considerar getSubVet como: 

```
T(n) : θ(n) 
```
Agora, este subvetor de interesse, pode ser passado como parâmetro recursivamente para a função *buscaMaior()*

```
n > 1 : T(n) = T(n/2) + θ(n)
```

Temos então que:

```
T(n) = | θ(1) para n = 1,
       | T(n/2) + θ(n) para n > 1
``` 

## Árvore de Recursão 

```
        n      n/2⁰     
        |               
       n/2     n/2¹        
        |
       n/4     n/2²       
        .
        .
        .
        1     n/2^î
```
Verificamos que o custo por nível é:
```
n/2^i 
```
Sabendo o custo no último nível é 1, podemos calcular a altura da árvore:

```
n/2^i = 1 -> 2^i = n -> i = Log n
```

O custo de cada nível é o mesmo que a quantidade de níveis,
logo, podemos afirmar que o algorítmo é 

``` T(n) = (Log n)² -> O(Log n) ```

## Ordenação


Para ordenar o vetor, foi utilizado o Radix, implementado com o algoritmo de contagem, que como visto nas aulas, é da ordem de complexidade O(n).