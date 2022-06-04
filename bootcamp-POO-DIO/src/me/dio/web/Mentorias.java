package me.dio.web;

import java.sql.Time;
import java.time.LocalDate;


public class Mentorias extends ConteudoBootcamp{

    private LocalDate dataMentoria;
    public Integer xpMentoria;
    public Time horaMentoria;
    public static final Integer duracaoMentoria =3;

    public Time getHoraMentoria() {
        return horaMentoria;
    }

    public void setHoraMentoria(Time horaMentoria) {
        this.horaMentoria = horaMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public Integer getXpMentoria() {
        return xpMentoria;
    }

    public void setXpMentoria(Integer xpMentoria) {
        this.xpMentoria = xpMentoria;
    }

    //public Integer totalMentorias = qtdMentorias*duracaoMentoria;

    public Integer calcularCargaHorariaMentorias() {
        return qtdMentorias*duracaoMentoria;
    }

    @Override
    public Integer calcularXp() {
        return xpMentoria;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "nome='" + nome + '\'' +
                "descricao='" + descricao + '\'' +
                ", dataMentoria=" + dataMentoria +" " +horaMentoria +
                ", xpMentoria=" + xpMentoria +
                '}';
    }
}
