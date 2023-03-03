package unidad2;

public class calculadora_cientifica_implementacion {	//Nombre de la clase

	public static void main(String[] args) {
		calculadora_cientifica_definicion obj = new calculadora_cientifica_definicion(0d, 0d, 0d);	//Este crea el objeto de clase
		{
			obj.Menu();
			obj.Opcion();
			obj.Switches();
			
			int i_r = obj.LeerInt("Si quieres realizar otra operacion pon 1, para salir escribe 0");
			
			do {	//Este es el ciclo para repetir la calculadora cada vez termine de hacer una operacion
				obj.Menu();
				obj.Opcion();
				obj.Switches();
				i_r = obj.LeerInt("Si quieres realizar otra operacion pon 1, para salir escribe 0");;
			}
				while (i_r != 0);	//Mientras i_r sea diferente de 0, se va a repetir el ciclo
			System.out.println("Gracias por usar la calculadora");
		}
	}

}
