package EEDD;

public class Act2GIT_3 {

	public static void main(String[] args) {
		
		int[] array = new int [20];
		valoresRandomArray(array, 1, 10);
		cuentaOcurrencias(array);

	}
	/**
	 * Revisa cuantas veces se repite un número en un array dado y lo imprime
	 * por pantalla
	 * @param a Array a evaluar
	 */
	public static void cuentaOcurrencias(int[] a) {

		//Dibuja e imprime los valores del array
		int aux;
		int ocurrencias;
		for (int i = 0; i < a.length; i++) {
			ocurrencias = 0;
			aux = a[i];
			for (int j = 0; j < a.length; j++) {
				if(aux == a[j]) {
				ocurrencias++;
				}
			}
			System.out.println("El número "+ aux +" se repite "+ ocurrencias + " veces");		}
	
	}
	
	/**
	 * Devuelve un array con numeros aleatorios segun un intervalo de numeros
	 * seleccionado
	 * @param m Array a la cual se le agregaran los valores random
	 * @param x Valor MINIMO del que pueden partir los numeros aleatorios
	 * @param y Valor MAXIMO al que pueden llegar los numeros aleatorios
	 * @return
	 */
	public static int[] valoresRandomArray(int[] m, int x, int y) {

		//Agrega valores numericos random a una matriz
		for (int i = 0; i < m.length; i++) {
				m[i] = (int) (Math.random() * (y + 1 - x)) + x;
			}
	
		return m;
	}

}
