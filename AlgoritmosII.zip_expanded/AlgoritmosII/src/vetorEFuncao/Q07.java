package vetorEFuncao;

public class Q07 {
	public static void main(String[] args) {
		int[] v = {3, 3, -1, -1, -1, 12, 12, 12, 3, 3};
				
		System.out.println(qtdSubsequencia(v));
	}
	
	public static int qtdSubsequencia(int[] v) {
		int contador = 0;
		
		if(v.length > 0) {
			contador++;
			for (int i = 1; i < v.length; i++) {
				if(v[i] != v[i - 1]) {
					contador++;
				}
			}
		}
		
		return contador;
	}
}
