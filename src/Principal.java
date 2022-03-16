import java.util.Arrays;


public class Principal {

	public static void main(String[] args) {


		System.out.println("hOLA");
		System.out.println("hOLA");
	/*
		int a=1;
		
		while (a<=100) {
			
			if (a%10==0) {
				System.out.println("Cambio de decena");
			}
			
					
			System.out.println(a);
			a++;
		}
		System.out.println(2);
		System.out.println(2*2);
		System.out.println(2*2*2);
		System.out.println(2*2*2*2);
		System.out.println(2*2*2*2*2);
		System.out.println(2*2*2*2*2*2);
		System.out.println(2*2*2*2*2*2*2);
		System.out.println(2*2*2*2*2*2*2*2);
		System.out.println(2*2*2*2*2*2*2*2*2);
		System.out.println(2*2*2*2*2*2*2*2*2*2);	


			double a=34.5;
			int b=0;
			while (a>=22.4) {
				b++;
				a=a-0.3;
				System.out.println(a);
			}
			System.out.println(b);

		
		
		double a=0.48;
		double b=0.48;
		int c= 0;
		while (a<=23.4) {
			c++;
			a=a+b;
			System.out.println(a);
			
		}
		System.out.println(c);
		
		int a=2;
		int multi=2;
		int veces=0;
		
		while (veces<10) {
		veces++;
		multi=multi*a;
		System.out.println(multi);
		
		
		int a= -21;
		int suma=0;
		while (a<=-9) {

			if (a%2==-1) {
				suma=suma+a;

			}
			a++;
		}
		System.out.println(suma);

		
		
		int b=14;
		int sumab=0;
		
		while (a<=64) {
			if (a%2==0) {
				sumab=sumab+b;
				
			}
			a++;
		
		}
		System.out.println(sumab);
		
		System.out.println(suma+sumab);
		
		
		int a=4096;
		int b=2;
		
		while (b<=8) {
			
			a=a/b;
			b++;
			System.out.println(a);
			
			
		}
		
		------------------------------
			
		
		int a=0;
		int suma=0;
		
		
		
		while (a<=100) {
			
			suma=suma+a;
			a++;
			
		}
		//	System.out.println(suma);

		int sumab=0;
		
		int sumac=0;
		int sumad=0;
		int sumafin=0;
		int fin=0;
		for (int b=7;b<=67; b=b+10) {
			
			sumab=sumab+b;
			
		}
		//System.out.println(sumab);

		for (int b=70;  b<=79; b++) {
		
			sumac=sumac+b;

		}
		
		//System.out.println(sumac);
		
		for (int b=87;b<=97; b=b+10) {
			
			sumad=sumad+b;
			
		}
		//System.out.println(sumad);
		
		sumafin=sumab+sumac+sumad;
		//System.out.println(sumafin);
		
		fin=suma-sumafin;
		System.out.println("Resultado final: "+fin);
	

		int a=1;
		int b=0;
		boolean meta=false;
		
		
		while (b<=40) {
			
			b=b+a;
			if (b>40) {
				System.out.println("El Ultimo Numero es "+a);
				meta=true;
			}
			a++;
			}
			
		
	
		// Primer multiplo de 37 por encima de 500
		
		boolean meta=false;
		
		for(int a=500; a>=500 && meta==false; a++) {
			
			if (a%37==0) {
				
				System.out.println(a);
				meta=true;
			}
		}
			
		// Primer multiplo de 37 por encima de 500

		
		
		long a=3;
		
		while (a<=9) {
			
			System.out.println(a);
			a=a+3;
			
		}
		
		a=013;
		
		while (a<=19) {
			System.out.println("00"+a);
			a=a+3;
			
		}
		
		a=023;
		
		while (a<=29) {
			System.out.println(a);
			a=a+3;
			
		}
	
		
		for (int a=-20; a<=0;  a++) {
			if (a%2==0) System.out.println(a);
			
		}
		
		for (int a=1; a<=21;  a++) {
			if (a%2==1) System.out.println(a);
			
		}
		
		//Coloca toda la frase en vertical
		String nombreApellido= "Pedro Ramiro Gutierrez";
		
		for (int i=0; i<nombreApellido.length(); i++) {
			
			System.out.println(nombreApellido.charAt(i));
		}
		
		String a="locomotora";
		String b= "camion";
		String c= "coche";
		
		int aa=a.length();
		int bb=b.length();
		int cc=c.length();
		System.out.println(aa+bb+cc);
	}

		
		String frase="En un lugar de la Mancha";
		
		char a= frase.charAt(0);
		char b= frase.charAt(13);
		char c= frase.charAt(18);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	 
		
		String frase="Ahora estamos en el ejercicio";
		
		String frase2=frase.substring(4,8);
		
		System.out.println(frase2);
		
		
		String a="mesa";
		String b="s";
		
		//String c=a.concat(b);
		//System.out.println(c);
		System.out.println(a.concat(b));
		
		
		//Ejercicio Numero 5 Sin terminar
		String  frase="Esta es la frase del ejercicio 4";
		
		for (int i=0; i<frase.length(); i++) {
			
			System.out.println(frase.charAt(i));
		}
		
		
		String a="uno";
		String b="dos";
		String c="tres";
		String d="cuatro";

		String all= a+", "+b+", "+c+", "+d;
		
		System.out.println(all);
		
		//Ejercicio 9 FAIL
		String frase="Hola, me voy a tomar una olanzapina, por cierto, mira esa ola.";
		
		String frase2=frase.replace("ola", "nube");
		System.out.println(frase2);

		//Ejercicio 10
		String palabra="LoCoMoToRa";
		
		String Pal1;
		String Pal2;

		int val;
		val=palabra.length();
		
		int mitad;
		mitad=val/2;
		
		Pal1=palabra.substring(0,mitad);
		
		Pal2=palabra.substring(mitad+1);
		
		System.out.println(Pal1.toUpperCase() + Pal2.toLowerCase());
		
		
		String  frase="Esta es la frase del ejercicio 4";
		
		
		for (int i=0; i<frase.length(); i++) {
			
			if (!(frase.charAt(i)==' ')) {
				System.out.println(frase.charAt(i));
			}
			 
		}
		
			
		
		String  frase="Este ejercicio es el primero de cuenta de letras";
		
		int aux= 0;
		
		for (int i=0; i<frase.length(); i++) {
			
			if (frase.charAt(i)=='e' || frase.charAt(i)=='E') {
				aux++;
			}
		}			
		System.out.println("Hay "+aux+" letras e/E");

		
		String  frase="Esta es una frase con varios espacios";

		int primero;
		int segundo;
		int tercero;
		
		primero=frase.indexOf(' ');
		
	    System.out.println("El primer espacio esta en "+primero);
		
		segundo=frase.indexOf(' ', primero=primero+1);
		
		tercero=frase.indexOf(' ', segundo=segundo+1);
	    System.out.println("El tercer espacio esta en "+tercero);
	
		
		String frase="Hola, me voy a tomar una olanzapina, por cierto, mira esa ola.";
		
		
		frase=" " + frase + " ";

		frase=frase.replace(" ola "," nube");
		frase=frase.replace(" ola? "," nube");
		frase=frase.replace("? ola "," nube");
		frase=frase.replace(" ola, "," nube ");
		frase=frase.replace(", ola "," nube ");
		frase=frase.replace("ola. ","nube.");
		frase=frase.replace("; ola "," nube ");
		frase=frase.replace(" ola; "," nube ");

		frase=frase.trim();
		System.out.println(frase);
		
		
		String frase="Esta es la frase que vamos a partir en cuatro";
		
		int mitad=frase.length()/2; 
		String frase1=frase.substring(0,mitad); System.out.println(frase1);
		String frase2=frase.substring(mitad); System.out.println(frase2);
		
		int mitad1=frase1.length()/2;
		String frase1a=frase1.substring(0,mitad1); System.out.println(frase1a); 
		String frase1b=frase1.substring(mitad1); System.out.println(frase1b);
		
		int mitad2=frase2.length()/2;
		String frase2a=frase2.substring(0,mitad2); System.out.println(frase2a); 
		String frase2b=frase2.substring(mitad2); System.out.println(frase2b);
		
		
		//EJERCICIO 2 FALLIDO
		String frase="Esta es la frase donde vamos a poner almohadillas";
		String frasefinal;
		int i=0;
		while (i<frase.length()){
			if (i%3==0) {
				
				frasefinal=frase.replace('#','a');
				
			}
							System.out.println(frase);

			i++;
	
			
		}
		
	
	
		
		
		//Ejercicio 3 Fallido Variable BOOLEAN
		String frase="Esta es una frase con unas cuantas aes"; 
		
		int cont=4;
		int i=0;
		int b=0;
		boolean c;
		while (i<frase.length()) { //Esto es para recorrer todo la frase
		
			cont++;
		}			
		if (cont==4) {

		System.out.println("La posicion de la cuarta a es= "+ b);

				
			}
		
		b=frase.indexOf('a',cont);
		if (c=frase.charAt(b)==a) {
			
		}
	
		String frase="Esta es la frase donde vamos a poner almohadillas";

		int i=0;
		while (i<frase.length()){
			
			if (i%3==0) {

				frase=frase.substring(0,i) + '#' + frase.substring(i+1);
				
			}
							

			i++;
	
			
		}
	System.out.println(frase);
		
		
		String frase="Esta es la frase de ahora";
		int primerEspacio= frase.indexOf("");
		int ultimoEspacio=0;
		
		int cont=0;
		
		for (int i=frase.length()-1; i>=0; i--) {
			
			
			if (frase.charAt(i)== ' ') {
				cont++;
				
				if (cont==1) ultimoEspacio=i;
			}
			
			//ultimoEspacio=frase.indexOf(" ");
			
		}
		
		System.out.println(ultimoEspacio);
		
		
		
		
		
		String frase="Esta es la frase de ahora";
		frase= " " + frase + " ";
		
		int espacio1=0;
		int espacio2=0;
		
		while (espacio2!=-1) {
			
		
		espacio2=frase.indexOf(" ", espacio1+1);	
		if (espacio2!=-1) {
		String palabra=frase.substring(espacio1,espacio2);
		System.out.println(palabra);
		}
		espacio1=espacio2;
		}
		
		
		
		
		String frase="Esta es la frase donde vamos a hacer los cambios";
		
		int primerEspacio= frase.indexOf(" ");
		int ultimoEspacio=0;
		int cont=0;
		
		String frase1="";
		String frase2="";
		String frase3="";
		String frasefinal="";
		
		for (int i=frase.length()-1; i>=0; i--) {
			
			
			if (frase.charAt(i)== ' ') {
				cont++;
				
				if (cont==1) ultimoEspacio=i;
			}
						
		}
		
		frase1=frase.substring(0,primerEspacio); 
		frase1=frase1.toUpperCase();
		
		frase2=frase.substring(primerEspacio, ultimoEspacio);
		
		frase3=frase.substring(ultimoEspacio);
		frase3=frase3.toUpperCase();
		
		frasefinal=frase1+frase2+frase3;
		System.out.println(frasefinal);
		
		
		
		String frase="A ver cuantas palabras hay aquí";
		frase= " " + frase + " ";
		
		int espacio1=0;
		int espacio2=0;
		int cont=0;
		while (espacio2!=-1) {
			
		
		espacio2=frase.indexOf(" ", espacio1+1);	
		if (espacio2!=-1) {
		String palabra=frase.substring(espacio1,espacio2);
		palabra=palabra.trim();
		cont++;
		}
		espacio1=espacio2;
		}
		
		System.out.println(cont);
		
		//EJERCICIO 6 FALLIDO 
		String frase="Esta es la frase que vamos a probar";
		int cont= 1;
		int b=0;
		char a;
		char aux;
		for(int i= 0; i<frase.length(); i++) {
			
			a=frase.charAt(i);
			
			
			if (cont<3 && a=='a') {
				cont++;
				frase=frase.replace('a','#');
				
			}
			
		}
		System.out.println(frase);
		
		
		String palabra="TERREMOTO";
		String palabraMitad="";
		String primerMitad="";
		String segundMitad="";
		String palabraFinal="";
		
		int numPalabra=palabra.length(); 
		
		
		primerMitad=palabra.substring(0,numPalabra/2);
		segundMitad=palabra.substring(numPalabra/2+1); 
		primerMitad=primerMitad.toLowerCase();
		segundMitad=segundMitad.toLowerCase();
		
		palabraMitad=palabra.substring(numPalabra/2, numPalabra/2+1);
		palabraMitad=palabraMitad.toUpperCase();
		
		palabraFinal=primerMitad+palabraMitad+segundMitad;
		System.out.println(palabraFinal);
		
		
		
		
		
		String frase="Esta es la frase que vamos a probar";
		String primero="";
		String segundo="";
		char caracter=' ';
		int cont=0;
		for(int i=0; i<frase.length(); i++) {
			
			caracter=frase.charAt(i);
			
			if(caracter=='a') {
				cont++;
					if(cont==3) {
						primero=frase.substring(0,i+1);
						primero=primero.replace('a','*'); 
						segundo=frase.substring(i+1); 
						frase=primero+segundo;
						System.out.println(frase);
					}
			}
			
		}
		
		
		
		
		
		//Cortar palabra palabra
		
		String frase="La LOcomotora avanza con paso firme y no hay LOcomoTora que la iguale";
		frase= " " + frase + " ";
		
		int espacio1=0;
		int espacio2=0;
		boolean b;
		while (espacio2!=-1) {
			
		
		espacio2=frase.indexOf(" ", espacio1+1);	
		if (espacio2!=-1) {
		String palabra=frase.substring(espacio1,espacio2);
		palabra=palabra.trim();
		b=palabra.equalsIgnoreCase("locomotora");
		if (b) {
			palabra=palabra.toLowerCase();
			palabra=palabra.replace("locomotora","tren");
		}
		System.out.print(palabra+" ");
		}
		espacio1=espacio2;
		}
		
		
		
		//Cortar palabra palabra
		
		String frase="Esta frase tiene muchas letras que son e, ademas es una estupidez";
		frase= " " + frase + " ";
		
		int espacio1=0;
		int espacio2=0;
		int cont=0;
		char caracter=' ';
		String palabra="";
		while (espacio2!=-1) {
			
		
		espacio2=frase.indexOf(" ", espacio1+1);	
			if (espacio2!=-1) {
			
				palabra=frase.substring(espacio1,espacio2);
				palabra=palabra.trim();
				cont=0;
			
				for (int i=0; i<palabra.length(); i++) {
				
					caracter=palabra.charAt(i);

						if(caracter=='e') {
							cont++;
								if (cont==1) {
									System.out.println(palabra);
							
						}
					
					}
			}
	
		}			
		

		espacio1=espacio2;
		}
		
		
		
		boolean b = true;
		String frase1="Esta es una frase con algunas letras a";
		for (int i=0; i<frase1.length(); i++) {
		if (frase1.toLowerCase().charAt(i)=='a') {
		if(b) {
		System.out.print('A');
		b = false;
		}else {
		System.out.print(frase1.charAt(i));
		b = true;
		}
		}else {
		System.out.print(frase1.charAt(i));
		}
		}
		
		
		int a[]= {1,3,5,7,8};
		int b[]= {1,2,3,4,5};
		
		int s[]= new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			
			s[i]= a[i]+b[i];
			
			System.out.println(s[i]);
		}
		
			

	
		int a[]= {1,4,6,10,-3,4,6,-5};
		
		int b=0;
		
		for (int i=0; i<a.length; i++) {
			b=b+a[i];
		}
	
					System.out.println(b);

		
		int a[]= {2,3,4,7,8,10,11,12,13};
		String b[]= new String[a.length];
		int aux=0;
		for (int i=0; i<a.length; i++) {
		
			aux=a[i]; 
			if (aux%2==0) {
				
				b[i]=a[i]+"Es par"; System.out.println(b[i]);
				}
			if (aux%2==1) {
				
				b[i]=a[i]+"Es Impar"; System.out.println(b[i]);
				}
			
		}
			
		
		
	int a[] = { 2, 3, 4, 7, 8, 10, 11 };
	int auxg = 0;
	int auxmenor = 0;
	int auxmayor = 0;
	int cont = 0;
	int reaux = 0;

	for (int i = 0; i < a.length; i++) {

		auxg = a[i];

		if (auxg < 6) {
			auxmenor++;
		}

		if (auxg > 6) {
			auxmayor++;
		}

	}
	auxg = 0;
	int cont2 = 0;
	int menor[] = new int[auxmenor];
	int mayor[] = new int[auxmayor];
	for (int i = 0; i < a.length; i++) {

		auxg = a[i];

		if (auxg < 6) {
			reaux = auxg;
			menor[cont] = reaux;
			cont++;

		}
		if (auxg > 6) {
			reaux = auxg;
			mayor[cont2] = reaux;
			cont2++;

		}

	}
	Arrays.sort(menor);
	System.out.println("Esto es menor que 6 " + Arrays.toString(menor));
	Arrays.sort(mayor);
	System.out.println("Esto es mayor que 6 " + Arrays.toString(mayor));
	
		
		int a[] = {2, 3, 4, 7, 8, 10, 11,12,34,50,51};
		int auxg = 0;
		int auximpar = 0;
		int auxpar = 0;
		int cont = 0;
		int reaux = 0;

		for (int i = 0; i < a.length; i++) {

			auxg = a[i];

			if (auxg%2==0) {
				auximpar++;
			}

			if (auxg%2==1) {
				auxpar++;
			}

		}
		auxg = 0;
		int cont2 = 0;
		int impar[] = new int[auximpar];
		int par[] = new int[auxpar];
		for (int i = 0; i < a.length; i++) {

			auxg = a[i];

			if (auxg%2==0) {
				reaux = auxg;
				impar[cont] = reaux;
				cont++;

			}
			if (auxg%2==1) {
				reaux = auxg;
				par[cont2] = reaux;
				cont2++;

			}
		2-3-4-7-8-10-11
		}
		Arrays.sort(impar);
		System.out.println("Los numeros pares son " + Arrays.toString(impar));
		Arrays.sort(par);
		System.out.println("Los numeros impares " + Arrays.toString(par));
		
		
		int a[]= {2,3,4,7,8,10,11};
		int b[]= new int[a.length*2];
		int cont=0;
		for (int i=0; i<b.length; i++) {
			
			if (cont<a.length) {
			
			b[cont*2]=a[cont];

			cont++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
		

		int a[]= {2,3,4,7,8};
		int diez=10;
		
		for (int i=0; i<a.length; i++) {
			
		a[i]=a[i]*diez;
		diez=diez*10;
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		double a []= {1,3,5,7,9};
		double b[]={6,4,2,1,3};
		double c[]=new double [a.length];
		
		for (int i=0; i<a.length; i++) {
			
			c[i]=a[i]*b[i];
			c[i]=c[i]/10;
			
		}
		
		System.out.println(Arrays.toString(c));
	
		
		char a[]= {'P','a','l','a','b','r','a'};
		String  palabra="";
		for (int i=0; i<a.length; i++) {
			
			palabra=palabra+a[i];
			
		}
		System.out.println(palabra);	
		
		
		
		int a[]= {4, 6, 1, 5, 6, 15, 12, 7};
		int b[]= new int [a.length];
		int cont=0;
		Arrays.sort(a);
		
		for (int i=a.length-1; i>=0; i--) {
			
			b[cont]=a[i];
			
			cont++;

		}
		System.out.println(Arrays.toString(b));
		
		
		
		String a []= {"tren","coche","barco","avioneta"};
		int b[]= new int [a.length];
		
		for(int i=0; i<a.length; i++) {
		b[i]=a[i].length(); 
		}
		System.out.println(Arrays.toString(b));
		
		


	int a[] = { 2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18, 22, -1, -15};
	int diez = 0;
	int veinte = 0;
	int treinta = 0;
	int reaux=0;
	for (int i = 0; i < a.length; i++) {

		if (a[i] <= 10) {
			diez++;
		}

		if (a[i] >= 11 && a[i] <= 20) {
			veinte++;
		}

		if (a[i] >= 21 && a[i] <= 30) {
			treinta++;
		}

	}

	int b[] = new int[diez];
	int c[] = new int[veinte];
	int d[] = new int[treinta];
	int conta=0;
	int contb=0;
	int contc=0;
	
	for (int i=0; i<a.length; i++) {
		
		reaux=a[i];
		
		if (reaux<=10) {
			b[conta]=reaux;
			conta++;
			
		}
		
		if (reaux>=11 && reaux <=20) {
			
			c[contb]=reaux;
			contb++;
		}
		
		if (reaux >=21 && reaux <=30) {
			d[contc]=reaux;
			contc++;
			
		}

	}
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	
	
		//Ejercicio fallido 5
		
		String frasee="Esta es la frase que vamos a partir";
		frasee= " " + frasee + " ";
		
		int espacio1=0;
		int espacio2=0;
		int cont=0;
		String aux= "";
		String word[]= new String[cont]; System.out.println(cont);
		//String palabra="";
		while (espacio2!=-1) {
		int i=0;	
		
		espacio2=frasee.indexOf(" ", espacio1+1);	
		if (espacio2!=-1) {
		String palabra=frasee.substring(espacio1,espacio2); aux=palabra; 
		//word[cont]=palabra; //System.out.println(word[cont]);
		System.out.println(palabra);
	
		cont++;
		//System.out.println(palabra);
		}
		
		espacio1=espacio2;
		}		//System.out.println(Arrays.toString(word));
	
	
		
	int num[] = { 2, 3, 4, 0, 2, 1, 4 };
	String text[] = { "hola", "adios", "que", "veremos", "suponiendo", "puede", "quizas" };
	String aux = " ";
	char fin[] = new char[text.length];
	int numaux = 0;
	char a = ' ';
	for (int i = 0; i < text.length; i++) {

		aux = text[i];
		numaux = text.length;

		if (num[i] > aux.length()) {
			fin[i] = '#';

		}

		else {
			a = aux.charAt(num[i]);
			fin[i] = a;

		}

	}
	System.out.println(Arrays.toString(fin));

		
		
		String frasee="Esta es la frase de ahora que vamos a partir";
		frasee= " " + frasee + " ";
		
		int espacio1=0;
		int espacio2=0;
		int cont=0;
		int contb=0;
		while (espacio2 != -1) {

			espacio2 = frasee.indexOf(" ", espacio1 + 1);
			if (espacio2 != -1) {
				String palabra = frasee.substring(espacio1, espacio2);
				palabra = palabra.trim();
				cont++;
			}
			espacio1 = espacio2;
		}
		
		
		String tres[]= new String[cont]; 
		espacio1=0;
		espacio2=0;
		
		while (espacio2 != -1) {

			espacio2 = frasee.indexOf(" ", espacio1 + 1);
			if (espacio2 != -1) {
				String palabra = frasee.substring(espacio1, espacio2);
				palabra = palabra.trim();
				tres[contb]=palabra;
				contb++;
				
			}
			espacio1 = espacio2;
		}
		System.out.println(Arrays.toString(tres));
		
		
		
	String frase = "Esta es la frase que vamos a partir en partes cada vez mas pequeñas hasta que no haya nada mas";
	String palabras[] = frase.split(" ");
	int cont = 0;
	int i = 0;

	for (String palabra : palabras) {
		cont++;
	}

	String fin[] = new String[cont];

	while (i < cont) {

		for (String palabra : palabras) {

			fin[i] = palabra;
			i++;
		}

	}
	System.out.println(Arrays.toString(fin));
	
		
		String frase = "Esta es la frase que vamos a partir en partes cada vez mas pequeñas hasta que no haya nada mas";
		String palabras[] = frase.split(" ");
		System.out.println(Arrays.toString(palabras));

		
	double numa[] = { 6, 9, 8, 10, 11 };
	double numb[] = { 2, 3, 4, 2, 3 };
	double numc[] = new double[numa.length];

	for (int i = 0; i < numc.length; i++) {

		numc[i] = numa[i] / numb[i];

		if (numc[i] < 4) {
			numc[i] = numc[i] + 10;
		}

	}
	System.out.println(Arrays.toString(numc));

		
	char a[] = { 'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x' };
	String b[] = new String[a.length / 3];
	int cont = 0;

	for (int i = 0; i < a.length; i = i + 3) {

		b[cont] = a[i] + "" + a[i + 1] + a[i + 2];
		cont++;

	}

	System.out.println(Arrays.toString(b));

		
	String frase = "Esta es la frase del ejercicio nueve";
	int cont = 0;
	int contb = 0;
	char letra = ' ';

	for (int i = 0; i < frase.length(); i++) {

		letra = frase.charAt(i);

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o'
				|| letra == 'O' || letra == 'u' || letra == 'U') {

			cont++;

		}

		else if (letra == ' ')
			;

		else {
			contb++;
		}
	}

	char vocales[] = new char[cont];
	char consonantes[] = new char[contb];

	cont = 0;
	contb = 0;
	for (int i = 0; i < frase.length(); i++) {

		letra = frase.charAt(i);

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o'
				|| letra == 'O' || letra == 'u' || letra == 'U') {

			vocales[cont] = letra;
			cont++;
		}

		else if (letra == ' ')
			;
		else {
			consonantes[contb] = letra;
			contb++;

		}

	}
	System.out.println(Arrays.toString(vocales));
	System.out.println(Arrays.toString(consonantes));
	*/
		
	String palabras[] = { "Coche", "Tren", "Avion", "Furgoneta", "Moto", "Barco", "Autobus" };
	Boolean compara[] = { false, true, true, false, true, true, false };
	String transformar = " ";
	boolean comparando = true;
	int conta = 0;
	int contb = 0;
	int auxa = 0;
	int auxb = 0;
	for (int i = 0; i < compara.length; i++) {

		comparando = compara[i];

		if (comparando == true) {
			conta++;
		}

		else {
			contb++;
		}
	}

	String mayus[] = new String[conta];
	String minus[] = new String[contb];

	for (int i = 0; i < compara.length; i++) {

		comparando = compara[i];
		transformar = palabras[i];
		if (comparando == true) {
			transformar = transformar.toUpperCase();
			mayus[auxa] = transformar;
			auxa++;
		}

		else {

			transformar = transformar.toLowerCase();
			minus[auxb] = transformar;
			auxb++;
		}

	}

	System.out.println(Arrays.toString(mayus));
	System.out.println(Arrays.toString(minus));
}
}
