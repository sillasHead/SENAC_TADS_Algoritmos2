package vetorEFuncao;

public class Q01 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4};
        
        System.out.println(interseccao(a, b));
    }
    
    public static String interseccao(int[] a, int[] b){
        String resposta = "";
        
        for(int i : a){
            for(int j : b){
                if(i == j){
                    resposta += i + " ";
                }
            }
        }
        
        return resposta;
    }
}
