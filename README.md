# Simulador de Algoritmos de Substituição de Páginas

**Autor:** João Vítor Maia Braga  
**Curso:** Ciência da Computação — Universidade de Fortaleza (UNIFOR)

---

## Repositório GitHub

[TrabalhoSO - GitHub](https://github.com/JOAOVITORMAIABRAGA/TrabalhoSO)

---

# Resumo

O gerenciamento de memória virtual é uma das principais funções desempenhadas pelos sistemas operacionais modernos, sendo responsável por otimizar o uso da memória principal durante a execução de processos. Dentro desse contexto, os algoritmos de substituição de páginas possuem papel fundamental na redução das faltas de página e na melhoria do desempenho do sistema.

Este projeto apresenta o desenvolvimento de um simulador em Java para comparação de algoritmos de substituição de páginas. Foram implementados os algoritmos FIFO, LRU, Clock e Ótimo, utilizando uma sequência de referências de páginas e uma quantidade fixa de quadros de memória.

Os resultados obtidos demonstraram diferenças significativas no número de faltas de página entre os algoritmos analisados, permitindo compreender suas vantagens, limitações e impactos no gerenciamento de memória virtual.

---

# Objetivo

O objetivo do projeto é simular e comparar diferentes algoritmos de substituição de páginas utilizados em sistemas operacionais, analisando a quantidade de faltas de página geradas por cada método.

Além disso, o trabalho busca consolidar conceitos relacionados a:

- Memória Virtual;
- Gerenciamento de Memória;
- Faltas de Página;
- Estruturas de Dados;
- Sistemas Operacionais.

---

# Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Estruturas de Dados:
  - Filas
  - Listas
  - Vetores
  - HashSet

---

# Estrutura do Projeto

```text
src/
│
├── Main.java
├── FIFO.java
├── LRU.java
├── Clock.java
└── Otimo.java
```

---

# Fundamentação Teórica

Os sistemas operacionais modernos utilizam memória virtual para permitir que processos sejam executados mesmo quando a quantidade de memória RAM disponível é limitada.

Nesse modelo, páginas de memória são carregadas e removidas da memória principal conforme a necessidade de utilização. Quando uma página requisitada não está presente na memória principal, ocorre uma falta de página, exigindo que o sistema operacional substitua alguma página já carregada.

Os algoritmos de substituição de páginas são responsáveis por decidir qual página deve ser removida da memória quando não há espaço disponível para o carregamento de uma nova página.

Entre os principais algoritmos estudados estão:

- FIFO (First In, First Out)
- LRU (Least Recently Used)
- Clock
- Ótimo

Cada um utiliza estratégias diferentes para determinar qual página será removida, impactando diretamente no desempenho do sistema.

---

# Funcionamento do Simulador

O programa recebe:

- Uma sequência de páginas;
- Uma quantidade fixa de quadros de memória.

## Entrada Utilizada

```java
int[] paginas = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

int quadros = 3;
```

A sequência representa as referências de páginas realizadas pelo sistema, enquanto a variável `quadros` representa a capacidade da memória principal.

Cada algoritmo executa a substituição de páginas utilizando sua própria estratégia e contabiliza a quantidade total de faltas de página ocorridas durante a simulação.

---

# Algoritmos Implementados

## FIFO (First In, First Out)

O algoritmo FIFO substitui sempre a página mais antiga presente na memória.

### Características

- Implementação simples;
- Baixo custo computacional;
- Não considera frequência ou recência de uso;
- Pode apresentar desempenho inferior em alguns cenários.

---

## LRU (Least Recently Used)

O algoritmo LRU remove a página menos recentemente utilizada.

### Características

- Considera o histórico recente de uso;
- Melhor aproveitamento da memória;
- Desempenho superior ao FIFO;
- Maior custo de controle.

---

## Clock

Também conhecido como algoritmo da Segunda Chance.

### Características

- Utiliza bits de referência;
- Aproximação do algoritmo LRU;
- Menor custo computacional;
- Bom equilíbrio entre desempenho e simplicidade.

---

## Ótimo

O algoritmo Ótimo substitui a página cuja próxima utilização ocorrerá mais distante no futuro.

### Características

- Melhor desempenho teórico possível;
- Utilizado como referência comparativa;
- Não pode ser implementado em sistemas reais;
- Requer conhecimento prévio das futuras referências.

---

# Como Executar

## 1. Clone o Repositório

```bash
git clone LINK_DO_REPOSITORIO
```

## 2. Acesse a Pasta do Projeto

```bash
cd simulador-substituicao-paginas
```

## 3. Compile os Arquivos

Dentro da pasta `src`:

```bash
javac *.java
```

## 4. Execute o Programa

```bash
java Main
```

---

# Saída Esperada

```text
=== SIMULADOR DE SUBSTITUIÇÃO DE PÁGINAS ===

FIFO  - 10 faltas de página
LRU   - 9 faltas de página
Clock - 9 faltas de página
Ótimo - 7 faltas de página
```

---

# Resultados Obtidos

| Algoritmo | Faltas de Página |
|---|---|
| FIFO | 10 |
| LRU | 9 |
| Clock | 9 |
| Ótimo | 7 |

---

# Análise dos Resultados

Os resultados demonstram diferenças significativas entre os algoritmos analisados.

O algoritmo Ótimo apresentou o menor número de faltas de página, conforme esperado, já que possui conhecimento prévio das futuras referências de memória. Apesar do excelente desempenho, não pode ser aplicado em sistemas reais devido à impossibilidade de prever acessos futuros.

O algoritmo FIFO apresentou o pior desempenho entre os métodos avaliados. Isso ocorre porque sua estratégia considera apenas a ordem de entrada das páginas na memória, ignorando frequência e recência de utilização.

Os algoritmos LRU e Clock apresentaram desempenho intermediário e semelhante, ambos registrando 9 faltas de página. O LRU mostrou maior eficiência ao considerar o histórico recente de uso, enquanto o Clock conseguiu desempenho semelhante utilizando uma abordagem menos custosa computacionalmente.

Os resultados obtidos confirmam os conceitos teóricos estudados na disciplina, demonstrando como diferentes estratégias de substituição influenciam diretamente a eficiência do gerenciamento de memória virtual.

---

# Conclusão

O desenvolvimento do simulador permitiu compreender de forma prática o funcionamento dos principais algoritmos de substituição de páginas utilizados em sistemas operacionais.

A implementação em Java possibilitou observar como diferentes estratégias impactam diretamente na quantidade de faltas de página e, consequentemente, no desempenho do sistema.

Os algoritmos LRU e Clock apresentaram desempenho superior ao FIFO por considerarem o comportamento recente das páginas na memória. Já o algoritmo Ótimo demonstrou o melhor resultado possível, servindo como referência teórica para comparação.

O projeto contribuiu para consolidar conceitos fundamentais de memória virtual, gerenciamento de memória e sistemas operacionais, aproximando teoria e prática por meio da simulação computacional.

---

# Conceitos Abordados

- Memória Virtual
- Gerenciamento de Memória
- Faltas de Página
- Algoritmos de Substituição
- Estruturas de Dados
- Sistemas Operacionais

---

# Referências

## Fundamentos de Sistemas Operacionais

SILBERSCHATZ, Abraham; GALVIN, Peter B.; GAGNE, Greg.  
*Fundamentos de Sistemas Operacionais*. 9. ed. Rio de Janeiro: LTC, 2015.

## Sistemas Operacionais Modernos

TANENBAUM, Andrew S.; BOS, Herbert.  
*Sistemas Operacionais Modernos*. 4. ed. São Paulo: Pearson, 2016.

- Material disponibilizado pelo professor da disciplina de Sistemas Operacionais.
