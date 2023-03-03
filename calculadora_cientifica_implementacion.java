package unidad2;

public class calculadora_cientifica_implementacion {

	public static void main(String[] args) {
		calculadora_cientifica_definicion obj = new calculadora_cientifica_definicion(0d, 0d, 0d);
		{
			obj.Menu();
			obj.Opcion();
			obj.Switches();
			
			int i_r = obj.LeerInt("Si quieres realizar otra operacion pon 1, para salir escribe 0");
			
			do {
				obj.Menu();
				obj.Opcion();
				obj.Switches();
				i_r = obj.LeerInt("Si quieres realizar otra operacion pon 1, para salir escribe 0");;
			}
				while (i_r != 0);
			System.out.println("Gracias por usar la calculadora");
		}
	}

}
