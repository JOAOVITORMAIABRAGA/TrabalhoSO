public class Main {

    public static void main(String[] args) {

        int[] paginas = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

        int quadros = 3;

        System.out.println("=== SIMULADOR DE SUBSTITUIÇÃO DE PÁGINAS ===\n");

        int fifo = FIFO.executar(paginas, quadros);
        int lru = LRU.executar(paginas, quadros);
        int clock = Clock.executar(paginas, quadros);
        int otimo = Otimo.executar(paginas, quadros);

        System.out.println("FIFO  - " + fifo + " faltas de página");
        System.out.println("LRU   - " + lru + " faltas de página");
        System.out.println("Clock - " + clock + " faltas de página");
        System.out.println("Ótimo - " + otimo + " faltas de página");
    }
}