# Relatório de Produção Individual – Sistema de Monitoramento de Equipamentos

**Data:** 03 de Julho de 2025

**Aluno:** Gustavo Ladislau Machado

**Matrícula:** 202403124

**Projeto:** Desenvolvimento de Interface Gráfica para Sistema de Monitoramento

---

### 1. Atribuição de Tarefas

**Tarefa atribuída:** desenvolver a Interface Gráfica após integrar todo o sistema.

**Responsabilidades atribuidas:**
Minha responsabilidade inicial era desenvolver uma interface gráfica funcional para um sistema de monitoramento de equipamentos já existente em código, elaborado pelos outros integrantes do grupo. As tarefas principais incluíam:
* Criar uma interface gráfica em Java para substituir a interação via Janela de Terminal do BlueJ.
* Integrar as classes model (`Equipamento`, `MotorElétrico`, `Gerador`, etc.) com a nova interface.
* Permitir que o usuário realizasse ações como login, visualização de equipamentos e verificação de manutenção através de botões nas telas.

**O que foi Exercido na Prática:**
Na prática, o foco do meu trabalho foi significativamente expandido devido aos desafios técnicos encontrados. Além de desenvolver a interface, precisei executar as seguintes tarefas:
* Dediacar um tempo considerável para diagnosticar e resolver problemas de compatibilidade e configuração entre a IDE BlueJ e a biblioteca externa JavaFX.
* Fui responsável por investigar, isolar e corrigir uma série de erros complexos, que iam desde falhas na localização de arquivos (`FileNotFoundException`) até problemas de ciclo de vida da aplicação (`IllegalStateException`), passando por bugs de formatação visual devido à formatação do texto na interface.
---

### 2. Contribuição de Acordo com a Atribuição

**O que foi Cumprido:**
Todos os objetivos iniciais foram atingidos com sucesso. A contribuição entregue foi uma aplicação JavaFX totalmente funcional, que inclui:
* Uma tela de login para autenticação do usuário, com credenciais pré-definidas.
* Uma tela principal que exibe uma mensagem de boas-vindas personalizada e a lista de equipamentos cadastrados.
* Um console de log integrado à interface que exibe em tempo real os resultados das operações.
* A funcionalidade de "Verificar Manutenção" totalmente integrada, cujos relatórios são exibidos no campo de diagnósticos.

**Lista dos 3 Commits/Documentos Mais Relevantes:**
Como o projeto não utilizou um sistema de versionamento como o Git, considero as seguintes implementações de código como as contribuições mais relevantes:

1.  **Configuração do Ambiente para BlueJ:** A criação da pasta `+vm` contendo o arquivo `args.txt` com os argumentos `--add-modules javafx.controls,javafx.fxml` foi a contribuição mais crítica. Sem ela, seria impossível executar qualquer aplicação JavaFX no BlueJ, sendo a chave que destravou todo o projeto.
2.  **Código de Diagnóstico Avançado (`MainApplication.java`):** A implementação de uma versão temporária da classe principal para listar o conteúdo do diretório de execução foi um ponto de virada. Esta contribuição foi essencial para diagnosticar e resolver o problema de localização do arquivo FXML, que era o principal bloqueio do projeto.
3.  **Correção da Codificação de Caracteres:** A investigação e correção do bug que exibia caracteres especiais de forma incorreta. A solução, que envolveu tanto forçar a compilação em UTF-8 quanto garantir que o `PrintStream` da interface também o fizesse, foi fundamental para entregar uma aplicação com um acabamento profissional e totalmente funcional em português.

**Principais Dificuldades:**
A maior dificuldade não residiu na lógica da programação orientada a objetos, mas sim na configuração do ambiente de desenvolvimento. A depuração de múltiplos erros foi uma tarefa central, ilustrada pelos desafios abaixo:

