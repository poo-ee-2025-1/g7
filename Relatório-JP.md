# Relatório individual:
## Nome: João Pedro Caixêta Soares Paiva
## Matrícula: 202403133

### 1.⁠ ⁠Atribuição de cargo e tarefas: o que foi atribuído a priori; responsabilidades; o que foi exercido na prática; etc.
<br>

 **Tarefa atribuida: Desenvolvimento, teste e execução de códigos.**
 
 Desde o princípio, me foi atribuida a tarefa de realizar a parte prática do projeto, que se resumiu em criar, testar e executar códigos para o bom funcionamento do trabalho. Dessa forma, passou a ser da minha responsabilidade a **pesquisa e a busca** de exemplos, referências e aulas sobre programação para o aprimoramento das minhas habilidades em desenvolver códigos e assim ajudar o grupo a alcançar o nosso objetivo principal. Dito isso, minha tarefa foi realizada da forma que me foi encarregada, criei um código que simulasse a ideia principal do projeto, de forma que fosse possível criar, modificar e analisar equipamentos para assim devolver o seu respectivo diagnóstico para a situação atual.

<br>

### 2.⁠ ⁠⁠Contribuição de acordo com a atribuição: o que foi cumprido; lista dos 3 commits mais relevantes, posts, documentos mais relevantes; o que não deu para cumprir; principais dificuldades; etc.

<br>

 **Contribuições da minha atribuição**: Uma vez encarregado da programação do projeto, eu criei um código que permite a análise de determinados equipamentos e, dessa forma, retornar um diagnóstico a respeito de sua condição especificada, como por exemplo: equipamento funcional, equipamento com problema ou equipamento estragado. Para isso, eu realizei as seguintes tarefas:

