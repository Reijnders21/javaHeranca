public class Mamifero extends Animal {
    private boolean temPelos;
    private int tempoGestacao;

    public Mamifero(String nome, int idade, String habitat, boolean temPelos, int tempoGestacao) {
        super(nome, idade, habitat);
        this.temPelos = temPelos;
        this.tempoGestacao = tempoGestacao;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero emite um som característico (ex: rugido, latido).");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Mamífero ===");
        super.exibirDados();
        System.out.println("Tem pelos: " + (temPelos ? "Sim" : "Não"));
        System.out.println("Tempo de gestação: " + tempoGestacao + " meses");
        emitirSom();
        System.out.println();
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}

