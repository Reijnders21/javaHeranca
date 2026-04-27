public class Ave extends Animal {
    private double envergaduraAsa;
    private boolean podeVoar;

    public Ave(String nome, int idade, String habitat, double envergaduraAsa, boolean podeVoar) {
        super(nome, idade, habitat);
        this.envergaduraAsa = envergaduraAsa;
        this.podeVoar = podeVoar;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave emite um som característico (ex: canto, grasnido).");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Ave ===");
        super.exibirDados();
        System.out.println("Envergadura da asa: " + envergaduraAsa + " metros");
        System.out.println("Pode voar: " + (podeVoar ? "Sim" : "Não"));
        emitirSom();
        System.out.println();
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}

