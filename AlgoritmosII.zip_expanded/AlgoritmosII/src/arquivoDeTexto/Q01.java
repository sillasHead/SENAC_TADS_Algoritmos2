/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoDeTexto;

import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author sillas.clpinto
 */
public class Q01 {
    public static void main(String[] args) throws Exception{
        FileReader arquivo = new FileReader("Q01.txt");
        BufferedReader leitor = new BufferedReader(arquivo);
            
        String linha;

        while((linha = leitor.readLine()) != null){
            System.out.println(linha);
        }
            
        leitor.close();
    }
}
