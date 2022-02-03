package br.com.mquintino.campoM;

import br.com.mquintino.campoM.modelo.Tabuleiro;
import br.com.mquintino.campoM.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);

    }
}
