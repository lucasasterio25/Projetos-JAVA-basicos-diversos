
public class Livro {
	
	private int codCatalogo;
	private String doacao;
	private String nomeObra;
	private String nomeAutor;
	private int codArea;
	private String palavraChave;
	
	private Livro anterior;
	private Livro proxima;
	
	public Livro getProxima() {
		return proxima;
	}

	public void setProxima(Livro proxima) {
		this.proxima = proxima;
	}

	public Livro getAnterior() {
		return anterior;
	}

	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}

	public int getCodCatalogo() {
		return codCatalogo;
	}
	
	public void setCodCatalogo(int codCatalogo) {
		this.codCatalogo = codCatalogo;
	}
	
	public String getDoacao() {
		return doacao;
	}
	
	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}
	
	public String getNomeObra() {
		return nomeObra;
	}
	
	public void setNomeObra(String nomeObra) {
		this.nomeObra = nomeObra;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public int getCodArea() {
		return codArea;
	}
	
	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}
	
	public String getPalavraChave() {
		return palavraChave;
	}
	
	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	
	public String toString(){
		String texto = "\nCódigo de Catalogação: " + this.codCatalogo + "\n" +
						"Doacao: " + this.doacao +  "\n" +
						"Nome da Obra: " + this.nomeObra + "\n" +
						"Nome do Autor: " + this.nomeAutor + "\n" +
						"Código da Área: " + this.codArea + "\n";
		
		return texto;					
	}

}
