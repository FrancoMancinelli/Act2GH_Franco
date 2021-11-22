package EEDD;

public class Act2GIT {
	public static void main(String [] args) {
		
		int[] array = new int [20];
		valoresRandomArray(array, 1, 10);
	
	} //Cierre del Main

	/**
	 * Devuelve un array con numeros aleatorios segun un intervalo de numeros
	 * seleccionado
	 * @param m Matriz a la cual se le agregaran los valores random
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
