package br.com.tks;

public class Set {
    private Time time1;
    private Time time2;

    public Set() {
        //associação
        this.time1 = new Time();
        this.time2 = new Time();
    }

    public Time getTime1() {
        return time1;
    }
    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }
    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public boolean continuarSet() {
        //obtem pontos e armazena nas vars
        int pt1 = this.time1.getPontos();
        System.out.println("time 1 no continuar: " + pt1);
        int pt2 = this.time2.getPontos();
        System.out.println("time 2 no continuar: " + pt2);
        //checa se alguém venceu
        return (pt1 - pt2 < 2 || pt1 < 25)
                && (pt2 - pt1 < 2 || pt2 < 25);
    }

    public Time obterVencedor() {
        //pega as pontuações
        int pt1 = this.time1.getPontos();
        int pt2 = this.time2.getPontos();
        // retorna qual time venceu;
        if (pt1 > pt2) {
            return this.time1;
        } else {
            return this.time2;
        }
    }

    @Override
    public String toString() {
        return "Time 01: " + this.time1
                + "\nTime 02: " + this.time2;
    }
}
