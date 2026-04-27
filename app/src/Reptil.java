public class Reptil extends Animal {
    private boolean temEscamas;
    private String tipoSangue;

    public Reptil(String nome, int idade, String habitat, boolean temEscamas, String tipoSangue) {
        super(nome, idade, habitat);
        this.temEscamas = temEscamas;
        this.tipoSangue = tipoSangue;
    }

    @Override
    public void emitirSom() {
        System.out.println("O réptil emite um som característico (ex: silvo, estalo).");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Réptil ===");
        super.exibirDados();
        System.out.println("Tem escamas: " + (temEscamas ? "Sim" : "Não"));
        System.out.println("Tipo de sangue: " + tipoSangue);
        emitirSom();
        System.out.println();
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
}

