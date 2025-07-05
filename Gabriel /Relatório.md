# Relatório Individual – Gabriel

## 1. Atribuição de cargo e tarefas
### Cargo atribuído:
Desenvolvedor Java (foco em autenticação e sistema de alertas).

### Responsabilidades atribuídas:

#### Implementar a classe Usuario com sistema de login (e-mail/senha).

A classe Usuario tem como objetivo realizar a autenticação de usuários e registrar os alertas recebidos por cada um deles.

#### Desenvolver a classe Alerta para notificar o usuário sobre manutenções pendentes.

A classe Alerta tem como função representar as notificações relacionadas à manutenção dos equipamentos. Cada alerta inclui uma mensagem, a referência ao 
equipamento associado, o nível de severidade e a data em que foi gerado. 

#### Integrar ambas as funcionalidades no Main.

A classe Main tem como objetivo iniciar a aplicação e testar o fluxo de funcionamento básico do sistema. Ela realiza a autenticação do usuário e, se o login for 
bem-sucedido, executa a verificação de manutenção dos equipamentos.

#### Planejar e iniciar estrutura para uma futura Agenda e persistência com BancoDeDados.

A classe BancoDeDados tem como principal objetivo gerenciar a persistência de dados da aplicação, seja por meio de interações com um banco de dados SQLite ou 
simulando essa persistência ao armazenar e manipular objetos do tipo Equipamento em uma estrutura de dados interna (como uma ArrayList). Ela encapsula a lógica de 
criação da estrutura do banco, inserção, recuperação, atualização e exclusão de dados, garantindo uma interface consistente e segura para o restante da aplicação 
e sendo essencial para o gerenciamento das informações durante a execução do sistema.

#### Implementar a classe UsuarioDAO para gestão de dados

Como parte do esforço para tornar o sistema mais robusto e escalável, iniciei a estruturação da persistência de dados relacionada a usuários, criando a classe 
UsuarioDAO. Essa classe segue o padrão DAO (Data Access Object), responsável por encapsular toda a lógica de armazenamento, recuperação, atualização e exclusão de 
objetos da classe Usuario. Diferentemente da classe Usuario, que representa um modelo de entidade com lógica de autenticação, o UsuarioDAO é voltado 
exclusivamente ao gerenciamento de dados.

### Responsabilidades exercidas na prática:

#### Modelei e desenvolvi a classe Usuario, aplicando encapsulamento e lógica de autenticação.

Seu funcionamento baseia-se na verificação de e-mail e senha, permitindo o acesso ao sistema apenas mediante credenciais válidas. Também possui um método que 
armazena e exibe os alertas encaminhados ao usuário. Foi construída com atributos privados (como nome, e-mail, senha e permissão), construtor, getters e métodos 
de lógica simples.

#### Criei a classe Alerta com cálculo de prazos e níveis de severidade com base em datas. 

Seu funcionamento é direto: os alertas são criados quando a manutenção está próxima ou em atraso, e podem ser exibidos ao usuário. A construção dessa classe é 
simples, com atributos, construtor e método de exibição. A data de emissão é gerada automaticamente com LocalDate.

#### Implementei a integração com o Main, permitindo a autenticação como etapa obrigatória.

Foi construída com o método main, utilizando um Scanner para entrada de dados e uma estrutura de decisão if-else para controlar o acesso. Cria uma lista de 
equipamentos de exemplo e interage com as demais classes.

#### Simulei cenários de alertas baseados em Equipamento, conectando o ciclo completo de uso.

#### Contribuí com testes de fluxo e análise de falhas.

#### Iniciei o esboço da Agenda e da classe BancoDeDados.

##### 1. Salvar Dados
Quando o sistema precisa registrar um novo equipamento, ele invoca o método salvar(Equipamento equipamento) da classe BancoDeDados. Esse método adiciona o novo 
equipamento à lista interna que simula um banco de dados. O processo é simples e direto: o objeto é inserido na estrutura de dados que armazena todos os 
equipamentos disponíveis.

##### 2. Buscar Equipamentos
Para localizar um equipamento específico, seja por parte do sistema ou por ação de um administrador, utiliza-se o método buscarPorId(String id). Esse método 
percorre a lista interna procurando pelo identificador informado. Quando encontra o equipamento correspondente, ele o retorna. Caso contrário, informa que o 
equipamento não foi localizado.

##### 3. Atualizar Dados
Se for necessário modificar os dados de um equipamento existente — por exemplo, ao registrar uma nova data de manutenção — o sistema chama o método 
atualizar(Equipamento e). Esse método localiza o equipamento original com base no identificador e, uma vez encontrado, atualiza seus atributos com os novos 
valores fornecidos. Isso garante que as informações permaneçam atualizadas e consistentes.

##### 4. Excluir Equipamentos
A exclusão de equipamentos, especialmente os que não estão mais ativos ou em uso, é feita por meio do método excluir(String id). O sistema fornece o identificador 
do equipamento a ser removido, e o método localiza o objeto na lista e o elimina. Essa funcionalidade permite a limpeza e manutenção dos dados armazenados na 
memória, simulando uma exclusão real de banco de dados.

