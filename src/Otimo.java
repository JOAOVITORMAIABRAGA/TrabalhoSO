import java.util.ArrayList;

public class Otimo {

    public static int executar(int[] paginas, int quadros) {

        ArrayList<Integer> memoria = new ArrayList<>();

        int faltas = 0;

        for (int i = 0; i < paginas.length; i++) {

            int paginaAtual = paginas[i];

            if (!memoria.contains(paginaAtual)) {

                faltas++;

                if (memoria.size() < quadros) {

                    memoria.add(paginaAtual);

                } else {

                    int indiceRemover = -1;
                    int maisDistante = -1;

                    for (int j = 0; j < memoria.size(); j++) {

                        int paginaMemoria = memoria.get(j);

                        int k;

                        for (k = i + 1; k < paginas.length; k++) {

                            if (paginas[k] == paginaMemoria) {
                                break;
                            }
                        }

                        if (k > maisDistante) {

                            maisDistante = k;
                            indiceRemover = j;
                        }
                    }

                    memoria.set(indiceRemover, paginaAtual);
                }
            }
        }

        return faltas;
    }
}