package trabalhoSTRING;

import java.util.Scanner;

public class TrabalhoTOP {

	public static void main(String[] args) {
		 Scanner entry = new Scanner(System.in);
		 int a; //declarar variÃ¡vel para abrir a entrada para o usuÃ¡rio
			System.out.println("Digite um verbo terminado em er:");
			String USER = entry.nextLine();
			USER.toLowerCase(); //Tratamento para deixar a string padrão pq o java é sensivel e para deixar bonito
			int tamanho = USER.length();// tamanho da String
			String posição = USER.substring(0, tamanho -2); //variavel que guarda apenas o radical do verbo, ou seja, tira a parte "er" e guarda o resto
			
			do { // para fazer o menu aparecer até o usuario digitar 4
			System.out.println("   --------------------------------------------");
			System.out.println("         Em qual tempo você deseja conjulgar                ");
	        System.out.println("                                                                   ");
	        System.out.println("  [1] Presente                                                     ");
	        System.out.println("  [2] Pretérito perfeito                                          ");
	        System.out.println("  [3] Futuro do presente                                           ");
	        System.out.println("  [4] Sair                                               ");                                            
	        System.out.println("  --------------------------------------------");
	        a = entry.nextInt(); //saÃ­da do usuÃ¡rio verbo no infinitivo + menu de opÃ§Ãµes
	        
	        
	        
	        switch (a) { // switch para poder acessar e dividir as partes do menu

	        case 1:
	        	String [] ARRAY = Presente(USER, posição); // uma array que guarda a array resultante do método
	        	for(int i = 0; i <ARRAY.length; i++ ) { //i posição do conteudo na array, o for vai rodar até todas as strings de dentro da array serem imprimidas
	        		System.out.println(ARRAY[i]);
	        	}
	        break; 
	        case 2:
	        	String [] ARRAY1 = Pretéritoperfeito(USER, posição);
	        	for(int i = 0; i <ARRAY1.length; i++ ) {
	        		System.out.println(ARRAY1[i]);
	        	}
	        break; 
	        case 3:
	        	String [] ARRAY2 = futuro(USER, posição);
	        	for(int i = 0; i <ARRAY2.length; i++ ) {
	        		System.out.println(ARRAY2[i]);
	        	}
	        break; 
	        
		    default: 
		    	System.out.println("Opção inválida");
		    	break;
	  }
			}while(a != 4); // saída 
	}
	  public static String[] Presente(String USER, String posição) {
			
			    String A1 = "Eu" + " " + USER.replace("er","o"); // string para guardar o verbo com sua alteração 
			    String B1 = "Tu" + " " + USER.replace("er","es");
			    String C1 = ("ele"+ " " + USER.replace("er","e"));
			    String D1 = ("nÃ³s" + " " + USER.replace("er","emos"));
			    String E1 = ("vÃ³s" + " " + USER.replace("er","eis")); 
			    String F1 =("eles" + " " + USER.replace("er","em"));
			    String [] presenteresultado = {A1,B1,C1,D1,E1,F1}; // maneira achada para conseguir retornar diversos resultados em um único método
			    // nessa array contem todos as strings com os verbos alterados
				return presenteresultado;    
		
	  }
	  
	  public static String[] Pretéritoperfeito(String USER, String posição) {
		  String A1 = "Eu" + " " + USER.replace("er","i");
		    String B1 = "Tu" + " " + USER.replace("er","este");
		    String C1 = ("ele"+ " " + USER.replace("er","eu"));
		    String D1 = ("nÃ³s" + " " + USER.replace("er","emos"));
		    String E1 = ("vÃ³s" + " " + USER.replace("er","estes")); 
		    String F1 =("eles" + " " + USER.replace("er","eram"));
		    String [] pretéritoPe = {A1,B1,C1,D1,E1,F1};
			return pretéritoPe;
		  
		  
	  }

	  public static String[] futuro (String USER, String posição) {
		  String A1 = "Eu" + " " + USER.replace("er","erei");
		    String B1 = "Tu" + " " + USER.replace("er","erÃ¡s");
		    String C1 = ("ele"+ " " + USER.replace("er","erÃ¡"));
		    String D1 = ("nÃ³s" + " " + USER.replace("er","eremos"));
		    String E1 = ("vÃ³s" + " " + USER.replace("er","ereis")); 
		    String F1 =("eles" + " " + USER.replace("er","erÃ£o"));
		    String []futuroresposta = {A1,B1,C1,D1,E1,F1};
			return futuroresposta;
	  }
	}