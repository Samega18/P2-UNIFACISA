# JAVA

## Estruturas De Repetição

Também conhecidas por laços(Loop), são utilizadas para executar repetidamente uma instrução passada pelo dev, isso enquanto a condição determinada for verdadeira(true).

Essas estruturas são: While/Do While/For

### While

Essa estrutura de repetição significa "enquanto" no português, ela executa repetidas vezes uma instrução colocada em um bloco. Tudo isso "enquanto" a condição determinada for "true".

```java

int idade = 17;

while(idade < 18){
  System.out.println("Você não tem permissão de acessar esse conteúdo");
}

```

### Do While

Essa estrutura de repetição é bem parecida com o "WHILE", a diferença é que ela vai executar no mínimo uma vez. Isso antes de conferir se a condição é verdadeira ou não. No caso de ser "true", ela executa outra vez, se for "false" para por ali.

```java

int valor = 5;

do{
  valor += 5;
}while(valor < 3);

```

Nesse exemplo, a variável "valor" vai ser 10 no final do programa.

### For

A estrutura de repetição "For" é de uma forma compacta, no qual tem elementos de inicialização, condição e iteração reunidos na parte do cabeçalho. Em seguida vem o espaço para linha de código.

```java

for(int i = 0, i < 100, i++){
  System.out.printf("Valor: %d", i);
}

```

