import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("===========linha 31 =============");
        System.out.println(bootcamp.getConteudos());
        System.out.println("================");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("=================linha 34===============");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        //devCamila.progredir("curso de java");
        System.out.println("=====================================");
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:");

        Set<Conteudo> con = devCamila.getConteudosInscritos();

        for (Conteudo c : con) {
            System.out.println(c.getTitulo());
        }
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir("mentoria de java");
        devJoao.progredir("curso js");
        //devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("Teste setDev");
        Map<Dev, LocalDate>  inscritos = bootcamp.getDevsInscritos();
        for (Dev i: inscritos.keySet()) {
            System.out.println(i.getNome()+ "Cursos Concluidos:" + i.getConteudosConcluidos());
        }
}
}
