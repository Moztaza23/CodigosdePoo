package unidad2;
import java.util.Scanner;
import java.lang.StrictMath;

public class calculadora_cientifica_definicion {
	
	public int opcion;	//Esto maneja la opcion seleccionada por el usuario
	public double d_valor_1;
	public double d_valor_2;
	public double d_res;
	public int i_rep;
	
	public calculadora_cientifica_definicion()
	{
		this.i_rep = 0;
	}
	public calculadora_cientifica_definicion(double d_v1, double d_v2, double d_res)
	{
		this.d_valor_1 = d_v1;
		this.d_valor_2 = d_v2;
		this.d_res = d_res;
	}
	public int LeerInt(String mensaje)	//Scanner para numeros enteros
	{
		System.out.println(mensaje);
		Scanner sc_1 = new Scanner(System.in);
		int i_n = sc_1.nextInt();
		return i_n;
	}
	public double LeerDouble(String mensaje)	//Scanner para numeros doubles
	{
		System.out.println(mensaje);
		Scanner sc_2 = new Scanner(System.in);
		double d_n = sc_2.nextDouble();
		return d_n;
	}
	public void Valores()	//Pide el primer y segundo valor
	{
		this.d_valor_1 = LeerDouble("Cual es el primer valor");
		this.d_valor_2 = LeerDouble("Cual es el segundo valor");
	}
	public void Impresion()	//Se encarga de imprimir el resultado
	{
		System.out.println("El resltado de la operacion es " + this.d_res);
		
	}

	public static void Menu()	//Este es solo el menu escrito
	{
		System.out.println("Elige una opcion para continuar");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicacion");
		System.out.println("4 - Division");
		System.out.println("5 - Raiz cuadrada");
		System.out.println("6 - Potencia");
		System.out.println("7 - Seno");
		System.out.println("8 - Coseno");
		System.out.println("9 - Tangente");
		System.out.println("Presiona la tecla 0 para salir");
	}
	public int Opcion() 	//Esto es lo que maneja la opcion seleccionada
	{
		Scanner sc_1 = new Scanner(System.in);
		System.out.println("Escribe el numero de la opcion correspondiente");
		this.opcion = sc_1.nextInt();
		return 0;
	}
	public void Switches()	//Estos son los switches que decidiran que accion se hara dependiendo de la respuesta del usuario
	{
		switch(this.opcion)
		{
		case 1:
			Suma();
			break;
		case 2:
			Resta();
			break;
		case 3:
			Multiplicacion();
			break;
		case 4:
			Division();
			break;
		case 5:
			Raiz();
			break;
		case 6:
			Elevar();
			break;
		case 7:
			Sen();
			break;
		case 8:
			Cos();
			break;
		case 9:
			Tan();
			break;
		case 0:
			System.out.println("Has salido del programa");
			break;
		default:
			Menu();
			Opcion();
			Switches();
			break;
		}
	}						//A partir de aqui son todas las operacions matematicas que puede hacer el programa
	public double Suma()
	{
		Valores();
		this.d_res = this.d_valor_1 + this.d_valor_2;
		Impresion();
		return this.d_res;
	}
	public double Resta()
	{
		Valores();
		this.d_res = this.d_valor_1 - this.d_valor_2;
		Impresion();
		return this.d_res;
	}
	public double Multiplicacion()
	{
		Valores();
		this.d_res = this.d_valor_1  * this.d_valor_2;
		Impresion();
		return this.d_res;
	}
	public double Division()
	{
		Valores();
		this.d_res = this.d_valor_1 / this.d_valor_2;
		Impresion();
		return this.d_res;	
	}
	public int Raiz()
	{
		int i_a = LeerInt("Escribe el numero al que le quieres sacar raiz cuadrada");
		System.out.println("La raiz cuadrada de " + i_a + " es " + StrictMath.sqrt(i_a));
		return i_a;
	}
	public double Elevar()
	{
		double d_p;
		int i_a = LeerInt("Escribe el numero que deseas elevar al cuadrado");
		d_p = StrictMath.pow(i_a, 2);
		System.out.println("El numero " + i_a + " elevado al cuadrado es " + d_p);
		return d_p;
	}
	public double Sen()
	{
		double d_s, d_r;
		d_s = LeerDouble("Escribe el angulo al cual le quieres sacar el seno");
		d_r = StrictMath.toRadians(d_s);
		System.out.println("El seno de " + d_s + " es igual a " + StrictMath.sin(d_r));
		return d_s;
	}
	public double Cos()
	{
		double d_c, d_r;
		d_c = LeerDouble("Escribe el angulo al cual le quieres sacar el coseno");
		d_r = StrictMath.toRadians(d_c);
		System.out.println("El coseno de " + d_c + " es igual a " + StrictMath.cos(d_r));
		return d_c;
	}
	public double Tan()
	{
		double d_t, d_r;
		d_t = LeerDouble("Escribe el angulo al cual le quieres sacar la tangente");
		d_r = StrictMath.toRadians(d_t);
		System.out.println("La tangente de " + d_t + " es igual a " + StrictMath.tan(d_r));
		return d_t;
	}
	
}
