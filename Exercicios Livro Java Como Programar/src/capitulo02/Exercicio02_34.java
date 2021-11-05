package capitulo02;

public class Exercicio02_34 {

    public static void main(String[] args) {

        Double populacaoAtual = 7000000000.0;
        Double taxaCrescimentoAnual = 1.2;
        Double populacaoAposUmAno;
        Double populacaoAposDoisAnos;
        Double populacaoAposTresAnos;
        Double populacaoAposQuatroAnos;
        Double populacaoAposCincoAnos;

        populacaoAposUmAno = populacaoAtual + (populacaoAtual * taxaCrescimentoAnual / 100);
        populacaoAposDoisAnos = populacaoAposUmAno + (populacaoAposUmAno * taxaCrescimentoAnual / 100);
        populacaoAposTresAnos = populacaoAposDoisAnos + (populacaoAposDoisAnos * taxaCrescimentoAnual / 100);
        populacaoAposQuatroAnos = populacaoAposTresAnos + (populacaoAposTresAnos * taxaCrescimentoAnual / 100);
        populacaoAposCincoAnos = populacaoAposQuatroAnos + (populacaoAposQuatroAnos * taxaCrescimentoAnual / 100);

        System.out.printf("População mundial atual: %,.1f de habitantes%n", populacaoAtual);
        System.out.printf("Taxa de crescimento anual: %.1f%%%n", taxaCrescimentoAnual);
        System.out.printf("População estimada após um ano: %,.1f de habitantes%n", populacaoAposUmAno);
        System.out.printf("População estimada após dois anos: %,.1f de habitantes%n", populacaoAposDoisAnos);
        System.out.printf("População estimada após três anos: %,.1f de habitantes%n", populacaoAposTresAnos);
        System.out.printf("População estimada após quatro anos: %,.1f de habitantes%n", populacaoAposQuatroAnos);
        System.out.printf("População estimada após cinco anos: %,.1f de habitantes%n", populacaoAposCincoAnos);
    }
}
