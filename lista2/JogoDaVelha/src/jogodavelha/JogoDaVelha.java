package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    enum Estado {
        Vazio,
        Jogador1,
        Jogador2
    }

    private Estado[][] grade;
    private Estado jogadorAtual;

    public JogoDaVelha() {
        grade = new Estado[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = Estado.Vazio;

            }
        }
        jogadorAtual = Estado.Jogador1;

    }

    public void exibirGrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(grade[i][j] + " ");
            }
        }

    }

    public boolean verificarMovimento(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && grade[linha][coluna] == Estado.Vazio;

    }

    public void fazerMovimento(int linha, int coluna) {
        if (verificarMovimento(linha, coluna)) {
            grade[linha][coluna] = jogadorAtual;
            jogadorAtual = (jogadorAtual == Estado.Jogador1) ? Estado.Jogador2 : Estado.Jogador1;
        } else {
            System.out.println("movimento inválido. tente novamente");
        }
    }

    public boolean verificarVencedor() {

        for (int i = 0; i < 3; i++) {
            if (grade[i][0] != Estado.Vazio && grade[i][0] == grade[i][1] && grade[i][0] == grade[i][2]) {
                return true;
            }
            if (grade[0][i] != Estado.Vazio && grade[0][i] == grade[1][i] && grade[0][i] == grade[2][i]) {
                return true;
            }
        }

        if (grade[0][0] != Estado.Vazio && grade[0][0] == grade[1][1] && grade[0][0] == grade[2][2]) {
            return true;
        }
        if (grade[0][2] != Estado.Vazio && grade[0][2] == grade[1][1] && grade[0][2] == grade[2][0]) {
            return true;
        }

        return false;
    }

    public boolean verificarEmpate() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == Estado.Vazio) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        while (true) {

            jogo.exibirGrade();

            System.out.println("Jogador " + jogo.jogadorAtual + ", faça sua jogada (linha coluna):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            jogo.fazerMovimento(linha, coluna);

            if (jogo.verificarVencedor()) {
                jogo.exibirGrade();
                System.out.println("Jogador " + jogo.jogadorAtual + " venceu!");
                break;
            }

            if (jogo.verificarEmpate()) {
                jogo.exibirGrade();
                System.out.println("O jogo empatou!");
                break;
            }
        }

        scanner.close();
    }

}