![image](https://github.com/user-attachments/assets/acd34a7a-86c3-4d12-ac3f-dc8640254293)

Usuário
  |
  | login()
  v
Sistema
  |
  | solicitarEquipamento(id)
  v
BancoDeDados
  |
  | buscarPorId(id)
  v
Busca na lista e retorna objeto
  |
  v
Sistema exibe dados ao usuário

#### Criei a classe UsuarioDAO

A implementação atual do UsuarioDAO é baseada em memória, utilizando uma ArrayList<Usuario> estática como repositório simulado. Os métodos disponíveis refletem as 
principais operações de CRUD:

salvar(Usuario usuario): adiciona um novo usuário à lista.

buscarPorEmail(String email): localiza um usuário pelo e-mail, utilizado especialmente para autenticação.

atualizar(Usuario usuarioAtualizado): substitui o usuário existente por um novo objeto com os dados atualizados.

excluir(String email): remove um usuário da lista com base no e-mail.

listarTodos(): retorna todos os usuários cadastrados.

Essa classe foi projetada para ser integrada futuramente com uma base real, como um banco SQLite, bastando substituir a estrutura em memória por chamadas JDBC ou 
frameworks como JPA.

Além disso, o UsuarioDAO facilita o desacoplamento entre a lógica de autenticação e a lógica de persistência, seguindo boas práticas de design orientado a 
objetos. A classe Usuario permanece responsável apenas por autenticar e receber alertas, enquanto o UsuarioDAO cuida do gerenciamento da persistência de dados.

## 2. Contribuição de acordo com a atribuição
### Tarefas cumpridas:

Autenticação funcional com método login(email, senha) validando as credenciais.

Implementação da classe Alerta, que analisa a data da última manutenção e emite mensagens de atenção ou urgência.

Uso de LocalDate para cálculo de prazos.

Encapsulamento adequado com uso de getters/setters em Usuario.

Integração com o Main para bloqueio de acesso em caso de login inválido.

### Commits/documentos mais relevantes:

Implementação da classe Usuario com autenticação via e-mail/senha.

Criação da classe Alerta, contendo lógica de verificação por data.

Integração de autenticação no início da execução do Main, com controle de acesso.

### Dificuldades enfrentadas:

Integração do fluxo de autenticação no início do Main (parava de interagir com Equipamento).

Estruturação da futura Agenda: A ideia da futura agenda era clara, mas o modelo de dados e a integração com o restante do sistema ainda precisavam ser definidos. 
Nesse processo, acabei integrando e criando uma espécie de agenda dentro da própria classe de alertas, combinando as funcionalidades de forma que as notificações 
e os agendamentos pudessem ser gerenciados de maneira mais fluida. Esse modelo simplificado permitiu um avanço, embora ainda precisasse de ajustes para se alinhar 
completamente ao sistema como um todo.

Dificuldade em implementar a persistência real (via SQLite) dentro do tempo disponível.

## 3. Contribuição além do atribuído
Apoio à equipe e iniciativas além da tarefa:

Acompanhei de perto os colegas na lógica de verificação de alertas, contribuindo para garantir que a checagem de falhas de equipamentos fosse realizada de forma 
eficiente. Sugeri a estrutura da classe Alerta, com o objetivo de criar uma representação desacoplada e flexível das falhas, facilitando a manutenção e o 
entendimento do código.

Além disso, colaborei ativamente na organização do fluxo de execução no Main, garantindo que a autenticação fosse realizada corretamente antes da verificação dos 
equipamentos, evitando problemas de dependência e garantindo a ordem de execução adequada.

Propondo uma visão mais estruturada do sistema, criei e documentei o esboço da Agenda e do BancoDeDados, alinhando as soluções a padrões reais de desenvolvimento, 
com o intuito de tornar o sistema mais escalável e de fácil manutenção.

Também realizei testes manuais de entradas inválidas de login, sugerindo melhorias no processo, como a diferenciação mais clara entre erros de e-mail ou senha 
incorretos, visando melhorar a experiência do usuário e a clareza das mensagens de erro.

Além disso, realizei testes manuais de entradas inválidas de login, sugerindo melhorias no processo, como a diferenciação mais clara entre erros de e-mail ou 
senha incorretos, visando melhorar a experiência do usuário e a clareza das mensagens de erro.

## 4. Considerações gerais
### Aprendizados:

Compreensão sólida de como manipular datas em Java com LocalDate.

Implementação de autenticação básica com verificação de entrada e encapsulamento.

Aprendi sobre a importância da ordem e clareza no fluxo do programa (login → verificação → alertas).

Entendi como representar entidades do sistema de forma limpa, usando boas práticas de modelagem orientada a objetos (POO).

### Tarefas pendentes ou futuras:

Implementar a classe Agenda, permitindo agendamentos personalizados de manutenção.

Implementar a persistência de dados com a classe BancoDeDados usando SQLite.

Melhorar o feedback ao usuário sobre tentativas de login com erros específicos.

### Conclusão:
Apesar do escopo inicial limitado, o projeto foi essencial para consolidar meu entendimento de autenticação, orientação a objetos e fluxo de aplicação em Java. As 
classes Usuario e Alerta se mostraram fundamentais na lógica geral do sistema e abriram espaço para futuras melhorias como agendamentos e persistência. Participar 
do projeto me deu segurança para trabalhar com estruturas mais complexas em projetos futuros.

### Referências:

Uso de LocalDate

https://www.youtube.com/watch?v=G2rChxrc1ug&t=3s&ab_channel=RodrigoFreitas

Comando gerais usados

https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
https://www.kufunda.net/publicdocs/Utilizando%20UML%20e%20padr%C3%B5es%20(Craig%20Larman).pdf

Coleções JAVA

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
https://docs.oracle.com/javase/8/docs/api/java/util/List.html

Identificadores

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equalsIgnoreCase-java.lang.String-
