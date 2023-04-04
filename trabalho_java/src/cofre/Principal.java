/**
 * 
 */
package cofre;
import java.util.Scanner;

/**
 * Sitema para armazenar e remover moedas em um cofre e calcular total convertido.
 * @author Douglas
 *
 */

public class Principal{
    public static void main(String[] args) {
    	
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
		int opcao, tipoMoeda;
        double valor;
        Moeda moeda;

        System.out.println("Selecione uma Opcao:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
        System.out.println("4 - Calcular Total");
		System.out.println("0 - Encerrar");     

        opcao = input.nextInt();

        while(opcao != 0){

            switch(opcao) {
                // Adicionar Moeda
                case 1:
                    tipoMoeda = 0;
                    while(tipoMoeda > 3 || tipoMoeda < 1){
		                System.out.println("1 - Real");     
		                System.out.println("2 - Dolar");     
		                System.out.println("3 - Euro");  
                        tipoMoeda = input.nextInt();
                    }
                    moeda = null;
                    
                    System.out.println("Qual o valor da moeda?");  
                    valor = input.nextDouble(); 
                    
                    switch(tipoMoeda) {
	                    case 1: moeda = new Real(valor); break;
	                    case 2: moeda = new Dolar(valor); break;
	                    case 3: moeda = new Euro(valor); break;
	                    default: System.out.println("Tipo Invalido"); 
                    }
                    
                    cofrinho.adicionarMoeda(moeda);

                    break;

                // Remover Moeda
                case 2:
                    tipoMoeda = 0;
                    System.out.println("Qual o tipo da moeda a ser removida?");
                    while(tipoMoeda > 3 || tipoMoeda < 1){
                        System.out.println("1 - Real");     
                        System.out.println("2 - Dolar");     
                        System.out.println("3 - Euro");  
                        tipoMoeda = input.nextInt();
                    }
                    System.out.println("Qual o valor da moeda a ser removida?");
                    
                    valor = input.nextDouble();
                    moeda = null;
                    
                    switch(tipoMoeda) {
	                    case 1: moeda = new Real(valor); break;
	                    case 2: moeda = new Dolar(valor); break;
	                    case 3: moeda = new Euro(valor); break;
	                    default: System.out.println("Tipo Invalido"); 
                    }

                    cofrinho.removerMoeda(moeda);

                break;
                
                // Listar Moedas
                case 3:
                    cofrinho.listarMoedas();
                break;
                
                // Total convertido
                case 4:
                    tipoMoeda = 0;
                    System.out.println("Para qual o tipo da moeda calcular o total?");
                    while(tipoMoeda > 3 || tipoMoeda < 1){
                        System.out.println("1 - Real");     
                        System.out.println("2 - Dolar");     
                        System.out.println("3 - Euro");  
                        tipoMoeda = input.nextInt();
	                }     
                    
                System.out.println("Total: " + cofrinho.totalConvertido(tipoMoeda));

                break;

                default:
                    System.out.println("Opcao Invalida.");
            }
            System.out.println("Selecione uma Opcao:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total");
            System.out.println("0 - Encerrar"); 
            opcao = input.nextInt();
        }
        
    }

}