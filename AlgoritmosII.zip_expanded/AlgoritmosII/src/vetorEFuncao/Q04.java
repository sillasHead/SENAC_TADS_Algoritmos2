package vetorEFuncao;

public class Q04 {
    public static void main(String[] args){
		int[] a = {1, 3, 5, 6};
		int[] b = {2, 4, 7};
		
		for (int i : intercalacao(a, b)) {
			System.out.print(i + " ");
		}
    }
    
    public static int[] intercalacao(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        
        for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
        
        for (int i = 0; i < b.length; i++) {
        	c[i + a.length] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
        	int aux = c[i];
        	for (int j = i; j < c.length; j++) {
				if(aux > c[j]) {
					aux = c[j];
					c[j] = c[i];
					c[i] = aux;
				}
			}
		}
        
        return c;
    }
}