>  ![image](https://github.com/user-attachments/assets/e9d36cd6-78d0-4573-ba04-eadd98f7a9e0)


> ![image](https://github.com/user-attachments/assets/f8d552fd-2d47-4061-9d60-0c9a88f104bd)


> ![image](https://github.com/user-attachments/assets/8757cbca-03fd-4cca-8f57-db6a1eb791ed)


---

### 3. Contribuição Além do Atribuído

Minhas contribuições adicionais focaram em metodologia e robustez:

* **Aplicação de Métodos Sistemáticos de Depuração:** Em vez de tentar soluções aleatórias, adotei uma abordagem específica para cada erro. Implementei códigos de diagnóstico específicos para obter informações precisas do sistema, uma prática que não estava nos planos iniciais mas se provou essencial.
* **Documentação do Processo de Resolução de Problemas:** A documentação de cada erro e sua respectiva solução serve como um guia valioso para mim no futuro ou para qualquer outra pessoa que venha a trabalhar neste projeto.
* **Preocupação com Portabilidade:** Ao pesquisar soluções para os problemas do BlueJ, busquei ativamente alternativas que não envolvessem a alteração de arquivos de instalação da IDE, como a sugestão de usar "códigos de escape Unicode". Isso demonstrou uma preocupação em criar uma solução que funcionasse em qualquer ambiente, não apenas no meu.

---

### 4. Considerações Gerais

**O que Aprendi:**
Este projeto trouxe algumas lições, principalmente nas áreas que vão além da pura codificação em JAVA:
1.  **A Configuração do Ambiente é Metade do Trabalho:** Aprendi, na prática, que um código funcional pode falhar miseravelmente por causa de uma configuração de ambiente inadequada.
2.  **Técnicas de Depuração Sistemática:** Entendi que a melhor forma de resolver um bug não é adivinhar, mas sim forçar o programa a fornecer as informações necessárias para um diagnóstico preciso.
3.  **Ciclo de Vida de Aplicações GUI:** Entendi na prática o erro `IllegalStateException: Application launch must not be called more than once`, compreendendo que uma aplicação gráfica tem um ciclo de vida que não pode ser reiniciado sem encerrar a instância anterior.

    > ![image](https://github.com/user-attachments/assets/bead3cb6-08ae-4d91-8ac6-9337a58df76c)


4.  **Codificação de Caracteres (Encoding):** Tive uma lição prática sobre a importância da codificação em todo o ciclo de desenvolvimento ao analisar a saída com formatação incorreta, um problema persistente durante o projeto.

    > ![image](https://github.com/user-attachments/assets/bf6da547-ac2c-4fd9-8779-74225b591bf7)

**Trabalhos Futuros Pendentes:**
O projeto, embora funcional, serve como uma excelente base para futuras expansões:
* **CRUD de Equipamentos:** Implementar telas para Criar, Ler, Atualizar e Deletar (CRUD) equipamentos dinamicamente.
* **Armazenar os Dados:** Salvar a lista de equipamentos em um arquivo (JSON, XML) ou em um banco de dados (SQLite).
* **Melhorias na Interface:** Adicionar elementos visuais mais ricos, como ícones de status e gráficos simples.

**Conclusão:**
Concluo este projeto com minhas tarefas finalizadas e com um conhecimento prático muito mais real, devido as experiências encaradas. O processo foi marcado por desafios complexos de configuração e depuração (áreas que eu tinha um conhecimento muito raso sobre), que, apesar de frustrantes, foram as maiores oportunidades de aprendizado. A persistência e a aplicação de métodos lógicos de diagnóstico específicos para classes que vinham a resultar em erro foram essenciais para superar os obstáculos e entregar uma aplicação funcional.

---

### 5. Recursos e Fontes Confiáveis Utilizadas

O desenvolvimento desta fase de interface foi fundamentado em documentações encontradas na internet e recursos confiáveis e usados pela comunidade de desenvolvimento Java.

* **JavaFX & OpenJFX:** Tecnologia central para a construção da interface gráfica.
    * **Fonte:** [Documentação Oficial do OpenJFX](https://openjfx.io/openjfx-docs/)

* **Gluon:** Mantenedora do OpenJFX e do Scene Builder. 
   * **Fonte:** [GluonHQ](https://gluonhq.com/products/javafx/)
   * **Observação:** o arquivo .jar proposto para comunicação IDE-JavaFX no tutorial de cálculo de IMC não foi suficiente, por isso busquei essa biblioteca de arquivos .jar que supriram a necessidade da minha etapa.

* **BlueJ:** Ambiente de Desenvolvimento Integrado (IDE) utilizado no projeto.
    * **Fonte:** [Manual de Referência do BlueJ](https://www.bluej.org/doc/reference-manual.pdf)

* **Codificação de Caracteres e API Java:**
    * **Fonte:** [Oracle Java Documentation: `PrintStream` Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintStream.html)
    * **Fonte:** [The Java™ Tutorials: Unicode](https://docs.oracle.com/javase/tutorial/i18n/text/unicode.html)

* **API de Data e Hora (`java.time`):**
    * **Fonte:** [Oracle Java Documentation: `java.time` Package](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/package-summary.html)
