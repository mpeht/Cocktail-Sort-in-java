/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class CocktailSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite o tamanho do vetor:");
        num = sc.nextInt();
        int vetor[] = new int[num];
        System.out.print("Digite os valores do vetor: ");
        for(int i = 0; i < num; i++)  {
        vetor[i] = sc.nextInt();
        }
            CocktailSort(vetor);
    
    }

    public static void CocktailSort(int vet[]) {

        boolean swapped;
        int i;
        do {
            swapped = false;
            for (i = 0; i < vet.length - 2; i++) {

                if (vet[i] > vet[i + 1]) {
                    swap(vet, i, i + 1);
                    swapped = true;
                }
            }
            if (swapped = false) {
                break;
            }
            swapped = false;
            for (i = vet.length - 2; i >= 0; i--) {
                if (vet[i] > vet[i + 1]) {
                    swap(vet, i, i + 1);
                    swapped = true;
                }

            }
            System.out.print(Arrays.toString(vet) + " - ");

        } while (swapped);

    }

    public static void swap(int vet[], int i, int j) {

        int aux;
        aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
        //return vet;

    }

}
