package br.com.fiapride.model;

public class HQ extends Caderno{
    
    private boolean isColorido;

    public HQ(String tituloCapa, int marcaPagina, int totalFolhas, Autor escritor, boolean isColorido) {
        super(tituloCapa, marcaPagina, totalFolhas, escritor);

        this.isColorido = isColorido;
    }

    public boolean isColorido() {
        return isColorido;
    }
}
