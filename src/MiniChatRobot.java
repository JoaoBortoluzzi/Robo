import java.util.Scanner;

public class MiniChatRobot {

    private Respostas respostas;

    public MiniChatRobot() {
        respostas = new Respostas();
    }

    public void iniciarConversa() {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) {
            System.out.print("Você: ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            }

            String resposta = respostas.getResposta(entrada);
            System.out.println("MiniChatbot: " + resposta);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MiniChatRobot chatbot = new MiniChatRobot();
        chatbot.iniciarConversa();
    }
}
