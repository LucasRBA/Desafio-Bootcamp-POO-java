package me.dio.web;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public  abstract class ConteudoBootcamp {

    protected String nome;
    protected LocalDate dtInicial;
    protected LocalDate dtFinal;
    protected String descricao;
    protected Integer qtdCursos;
    protected Integer qtdProjetos;
    protected Integer qtdMentorias;
    protected Integer qtdDesafios;
    protected Set<ConteudoBootcamp> conteudos = new LinkedHashSet<>();
    protected Set<Devs> qtdDevs = new HashSet<>();


    public abstract Integer calcularXp();

    public Set<ConteudoBootcamp> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<ConteudoBootcamp> conteudos) {
        this.conteudos = conteudos;
    }

    public void setQtdDevs(Set<Devs> qtdDevs) {
        this.qtdDevs = qtdDevs;
    }

    public Integer getQtdProjetos() {
        return qtdProjetos;
    }

    public void setQtdProjetos(Integer qtdProjetos) {
        this.qtdProjetos = qtdProjetos;
    }

    public Integer getQtdMentorias() {
        return qtdMentorias;
    }

    public void setQtdMentorias(Integer qtdMentorias) {
        this.qtdMentorias = qtdMentorias;
    }

    public Integer getQtdDesafios() {
        return qtdDesafios;
    }

    public void setQtdDesafios(Integer qtdDesafios) {
        this.qtdDesafios = qtdDesafios;
    }

    public Set getQtdDevs() {
        return qtdDevs;
    }

    public void setQtdDevs(HashSet qtdDevs) {
        this.qtdDevs = qtdDevs;
    }

    public Integer getQtdCursos(int i) {
        return qtdCursos;
    }

    public void setQtdCursos(Integer qtdCursos) {
        this.qtdCursos = qtdCursos;
    }

    protected String certificadoConclusao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(LocalDate dtInicial) {
        this.dtInicial = dtInicial;
    }

    public LocalDate getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(LocalDate dtFinal) {
        this.dtFinal = dtFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCertificadoConclusao() {
        return certificadoConclusao;
    }

    public void setCertificadoConclusao(String certificadoConclusao) {
        this.certificadoConclusao = certificadoConclusao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConteudoBootcamp that = (ConteudoBootcamp) o;
        return Objects.equals(nome, that.nome) && Objects.equals(dtInicial, that.dtInicial) && Objects.equals(dtFinal, that.dtFinal) && Objects.equals(descricao, that.descricao) && Objects.equals(qtdCursos, that.qtdCursos) && Objects.equals(qtdProjetos, that.qtdProjetos) && Objects.equals(qtdMentorias, that.qtdMentorias) && Objects.equals(qtdDesafios, that.qtdDesafios) && Objects.equals(conteudos, that.conteudos) && Objects.equals(qtdDevs, that.qtdDevs) && Objects.equals(certificadoConclusao, that.certificadoConclusao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dtInicial, dtFinal, descricao, qtdCursos, qtdProjetos, qtdMentorias, qtdDesafios, conteudos, qtdDevs, certificadoConclusao);
    }

    @Override
    public String toString() {
        return "conteudoBootcamp{" +
                "nome='" + nome + '\'' +
                ", dtInicial=" + dtInicial +
                ", dtFinal=" + dtFinal +
                ", descricao='" + descricao + '\'' +
                ", qtdCursos=" + qtdCursos +
                ", qtdProjetos=" + qtdProjetos +
                ", qtdMentorias=" + qtdMentorias +
                ", qtdDesafios=" + qtdDesafios +
                ", qtdDevs=" + qtdDevs +
                ", certificadoConclusao='" + certificadoConclusao + '\'' +
                '}';
    }
}
