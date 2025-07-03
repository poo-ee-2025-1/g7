#Relatório de Produção Individual – Gabriel

1. Atribuição de cargo e tarefas
Cargo atribuído: Desenvolvedor Java(lógica de autenticação e alertas)

Responsabilidades atribuídas:

Criar a classe Usuario com sistema básico de autenticação (e-mail/senha).

Criar a classe Alerta para notificar sobre manutenções e vencimentos.

Estender o projeto com Agenda e Banco de Dados.

Responsabilidades exercidas na prática:

Desenvolvi completamente a classe Usuario com verificação de acesso.

Modelei e implementei a classe Alerta com base na lógica de verificação de datas de manutenção.

Contribuí com testes e integração parcial com o Main.

2. Contribuição de acordo com a atribuição
O que foi cumprido:

Autenticação de usuários por e-mail e senha com bloqueio de acesso se inválido.

Lógica de alerta baseada na data da última manutenção e na frequência.

Utilização de LocalDate para comparar e calcular prazos vencidos.

Commits ou arquivos mais relevantes:

classe Usuario com autenticação simples

criação de Alerta com lógica de vencimento

integração de login com Main.java

Dificuldades enfrentadas:

Integração do fluxo de autenticação no início do Main (parava de interagir com Equipamento).

Dificuldade em planejar e estruturar a persistência em banco de dados.

3. Considerações gerais
O que aprendi:

Como manipular datas em Java usando LocalDate.

Como fazer autenticação simples.

A importância de organizar o fluxo do programa (login antes de qualquer ação).

O que ficou pendente ou seria um próximo passo:

Criar a classe Agenda para registrar datas futuras de manutenção.

Implementar BancoDados.

Conclusão:

Mesmo com escopo reduzido, as classes Usuario e Alerta foram fundamentais para o funcionamento básico do sistema.

A experiência me ajudou a entender como os objetos e a lógica de POO se conectam em um projeto real.
