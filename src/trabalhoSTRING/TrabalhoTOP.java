package trabalhoSTRING;

import java.util.Scanner;

public class TrabalhoTOP {

	public static void main(String[] args) {
		 Scanner entry = new Scanner(System.in);
		 int a; //declarar variável para abrir a entrada para o usuário
			System.out.println("Digite um verbo terminado em er:");
			String USER = entry.nextLine();
			USER.toLowerCase(); //Tratamento para deixar a string padr�o pq o java � sensivel e para deixar bonito
			int tamanho = USER.length();// tamanho da String
			String posi��o = USER.substring(0, tamanho -2); //variavel que guarda apenas o radical do verbo, ou seja, tira a parte "er" e guarda o resto
			
			do { // para fazer o menu aparecer at� o usuario digitar 4
			System.out.println("   --------------------------------------------");
			System.out.println("         Em qual tempo voc� deseja conjulgar                ");
	        System.out.println("                                                                   ");
	        System.out.println("  [1] Presente                                                     ");
	        System.out.println("  [2] Pret�rito perfeito                                          ");
	        System.out.println("  [3] Futuro do presente                                           ");
	        System.out.println("  [4] Sair                                               ");                                            
	        System.out.println("  --------------------------------------------");
	        a = entry.nextInt(); //saída do usuário verbo no infinitivo + menu de opções
	        
	        
	        
	        switch (a) { // switch para poder acessar e dividir as partes do menu

	        case 1:
	        	String [] ARRAY = Presente(USER, posi��o); // uma array que guarda a array resultante do m�todo
	        	for(int i = 0; i <ARRAY.length; i++ ) { //i posi��o do conteudo na array, o for vai rodar at� todas as strings de dentro da array serem imprimidas
	        		System.out.println(ARRAY[i]);
	        	}
	        break; 
	        case 2:
	        	String [] ARRAY1 = Pret�ritoperfeito(USER, posi��o);
	        	for(int i = 0; i <ARRAY1.length; i++ ) {
	        		System.out.println(ARRAY1[i]);
	        	}
	        break; 
	        case 3:
	        	String [] ARRAY2 = futuro(USER, posi��o);
	        	for(int i = 0; i <ARRAY2.length; i++ ) {
	        		System.out.println(ARRAY2[i]);
	        	}
	        break; 
	        
		    default: 
		    	System.out.println("Op��o inv�lida");
		    	break;
	  }
			}while(a != 4); // sa�da 
	}
	  public static String[] Presente(String USER, String posi��o) {
			
			    String A1 = "Eu" + " " + USER.replace("er","o"); // string para guardar o verbo com sua altera��o 
			    String B1 = "Tu" + " " + USER.replace("er","es");
			    String C1 = ("ele"+ " " + USER.replace("er","e"));
			    String D1 = ("nós" + " " + USER.replace("er","emos"));
			    String E1 = ("vós" + " " + USER.replace("er","eis")); 
			    String F1 =("eles" + " " + USER.replace("er","em"));
			    String [] presenteresultado = {A1,B1,C1,D1,E1,F1}; // maneira achada para conseguir retornar diversos resultados em um �nico m�todo
			    // nessa array contem todos as strings com os verbos alterados
				return presenteresultado;    
		
	  }
	  
	  public static String[] Pret�ritoperfeito(String USER, String posi��o) {
		  String A1 = "Eu" + " " + USER.replace("er","i");
		    String B1 = "Tu" + " " + USER.replace("er","este");
		    String C1 = ("ele"+ " " + USER.replace("er","eu"));
		    String D1 = ("nós" + " " + USER.replace("er","emos"));
		    String E1 = ("vós" + " " + USER.replace("er","estes")); 
		    String F1 =("eles" + " " + USER.replace("er","eram"));
		    String [] pret�ritoPe = {A1,B1,C1,D1,E1,F1};
			return pret�ritoPe;
		  
		  
	  }

	  public static String[] futuro (String USER, String posi��o) {
		  String A1 = "Eu" + " " + USER.replace("er","erei");
		    String B1 = "Tu" + " " + USER.replace("er","erás");
		    String C1 = ("ele"+ " " + USER.replace("er","erá"));
		    String D1 = ("nós" + " " + USER.replace("er","eremos"));
		    String E1 = ("vós" + " " + USER.replace("er","ereis")); 
		    String F1 =("eles" + " " + USER.replace("er","erão"));
		    String []futuroresposta = {A1,B1,C1,D1,E1,F1};
			return futuroresposta;
	  }
	}