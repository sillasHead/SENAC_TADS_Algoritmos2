package vetorEFuncao;

public class Q05 {
	public static void main(String[] args) {
		int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i : parImpar(v)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] parImpar(int[] v) {
		int aux = 0;
		
		for (int i = 0; i < v.length; i++) {
			for (int j = i; j < v.length; j++) {
				if(v[j]%2 == 0) {
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
					break;
				}
			}
		}
		
		return v;
	}
}
