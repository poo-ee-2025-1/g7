# g7
Projeto do Grupo 7

---
---
---

# **Realizado Etapa 1**

# Seção 1 – Introdução

Manter os equipamentos elétricos em bom estado é fundamental para garantir segurança, evitar falhas e manter tudo funcionando bem em indústrias, empresas e até em condomínios. Quando a manutenção não é feita do jeito certo, os riscos aumentam: podem acontecer acidentes, paradas inesperadas nas operações e até prejuízos financeiros. Mesmo assim, ainda é comum ver organizações controlando essas manutenções apenas com planilhas simples ou anotações, o que dificulta muito o acompanhamento e a tomada de decisões mais inteligentes (PIRES, 2019).

A falta de um sistema específico e automatizado para gerenciar a manutenção desses equipamentos gera problemas reais. Um controle manual pode causar perda de informações importantes, atrasos em inspeções e dificuldade em rastrear manutenções corretivas que já foram feitas. Imagine um condomínio com vários transformadores e quadros de distribuição: se não houver um sistema que avise sobre a hora certa de fazer uma manutenção, é muito fácil esquecer e acabar lidando com falhas que poderiam ter sido evitadas.

Com a ajuda da tecnologia, esse processo pode ser muito mais eficiente. Sistemas informatizados facilitam a organização, automatizam tarefas repetitivas, enviam alertas no momento certo e geram relatórios que ajudam na gestão. Um exemplo disso está na Xiaomi, que criou uma fábrica inteligente em Pequim, capaz de produzir mais de 10 milhões de smartphones por ano praticamente sem nenhuma intervenção humana (TECNOGAMES BRASIL, 2024).

Essa fábrica funciona com uma plataforma chamada Xiaomi Pengpai Smart Manufacturing Platform, que usa inteligência artificial, sensores e aprendizado de máquina para prever falhas, tomar decisões e até reconfigurar o processo de produção sozinha (NEW ATLAS, 2024). É um exemplo de como a automação pode transformar a forma como cuidamos dos equipamentos e melhoramos a produtividade.

É claro que um sistema como o da Xiaomi envolve muitos recursos e tecnologias avançadas, que estão fora do alcance da maioria das empresas menores. No entanto, ele serve como inspiração para mostrar o que é possível fazer. Este projeto tem como objetivo justamente adaptar essa ideia para uma realidade mais simples, oferecendo uma solução acessível para pequenas e médias indústrias, empresas ou condomínios, com um sistema de gerenciamento de manutenção desenvolvido com Programação Orientada a Objetos (POO), que seja fácil de usar, eficiente e pronto para evoluir.

---

# Seção 2 – Plano

## Objetivo Geral

Criar um sistema de software, utilizando os princípios da Programação Orientada a Objetos (POO), para gerenciar o ciclo de vida e a manutenção de equipamentos elétricos em ambientes industriais ou residenciais. A ideia é permitir o registro, controle e acompanhamento de manutenções, inspeções e ordens de serviço de forma prática e eficiente.

## Objetivos Específicos

* Permitir o cadastro completo dos equipamentos elétricos, com informações como nome, tipo, fabricante, data de compra e tempo estimado de vida útil;
* Desenvolver funcionalidades para agendar e acompanhar manutenções preventivas e corretivas, com alertas automáticos para lembrar os responsáveis;
* Gerar relatórios históricos com base em período, tipo de manutenção, status e outros filtros personalizados;
* Incluir a opção de múltiplas empresas a serem cadastradas;
* Conectar o sistema a um banco de dados para garantir a segurança e persistência das informações;
* Utilizar boas práticas da POO para manter o código organizado, reutilizável e fácil de manter ou expandir futuramente.

---

# Referências das seções 1 e 2

* PIRES, V. da S. Manutenção elétrica: planejamento, controle e análise de falhas. 2. ed. São Paulo: Érica, 2019.

