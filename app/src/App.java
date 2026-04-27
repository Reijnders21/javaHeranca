public class App {
    public static void main(String[] args) throws Exception {
        Mamifero leao = new Mamifero("Leão", 5, "Savana", true, 4);
        Ave aguia = new Ave("Águia", 3, "Montanhas", 2.3, true);
        Reptil cobra = new Reptil("Cobra", 2, "Floresta Tropical", true, "Ectotérmico");

        leao.exibirDados();
        aguia.exibirDados();
        cobra.exibirDados();
    }
}

