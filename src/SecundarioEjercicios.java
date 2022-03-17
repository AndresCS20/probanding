 import java.util.Arrays;
import java.util.Iterator;


public class SecundarioEjercicios {

	public static void main(String[] args) {
/*
		double[][] matriz = { { 23, 6, 8 }, { 4, 7, 1 }, { 3, 5, 9 } };
		double matrizb[][] = { { -12, 5, 6 }, { 7, 9, 0.6 }, { 10, 3, 8 } };
		double solucion[][] = new double[matriz.length][matriz[0].length];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				solucion[i][j] = matriz[i][j] + matrizb[i][j];

			}
		}

		System.out.println(Arrays.deepToString(solucion));
		System.out.println("Ola");
		
int mat[][] = { { 3, 6, 8, 5 }, { 4, 7, 1, 9 } };
int matb[][] = { { 2, 5, 6, 3 }, { 7, -7, 3, 4 } };
int solucion[][] = new int[mat.length][mat[0].length];

int aux = 0;
for (int i = 0; i < mat.length; i++) {

	for (int j = 0; j < mat[i].length; j++) {

		aux = mat[i][j] + matb[i][j];

		if (aux % 2 == 0) {
			solucion[i][j] = aux;
		}

	}

}

System.out.println(Arrays.deepToString(solucion));


		
int array2D[][] = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8 }, { 4, 5 } };
int aux = 0;
boolean solucion[][] = new boolean[array2D.length][];
for (int i = 0; i < array2D.length; i++) {
	solucion[i] = new boolean[array2D[i].length];
	for (int j = 0; j < array2D[i].length; j++) {
		aux = array2D[i][j];
		if (aux % 2 == 0) {
			solucion[i][j] = true;
		}

		else {
			solucion[i][j] = false;
		}
	}
}

System.out.println(Arrays.deepToString(solucion));
			
	
		int a[][]= {{43, 1}, {67, 3, 1, 8, 6, 8}, {2, 7, 9, 2, 1}, {1, 6, 8}, { 4, 7}};
		
		int aux[]= new int [a.length];
		
		for(int i=0; i<a.length; i++) {
			
			aux[i]=a[i].length;
			
		}
		
		Arrays.sort(aux);
		
		System.out.println("El tamaño de la fila más larga es= "+aux[aux.length-1]);
			
		
		//Ejercicio 5 Fallido
		int a[][]={{2,5,7}, {1,6,6}, {1,1,1},{6, 8, 5}, {3,6, 4}, {1,8, 5}};
		int b[][]= new int [a.length/2][a[0].length];
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[i].length; j++) {
				
				b[i][j]=a[i][j]+a[i][j];
				
				
				
			}
		}
		
		System.out.println(Arrays.deepToString(b));
			
		
		
		int a[][]={{1, 2, 2, 4, 5}, {6, 7, 7, 9, 10}, {21, 22, 25, 4, 2}, {1, 2, 3, 4, 3}, {16, 17, 2, 19, 20},{12,4,3,23,5}};
		int aux[]=new int [a.length];
		for (int i=0; i<a.length; i++){
			
			Arrays.sort(a[i]);
			aux[i]=a[i][a[i].length-1];
			
		}
		Arrays.sort(aux);
		System.out.println(aux[aux.length-1]);

		
		int  a[]={4, 1, 4, 6, 3, 1, 8, 6, 8, 2, 7, 9, 2, 1,1, 6, 8, 6, 4, 7, 9, 0, 1, 3};
		int b[][]= new int [a.length/4][4];
		int cont=0;
		for (int i=0; i<b.length; i++) {
		
			for (int j=0; j<b[i].length; j++) {
				
				b[i][j]=a[cont];
				cont++;
			}

	}		
		
		System.out.println(Arrays.deepToString(b));

		
		int a[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		int j=a.length-1;	
		int diagonal1=0;
		int diagonal2=0;
		for(int i=0; i<a.length; i++) {
			
			diagonal1=diagonal1+a[i][i];
				}
		
		for(int i=0; i<a.length; i++) {
		
			diagonal2=diagonal2+a[i][j];
					j--;
				}
		
		System.out.println("Resultado total:" + (diagonal1+diagonal2));
		
		
		
		int a [][]= {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		int solucion[][]=new int[a.length][a[0].length];
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[i].length; j++) {
				
				solucion[i][j]=a[i][j]*i+j;
			}
					
		}
		
		System.out.println(Arrays.deepToString(solucion));
		

		int a[][]= {{9, 7, 3, 4}, {2, 5, 2, 1, 9, 7}, {1, 9, 8}};
		int b[][]={{1, 2}, {2, 5, 9, 1, 4}, {2, 8, 5}, {4, 5}};
		int cont=0;
		int cm1=0;
		int cm2=0;
		int numfilasmin=0;
		int numfilasmax=0;
		if (a.length>b.length){
			numfilasmax=a.length;
			numfilasmin=b.length;
		}
		
		else if (a.length<b.length) {
			numfilasmax=b.length;
			numfilasmin=a.length;
		}
		
		else {
			numfilasmax=a.length;
			numfilasmin=b.length;
		}
		char auxiliar[]= new char [numfilasmin];
		int solucion[][]= new int [numfilasmax][];
		
		for (int i=0; i<numfilasmin; i++) {
	
				cm1=a[i].length;
				cm2=b[i].length;
				
				if(cm1>cm2){
					solucion[i]= new int [a[i].length];
				}
				
				else if(cm1<cm2) {
					solucion[i]= new int [b[i].length];
				}
				
				else {
					solucion[i]= new int [b[i].length];
				}

		}
		
		for (int i=0; numfilasmin<numfilasmax; i++) {
			
			cm1=a[i].length;
			cm2=b[i].length;
			
			if(cm1>cm2){
				solucion[i]= new int [a[i].length];
			}
			
			else if(cm1<cm2) {
				solucion[i]= new int [b[i].length];
			}
			
			else {
				solucion[i]= new int [b[i].length];
			}
			
				numfilasmin++;	
		}
		
		
		
		System.out.println(Arrays.deepToString(solucion));
		
		
		int a[][]= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int solucion [][]= new int [a.length][a[0].length];
		int cont=0;

		for(int i=0; i<a.length-1; i++) {
			
			for (int j=a[i].length-1; j>=0 && cont<=a[i].length-1; j--) {
				
				solucion[i][cont]=a[i][j];
				cont++;
			}
			cont=0;

		}
		
		System.out.println(Arrays.deepToString(solucion));
		
		int a[][]= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int solucion [][]= new int [a.length][a[0].length];
		int cont=0;

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < a[i].length; j++) {
				solucion[cont][j] = a[i][j];
			}

			cont++;

		}

		
		
		
		
		String frase="Esta es la frase que meteremos en la matriz";
		
		int cont = 0;
		
		String palabras[]= frase.split(" ");
		for (int i=0; i<palabras.length; i++) {
			
			cont++;
		}
		
		char solucion[][]= new char [cont][];
		
		int aux=0;
		for(int i=0; i<palabras.length; i++) {
		aux=palabras[i].length();
					
		solucion[i]= new char [palabras[i].length()];
			
		}

		char letra=' ';
		String auxpalabra=" ";
		
		for (int i=0; i<solucion.length; i++) {
			
			for (int j=0; j<solucion[i].length; j++) {
				
				auxpalabra=palabras[i];
				letra=auxpalabra.charAt(j);
				solucion[i][j]=letra;
				
			}

		}
		
		System.out.println(Arrays.deepToString(solucion));		
		*/
		
		
	/*	
		int a[][]={{2, 3, 4, 5, 6, 7}, {9, 10, 2, 3, 5}, { 9, 14, 17, 12, 6} , {4, 8, 10}, {6, 7, 4, 9, 10}, {1, 2}, {8, 9, 10, 11}};
		int contpar=0;
		for (int i=0; i<a.length; i++) {
			
			if (a[i]%2==0) {
				
							for (int j=0; i<a[i].length; j++) {
				
				if (a[i][j]%2==0) {
					contpar++;
				}
				
				
			}
			}
			

			
			
		}
		
		
		
		
		
		
		int a[][]={{2, 5, 6, 1, 6}, {7, 3, 2, 8, 0}, {4, 9, 2, 10, 7}, {1, 8, 3, 2, 6}, {9, 2, 6, 1, 3}};

		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
				}
			System.out.println("-----------------------------------");
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
			System.out.print(a[j][i]+"\t");

			}
			System.out.println();	
				}
				
		
		
		
		
	int a[][] = { { 3, 4, 6, 3, 3, 3 }, { 4, 3, 5, 4, 4 }, { 9, 14, 17, 12, 6 }, { 4, 8, 10 }, { 6, 7, 4, 9, 10 },{ 1, 2 }, { 8, 9, 10, 11 } };
	int solucion[][] = new int[a.length][];
	int contpar = 0;
	int contimpar = 0;
	for (int i = 0; i < a.length; i++) {
		contpar = 0;
		contimpar = 0;
		if (i % 2 == 0) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] % 2 == 0) {

					contpar++;

				}
				solucion[i] = new int[contpar];
			}

			if (contpar == 0) {

				solucion[i] = new int[1];

			}

		}

		if (i % 2 == 1) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] % 2 == 1) {
					contimpar++;

				}
				solucion[i] = new int[contimpar];

			}
			if (contimpar == 0) {

				solucion[i] = new int[1];

			}
		}

	}

	int aux = 0;
	int posaux = 0;
	for (int i = 0; i < a.length; i++) {
		posaux = 0;
		contpar = 0;
		contimpar = 0;
		if (i % 2 == 0) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] % 2 == 0) {
					contpar++;
					aux = a[i][j];
					solucion[i][posaux] = aux;
					posaux++;

				}

				if (contpar == 0) {

					solucion[i][0] = -1;

				}
			}

		}

	}

	for (int i = 0; i < a.length; i++) {
		posaux = 0;
		contimpar = 0;
		if (i % 2 == 1) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] % 2 == 1) {
					contimpar++;
					aux = a[i][j];
					solucion[i][posaux] = aux;
					posaux++;

				}

				if (contimpar == 0) {

					solucion[i][0] = -1;

				}
			}

		}

	}

	System.out.println(Arrays.deepToString(solucion));
		
		
		
		
		
		
	int a[][] = { { 9, 7, 3, 4 }, { 2, 5, 2, 1, 9, 7 }, { 1, 9, 8 } };
	int b[][] = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };

	int filamayor = 0;
	int filamenor = 0;

	if (a.length >= b.length) {

		filamayor = a.length;
		filamenor = b.length;
	}

	else {
		filamayor = b.length;
		filamenor = a.length;
	}

	int solucion[][] = new int[filamayor][];

	for (int i = 0; i < filamenor; i++) {
		// Los dos arrays tienen filas

		if (a[i].length >= b[i].length) {

			solucion[i] = new int[a[i].length];

		}

		else {
			solucion[i] = new int[b[i].length];
		}

	}

	for (int i = filamenor; i < filamayor; i++) {
		// Aqui solo un array tiene filas

		if (filamayor == a.length) {
			solucion[i] = new int[a[i].length];

		}

		else {
			solucion[i] = new int[b[i].length];

		}

	}

	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			solucion[i] = a[i];
		}
	}

	for (int i = 0; i < b.length; i++) {

		for (int j = 0; j < b[i].length; j++) {

			solucion[i][j] = solucion[i][j] + b[i][j];
		}

	}

	System.out.println(Arrays.deepToString(solucion));
		
		
		int a[][] = { { 23, 5, 2, 9, 4 }, { 8, 76, 34, 10, 1 }, { 29, 0, 7, 14, 3 }, { 38, 6, 18, 52, 47 } };
		int cont = 0;
		int contaux = 0;
		int solucion[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				cont++;
			}
		}

		int b[] = new int[cont];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length && contaux < cont; j++) {
				b[contaux] = a[i][j];
				contaux++;

			}

		}

		Arrays.sort(b);

		for (int i = 1, j = 0; i <= solucion.length && j < solucion.length; i++, j++) {
			solucion[j] = b[b.length - i];
		}

		System.out.println(Arrays.toString(solucion));
		System.out.println(Arrays.toString(b));

		
		
	int a[][] = { { 9, -7, 5, 3 }, { 12, 23, -2, 8 }, { 4, 7, 9, 0 } };

	int solucion[][] = new int[a.length][a[0].length];
	int cont = 0;
	int contaux = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {

			cont++;

		}
	}

	int aux[] = new int[cont];

	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length && contaux < cont; j++) {
			aux[contaux] = a[i][j];
			contaux++;

		}
	}
	int contreaux = 0;
	Arrays.sort(aux);
	System.out.println(Arrays.toString(aux));

	for (int i = 0; i < solucion.length; i++) {

		for (int j = 0; j < solucion[i].length; j++) {

			solucion[i][j] = aux[contreaux];
			contreaux++;
		}

	}

	System.out.println(Arrays.deepToString(solucion));
	
	
	
		
	int a[][]= {{1, 2, 4, 6, 4}, {9, 7}, {2, 6, 8, 3}, {7,6, 9}};
	
	int aux[]= new int[a.length];
	for (int i = 0; i < a.length; i++) {

		aux[i] = a[i].length;

	}
	
	Arrays.sort(aux);
	
	int solucion[][]= new int[a.length][];
	
	for (int i=0; i<solucion.length; i++) {
		solucion[i]=new int [aux[i]];
	}
	
	
		for (int i=0; i<solucion.length; i++) {
			
			for (int j=0; j<a.length; j++) {
				
				if (solucion[i].length==a[j].length) {
					
					solucion[i]=a[j];
					
				}
			}
			
		}
		System.out.println(Arrays.deepToString(solucion));

	int a[][] = { { 23, 4, 5, 1, 9, 8 }, { 43, 12, 67, 7 }, { 2, 71 }, { 9, 1, 6, 14 } };
	int b[][] = { { 11, 6, 5, 9, 1 }, { 9, 12, 8, 1 }, { 6, 9, 3, 2 }, { 4, 1, 6, 8 } };

	int filaMayor = 0;
	int filaMenor = 0;

	if (a.length >= b.length) {
		filaMayor = a.length;
		filaMenor = b.length;

	} else {
		filaMayor = b.length;
		filaMenor = a.length;
	}

	int solucion[][] = new int[filaMayor][];

	for (int i = 0; i < filaMenor; i++) {
		// Los dos arrays tienen filas porque estamos haciendo un bucle hasta filaMenor
		if (a[i].length >= b[i].length) {
			solucion[i] = new int[a[i].length];
		} else {
			solucion[i] = new int[b[i].length];
		}
	}

	for (int i = filaMenor; i < filaMayor; i++) {
		// Aquí solo un array tiene filas que en este caso es filaMayor
		if (filaMayor == a.length) {
			solucion[i] = new int[a[i].length];
		} else {
			solucion[i] = new int[b[i].length];
		}
	}

	// En Este punto ya tenemos el tamaño de Array Solucion
	// Despues de esto hacemos que ponga en todos los numeros -1, -2 o 0 dependiendo
	// del tamaño

	for (int i = 0; i < solucion.length; i++) {

		if (a[i].length > b[i].length) {

			for (int j = 0; j < solucion[i].length; j++) {
				solucion[i][j] = -1;

			}

		}

		else if (a[i].length < b[i].length) {

			for (int j = 0; j < solucion[i].length; j++) {
				solucion[i][j] = -2;

			}

		}

		else {

			for (int j = 0; j < solucion[i].length; j++) {
				solucion[i][j] = 0;

			}
		}

	}

	// Aqui vamos cifra por cifra comparando cual es mayor o menor o igual y ponemos
	// 1, 2 o 0

	for (int i = 0; i < solucion.length; i++) {

		if (a[i].length > b[i].length) {

			for (int j = 0; j < solucion[i].length - (a[i].length - b[i].length); j++) {

				if (a[i][j] > b[i][j]) {

					solucion[i][j] = 1;
				}

				else if (a[i][j] < b[i][j]) {

					solucion[i][j] = 2;
				}

				else {

					solucion[i][j] = 0;
				}

			}

		}

		else if (a[i].length < b[i].length) {

			for (int j = 0; j < solucion[i].length - (b[i].length - a[i].length); j++) {

				if (a[i][j] > b[i][j]) {

					solucion[i][j] = 1;
				}

				else if (a[i][j] < b[i][j]) {

					solucion[i][j] = 2;
				}

				else {

					solucion[i][j] = 0;
				}

			}

		}

		else {

			for (int j = 0; j < solucion[i].length; j++) {

				if (a[i][j] > b[i][j]) {

					solucion[i][j] = 1;
				}

				else if (a[i][j] < b[i][j]) {

					solucion[i][j] = 2;
				}

				else {

					solucion[i][j] = 0;
				}

			}

		}

	}

	System.out.println(Arrays.deepToString(solucion));

		
		int a[][] = { { 3, 4, 6, 3, 3, 3 }, { 4, 3, 5, 4, 4 }, { 9, 14, 17, 12, 6 }, { 4, 8, 10 }, { 6, 7, 4, 9, 10 },{ 1, 2 }, { 8, 9, 10, 11 } };
		int solucion[][] = new int[a.length][];
		int contpar = 0;
		int contimpar = 0;
		for (int i = 0; i < a.length; i++) {
			contpar = 0;
			contimpar = 0;
			if (i % 2 == 0) {

				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] % 2 == 0) {

						contpar++;

					}
					solucion[i] = new int[contpar];
				}

				if (contpar == 0) {

					solucion[i] = new int[1];

				}

			}

			if (i % 2 == 1) {

				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] % 2 == 1) {
						contimpar++;

					}
					solucion[i] = new int[contimpar];

				}
				if (contimpar == 0) {

					solucion[i] = new int[1];

				}
			}

		}

		int aux = 0;
		int posaux = 0;
		for (int i = 0; i < a.length; i++) {
			posaux = 0;
			contpar = 0;
			contimpar = 0;
			if (i % 2 == 0) {

				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] % 2 == 0) {
						contpar++;
						aux = a[i][j];
						solucion[i][posaux] = aux;
						posaux++;

					}

					if (contpar == 0) {

						solucion[i][0] = -1;

					}
				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			posaux = 0;
			contimpar = 0;
			if (i % 2 == 1) {

				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] % 2 == 1) {
						contimpar++;
						aux = a[i][j];
						solucion[i][posaux] = aux;
						posaux++;

					}

					if (contimpar == 0) {

						solucion[i][0] = -1;

					}
				}

			}

		}

		System.out.println(Arrays.deepToString(solucion));

		*/
		
		/*
		int a=0;
		
		while (a<200) {
			
			if (a%5==0 && a%2==1) {
				
				System.out.println(a);
				
			}
			
			a++;
		}
		
	
		
		int a=0;
		while (a<=300) {
		
		if (a%3==0 || a%4==0) {
			if(a%12!=0) {
			System.out.println(a);
		}		}
		a++;
		}
			
		
		
		String frase = "Esta es una frase que vamos a cortar en palabras";
		String palabras[] = frase.split(" ");
		boolean solucion[] = new boolean[palabras.length];

		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i].length() % 2 == 0) {
				solucion[i] = true;
			}

		}

		System.out.println(Arrays.toString(solucion));
		
		
		
		int a[] = { 3, 8, 4, 5, 10, 6, 9, 0, 2 };
		double solucion = 0;
		int aux = 0;

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length - 1; i++) {

			solucion = solucion + a[i];
			aux = i;

		}
		System.out.println(solucion + " " + aux);
		solucion = solucion / aux;

		System.out.println(solucion);
		
		
		

		// Numero 1000 le restamos 1 luego 2 , luego 3 , luego 4 hasta el 500 y mostar el ultimo numero que ha restado
		int a = 1000;
		int aux = 1;

		for (int i = 0; a >= 500; i++) {

			a = a - i;
			aux = i;

		}
		System.out.println("El ultimo numero que ha restado A es:" + aux);
	
		
		// Cualquier frase, mostrar la subfrase entre el tercer espacio y el sexto
		// espacio si no hay sexto espacio mostrar no hay espacio y si no hay tercer
		// espacio mostrar no hay tercer espacio

		String frase = "Esta es la probamos ahora mismo en este lugar";
		int cont = 0;
		int valaux = 0;
		int valauxb = 0;

		String solucion = " ";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				cont++;

				if (cont == 3) {
					valaux = i;
				}

				else if (cont == 6) {
					valauxb = i;
				}

			}
		}

		if (cont >= 6) {

			solucion = frase.substring(valaux + 1, valauxb);

		} else if (cont >= 3) {

			System.out.println("No hay Sexto Espacio");
		}

		else
			System.out.println("No hay Tercer Espacio");

		System.out.println(solucion);

	
		//Arrays unidimensionales con posiciones multiplos de 4 hasta lo que sea, 1º se tiene que comprobar que es multiplo de 4, 2 si tiene multiplo de 4 tiene que hacer lo siguiente 
	//Array solucion coge los cuatro primeros los suma y lo guarda en la primera posicion y así 
	
		int a[]= {2,4,8,7,3,2,5,6,8,9,12,56,30,21,34,54};
		int j=0;
		if (a.length%4==0) {
			int solucion[]=new int[a.length/4];
			
			for (int i=0; i<solucion.length; i++) {
				solucion[i]=a[j]+a[j+1]+a[j+2]+a[j+3];
				j=j+4;
			}
			
			System.out.println(Arrays.toString(solucion));
			
		}
		
		else System.out.println("No se puede hacer porque el Array A no es multiplo de 4");
		
		
		
		
		//Dado un array de numeros enteros, luego un array b de booleanos del mismo tamaño ALEATORIO 
		//Primero  medir el tamaño de ambos si no mide lo mismo mandar mensaje si miden igua hacer un array solucionb donde si es true multiplica el numero por 10  y si es false lo divide entre diez
		
		int a[]= {45,6,35,36,41,64,13,64,33};
		boolean b[]={false, true,false,true,false,false,false,true,false};

		
		if (a.length==b.length) {
			
			double solucion[]=new double[a.length];
			
			for (int i=0; i<a.length; i++) {
				
				if (b[i]==true) {
					
					solucion[i]=a[i]*10;
				}
				
				else  solucion[i]=a[i]/10.0;
				
				
			}
			
			System.out.println(Arrays.toString(solucion));
		}
		
		
		else System.out.println("No tienen el mismo tamaño A y B");
		
		
		
		//Tener un listado hasta el 200  de todos los numeros que acaban en 4 y 6 
		
		
		
		for (int i = 4, j = 6; i < 200 && j<200; i = i + 10, j = j + 10) {

			System.out.println(i);

			System.out.println(j);

		}
		
		
		//Empezamos de 0, sumamos +0,4 luego +0,7 luego 0,6 y a volver a empezar. cuando pase de 200 que diga el numero ha pasado
		
		
		double a = 0;

		double i = 0.4;
		double j = 0.7;
		double k = 0.6;

		int conta=0;
		int contb=0;
		int contc=0;
		
		while (a <= 200) {

			if(a<200) {
				
				a=a+0.4;
				
				if (a>200) {
					
					System.out.println("Ha pasado con 0.4");
				}
				
				
				if(a<200) {
					
					a=a+0.7;
					
					if (a>200) {
						
						System.out.println("Ha pasado con 0.4");
					}	
				
			}
				
				if(a<200) {
					
					a=a+0.6;
					
					if (a>200) {
						
						System.out.println("Ha pasado con 0.4");
					}	
			
		}
			}
		
		System.out.println(conta);
		
		System.out.println(contb);
		System.out.println(contc);

		
		
		
		
		//Array Bidimensional (Matriz cuadrada) que puede ser de 5 o más (5x5 etc) hay que obtener matriz resultado de quitar la periferia 
		
		
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int conta=0;
		int contb=0;
		int solucion[][]= new int[a.length-2][a[0].length-2];
		
		for (int i=1; i<a.length-1 && conta<solucion.length; i++) {
			contb=0;
			for (int j=1; j<a[i].length-1 && contb<solucion[conta].length; j++) {

				solucion[conta][contb]=a[i][j];
				
				contb++;
			}
			
			conta++;
			
		}
		
		System.out.println(Arrays.deepToString(solucion));
		*/
		
		//Defino un caracter cual sea  y luego una frase la que sea, tenemos un array de enteros con la misma longitud que palabras tiene la frase  y en cada posicion diga el numero caracteres que tenga esa palabra
		
		char letra = 'a';

		String frase = "Esta es una frase con varias palabras";

		String aux[] = frase.split(" ");

		int solucion[] = new int[aux.length];

		for (int i = 0; i < aux.length; i++) {
			int cont = 0;
			for (int j = 0; j < aux[i].length(); j++) {

				if (aux[i].charAt(j) == letra) {
					cont++;
					solucion[i] = cont;
				}

			}

		}

		System.out.println(Arrays.toString(solucion));

	}

}
