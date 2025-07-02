# **Realizado Etapa 1**

# Diagrama de classes

## Código

```
@startuml

class Equipamentos {
  - tipo: String
  - nome: String
  - id: int
  - dataInstalacao: LocalDate
  - vidaUtil: int
  - ultimaVerificacao: LocalDate
  + mostrarInfo(): void
  + simularFalha(): void
}

class MotorEletrico {
  - temperaturaAtual: double
  + simularFalha(): boolean
}

class Gerador {
  - horasUsado: double
  + simularFalha(): boolean
}

Equipamentos <|-- MotorEletrico
Equipamentos <|-- Gerador

@enduml
```

![Diadrama de classes](https://cdn-0.plantuml.com/plantuml/png/ZP31IWCn48RlUOeS5TaNM3nKi4f1JrBlVpTJEp39h9D9B-gxMnRNijI3j_3zcI_vPrKTvYrB28EWrhX-RpmYKt6jyIF4s4NdKVluuiRbRG95Coq0fpvoyUcSuDYKwX0CECqzwG2vXzEK7ZbXwopd-qsSCrx9UC_3vSXDp5hTO9korwlhFXwLqyGhvoQm1yW1ly7NtEDPNMqjvCQ3paKeZsJmPhZp1kbZqhOJ-bEtKnL2EHiVoP3KVbm7DTHjFP7_MXQRlVtikkKVB_FvnH1ML5BB4hu1)


# Código do Diagrama de Caso de Uso:


```
@startuml
left to right direction

actor Usuário



rectangle "Empresas" {
  usecase "Cadastrar empresas" as UC6
}

rectangle "Cadastro de equipamentos" {
  usecase "Cadastrar equipamentos" as UC7
}

rectangle "Sistema de monitoramento" {
  usecase "Análise de equipamentos" as UC5
}

rectangle "Equipamentos" {
  usecase "Motor Elétrico" as UC1
  usecase "Gerador" as UC2
  usecase "Transformador" as UC3
  usecase "Painel Elétrico" as UC4
}

Usuário --> UC6
UC6 --> UC7
UC7 --> "Equipamentos"
UC6 --> UC5
UC5 --> UC1
UC5 --> UC2
UC5 --> UC3
UC5 --> UC4


@enduml
```




## Imagem do Diagrama de Casos de Uso:


![Diagrama de Casos de Uso](https://img.plantuml.biz/plantuml/png/VPBFQiCm3CRlWRo3wBs7_ibo6nqbx3GOR7q0aQYTmROwMJcDFKoFUuwysEB66qa3nM3yoPz_acplWg9ewsoUMJegA8EOquT2OuHgDUppBC-mLXOuXBQxYE4OYICQq9yimQ9oPw60OG5VUGRG1genzF4zDXXKK83-7HZWi7_8i-yRHl8oD0JqsPepElBAzvWJrvLRphbl9YWvZ5Z7tlIT34TkkK--krZJhsRvh-HYJgxkLFd2ySegs_sec9eJP3NnF9DWmvBsrfEzTq4VZYnkvDXC7AzeFDbPYcsgy--rOBby72wydv8eeoYlOjh4s5H4KIIn6elrM6p6OZlyZ1tvflzJlm00)






# Diagrama de Sequência para um caso de uso:


```
@startuml


actor Usuário
participant Sistema
participant Banco


Usuário -> Sistema : cadastro de empresa
Sistema --> Usuário : cadastro efetuado

Usuário -> Sistema : solicitar cadastro de equipamentos
Sistema -> Banco : buscar equipamentos
Banco --> Sistema : equipamentos disponíveis
Sistema --> Usuário : exibir equipamentos disponíveis

Usuário -> Sistema : cadastro de equipamentos
Sistema -> Banco : selecionar equipamento
Banco --> Sistema : equipamento selecionado
Sistema --> Usuário : equipamento selecionado

Usuário -> Sistema : verificar situação
Sistema -> Banco : situação atual dos equipamentos
Banco --> Sistema : diagnóstico dos equipamentos
Sistema --> Usuário : equipamentos defeituosos e funcionais



@enduml
```

## Imagem do Diagrama de Sequência para um caso de uso:

![Diagrama de sequência](https://img.plantuml.biz/plantuml/png/ZLB1RSCm3Fm7o0vSm0lq4GHPeUW0YaGN16pH5QMWwnHvzDLNHz1YeMeujO2eBlWHn3loZkHHeWanZSD-LyBOo05U9EMFGBpVJPeaIvFn4Pv98ewc_ZmPRtdcBYpe3WiMdi0QPoG61eU0unHGjCAIxXHwfwsms6DCnd6xhF2W4bHxtU0jgQmHVMHPTJdCCfLsJcALK-FcP5VLNoF0aKpiyzS5IPhYyPtE5FuY_cj4Mmu41xJ4ldQnQUANLwRQij32jvHVC51FPQ92kh3ycQ_yMFKz3KPV0pYTplOM79bNdxz5puqVKBPjw0hqbhGvIs53d_oFgNaT9OxedPx_3G00)

---
---
---

# **Realizado Etapa 2**



# Diagramas de classes

## Código

```
@startuml

skinparam classAttributeIconSize 0

class Equipamento {
  - nome : String
  - tipo : String
  - dataInstalação : LocalDate
  - vidaUtil : double
  - frequenciaManutenções : int
  - ultimaVerificação : LocalDate
  + verificarManutenção() : void
  + simularVerificação(data: LocalDate) : void
  + exibirInfo() : void
  + resetar() : void
  + correção() : void
  + simularFalha() : void
  + simularFalha1(data: LocalDate) : void
  + getNome() : String
  + getTipo() : String
  + getDataInstalacao() : LocalDate
  + getVidaUtil() : double
  + getFrequenciaManutencao() : int
  + getUltimaVerificacao() : LocalDate
  + registrarProblema() : void
  + getTotalProblemas() : int
}

class MotorElétrico {
  - temperaturaAtual : double
  - temperaturaIdeal : double
  - aumentoMes : double
  - reduçãoVidaUtil : double
}

class Gerador {
  - horasUsado : double
  - limiteHoras : double
  - horasDia : double
  - reduçãoVidaUtil : double
}

class Transformador {
  - desgasteTotal : double
  - desgastePercentual : double
  - reduçãoVidaUtil : double
}

class PainelEletrico {
  - poeiraAcumulada : boolean
  - reduçãoVidaUtil : double
}

MotorElétrico --|> Equipamento
Gerador --|> Equipamento
Transformador --|> Equipamento
PainelEletrico --|> Equipamento

class Usuario {
  - nome : String
  - cargo : String
  - id : int
  - email : String
  - senha : String
  + autenticar(email: String, senha: String) : boolean
  + receberAlerta(alerta: Alerta) : void
  + getNome() : String
  + getCargo() : String
  + getId() : int
}

class Alerta {
  - mensagem : String
  - dataAlerta : LocalDate
  - equipamento : Equipamento
  + getMensagem() : String
}

Alerta --> Equipamento : equipamento
Usuario --> Alerta : receberAlerta()

@enduml


```

![Diagrama de classes](https://cdn-0.plantuml.com/plantuml/png/bLNBRbCn4DtVhxZBL109jbsWHhI5I0HLQjFzn9wa8_n8n-CAyVWQ5eWFu0lwOzYtryLEKbHMKUOSdndF6Syz2G8iqPgk2v_8RO71zif023CHfbKKd2llBkaBzg-wRa3wizj8Mx3enFTVkxwVzivRx8_xIs5oco4YjFLjH8F0t0K10_S_xtzaz8DNO4v1S23SaOQba4c0zd5b7g9hnjk8JX4im4L1bmx_nf18v6HWH2DauHgPrgGEQh_exqQKYqXcJOuIxywJ7YY1R3J0ZSua5rrfDGVmCws8vswz8yGOK83ReFBC-7JMSp0ty3Jo-f-5R50-UelfU6bu2Lyb5mw4J_zQeI0JAkN2kHxTI6Zneq3dkvOK4N9IECl6bCDP63SKX84ls2TvMpMWrEy5J473OuxlPH8NNZoVcVjVmgJAC0hQBJ98P9X9X6QU6dIkSHU5E8pr0aCRPzHnSEzwRqWVYtc73DhpMCMDPmZBa2AjaY5BWkypMW7bm2d1_oU-Od1XxTbMwJM63GJ1eOEjP84ka1MwjaFFJNa1vD2S6QmRl_L833CLy-3gV96LzmR1FKDsnydfzDkRUizqfRbxG7lvFRWjT0ylzrc624nFhpC5lF5jY7IrWz02cHOFw6wWVNeG1PrG4fiC1mhuye5S_XurdSllHE4AUMQG1IQGVnBtuUyp5y7RNF-1-5plFQfHU6o5HHTWWtP_bu-qtIsErSVXk6vrIRaO5UjgKkvHRZej_XG9h2IAJPbLyk-qvwZhJj3f_4dx0m00)



---

# Diagramas de casos de uso

## Código

```
@startuml
left to right direction
skinparam packageStyle rectangle
skinparam actorStyle awesome

actor "Usuário Comum" as Usuario
actor "Administrador" as Admin
actor "Sistema" as Sistema

rectangle "Sistema de Gerenciamento de Equipamentos Elétricos" {

  usecase "Autenticar no Sistema" as UC1
  usecase "Cadastrar Equipamento" as UC2
  usecase "Simular Falha" as UC3
  usecase "Receber Alerta" as UC4
  usecase "Exibir Informações" as UC5
  usecase "Gerar Relatório" as UC6
  usecase "Resetar Equipamento" as UC7
}

Usuario --> UC1
Usuario --> UC3
Usuario --> UC4
Usuario --> UC5

Admin --> UC1
Admin --> UC2
Admin --> UC3
Admin --> UC4
Admin --> UC5
Admin --> UC6
Admin --> UC7

Sistema --> UC4 : envia alertas
UC3 --> UC4 : gera

@enduml


```

![Diagrama de casos de uso](https://cdn-0.plantuml.com/plantuml/png/RP9B3jem48RtSueHUnRb0L8N5GZHgbiG1nYS8LZuGSTE7wfwcAwghgkU81Uh4n9ae-xopV_P7dko2P4aDjQ0uKl4w55qVOrOQM4LjNSGRjhTISZYdTIDQZx6RuQnYydLXZE1LFJoYEaB1syPeA_Xv1IQzgTeZpjl6pj12fXAb2gZiQsiTZf4eSfBB_ILCJwcY2trmV0Dy6pYcMF5-865dT9asKNV5VQV6dr_OC2zQNz7qSg72Nu7G6m2AmgSEcXYKhGYGUSnF_2qUvEBEwgeQrJodGTnbej7RHkJjFTahkDEyrmuiE8p2suDInoDHMxil-gp5lpeBbuijR_Qlnm6RvbxwT8aU613iVsJddLmLkLfWUD_krx33u1X83YTlkjlNFByXHSll0Je1pOkBsXMqBoWHK7BWbO5hG76CGzByIso-wm9gN_006dpBAjP2633hkh-SFW7)



---

# Diagramas de sequência

## Código 1

```
@startuml
actor Usuario
participant "Sistema" as Sistema
participant "Equipamento" as Equipamento
participant "Alerta" as Alerta

Usuario -> Sistema : solicitarSimulacaoFalha(equipamento)
Sistema -> Equipamento : simularFalha()

alt falha detectada
    Sistema -> Alerta : criarAlerta(mensagem, equipamento)
    Sistema -> Usuario : receberAlerta(alerta)
end

@enduml

```


![Diagrama de sequência](https://cdn-0.plantuml.com/plantuml/png/LP11JWCn34NtFeNLLKU22x10PG4Ng3Z09sCWKZ8fZkV-U2QDEiaYyPV--p_ofHhKrfm8mOhoPrsXiT0DQZ746nRZqpLMaumJe_9z7WtlVwjFMHOhk-cWH-DR4hKMr4QYUoC_l_PiVk5QaZC6lSQy9WIK3wHVdEKHF56tEtaetEWTqePCH4Z6tvlWMKo2OGQndqD0-uspGIEqgRFdLVn8VkAXTqJxofnL2V8bdSR-J2JBJ7JnUzloFm00)








