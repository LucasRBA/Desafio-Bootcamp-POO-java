package me.dio.web;

public class DesafiosCodigo extends ConteudoBootcamp{

    public Integer xpMediaDesafio;

    public Integer getXpMediaDesafio() {
        return xpMediaDesafio;
    }

    public void setXpMediaDesafio(Integer xpMediaDesafio) {
        this.xpMediaDesafio = xpMediaDesafio;
    }

    @Override
    public Integer calcularXp() {
        return (xpMediaDesafio +(getQtdDesafios()*xpMediaDesafio));
    }

    @Override
    public String toString() {
        return "DesafiosCodigo{" +
                "nome='" + nome + '\'' +
                "descricao='" + descricao + '\'' +
                ", xpMediaDesafio=" + xpMediaDesafio +
                ", Xp Total Desafio= " + calcularXp() +
                '}';
    }
}
