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
public class Q02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4};
        
        System.out.println(diferenca(a, b));
    }
    
    public static String diferenca(int[] a, int[] b){
        String resposta = "";
        
        for(int i : a){
            boolean encontrei = false;
            for(int j : b){
                if(i == j){
                    encontrei = true;
                }
            }
            if(!encontrei){
                resposta += i + " ";
            }
        }
        
        return resposta;
    }
}
