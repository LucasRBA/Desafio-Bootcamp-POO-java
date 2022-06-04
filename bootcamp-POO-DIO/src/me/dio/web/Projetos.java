package me.dio.web;

public class Projetos extends ConteudoBootcamp{


    public Integer xpMediaProjeto;

    public Integer getXpMediaProjeto() {
        return xpMediaProjeto;
    }

    public void setXpMediaProjeto(Integer xpMediaProjeto) {
        this.xpMediaProjeto = xpMediaProjeto;
    }

    @Override
    public Integer calcularXp() {
        return (xpMediaProjeto +(5*getQtdProjetos()*100));
    }

    @Override
    public String toString() {
        return "Projetos{" +
                "nome='" + nome + '\'' +
                ", xpMediaProjeto=" + xpMediaProjeto + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

