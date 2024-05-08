import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Descrição Curso 1");
        curso1.setCargaHorario(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Descrição Curso 2");
        curso2.setCargaHorario(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Descricao Mentoria 1");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos Inscritos " + devPedro.getConteudosConcluidos());




        Dev devLais = new Dev();
        devLais.setNome("Lais");
        devLais.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devLais.getConteudosInscritos());
        devLais.progredir();
        System.out.println("Conteudos Inscritos " + devLais.getConteudosConcluidos());


    }
}