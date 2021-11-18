/**
 * Clase que representa a parametros por valor y referencia
 * @author : Elizabeth
 * @version : 1.0
 */

public class Practica06
{
    public static void main(String[] args)
    {
	
	//Inicializamos variables con valores distintos
	int a = 10;
	int b = 20;
	//Aquí se indica que c va a ser igual al valor que tiene a 
	int c = a;

	//Le damos un valor nuevo a la variable a
	a = 30;

	//Va a imprimir el valor que se le asigno despues a=30
	System.out.println(a);
	//Va a imprimir el valor que le corresponde a b=20
	System.out.println(b);
	//Va a imprimir el valor que se le asigno en un inicio, donde "a" valia 10
	//Aunque se le asigne otro valor no afectaran a las variables originales
	System.out.println(c);
    }
}
