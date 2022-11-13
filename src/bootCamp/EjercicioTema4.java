package bootCamp;

public class EjercicioTema4 {
	public static void main(String[] args) {
	
		//Comparo numeros y digo si es posivo negativo o cero
		int num = 0;
		if(num>0) {
			System.out.println("El numero es positivo");
		}else if (num<0) {
			System.out.println("El numero es Negativo");
		}else {
			System.out.println("El numero es cero.");
		}
		System.out.println("-----------------");
		
		//Imprimo los numeros con un bucle while
		int numeroWhile = 0;
		while(numeroWhile<3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}
		System.out.println("-----------------");
		
		//Uso do while
		do {
			numeroWhile = 3;
			System.out.println("Uso do while");
		}while (numeroWhile<3) ;
		
		//uso de for
		for(int numeroFor=0; numeroFor<=3; numeroFor++) {
			System.out.println(numeroFor);
		}
		System.out.println("-----------------");
		
		//uso de swith
		String estacion = "primavera";
		switch(estacion){
			case "verano":
				System.out.println("Es verano");
				break;
			case "invierno":
				System.out.println("Es Invierno");
				break;
			case "otoño":
				System.out.println("Es otoño");
				break;
			case "primavera":
				System.out.println("Es primavera");
				break;
			default:
				System.out.println("Ingrese una estacion correcta");
		}
		
	}
}
	

	
