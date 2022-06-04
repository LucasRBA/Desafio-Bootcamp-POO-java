package me.dio.web;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs extends ConteudoBootcamp{

    Bootcamp bootcamp = new Bootcamp();

    private boolean inscricao;
    private Integer nivelDev;
    private Integer xpDev;
    private Set<ConteudoBootcamp> cursosCompletos = new LinkedHashSet<>();
    private Set<ConteudoBootcamp> conteudosInscritos = new LinkedHashSet<>();
    private  boolean exibirCursos;

    public boolean isInscricao() {
        return inscricao;
    }

    public void setInscricao(boolean inscricao) {
        this.inscricao = inscricao;
    }

    public Set<ConteudoBootcamp> getCursosCompletos() {
        return cursosCompletos;
    }

    public void setCursosCompletos(Set<ConteudoBootcamp> cursosCompletos) {
        this.cursosCompletos = cursosCompletos;
    }

    public Set<ConteudoBootcamp> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<ConteudoBootcamp> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Integer getNivelDev() {
        return nivelDev;
    }

    public void setNivelDev(Integer nivelDev) {
        this.nivelDev = nivelDev;
    }

    public Integer getXpDev() {
        return xpDev;
    }

    public void setXpDev(Integer xpDev) {
        this.xpDev = xpDev;
    }


    public boolean isExibirCursos() {
        return exibirCursos;
    }

    public void setExibirCursos(boolean exibirCursos) {
        this.exibirCursos = exibirCursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return inscricao == devs.inscricao && exibirCursos == devs.exibirCursos && Objects.equals(nivelDev, devs.nivelDev) && Objects.equals(xpDev, devs.xpDev) && Objects.equals(cursosCompletos, devs.cursosCompletos) && Objects.equals(conteudosInscritos, devs.conteudosInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inscricao, nivelDev, xpDev, cursosCompletos, conteudosInscritos, exibirCursos);
    }

    @Override
    public Integer calcularXp() {
        return (nivelDev *(1500));
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getQtdDevs().add(this);
    }

    public void progressaoDev() {
        Optional<ConteudoBootcamp> conteudos = this.conteudosInscritos.stream().findFirst();
        if(conteudos.isPresent()) {
            this.cursosCompletos.add(conteudos.get());
            this.conteudosInscritos.remove(conteudos.get());
        } else {
            System.err.println("O Dev não está matriculado em nenhum bootcamp");
        }
    }


    public Integer emitirCertificado() {
        if (conteudos.isEmpty()) {
            System.out.println("Parabéns " +getNome() +" você concluiu o bootcamp!!!");
            Integer xpDevFinal = xpDev + 9400; //xpDev + bootcamp.totalXpBootcamp quebrava app
            System.out.println("Agora " + getNome() + " tem " +xpDevFinal + " de xp!");
            return xpDevFinal;
        } else {
            System.out.println("Você ainda não finalizou o bootcamp");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                "nivelDev=" + nivelDev + " " +
                "inscricao=" + inscricao +
                ", xpDev=" + xpDev +
                ", conteudosInscritos=" + conteudosInscritos +
                ", cursosCompletos=" + cursosCompletos +
                ", exibirCursos=" + exibirCursos +
                '}';
    }
}
