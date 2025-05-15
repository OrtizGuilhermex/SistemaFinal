public class LimparTerminal {

    public static void limparTerminal() {
        String sistema = System.getProperty("os.name").toLowerCase();
        try {
            if (sistema.contains("win")) {
                // Para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para Linux e macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
