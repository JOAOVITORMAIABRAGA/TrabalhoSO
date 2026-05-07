Simulador de Algoritmos de Substituição de Páginas

Projeto desenvolvido para a disciplina de Sistemas Operacionais com o objetivo de simular e comparar diferentes algoritmos de substituição de páginas utilizados no gerenciamento de memória virtual.

Objetivo

O projeto realiza a simulação de algoritmos de substituição de páginas e contabiliza a quantidade de faltas de página geradas por cada método.

Os algoritmos implementados foram:

FIFO (First In, First Out)
LRU (Least Recently Used)
Clock
Ótimo
Tecnologias Utilizadas
Java
Programação Orientada a Objetos
Estruturas de Dados (Fila, Lista, Vetores e HashSet)
Estrutura do Projeto
src/
│
├── Main.java
├── FIFO.java
├── LRU.java
├── Clock.java
└── Otimo.java
Funcionamento

O programa recebe:

uma sequência de páginas;
uma quantidade fixa de quadros de memória.

Exemplo utilizado:

int[] paginas = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

int quadros = 3;

Cada algoritmo executa a substituição de páginas de maneira diferente e, ao final, o simulador apresenta a quantidade de faltas de página geradas.

Algoritmos Implementados
FIFO (First In, First Out)

Substitui a página mais antiga presente na memória.

Características
Simples implementação;
Baixo custo computacional;
Pode apresentar desempenho inferior em alguns cenários.
LRU (Least Recently Used)

Substitui a página menos recentemente utilizada.

Características
Considera o histórico de uso;
Melhor desempenho que FIFO;
Maior overhead de controle.
Clock

Também conhecido como algoritmo da Segunda Chance.

Características
Utiliza bits de referência;
Aproximação do LRU;
Menor custo computacional.
Ótimo

Substitui a página cuja próxima utilização ocorrerá mais distante no futuro.

Características
Melhor desempenho possível;
Utilizado como referência teórica;
Não pode ser implementado em sistemas reais.
Como Executar
1. Clone o repositório
git clone LINK_DO_REPOSITORIO
2. Acesse a pasta do projeto
cd simulador-substituicao-paginas
3. Compile os arquivos

Dentro da pasta src:

javac *.java
4. Execute o programa
java Main
Saída Esperada
=== SIMULADOR DE SUBSTITUIÇÃO DE PÁGINAS ===

FIFO  - 10 faltas de página
LRU   - 9 faltas de página
Clock - 9 faltas de página
Ótimo - 7 faltas de página
Resultados Obtidos
Algoritmo	Faltas de Página
FIFO	10
LRU	9
Clock	9
Ótimo	7
Análise dos Resultados

O algoritmo Ótimo apresentou o menor número de faltas de página, servindo como referência ideal de desempenho.

O FIFO apresentou o maior número de faltas, demonstrando que a substituição baseada apenas na ordem de chegada pode não ser eficiente.

Os algoritmos LRU e Clock apresentaram desempenho intermediário e semelhante, mostrando melhor aproveitamento da memória ao considerar o histórico recente de utilização das páginas.

Conceitos Abordados
Memória Virtual
Gerenciamento de Memória
Faltas de Página
Algoritmos de Substituição
Estruturas de Dados
Sistemas Operacionais
Referências

Fundamentos de Sistemas Operacionais
SILBERSCHATZ, Abraham; GALVIN, Peter B.; GAGNE, Greg. Fundamentos de Sistemas Operacionais. 9. ed. Rio de Janeiro: LTC, 2015.

Sistemas Operacionais Modernos
TANENBAUM, Andrew S.; BOS, Herbert. Sistemas Operacionais Modernos. 4. ed. São Paulo: Pearson, 2016.

Autor

João Vítor Maia Braga
Ciência da Computação — Universidade de Fortaleza (UNIFOR)