* TECNOGAMES BRASIL. Xiaomi inaugura fábrica inteligente e autônoma capaz de produzir 10 milhões de smartphones por ano. 2024. Disponível em: [https://tecnogamesbrasil.com.br/2024/07/11/xiaomi-inaugura-fabrica-inteligente-e-autonoma-capaz-de-produzir-10-milhoes-de-smartphones-por-ano/](https://tecnogamesbrasil.com.br/2024/07/11/xiaomi-inaugura-fabrica-inteligente-e-autonoma-capaz-de-produzir-10-milhoes-de-smartphones-por-ano/). Acesso em: 02 jun. 2025.

* NEW ATLAS. Xiaomi's self-optimizing autonomous factory will make 10M+ phones a year. 2024. Disponível em: [https://newatlas.com/robotics/xiaomi-dark-robotic-factory](https://newatlas.com/robotics/xiaomi-dark-robotic-factory). Acesso em: 02 jun. 2025.

---

# Seção 3 - Divisão de tarefas

* Gabriel -20%- Programação das classes de usuário, alerta;
* Gustavo -20%- Começo da harmonização das classes na classe controladora JavaFX;
* João Pedro -20%- Criação de classe iniciais e diagramas de casos de uso e de sequência;
* Miguel -20%- Seção 1 e 2, e diagrama de classes;

## Responsabilidades futuras
* Gabriel - Codificação e criação de classes adicionais e banco de dados;
* Gustavo - (Interface) Programação da classe controladora JavaFX, e desenvolvimento do layout interativo no SceneBuilder;
* João Pedro - Codificação e criação das classes de equipamentos e métodos para verificar a situação de cada um;
* Miguel - Próximos diagramas necessários;

---

# Seção 4 - Diagramas

* Pasta Diagrama.md

---
---
---

# **Realizado Etapa 2**

# Gerenciamento de Manutenção de Equipamentos Elétricos com Apoio de Sistemas Digitais

A confiabilidade e segurança no uso de equipamentos elétricos é um fator crítico em ambientes industriais e prediais. Com o avanço da digitalização e o surgimento de novas tecnologias da Indústria 4.0, os métodos tradicionais de manutenção precisam evoluir para acompanhar as novas demandas por eficiência e previsibilidade.

## 1. A Importância da Manutenção Elétrica Preventiva

Equipamentos como motores, transformadores e geradores são essenciais para o funcionamento de sistemas elétricos, mas estão sujeitos a desgaste e falhas por uso contínuo, envelhecimento ou fatores externos. Diferentemente de uma abordagem corretiva, a manutenção preventiva busca **antecipar problemas** e evitar falhas, promovendo maior segurança e longevidade dos ativos.

Segundo a empresa **Hawkins Electric**, esse tipo de manutenção pode reduzir em até 60% o risco de falhas críticas. A **North Central Electric** destaca ainda que ela contribui para o bom desempenho dos equipamentos e a segurança dos profissionais envolvidos. Além disso, normas como a **NFPA 70B** reforçam a obrigatoriedade de inspeções periódicas, especialmente em instalações de médio e grande porte.

## 2. O Papel dos Sistemas CMMS

A adoção de sistemas digitais como os **CMMS** (*Computerized Maintenance Management Systems*) permite centralizar dados de manutenção e automatizar processos antes geridos manualmente. Eles tornam possível programar inspeções, acompanhar ordens de serviço, gerar relatórios e emitir alertas de forma prática e sistematizada.

A empresa **Accruent** aponta que o uso de CMMS resulta em:

- Redução de custos com falhas inesperadas;
- Melhoria na confiabilidade dos equipamentos;
- Facilidade na organização das rotinas de inspeção;
- Apoio em auditorias e conformidade técnica;
- Prevenção de riscos por meio de alertas automatizados.

## 3. Manutenção Preditiva e a Indústria 4.0

Com tecnologias emergentes como **IoT**, **Inteligência Artificial** e **Machine Learning**, a manutenção elétrica dá um salto em direção à **preditividade**. Agora, é possível detectar anomalias com base em dados em tempo real, antecipando falhas com alta precisão.

Estudos como os de **Zhu et al. (2019)** mostram que algoritmos podem prever falhas ocultas em padrões de operação. **Arifidi et al. (2021)** e **Kane et al. (2022)** demonstram aplicações práticas dessas tecnologias em transformadores, fontes renováveis e painéis de distribuição — otimizando tempo de resposta e reduzindo falhas catastróficas.

Crescimento do Mercado Global de Manutenção Preditiva.

![](![TABELA](![TABELA](https://github.com/user-attachments/assets/a4a1f269-b025-4238-ab68-9b6102d11df3)
))







## 4. Aplicação no Projeto

Este projeto busca aplicar esses conceitos de forma adaptada e acessível, voltada a pequenas e médias empresas, condomínios ou instalações industriais. Através da **Programação Orientada a Objetos em Java**, está sendo desenvolvido um sistema que premite:

- Cadastro e controle de equipamentos elétricos, como motores, geradores, transformadores e painéis elétricos, com dados técnicos como vida útil, tipo e data de instalação.

- Verificação automatizada de falhas com base em critérios específicos de cada equipamento (ex.: temperatura elevada, desgaste excessivo, horas de uso, acúmulo de poeira).

- Simulações futuras de falhas, permitindo prever o comportamento do equipamento em uma data futura.

- Emissão de alertas e mensagens de recomendação quando problemas são detectados.

- Reset de dados dos equipamentos para restaurar seu estado inicial.

Trata-se de uma solução funcional e educativa, semelhante a um **CMMS simplificado**, mas com estrutura pronta para expansão conforme os recursos do usuário.

##  Referências

- Accruent (2025). *10 Benefits of CMMS Software in 2025*. Disponível em: [https://www.accruent.com](https://www.accruent.com)
- Hawkins Electric. *Importance of Electrical Preventative Maintenance*. Disponível em: [https://www.hawkinselectric.com](https://www.hawkinselectric.com)
- North Central Electric. *Electrical Preventive Maintenance Programs*. Disponível em: [https://www.ncelec.org](https://www.ncelec.org)
- NFPA 70B – Recommended Practice for Electrical Equipment Maintenance
- Shaheen, F., & Németh, Z. (2022). *Integration of Maintenance Management System Functions with Industry 4.0*. IEEE Xplore.
- Zhu, R. et al. (2019). *A Survey of Predictive Maintenance using Machine Learning*. Journal of Systems and Software.
- Arifidi, M. et al. (2021). *Artificial Intelligence Based Prognostic Maintenance of Renewable Energy Systems*. Renewable and Sustainable Energy Reviews.
- Kane, D. et al. (2022). *Predictive Maintenance with AI: Trends and Applications*. Springer.
- Pires, A. (2019). *Gestão da Manutenção na Prática*. Ed. Atlas.
- Tecnogames Brasil (2024). *A fábrica inteligente da Xiaomi*. Disponível em: [https://tecnogamesbrasil.com](https://tecnogamesbrasil.com)
- New Atlas (2024). *Inside Xiaomi's Smart Factory*. Disponível em: [https://newatlas.com](https://newatlas.com)

---
#   **Dados Técnicos – Equipamentos Monitorados**

##  Motor Elétrico

**Vida útil média: ~5 anos**

O motor elétrico é um equipamento essencial em ambientes industriais, responsável por transformar energia elétrica em energia mecânica. Essa energia mecânica é utilizada para acionar máquinas, através do acoplamento motor-máquina, sendo peça-chave no funcionamento da linha de produção.  
Fonte: [DME - Motores Elétricos](https://www.dmedsa.com.br/conccel/48-paginas/economia-de-energia/170-motores-eletricos)



###  Importância da Manutenção

Para que o motor opere com desempenho ideal e com o mínimo de falhas, a manutenção deve ser realizada de forma regular e estratégica. Com um plano de manutenção bem definido e o apoio da tecnologia, é possível antecipar problemas, corrigir não conformidades e evitar paradas inesperadas na produção.  
Fonte: [Produttivo - Manutenção de Motores Elétricos](https://www.produttivo.com.br/blog/manutencao-de-motores-eletricos/)

A manutenção periódica garante que os componentes estejam em boas condições e permite identificar falhas ainda em estágio inicial. Isso não apenas prolonga a vida útil do equipamento, como também evita a necessidade de manutenções corretivas mais complexas e custosas.



###  Ações e Verificações Comuns na Manutenção

- Inspeção visual de componentes
- Análises termográficas
- Medições elétricas
- Testes de isolamento
- Troca de óleo e lubrificação
- Limpezas periódicas



###  Benefícios da Manutenção de Motores Elétricos

- Evita acidentes e aumenta a segurança no ambiente de trabalho;
- Reduz o número de paradas não programadas na produção;
- Diminui a necessidade de manutenções corretivas;
- Gera economia nos custos com manutenção;
- Aumenta a performance e a vida útil dos motores;
- Contribui para o uso mais eficiente de energia elétrica.



###  Importância do Plano de Manutenção

Um plano bem estruturado permite acompanhar o desempenho de cada motor individualmente, saber quando a manutenção deve ser feita e qual tipo de intervenção é necessária. Isso ajuda a manter o controle sobre toda a frota de motores da empresa e reduz o risco de falhas inesperadas.



###  Informações Importantes para o Cadastro do Motor

Para facilitar o controle e o monitoramento, recomenda-se cadastrar os seguintes dados no sistema:

- Marca do motor  
- Número de série  
- Modelo  
- Fabricante  
- Ano de fabricação  
- Conformidade com normas regulamentadoras  
- Data da última inspeção  
- Histórico e descrição dos reparos realizados  
- Observações gerais  



>  Um sistema de gerenciamento digital automatizado ajuda a organizar todas essas informações, emitir alertas e gerar relatórios, tornando o processo de manutenção mais eficiente, seguro e econômico.

---

##  Gerador de Energia

**Vida útil média: 10 a 20 anos**  
Fonte: [Tivea Geradores](https://www.tiveageradores.com/produtos/quanto-tempo-dura-um-gerador-de-energia/)

O gerador de energia é um equipamento essencial em ambientes industriais e comerciais, responsável por converter diferentes formas de energia (mecânica, química, solar, entre outras) em energia elétrica.  
Internamente, os geradores operam com dois polos – um positivo e outro negativo – que mantêm uma diferença de potencial constante, alimentando as cargas e garantindo o fornecimento contínuo de energia elétrica.  
Fonte: [Gold Energy](https://goldenergy.pt/glossario/gerador/)



###  Manutenção de Geradores: Por que é tão importante?

A manutenção regular dos geradores garante não apenas seu funcionamento eficiente, mas também previne falhas em momentos críticos — como em quedas de energia da rede principal. Ao seguir um cronograma de verificação e inspeção, é possível detectar e corrigir falhas ainda em estágio inicial, prolongando a vida útil do equipamento e garantindo segurança para o ambiente.



###  Itens que Devem Ser Verificados

Durante a manutenção, alguns componentes devem ser checados com frequência:

- **Óleo e água**: Verificar os níveis e substituir, se necessário.
- **Filtros**: Checar filtros de ar, óleo e combustível, trocando-os se estiverem sujos.
- **Bateria**: Avaliar se está com carga suficiente para partida.
- **Correia**: Verificar desgaste e ajuste adequado.
- **Radiador**: Certificar-se de que está limpo e desobstruído.

Fonte: [Generac Brasil](https://generacbrasil.com.br/como-funciona-a-manutencao-de-geradores-de-energia/)



###  Plano de Manutenção Recomendado

A manutenção pode ser dividida por periodicidade, conforme descrito abaixo:

####  **Manutenção Diária**
- Verificar níveis de combustível e óleo;
- Checar o sistema de aquecimento e fluido refrigerante;
- Inspecionar a tubulação de ar;
- Observar o estado geral (corrosões, vazamentos, danos).

####  **Manutenção Semanal**
- Drenar o tanque e o filtro de combustível;
- Verificar tensão do carregador de bateria;
- Limpar o filtro de ar.

####  **Manutenção Mensal**
- Ajustar e limpar os sistemas do gerador;
- Coletar amostra do líquido de arrefecimento para análise;
- Verificar tensão da correia e carga da bateria.

####  **Manutenção Semestral**
- Trocar filtros, combustível e fluido refrigerante;
- Limpar o cárter de respiro;
- Verificar mangueiras do radiador.

####  **Manutenção Anual**
- Realizar limpeza completa do sistema de refrigeração.

Fonte: [Genergia Brasil](https://www.genergiabrasil.com.br/manutencao-geradores-guia-completo)



###  Informações Úteis para Cadastro no Sistema

Para controle e monitoramento dentro do sistema de gerenciamento, recomenda-se registrar:

- Tipo de gerador (diesel, gás, solar, etc.)
- Marca e modelo
- Fabricante
- Número de série
- Capacidade (kVA ou kW)
- Ano de fabricação
- Data da última manutenção
- Histórico de falhas ou reparos
- Conformidade com normas técnicas



>  O acompanhamento digital desses dados ajuda o responsável técnico a programar as manutenções preventivas corretamente e tomar decisões com base em histórico real de uso e desgaste.

---

##  Transformador Elétrico

**Vida útil média: ~20 anos**  
Fonte: [Confea – Vida Útil de Transformadores](https://www.confea.org.br/midias/uploads-imce/Contecc2021/Eletricista/A%20VIDA%20%C3%9ATIL%20DE%20TRANSFORMADORES%20EL%C3%89TRICOS%20EM%20RESINA%20EP%C3%93XI.pdf)

O transformador é um dos componentes mais críticos de um sistema elétrico. Ele tem a função de **modificar os níveis de tensão**, seja para reduzir a tensão da rede elétrica (baixa tensão) para uso interno ou elevar a tensão para transmissão em longas distâncias. Essa adaptação é essencial para manter o bom funcionamento de máquinas, equipamentos e sistemas ligados à rede elétrica.  
Fonte: [Tecnogera Blog](https://blog.tecnogera.com.br/blog/o-que-e-um-transformador)



###  Principais Problemas em Transformadores

A manutenção de transformadores não deve ser negligenciada. A seguir, os problemas mais comuns e suas implicações:

####  Sobrecarga
Ocorre quando o transformador opera acima de sua capacidade. Isso provoca **superaquecimento**, danos aos enrolamentos e pode até causar **falhas graves**. Monitorar a carga regularmente é fundamental.

####  Desgaste do Isolamento
O isolamento dos enrolamentos é o que evita curtos-circuitos. Com o tempo, o calor e a umidade danificam esse isolamento, podendo levar a falhas elétricas. **Inspeções periódicas** podem identificar desgastes antes que se tornem problemas críticos.

####  Contaminação do Óleo
Transformadores a óleo usam esse fluido como isolante e meio de resfriamento. Quando contaminado com água, partículas ou produtos químicos, o óleo perde eficiência. Ensaios laboratoriais regulares ajudam a **garantir a qualidade do óleo**.

####  Vibrações Excessivas
Desequilíbrios mecânicos ou falhas internas podem gerar **vibrações anormais**, prejudicando componentes e criando ruídos indesejados. O ideal é identificar e corrigir essas vibrações precocemente.

####  Temperatura Elevada
Excesso de calor é uma das maiores ameaças aos transformadores. Pode ser causado por sobrecarga, falha na ventilação ou problemas no sistema de resfriamento. Um bom sistema de **monitoramento térmico** é essencial para evitar danos permanentes.  
Fonte: [Transformador Elétrico – Blog Técnico](https://www.transformadoreletrico.com.br/blog/categorias/artigos/manuten-ccedil-atilde-o-de-transformadores-dicas-e-import-acirc-ncia)



###  Recomendações para Manutenção

- Verificação periódica da temperatura operacional;
- Análise laboratorial do óleo isolante;
- Inspeção visual de cabos, buchas e conexões;
- Verificação de ruídos ou vibrações anormais;
- Checagem dos indicadores de nível de óleo e pressão;
- Manutenção do sistema de ventilação ou refrigeração.



###  Informações para Cadastro no Sistema

Para garantir um monitoramento eficaz, é importante registrar os seguintes dados no sistema de gerenciamento:

- Tipo de transformador (a seco, a óleo, encapsulado, etc.)
- Potência nominal (kVA)
- Tensão primária e secundária
- Marca e modelo
- Fabricante
- Número de série
- Ano de fabricação
- Data da última inspeção/manutenção
- Histórico de falhas ou anomalias
- Resultados de ensaios laboratoriais (óleo, isolamento, etc.)



>  Um transformador bem monitorado é sinônimo de segurança energética, maior durabilidade e menos interrupções na operação industrial.

---

##  Painel de Distribuição Elétrica (Quadro de Distribuição)

**Vida útil média: ~15 anos**  
Fonte: [IBAPE Nacional – Estudo de Vidas Úteis](https://ibape-nacional.com.br/admin/images/Estudo%20de%20vidas%20_teis%20de%20bens.pdf)

O quadro de distribuição é o ponto central onde todos os circuitos elétricos de uma instalação — seja industrial, comercial ou residencial — se conectam. Através dele, a energia recebida da concessionária é distribuída de forma organizada e segura entre os diversos setores, máquinas, pontos de iluminação e tomadas.  
Fonte: [Amperi](https://amperi.com.br/canais/instalacao-eletrica/quadro-distribuicao-eletrica/)



###  Funções e Componentes

O quadro não apenas distribui energia, mas também abriga **dispositivos de proteção** e controle, como:

- **Disjuntores** – protegem contra sobrecargas e curtos-circuitos;
- **DR (Dispositivo Diferencial Residual)** – detecta fugas de corrente e evita choques elétricos;
- **DPS (Dispositivo de Proteção contra Surtos)** – protege contra descargas elétricas e surtos de tensão;
- **Fusíveis, barramentos, relés e contatores** – para controle e seccionamento de cargas.

A correta organização e manutenção desses elementos é essencial para garantir a **segurança da instalação** e a **eficiência energética**.



###  Manutenção Preventiva do Quadro de Distribuição

A manutenção periódica evita falhas, minimiza riscos e garante a conformidade com as normas técnicas. As ações recomendadas incluem:

####  Inspeções Visuais
- Verificar estado de disjuntores, fusíveis, fios e conexões;
- Procurar sinais de superaquecimento, desgaste ou corrosão;
- Verificar presença de pragas (roedores, insetos) no interior do quadro.

####  Testes Técnicos
- Medir funcionamento de disjuntores e DPS com multímetro;
- Testar eficiência do isolamento elétrico;
- Avaliar conformidade com normas de segurança vigentes.

####  Limpeza e Conservação
- Remover sujeira e poeira acumulada;
- Reapertar conexões soltas;
- Eliminar umidade ou sinais de infiltração;
- Em casos específicos, analisar o óleo isolante de componentes embutidos (como mini transformadores).

>  Uma inspeção bem feita pode identificar ligações frouxas, sobrecarga em determinados circuitos, aquecimento excessivo e outras condições de risco que comprometem a instalação.

Fonte: [Defante Materiais Elétricos](https://www.defantemateriaiseletricos.com.br/blog/categorias/quadro/quadros-eletricos-precisam-de-manutencao)



###  Informações Relevantes para Cadastro no Sistema

Ao registrar um painel de distribuição no sistema de gerenciamento, inclua:

- Tipo do painel (monofásico, trifásico, industrial, etc.)
- Quantidade de circuitos/disjuntores
- Marca e modelo
- Localização exata na planta
- Fabricante e número de série
- Ano de instalação
- Última manutenção ou inspeção
- Histórico de falhas, ajustes e substituições



>  Um painel bem monitorado garante a distribuição segura de energia e contribui diretamente para a confiabilidade de toda a instalação elétrica.



---



