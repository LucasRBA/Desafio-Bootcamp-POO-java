package me.dio.web;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        Cursos cursoJava2 = new Cursos();
        cursoJava2.setNome("Iniciando no Java parte 2");
        cursoJava2.setDescricao("Primeiros passos com java e configuração do ambiente de desenvolvimento");
        cursoJava2.setMediaModulosCurso(4);
        cursoJava2.setXpPorModulo(50);
        cursoJava2.setCargaHorariaMedia(3);

	Cursos cursoJava = new Cursos();
    cursoJava.setNome("Iniciando no Java");
    cursoJava.setDescricao("Primeiros passos com java e configuração do ambiente de desenvolvimento");
    cursoJava.setMediaModulosCurso(4);
    cursoJava.setXpPorModulo(50);
    cursoJava.setCargaHorariaMedia(3);
    cursoJava.calcularXpCurso();

    Mentorias mentoriaAngular = new Mentorias();
    mentoriaAngular.setNome("Desmistificando Data binding no Angular");
    mentoriaAngular.setDescricao("Aprendendo sobre tipos e usos do data binding");
    mentoriaAngular.setDataMentoria(LocalDate.of(2022, 6, 12));
    mentoriaAngular.setHoraMentoria(Time.valueOf(LocalTime.of(14, 30)));
    mentoriaAngular.setXpMentoria(400);

    Projetos projetoCriandoUmaFintechComAngularJavaEMysqlServer = new Projetos();
    projetoCriandoUmaFintechComAngularJavaEMysqlServer.setNome("Criando Uma Fintech Com Angular Java E MysqlServer");
    projetoCriandoUmaFintechComAngularJavaEMysqlServer.setDescricao("Utilizando os conhecimentos adquiridos durante o Bootcamp para criar uma Fintech");
    projetoCriandoUmaFintechComAngularJavaEMysqlServer.setXpMediaProjeto(1000);

    DesafiosCodigo desafiosIniciaisEmJava = new DesafiosCodigo();
    desafiosIniciaisEmJava.setNome("Desafios Iniciais Em Java");
    desafiosIniciaisEmJava.setDescricao("Aplicando conhecimento na linguagem Java para resolver desafios lógicos ");
    desafiosIniciaisEmJava.setQtdDesafios(3);
    desafiosIniciaisEmJava.setXpMediaDesafio(300);
    desafiosIniciaisEmJava.calcularXp();


    Bootcamp geracaoTechIBM2022 = new Bootcamp();
    geracaoTechIBM2022.setNome("Geração Tech IBM 2022");
    geracaoTechIBM2022.setDescricao("Aprenda Java e banco de dados numa abordagem voltada a segurança neste bootcamp elaborado pela IBM");
    geracaoTechIBM2022.setDtInicial(LocalDate.of(2022, 06,10 ));
    geracaoTechIBM2022.setDtFinal(LocalDate.of(2022,06,10).plusDays(75));
    geracaoTechIBM2022.setQtdDesafios(4);
    geracaoTechIBM2022.setQtdMentorias(3);
    geracaoTechIBM2022.setQtdCursos(10);
    geracaoTechIBM2022.setQtdProjetos(3);
    geracaoTechIBM2022.getConteudos().add(cursoJava);
    geracaoTechIBM2022.getConteudos().add(cursoJava2);
    geracaoTechIBM2022.getConteudos().add(mentoriaAngular);
    geracaoTechIBM2022.calcularCargaHorariaTotalBootcamp();
    geracaoTechIBM2022.getQtdDevs();
    geracaoTechIBM2022.calcularXpBootcamp(200,400, 300, 1000 );


    Devs devKira = new Devs();
    devKira.setNome("Kira");
    devKira.setNivelDev(16);
    devKira.setXpDev(devKira.calcularXp());
    devKira.setInscricao(true);
    devKira.inscreverBootcamp(geracaoTechIBM2022);
    devKira.progressaoDev();
    devKira.getCursosCompletos();
    System.out.println("Kira ainda está inscrita em: " + devKira.getConteudosInscritos());
    devKira.progressaoDev();
    System.out.println("Kira ainda está inscrita em: " + devKira.getConteudosInscritos());
    System.out.println("Kira já concluiu: " + devKira.getCursosCompletos());

    Devs devChiara = new Devs();
    devChiara.setNome("Chiara");
    devChiara.setNivelDev(14);
    devChiara.setXpDev(devChiara.calcularXp());
    devChiara.setInscricao(true);
    devChiara.inscreverBootcamp(geracaoTechIBM2022);
    devChiara.progressaoDev();
    devChiara.getCursosCompletos();
    System.out.println("Chiara ainda está inscrita em: "+ devChiara.getConteudosInscritos());
    devChiara.progressaoDev();
    System.out.println("Chiara ainda está inscrita em: "+ devChiara.getConteudosInscritos());
    System.out.println("Chiara já concluiu: " + devChiara.getCursosCompletos());

        Devs devZensga = new Devs();
        devZensga.setNome("Zensga");
        devZensga.setNivelDev(19);
        devZensga.setXpDev(devZensga.calcularXp());
        devZensga.setInscricao(true);
        devZensga.inscreverBootcamp(geracaoTechIBM2022);
        devZensga.progressaoDev();
        devZensga.getCursosCompletos();
        System.out.println("Zensga ainda está inscrita em: "+ devZensga.getConteudosInscritos());
        devZensga.progressaoDev();
        System.out.println("Zensga ainda está inscrita em: "+ devZensga.getConteudosInscritos());
        System.out.println("Zensga já concluiu: " + devZensga.getCursosCompletos());
        devZensga.progressaoDev();
        devZensga.progressaoDev();
        devZensga.progressaoDev();
        System.out.println("Zensga já concluiu: " + devZensga.getCursosCompletos());
        devZensga.emitirCertificado();




    System.out.println(cursoJava);
    System.out.println(mentoriaAngular);
    System.out.println(projetoCriandoUmaFintechComAngularJavaEMysqlServer);
    System.out.println(desafiosIniciaisEmJava);
    System.out.println(devKira);
    System.out.println(devChiara);
    System.out.println(devZensga);
    System.out.println(geracaoTechIBM2022);
    }
}
