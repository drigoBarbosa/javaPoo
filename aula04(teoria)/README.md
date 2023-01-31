## Métodos Especiais:



- #### Métodos acessores:  

  #### Getters: pega/acessa alguma informação que você não teria acesso chamando normalmente.

  - Ex. chamada normal: 

  Estante e1 = new Estante;

  total = e1.**TotDoc**;

  - Ex. chamada por método: 

  Estante e1 = new Estante;

  total = e1.**getTotDoc()**;

É uma forma de dar acesso a determinado atributo sem contudo dar acesso direto ao atributo, isso garante uma segurança adicional.



- #### Métodos modificadores:

  #### Setters: Modificam coisas que estão dentro do Objeto.

  - Ex. forma sem método:

    Estante e1 = new Estante;

    e1.totDoc = totDoc +1;

    

  - Ex. forma por método:

    Estante e1 = new Estante;

    e1.setTotDoc(doc);

    

- #### Métodos construtores: 

  #### Construct: Criam e inicializam objetos que ainda não existem.

  - Ex; 

    Classe Caneta

    ​	Metodo construtor(m: Caractere, c: Caractere, p: Real)

    ​		setModelo(m);

    ​		setCor(c);

    ​		setPonta(p);

    ​	FimMetodo

    FimClasse

    Caneta c1 = new Caneta("BIC", "azul", 0.5f);

  Assim que Caneta for estanciada com o uso da palavra new, o construtor será ativado e jogara os valores passados entre parênteses para os parâmetros. Posso criar inúmeros objetos da classe caneta com apenas uma linha de código.

  