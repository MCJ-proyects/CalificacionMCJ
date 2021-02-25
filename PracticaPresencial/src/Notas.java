public class Notas {
	/**
	 * @param args
	 **/
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String nota = "";
		System.out.print("Introduzca una nota: ");
		nota = obtenerNota(reader);
		System.out.println(nota);
		reader.close();
	}

	public static String obtenerNota(Scanner reader) {
		int n;
		String calificacion;
		n = reader.nextInt();
		if (n >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (n >= 5 && nota <= 10)
			calificacion = "Aprobado";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}