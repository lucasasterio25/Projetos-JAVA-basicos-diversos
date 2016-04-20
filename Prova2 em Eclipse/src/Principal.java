import java.util.Scanner;

public class Principal {
		
	//metodo Principal
	public static void main(String[] args) {
		
		int escolha;
		int escolhaLista;
		int posicao;
		
		Scanner scan = new Scanner(System.in);
		
		ListaLigada exatas = new ListaLigada();
		ListaLigada humanas = new ListaLigada();
		ListaLigada biologicas = new ListaLigada();
		

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1) Consultar todos os volumes");
			System.out.println("2) Inserir livro na lista");
			System.out.println("3) Inserir livro em determinada posição da lista");
			System.out.println("4) Mostrar quantidade de livros de determinada área");
			System.out.println("5) Consultar livro por palavra chave");
			System.out.println("6) Consultar primeiro livro de determinada lista");
			System.out.println("7) Consultar ultimo livro de determinada lista");
			System.out.println("8) Ordenar todas as listas pelo código de catalogação do livro");
			System.out.println("0) Encerrar o programa");
			
			escolha = scan.nextInt();
			
			switch(escolha){
				case 1: //Consultar todos os volumes
					System.out.println("***** Dados dos livros de exatas *****");
					System.out.println(exatas);
					System.out.println("***** Dados dos livros de humanas *****");
					System.out.println(humanas);
					System.out.println("***** Dados dos livros de biologicas *****");
					System.out.println(biologicas);
					break;
				
				case 2: //Inserir livro na lista
					System.out.println("Informe a lista na qual deseja adicionar o livro: ");
					System.out.println("1)Exatas - 2)Humanas - 3)Biologicas ");
					
					escolhaLista = scan.nextInt();
					Livro livro = new Livro();
					
					System.out.println("Informe se o livro veio de doação ou não (S/N): ");
					livro.setDoacao(scan.next());
					System.out.println("Informe o nome da obra: ");
					livro.setNomeObra(scan.next());
					System.out.println("Informe o nome do autor: ");
					livro.setNomeAutor(scan.next());
					System.out.println("Informe a palavra chave de busca: ");
					livro.setPalavraChave(scan.next());
					livro.setCodArea(escolhaLista);
					
					switch(escolhaLista){
						case 1:
							livro.setCodCatalogo(exatas.tamanho()+1);
							exatas.adiciona(livro);
							break;
						case 2:
							livro.setCodCatalogo(humanas.tamanho()+1);
							humanas.adiciona(livro);
							break;
						case 3:
							livro.setCodCatalogo(biologicas.tamanho()+1);
							biologicas.adiciona(livro);
							break;
						default:
							System.out.println("Opção Inválida");
					}
					break;
				
				case 3: //Inserir livro em determinada posição da lista
					System.out.println("Informe a lista na qual deseja adicionar o livro: ");
					System.out.println("1)Exatas - 2)Humanas - 3)Biologicas ");
					
					escolhaLista = scan.nextInt();
					Livro livro2 = new Livro();
					
					System.out.println("Informe se o livro veio de doação ou não (S/N): ");
					livro2.setDoacao(scan.next());
					System.out.println("Informe o nome da obra: ");
					livro2.setNomeObra(scan.next());
					System.out.println("Informe o nome do autor: ");
					livro2.setNomeAutor(scan.next());
					System.out.println("Informe a palavra chave de busca: ");
					livro2.setPalavraChave(scan.next());
					livro2.setCodArea(escolhaLista);
					
					System.out.println("Informe a opção onde o livro sera inserida na lista");
					posicao = scan.nextInt();
					
					switch(escolhaLista){
						case 1:
							livro2.setCodCatalogo(exatas.tamanho()+1);
							exatas.adiciona(posicao, livro2);
							break;
						case 2:
							livro2.setCodCatalogo(humanas.tamanho()+1);
							humanas.adiciona(posicao, livro2);
							break;
						case 3:
							livro2.setCodCatalogo(biologicas.tamanho()+1);
							biologicas.adiciona(posicao, livro2);
							break;
						default:
							System.out.println("Opção Inválida");
					}
					break;
				
				case 4: //Mostrar quantidade de livros de determinada área
					System.out.println("Informe a área que gostaria de consultar a quantidade: ");
					System.out.println("1)Exatas - 2)Humanas - 3)Biologicas ");

					escolhaLista = scan.nextInt();

					switch(escolhaLista){
						case 1:
							System.out.println(exatas.tamanho());
							break;
						case 2:
							System.out.println(humanas.tamanho());
							break;
						case 3:
							System.out.println(biologicas.tamanho());
							break;
						default:
							System.out.println("Opção Inválida");
					}
					break;
				
				case 5: //Consultar livro por palavra chave
					String palavraChave;
					boolean encontrado = false;
					
					System.out.println("Informe a palavra chave de busca do livro: ");
					palavraChave = scan.next();
					
					//Procura o livro na lista de exatas
					System.out.println("***** Livros encontrados em exatas *****");
					for(int i = 0; i < exatas.tamanho(); i++){
						if(exatas.pega(i).getPalavraChave().equals(palavraChave)){ //Compara se existem livros com a palavra chave
							System.out.println(exatas.pega(i));
							encontrado = true;
						}
					}
					if(encontrado == false){
						System.out.println("Nenhum livro encontrado");
					}
					
					//Procura o livro na lista de humanas
					System.out.println("\n***** livros encontrados em humanas *****");
					encontrado = false;
					for(int i = 0; i < humanas.tamanho(); i++){
						if(humanas.pega(i).getPalavraChave().equals(palavraChave)){ //Compara se existem livros com a palavra chave
							System.out.println(humanas.pega(i));
							encontrado = true;
						}
					}
					if(encontrado == false){
						System.out.println("Nenhum livro encontrado");
					}
					
					//Procura o livro na lista de biologicas

					System.out.println("\n***** livros encontrados em biologicas *****");
					encontrado = false;
					for(int i = 0; i < biologicas.tamanho(); i++){
						if(biologicas.pega(i).getPalavraChave().equals(palavraChave)){ //Compara se existem livros com a palavra chave
							System.out.println(biologicas.pega(i));
							encontrado = true;
						}
					}
					if(encontrado == false){
						System.out.println("Nenhum livro encontrado\n");
					}
					
				
				case 6: //Consultar primeiro livro de determinada lista
					System.out.println("Informe a área que gostaria de consultar o primeiro livro: ");
					System.out.println("1)Exatas - 2)Humanas - 3)Biologicas ");

					escolhaLista = scan.nextInt();

					switch(escolhaLista){
						case 1:
							System.out.println(exatas.getPrimeiroElemento());
							break;
						case 2:
							System.out.println(humanas.getPrimeiroElemento());
							break;
						case 3:
							System.out.println(biologicas.getPrimeiroElemento());
							break;
						default:
							System.out.println("Opção Inválida");
					}
					break;
				
				case 7: //Consultar ultimo livro de determinada lista
					System.out.println("Informe a área que gostaria de consultar o ultimo livro: ");
					System.out.println("1)Exatas - 2)Humanas - 3)Biologicas ");

					escolhaLista = scan.nextInt();

					switch(escolhaLista){
						case 1:
							System.out.println(exatas.getUltimoElemento());
							break;
						case 2:
							System.out.println(humanas.getUltimoElemento());
							break;
						case 3:
							System.out.println(biologicas.getUltimoElemento());
							break;
						default:
							System.out.println("Opção Inválida");
					}
					break;
				
				case 8:
					exatas = exatas.Ordena();
					humanas = humanas.Ordena();
					biologicas = biologicas.Ordena();
					System.out.println("Listas ordenadas com sucesso!");
				
				default:
					System.out.println("Opção inválida!");
			}
			
		} while(escolha != 0);
		
		scan.close();
		System.out.println("Programa encerrado");
	}
}
