package vetorEFuncao;

public class Q06 {
	public static void main(String[] args) {
int[] a = {4, 1, 3, 7, 2, 5};
		
		for (int i : rearranjo(a)) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] rearranjo(int[] a) {
//		int aux = a[0], indice = 0;
		String[] aux;
		String item = String.valueOf(a[0]);
		
//		for (int i = 1; i < a.length; i++) {
//			for (int j = i; j < a.length; j++) {
//				if(a[j] <= aux) {
//					a[i] = a[j];
//					a[j] = a[i];
//					a[i] = aux;
//					break;
//				}
//			}
//		}
		for (int i = 1; i < a.length; i++) {
			if(a[i] <= a[0]) {
				item = String.valueOf(a[i]) + " " + item;
			} else if (a[i] >= a[0]) {
				item += " " + String.valueOf(a[i]);
			}
		}
		
		aux = item.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(aux[i]);
		}
		
		return a;
	}
}
