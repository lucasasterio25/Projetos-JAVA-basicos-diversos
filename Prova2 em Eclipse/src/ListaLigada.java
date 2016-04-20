

public class ListaLigada {
    
	private Livro primeira; 
	private Livro ultima;
	private int totalDeElementos;
	
	public void adiciona(Livro elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			this.ultima.setProxima(elemento);
			elemento.setAnterior(this.ultima);
			this.ultima = elemento;
			this.totalDeElementos++;
		}
	} 
	
	public void adiciona(int posicao, Livro elemento) { 
	    
	    if(posicao== 0){ // No come√ßo.
	        this.adicionaNoComeco(elemento);} 
	    else if(posicao== this.totalDeElementos){ // No fim.
	        this.adiciona(elemento);} 
	    else {
	        Livro anterior = this.pegaLivro(posicao- 1);
	        Livro proxima = anterior.getProxima();
	        elemento.setProxima(anterior.getProxima()); 
	        elemento.setAnterior(anterior); 
	        anterior.setProxima(elemento); 
	        proxima.setAnterior(elemento); 
	        this.totalDeElementos++;
	
	}
	
	}
	
	public void adicionaNoComeco(Livro elemento) {
		elemento.setProxima(this.primeira);
		this.primeira = elemento;
		if(this.totalDeElementos == 0){
		// caso especial da lista vazia
		this.ultima = this.primeira;
		}
		this.totalDeElementos++;
		}

	
	public void remove(int posicao){ 
	    if (!this.posicaoOcupada(posicao)){ 
	        throw new IllegalArgumentException("Posi√ß√£o n√£o existe");
	    }
	    if (posicao== 0) { this.removeDoComeco();
	    } 
	    else if (posicao== this.totalDeElementos - 1) { this.removeDoFim();
	    } 
	    else {
	    Livro anterior = this.pegaLivro(posicao- 1);
	    Livro atual = anterior.getProxima(); 
	    Livro proxima = atual.getProxima();
	    anterior.setProxima(proxima); 
	    proxima.setAnterior(anterior); this.totalDeElementos--;
	}
	}
	
	public void removeDoComeco(){
	    if (!this.posicaoOcupada(0)) { 
	    throw new IllegalArgumentException("PosiÁ„o n„o existe");
	    } 
	    this.primeira = this.primeira.getProxima();
	    this.totalDeElementos--;
	    if (this.totalDeElementos == 0) {
	        this.ultima = null;
	        }
	}
	
	public void removeDoFim(){ 
	if (!this.posicaoOcupada(this.totalDeElementos - 1)) { 
	throw new IllegalArgumentException("PosiÁ„o n„o existe");
	} 
	if (this.totalDeElementos == 1) {
	    this.removeDoComeco();
	    } 
	else {
	    Livro penultima = this.ultima.getAnterior(); 
	penultima.setProxima(null); 
	this.ultima = penultima; 
	this.totalDeElementos--;
	
	}
	
	}
	
	public Livro pega(int posicao){ return this.pegaLivro(posicao);}
	
	private Livro pegaLivro(int posicao){ 
	    if(!this.posicaoOcupada(posicao)){ 
	        throw new IllegalArgumentException("Posi√ß√£o n√£o existe");
	    }
	
	    Livro atual = primeira; 
	    for (int i = 0; i < posicao; i++) { 
	        atual = atual.getProxima();
	    } return atual;
	
	}
	
	public String toString() {
	
	    if(this.totalDeElementos == 0){ 
	        return "\nLista vazia!\n";
	    }
	
	StringBuilder builder = new StringBuilder("");
	
	Livro atual = primeira;
	
	for (int i = 0; i < this.totalDeElementos - 1; i++) { 
	    builder.append(atual); 
	    builder.append("\n"); 
	    atual = atual.getProxima();
	
	}
	
	builder.append(atual);
	builder.append("\n"); 
	return builder.toString();
	
	}
	
	public int tamanho(){
		return this.totalDeElementos; 
	}
	
	public boolean contem(Livro elemento){ 
	    Livro atual = this.primeira;
	        while (atual!= null) { if (atual.equals(elemento)){ return true;
	            } 
	        atual = atual.getProxima();
	        } 
	        return false;
	}
	
	private boolean posicaoOcupada(int posicao){ 
	    return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public Livro getPrimeira() {
		return primeira;
	}
	
	public void setPrimeira(Livro primeira){
		this.primeira = primeira;
	}
	
	public Livro getUltima() {
		return ultima;
	}

	public Livro getUltimoElemento(){
		if(this.totalDeElementos == 0){
			throw new IllegalArgumentException("Lista vazia");
		} else {
			return this.pega(totalDeElementos - 1); 
		}
	}
	
	public Livro getPrimeiroElemento(){
		if(this.totalDeElementos == 0){
			throw new IllegalArgumentException("Lista vazia");
		} else {
			return this.pega(0); 
		}
	}
	
	public ListaLigada Ordena(){
		Livro[] livros = new Livro[this.tamanho()];
		ListaLigada listaOrd = new ListaLigada();
		
		//Coloca a lista num vetor de Livros
		for(int i = 0; i < this.tamanho(); i++){
			livros[i] = this.pega(i);
		}
		
		//Ordena o vetor utilizando QuickSort
		QuickSort.quick_sort(livros, 0, livros.length-1);
		
		//Joga o vetor ordenado numa nova lista ordenada
		for(int i = 0; i < this.tamanho(); i++){
			listaOrd.adiciona(livros[i]);
		}
		
		return listaOrd;
	}
}