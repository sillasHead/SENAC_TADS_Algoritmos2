package vetorEFuncao;

public class Q06 {
	public static void main(String[] args) {
		int[] v = {5, 6, 2, 7, 9, 1, 8, 3, 7};
			
			for (int i : rearranjo(v)) {
				System.out.print(i + " ");
			}
	}
	
	public static int[] rearranjo(int[] v) {
		if(v.length > 0) {
			int aux = v[0], indice = 0;

			for(int i = 1; i < v.length; i++) {
				if(aux >= v[i]) {
					v[indice] = v[i];
					
					for (int j = i; j > indice; j--) {
						v[j] = v[j - 1];
					}

					v[indice += 1] = aux;
				}
			}
		}
		
		return v;
	}
}
