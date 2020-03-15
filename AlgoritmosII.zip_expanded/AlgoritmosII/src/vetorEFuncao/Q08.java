package vetorEFuncao;

public class Q08 {
    public static void main(String[] args) {
		int[] v = {5, 10, 3, 2, 4, 7, 9, 8, 5};
    	
    	System.out.println(comprimentoSegmento(v));
    }
    
    public static int comprimentoSegmento(int[] v) {
    	int comprimento = 0, aux = 1;
    	
    	for(int i = 1; i < v.length; i++) {
    		if(v[i] > v[i - 1]) {
    			aux++;
    		} else {
    			aux = 1;
    		}
    		
    		if(aux > comprimento) {
    			comprimento = aux;
    		}
    	}
    	
    	return comprimento;
    }
}
