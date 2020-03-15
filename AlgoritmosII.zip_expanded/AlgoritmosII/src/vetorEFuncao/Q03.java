package vetorEFuncao;

public class Q03 {
    public static void main(String[] args){
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        
        System.out.println(uniao(a, b));
    }
    
    public static String uniao(int[] a, int[] b){
        String resposta = "";
        
        for (int i : a) {
            resposta += i + " ";
        }
        
        for(int i : b){
            boolean encontrei = false;
            for(int j : a){
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
