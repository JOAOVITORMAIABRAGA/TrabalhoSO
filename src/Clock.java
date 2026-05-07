public class Clock {

    public static int executar(int[] paginas, int quadros) {

        int[] memoria = new int[quadros];
        boolean[] referencia = new boolean[quadros];

        for (int i = 0; i < quadros; i++) {
            memoria[i] = -1;
        }

        int ponteiro = 0;
        int faltas = 0;

        for (int pagina : paginas) {

            boolean encontrada = false;

            for (int i = 0; i < quadros; i++) {

                if (memoria[i] == pagina) {

                    referencia[i] = true;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {

                faltas++;

                while (referencia[ponteiro]) {

                    referencia[ponteiro] = false;
                    ponteiro = (ponteiro + 1) % quadros;
                }

                memoria[ponteiro] = pagina;
                referencia[ponteiro] = true;

                ponteiro = (ponteiro + 1) % quadros;
            }
        }

        return faltas;
    }
}