import java.time.LocalDate;

import models.Bootcamp;
import models.Curso;
import models.Dev;
import models.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "descrição curso java", 8);

        Curso curso2 = new Curso("Curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("mentoria java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev devFulano = new Dev("Fulano");
        devFulano.inscreverBootCamp(bootcamp);
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();

        System.out.println(devFulano);
    }
}
