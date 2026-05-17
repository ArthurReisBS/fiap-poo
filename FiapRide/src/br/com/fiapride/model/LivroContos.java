package br.com.fiapride.model;

public class LivroContos extends Caderno{

    private int quantidadeDeContos;

    public LivroContos(String tituloCapa, int marcaPagina, int totalFolhas, Autor escritor, int quantidadeDeContos) {
        super(tituloCapa, marcaPagina, totalFolhas, escritor);

        setQuantidadeDeContos(quantidadeDeContos);
    }

    // Getters e Setters:
    public void setQuantidadeDeContos(int quantidadeDeContos) {
        if(quantidadeDeContos <= 0){
            System.out.println("ERRO: A quantidade de contos do livro de contos não pode ser menor ou igual a 0.");
            return;
        }this.quantidadeDeContos = quantidadeDeContos;
    }

    public int getQuantidadeDeContos() {
        return this.quantidadeDeContos;
    }
    
}
