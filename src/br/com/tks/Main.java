package br.com.tks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set set1 = new Set();
        byte escolha = -1;
        /* Definição dos times */
        Time t1 = new Time();
        Time t2 = new Time();

        /* PEGA OS DADOS DO TIME 1*/
        System.out.println("*** TIME 1 ***");
        System.out.println("Nome do time 1: ");
        t1.setNome(sc.nextLine());
        System.out.println("Técnico do time 1: ");
        t1.setTecnico(sc.nextLine());

        /* PEGA OS DADOS DO TIME 2*/
        System.out.println("*** TIME 2 ***");
        System.out.println("Nome do time 2: ");
        t2.setNome(sc.nextLine());
        System.out.println("Técnico do time 2: ");
        t2.setTecnico(sc.nextLine());

        /* SETANDO TIMES NA CLASSE SET */
        set1.setTime1(t1);
        set1.setTime2(t2);

        /* CONTROLE DE PARTIDA */
        do {
            System.out.println(set1 + "\n");
            System.out.println("1 - Marcar ponto para: " + t1.getNome());
            System.out.println("2 - Marcar ponto para: " + t2.getNome());
            escolha = sc.nextByte();
            switch (escolha) {
                case 1:
                    t1.pontuar();
                    System.out.println("Ponto para " + t1.getNome());
                    break;
                case 2:
                    t2.pontuar();
                    System.out.println("Ponto para " + t2.getNome());
                    break;
                    default:
                        System.out.println("Opcão inválida!");
            }
        } while (set1.continuarSet());
        System.out.println("\nPartida encerrada!");
        System.out.println(set1);
        System.out.println("VENCEDOR: " + set1.obterVencedor());
    }
}
