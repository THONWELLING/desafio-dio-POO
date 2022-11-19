import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    System.out.println("Olá Desenvolvedor !!!");

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição do curso de Java");
    curso1.setCargaHoraria(90);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Nodejs");
    curso2.setDescricao("Descrição do curso de Nodejs");
    curso2.setCargaHoraria(70);


    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setDescricao("Descrição mentoria Java");
    mentoria1.setData(LocalDate.now());

//    System.out.println(curso1);
//    System.out.println(curso2);
//    System.out.println(mentoria1);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Java Developers");
    bootcamp.setDescricao("Seja um desenvolvedor nível Jedy");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devThonwelling = new Dev();
    devThonwelling.setNome("Thonwelling");
    devThonwelling.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos de " + devThonwelling.getNome() + " ==> " + devThonwelling.getConteudosInscritos());
    devThonwelling.progredir();
    devThonwelling.progredir();
    System.out.println("progrediu");
    System.out.println("Conteúdos Inscritos de " + devThonwelling.getNome() + " ==> " + devThonwelling.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos de " + devThonwelling.getNome() + " ==> " + devThonwelling.getConteudosConcluidos());
    System.out.println("Xp Total => " + devThonwelling.CalcularXpTotal());
    System.out.println("========================================================================");

    Dev devDaniThon = new Dev();
    devDaniThon.setNome("DaniThon");
    devDaniThon.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos de " + devDaniThon.getNome() + " ==> " + devDaniThon.getConteudosInscritos());
    devDaniThon.progredir();
    devDaniThon.progredir();
    System.out.println("progrediu");
    System.out.println("Conteúdos Inscritos de " + devDaniThon.getNome() + " ==> " + devDaniThon.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos de " + devDaniThon.getNome() + " ==> " + devDaniThon.getConteudosConcluidos());
    System.out.println("Xp Total => " + devDaniThon.CalcularXpTotal());
  }
}
