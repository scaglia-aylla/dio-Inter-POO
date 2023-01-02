import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("curso de javascript intermediário");
        curso2.setCargaHoraria(28);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do curso Java");
        mentoria.setDescricao("aprendendo Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosIncritos());
        devAna.progredir();
        System.out.println("Conteúdos Concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP :" + devAna.calcularXp());

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosIncritos());
        devLucas.progredir();
        System.out.println("Conteúdos Concluidos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("Xp :" + devLucas.calcularXp());


    }
}