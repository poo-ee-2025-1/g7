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
