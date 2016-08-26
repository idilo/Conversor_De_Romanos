A logica parece bem simples:
vamos a isso:

dado uma da regras dos numeros romanos que diz todos os algarismos romanos devem 
ser registrados sempre do maior valor para o primeiro, nada melhor que escrever a lista
comecando pelo maior; excepto quando quando tivermos 4 simbolos semelhantes, entao subtituiremos 
os ultimos 3 pelo simbolo do maior numero logo a seguir;

romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
numerais = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

A ideia e' a seguinte:
imagine o seguinte numero: 342
deve ser representado por CCCXLII
repete o C 3x depois o 40 uma vez XL e depois o 2 II
entao vamos percorrendo subtraindo o numero sempre pelo valor da posicao
que tem o simbolo correspondente, lembrando que deve ser sempre maior que o tal;

entao teriamos 342 > 100 logo C;
depois teriamos 342 - 100 = 242 > 100 logo: CC
depois teriamos 242 - 100 = 142 > 100 logo CCC;
depois teriamos 142 - 100 = 42 > 42 logo CCCXL;
depois teriamos 42 -  40 = 2 > 1 logo CCCXLI;
depois teriamos 2 - 1 = 1 >= 1 logo CCCXLII;
depois teriamos 0 que nao e maior que nenhum....