# JAVA

## Estruturas Condicionais

Elas possibilitam ao programa tomar decisões colocadas pelo dev, fazendo com que altere o fluxo de execução do programa. É através dessas estruturas que podemos dizer para o programa executar uma determinada ação se algo acontecer, ou se não acontecer, ele pode executar outra ação.

Essas estruturas são: if-else if-else / switch-case

### If-Else If-Else

A estrutura condicional 'If-Else' permite ao programa verificar se alguma situação é verdadeira ou falsa. Se(if) for true, executa uma ação, se não(else)(false) executa outra. Em java o resultante da expressão tem que ser no tipo boolean, pois o java não converte null ou inteiros como 1 ou 0 para true ou false.

A estrutura condicional 'Else If' permite adicionar uma nova condição ao sistema que você iniciou com 'If'.

Obs: Se o comando que fica após a condição possuir apenas uma linha, as chaves '{ (código) }' não são necessárias; Porém se tiver mais de uma linha, elas são obrigatórias.

```java

int hora = 8;

if(hora >= 8 && hora < 9)
  System.out.println("1ª aula de Inglês II");
  
else if(hora >= 8 && hora < 10)
  System.out.println("2ª aula de Inglês II");
 
else if(hora >= 10 && hora < 11)
  System.out.println("1ª aula de Programação II");
  
else if(hora >= 10 && hora < 12)
  System.out.println("1ª aula de Programação II");

```

### Switch-case

A estrutura condicional 'Switch-case' é mais restrita que a 'If-else' pelo fato que só pode ser usado com o operador '==', sendo assim, não é permitido usar nenhum outro operador de comparação e nem operador lógico. Não tem como usar algum valor do tipo Float ou Double, apenas de inteiros ou string. Caso a variável não atenda nenhum dos casos da condicional, você pode usar o 'default', que executa algo caso nada seja 'true'.

```java

int valor = 0;

switch(valor){
  
  case 1:
    System.out.println("É o valor 1");
    break;
  
  case 2:
    System.out.println("É o valor 2");
    break;
    
  case 3:
    System.out.println("É o valor 3");
    break;
  
  default:
    System.out.println("Não é o valor 1, 2 e 3");
}

```
