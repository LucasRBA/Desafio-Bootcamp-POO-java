package me.dio.web;


public class Bootcamp extends ConteudoBootcamp{


    protected Integer totalXpBootcamp;
    protected Integer totalHorasBootcamp;

    public Integer calcularXpBootcamp(Integer xpCurso, Integer xpMentoria, Integer xpMediaDesafio, Integer xpMediaProjeto) {
        totalXpBootcamp = (qtdCursos*xpCurso) + (qtdMentorias*xpMentoria) + (qtdDesafios*xpMediaDesafio) + (2*xpMediaProjeto+(5*getQtdProjetos()*200));
        return totalXpBootcamp;
    }

    public Integer calcularCargaHorariaTotalBootcamp() {
        totalHorasBootcamp = ((qtdMentorias*Mentorias.duracaoMentoria) +(qtdCursos*Cursos.cargaHorariaMedia));
        return totalHorasBootcamp;
    }


    @Override
    public Integer calcularXp() {
        return null;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "totalXpBootcamp=" + totalXpBootcamp +
                ", nome='" + nome + '\'' +
                ", dtInicial=" + dtInicial +
                ", dtFinal=" + dtFinal +
                ", descricao='" + descricao + '\'' +
                ", qtdCursos=" + qtdCursos +
                ", qtdProjetos=" + qtdProjetos +
                ", qtdMentorias=" + qtdMentorias +
                ", qtdDesafios=" + qtdDesafios +
                ", conteudos=" + conteudos +
                ", qtdDevs=" + qtdDevs +
                ", certificadoConclusao=" + certificadoConclusao + '\'' +
                ", cargaHorariaTotalBootcamp=" + totalHorasBootcamp +
                '}';
    }
}
