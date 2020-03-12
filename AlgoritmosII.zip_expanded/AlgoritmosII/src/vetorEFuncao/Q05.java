package vetorEFuncao;

public class Q05 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i : parImpar(a)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] parImpar(int[] a) {
		int aux = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[j]%2 == 0) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
					break;
				}
			}
		}
		
		return a;
	}
}
