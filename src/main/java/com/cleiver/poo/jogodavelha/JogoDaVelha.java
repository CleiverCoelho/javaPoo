package com.cleiver.poo.jogodavelha;
public class JogoDaVelha {

    int tamanhoLinha = 3;
    int tamanhoColuna = 3;
    char[][] jogoVelha = new char[tamanhoLinha][tamanhoColuna];
    int jogada = 1;

    boolean validarJogada(int linha, int coluna, char sinal) {

        if (!(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O')) {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        } else { //jogada inválida
            return false;
        }
    }

    void imprimirTabuleiro() {
        for (int i = 0; i < tamanhoLinha; i++) {
            for (int j = 0; j < tamanhoColuna; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal) {
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || //linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //diagonal
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
    }

    char vezDoJogador(){
        if (jogada % 2 == 1){
            System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
            return 'X';
        }else {
            System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
            return 'O';
        }

    }
}