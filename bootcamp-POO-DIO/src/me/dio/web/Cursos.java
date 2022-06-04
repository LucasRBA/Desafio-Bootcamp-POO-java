package me.dio.web;

public class Cursos extends ConteudoBootcamp {

    public Integer mediaModulosCurso;
    public Integer xpPorModulo;
    public static Integer cargaHorariaMedia;
    private  Integer xpCurso;


    public Integer getMediaModulosCurso() {
        return mediaModulosCurso;
    }

    public void setMediaModulosCurso(Integer mediaModulosCurso) {
        this.mediaModulosCurso = mediaModulosCurso;
    }

    public Integer getXpPorModulo() {
        return xpPorModulo;
    }

    public void setXpPorModulo(Integer xpPorModulo) {
        this.xpPorModulo = xpPorModulo;
    }

    public Integer getCargaHorariaMedia() {
        return cargaHorariaMedia;
    }

    public void setCargaHorariaMedia(Integer cargaHorariaMedia) {
        Cursos.cargaHorariaMedia = cargaHorariaMedia;
    }

    public Integer calcularXpCurso() {
        xpCurso = mediaModulosCurso*xpPorModulo;
        return xpCurso;
    }

    public Integer calcularDuracaoCursos () {
       return (qtdCursos*cargaHorariaMedia);
    }

    @Override
    public Integer calcularXp() {
        return xpCurso;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "nome='" + nome + '\'' +
                "descricao='" + descricao + '\'' +
                ", mediaModulosCurso=" + mediaModulosCurso +
                ", xpPorModulo=" + xpPorModulo +
                ", cargaHorariaMedia=" + cargaHorariaMedia + " " +
                ", xpCurso=" + xpCurso +
                '}';
    }
}

