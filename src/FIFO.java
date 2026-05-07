import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FIFO {

    public static int executar(int[] paginas, int quadros) {

        HashSet<Integer> memoria = new HashSet<>();
        Queue<Integer> fila = new LinkedList<>();

        int faltas = 0;

        for (int pagina : paginas) {

            if (!memoria.contains(pagina)) {

                faltas++;

                if (memoria.size() == quadros) {

                    int removida = fila.poll();
                    memoria.remove(removida);
                }

                memoria.add(pagina);
                fila.add(pagina);
            }
        }

        return faltas;
    }
}