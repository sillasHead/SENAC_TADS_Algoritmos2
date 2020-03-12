/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorEFuncao;

/**
 *
 * @author sillas.clpinto
 */
public class Q04 {
    public static void main(String[] args){
    	 int[] a = {7, 2, 5, 8, 4};
         int[] b = {4, 2, 9, 5};
         
         for (int i : intercalacao(a, b)) {
			System.out.print(i + " ");
		}
    }
    
    public static int[] intercalacao(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int aux, indice = 0;
        for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
        
        for (int i = 0; i < b.length; i++) {
        	c[i + a.length] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
        	aux = c[i];
        	for (int j = i; j < c.length; j++) {
        		if(aux > c[j]) {
        			aux = c[j];
        			indice = j;
        		}
        	}
        	c[indice] = c[i];
        	c[i] = aux;
		}
        
        return c;
    }
}
