# Linguagem de Programação II

## Exercício do Baralho

### Tecnologias utilizadas

- Linguagem : Java 21 LTS
- IDE : Intellig IDEA
- Git / Github 

### Descrição do projeto

- Crie a classe Carta, que possui um nome e um naipe. Crie os
métodos GET e SET para os atributos. Crie agora uma classe
Baralho, que possui 52 cartas. No construtor de Baralho, inicialize
as 52 cartas (juntamente com os 4 coringas, que devem se chamar
“coringa” e o naipe é “coringa”).


### Métodos desenvolvidos
- embaralhar( ) – usando o método Math.random dá para trocar as
cartas dentro do baralho, misturando-as (sorteie duas posições e
troque-as. Repita este processo diversas vezes).

- distribuirCarta( ) – devolve uma carta, retirada do topo do baralho, se
  não estiver vazio, ou null. 

- hasCarta( ) – verifica se tem carta no baralho, devolvendo true ou
false. A classe Baralho, assim construída, será útil para programar
diversos jogos de cartas, através de novas classes que os
implementem.

- imprimirBaralho( ) – imprime as cartas para verificar como estão
  dispostas (se estão embaralhadas por exemplo).