import java.util.ArrayList;

public class LRU {

    public static int executar(int[] paginas, int quadros) {

        ArrayList<Integer> memoria = new ArrayList<>();

        int faltas = 0;

        for (int pagina : paginas) {

            if (!memoria.contains(pagina)) {

                faltas++;

                if (memoria.size() == quadros) {
                    memoria.remove(0);
                }

            } else {

                memoria.remove((Integer) pagina);
            }

            memoria.add(pagina);
        }

        return faltas;
    }
}