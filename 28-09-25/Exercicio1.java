class Livro {
  String titulo;
  String autor;
  int anoPublicacao;

 public Livro(){
    this.titulo = "Sem titulo";
    this.autor = "Desconhecido";
    this.anoPublicacao = 0;
  }

  public Livro(String titulo, String autor, int anoPublicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public void exibirDetalhes(){
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de Publicação: " + anoPublicacao);
  }

  public static void main(String[] args){
    Livro livroSemParametros = new Livro();
    livroSemParametros.exibirDetalhes();

    Livro livroComParametros = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    livroComParametros.exibirDetalhes();
  }
}