#### Classes: (Equipamento; Motor Elétrico; Gerador; Transformador; Painel Elétrico; Monitorável e Util Equipamentos)
#### Métodos: (exibirInfo(); verificarManutenção(); simularFalha())

 Criei uma classe abstrata chamada "**Equipamento**" que contém atributos padrões em qualquer equipamento, entre eles: o **Nome, ID, Tipo, Vida Útil e a Data de Instalação** por exemplo. Além disso criei métodos responsáveis por: **apresentar os dados atuais do equipamento, verificar se é necessária uma manutenção ou não e simular uma falha específica para cada equipamento**. Após isso, criei as sub-classes de Equipamento, sendo elas: **"Motor Elétrico", "Gerador", "Transformador" e "Painel Elétrico"**. Cada uma dessas possuindo atributos específicos que foram usados para criar um problema hipotético que deve ser analisado pelo programa. Criei também uma interface chamada "Monitorável" e uma classe à parte chamada "UtilEquipamentos" onde ambas apenas guardam métodos importantes para a execução do programa.

 <br>

 ![](https://github.com/poo-ee-2025-1/g7/blob/parte-Jo%C3%A3o-Pedro-Caix%C3%AAta/Classes.png?raw=true)

 <br>
 

 #### Resumo do código: O usuário cadastra um equipamento e define seu nome e data de instalação ---> ele chama o método **verificarManutenção()** que calcula os problemas encontrados no intervalo de tempo entre a data de instalação e a data atual e devolve ao usuário quantos e quais problemas foram encontrados.

 <br>

 #### Exemplo: Motor criado com o nome "Motor 1" e data de instalação "2024/07/02". Foi chamado o método exibirInfo() e logo em seguida o método verificarManutenção() :

 <br>

![](https://github.com/poo-ee-2025-1/g7/blob/parte-Jo%C3%A3o-Pedro-Caix%C3%AAta/TesteClasses.png?raw=true)

<br>
 

 #### Objetivos: Meu objetivo ao longo de todo o processo de programação foi **tentar utilizar o máximo de conceitos aprendidos ao longo do semestre letivo**, dessa forma, reforçando meu aprendizado ao longo do tempo. Meu código possui, portanto, ideias como **Herança, Polimorfismo, Encapsulamento, Controle de situações, entre outros**.

 #### Novidade: Utilização do conceito de datas e passagem de tempo para melhorar meu código

 A fim de incrementar meu projeto e trazer uma ideia diferente que não foi abordada em nossas aulas eu pesquisei e trouxe a **manipulação de datas** como ferramenta no meu projeto. Para isso utilizei a biblioteca **java.time.LocalDate** e **java.time.temporal.ChronoUnit** que são bibliotecas que me permitiram utilizar datas e contas com passagem de tempo como variáveis para facilitar meus cálculos a respeito dos problemas dos equipamentos, uma vez que em meu programa o problema dos equipamentos se agrava com o passar do tempo. Portanto achei muito útil e prática a utilização desse conceito para dar um complemento maior ao meu trabalho.

 <br>

 ![](https://github.com/poo-ee-2025-1/g7/blob/parte-Jo%C3%A3o-Pedro-Caix%C3%AAta/TempoClasses.png?raw=true)

 <br>
 

 #### Dificuldades: Em geral, tudo que eu planejei para o resultado final do meu projeto eu consegui desenvolver dentro do prazo. Entretanto eu tive uma ideia de **criar um gráfico** junto com meu código, de forma que ficasse mais fácil a visualização do crescimento dos problemas com o passar do tempo. Porém, devido ao tempo escasso ao final do semestre, não consegui colocar essa ideia em prática a tempo. 

<br>

### 3.⁠ ⁠⁠Contribuição além do atribuído: como ajudei a equipe; quais commits a mais, posts e documentos mais relevantes; como ajudei outros a resolverem seus problemas; etc.

<br>

Em geral eu realizei apenas a parte prática do projeto. Entretanto, durante minha pesquisa sobre equipamentos, eu escrevi pequenos textos para relatar minhas descobertas e buscas. Esses textos, entretanto, foram usados para complementar a parte teórica na finalisação do projeto. Ademais, me mantive sempre à disposição do grupo para ajudar a solucionar qualquer problema que aparecesse e retirar dúvidas caso surgissem.

<br>

### 4.⁠ ⁠⁠Considerações gerais: o que aprendi; quais trabalhos futuros ficaram pendentes; conclusões; etc.

<br>

 Ao final da realização da minha parte do projeto, consegui reforçar meus conhecimentos sobre programação em Java, de modo que conceitos básicos que eu ainda não havia entendido ao longo dos meus estudos, eu consegui desenvolver e compreender melhor enquanto pesquisava para executar meu programa de forma satisfatória. Além disso, adicionei também aos meus conhecimentos de Java a manipulação de datas e passagem de tempo, que foi a parte que eu mais gostei de trabalhar ao decorrer do projeto, de modo que eu pesquisei formas de utilizar tal recurso para facilitar e complementar meu código, de forma a torná-lo mais completo, complexo e eficiente.


<br>


### 5. Referências usadas por mim:

<br>

**Referência para uso de throw**:

https://youtu.be/YPHhoXeJMDU

**Referências sobre uso das bibliotecas LocalDate e ChronoUnit**:

https://www.treinaweb.com.br/blog/dica-de-codigo-trabalhando-com-data-e-hora-no-java

https://youtu.be/G2rChxrc1ug

https://youtu.be/17_tFE6Xna8

**Referência para comandos gerais usados**:

https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

**Referência para limitar valores positivos**:

https://codegym.cc/pt/groups/posts/pt.398.metodo-java-lang-math-max-

**Referências gerais para estudo dos equipamentos**:

https://www.dmedsa.com.br/conccel/48-paginas/economia-de-energia/170-motores-eletricos

https://www.produttivo.com.br/blog/manutencao-de-motores-eletricos/

https://www.tiveageradores.com/produtos/quanto-tempo-dura-um-gerador-de-energia/

https://goldenergy.pt/glossario/gerador/

https://generacbrasil.com.br/como-funciona-a-manutencao-de-geradores-de-energia/

https://www.genergiabrasil.com.br/manutencao-geradores-guia-completo

https://www.confea.org.br/midias/uploads-imce/Contecc2021/Eletricista/A%20VIDA%20%C3%9ATIL%20DE%20TRANSFORMADORES%20EL%C3%89TRICOS%20EM%20RESINA%20EP%C3%93XI.pdf

https://blog.tecnogera.com.br/blog/o-que-e-um-transformador

https://www.transformadoreletrico.com.br/blog/categorias/artigos/manuten-ccedil-atilde-o-de-transformadores-dicas-e-import-acirc-ncia

https://ibape-nacional.com.br/admin/images/Estudo%20de%20vidas%20_teis%20de%20bens.pdf

https://amperi.com.br/canais/instalacao-eletrica/quadro-distribuicao-eletrica/

https://www.defantemateriaiseletricos.com.br/blog/categorias/quadro/quadros-eletricos-precisam-de-manutencao
