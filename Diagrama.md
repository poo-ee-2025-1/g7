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

# **Realizado Etapa 1**

---

# Diagramas de classes

## Código

```
@startuml

interface Monitoravel {
  + simularFalha()
  + correção()
  + exibirInfo()
  + resetar()
  + simularFalha1(dataSimulada: LocalDate)
}

abstract class Equipamento implements Monitoravel {
  - static int problemas
  - static int contaID
  - String tipo
  - String ID
  - String nome
  - LocalDate dataInstalação
  - int vidaUtil
  - LocalDate ultimaVerificação
  - int frequenciaManutenções
  + Equipamento(nome: String, dataInstalação: LocalDate)
  + static getContaID(): int
  + static registrarProblema()
  + static resetarProblemas()
  + static getTotalProblemas(): int
  + getID(): String
  + getNome(): String
  + getTipo(): String
  + getDataInstalação(): LocalDate
  + getUltimaVerificação(): LocalDate
  + exibirInfo()
  + verificarManutenção()
  + simularVerificação(dataSimulada: LocalDate)
  + abstract correção()
  + abstract resetar()
  + abstract simularFalha()
  + abstract simularFalha1(dataSimulada: LocalDate)
}

class Gerador {
  - double horasUsado
  - double limiteHoras
  - double horasDia
  - double reduçãoVidaUtil
  + Gerador(nome: String, dataInstalação: LocalDate)
  + getHorasUsado(): double
  + setHorasUsado(novaHora: double)
  + getLimiteHoras(): double
  + setLimiteHoras(novoLimite: double)
  + exibirInfo()
  + correção()
  + resetar()
  + simularFalha()
  + simularFalha1(dataSimulada: LocalDate)
}

class MotorElétrico {
  - double temperaturaAtual
  - double temperaturaIdeal
  - double aumentoMes
  - double reduçãoVidaUtil
  + MotorElétrico(nome: String, dataInstalação: LocalDate)
  + getTemperatura(): double
  + setTemperatura(novaTemperatura: double)
  + getTemperaturaIdeal(): double
  + setTemperaturaIdeal(novaTemperaturaIdeal: double)
  + exibirInfo()
  + correção()
  + resetar()
  + simularFalha()
  + simularFalha1(dataSimulada: LocalDate)
}

class Transformador {
  - double desgasteTotal
  - double desgastePercentual
  - double reduçãoVidaUtil
  + Transformador(nome: String, dataInstalação: LocalDate)
  + getDesgasteTotal(): double
  + setDesgasteTotal(novoDesgaste: double)
  + exibirInfo()
  + correção()
  + resetar()
  + simularFalha()
  + simularFalha1(dataSimulada: LocalDate)
}

class PainelEletrico {
  - boolean poeiraAcumulada
  - double reduçãoVidaUtil
  + PainelEletrico(nome: String, dataInstalação: LocalDate)
  + exibirInfo()
  + correção()
  + resetar()
  + simularFalha()
  + simularFalha1(dataSimulada: LocalDate)
}

class UtilEquipamentos {
  + verificarTodosEquipamentos(lista: List<Equipamento>)
  + simularTodosEquipamentos(lista: List<Equipamento>, dataSimulada: LocalDate)
}

' Heranças
Equipamento <|-- Gerador
Equipamento <|-- MotorElétrico
Equipamento <|-- Transformador
Equipamento <|-- PainelEletrico

' Implementa interface
Equipamento ..|> Monitoravel

@enduml

```

![Diagrama de classes](https://uml.planttext.com/plantuml/png/pLRDJXin4BuZvHrywqOqIBqYXAYQj4GY5H89zydk95Zosi7sHfLAdwQ7gW_G9yYBTRpERknTGu5B4OUmyutdv_iyjY-C1MshKWoE1aTSMjGho97DbEHMQTYYODy7HumTCyFBIe3-3E8Eig6tvKfhtFtQ_LID1R_n9TTJkMej6WrIZkOp3FCXAy32JMqfu9HTgHp462oIxmzN42oDrP1RbWimXatkAxw14gLLZ9SRWUvVqozsnAWhotD63R6DLalo1DD3SYKjJCVUVcCrbsjc-KP5XWukLOdUq1RBN1DJIO45r5nut6NOyW8MbelkYafONi8jQhxYUNVHIkDzXJBdC0DPMPI4_q7ZwGieo5mjf_l2tlUgYEcigVUjhz5-yfrdmrENCK8rhhaZNL_lUSk67RoMiq5DrWi-LrH3W0Sv2FLPVT6jyIjraZ3FIOo4UTpfrBcqlRPUYpx72SV-VjtkL-W3-uVjlT-zSTJ7Dx5RSjZ3lM5feSwCjFRKp2N1VqwI7w0lgA5GkfcIGbKa4hkZsJ4BGqXa5hpa5YyTs7SVSuYC6ekgxkqssFB7JS8NRrNIxxAjoidcq-n5Y42fjk0-6vz3XAj30uaG8KenbF_kHEblZxwAJnnmhphql5GpHKVQHEn-4sUvwYXciTmGixRIyD5M81u3fmLsGAZgisE6vZdonKMyHiNvePY41Y7gT0o--tBEEtqz7S-xT8BMnZSZyLo3D2kboyHC5cZMO2pMXsaIkKQTavHTzHzHCihr6Y77OK49wcFS3LHZUJDyNmENA2O2ev5QAYKG9Diev3HEUUMZF8VKEE2BMVr_JBWMWfU4QTvuxTqtLuKoeKScw5NW0jBFMG2SnqKyVvqdw8bAtx5BcbgwVjtr4xxypXv6e-PYII3ncPLmY4OXWSUg-bAcpMiJMFj8ZfUUd3oSXozHj-u2PR5_Mhk_lm00)

---

# Diagramas de casos de uso

## Código

```
@startuml
left to right direction
skinparam packageStyle rectangle

actor Técnico

package "Sistema de Gerenciamento de Equipamentos" {
    
    usecase "Cadastrar Equipamento" as UC_Cadastrar
    
    usecase "Cadastrar Motor" as UC_CadMotor
    usecase "Cadastrar Gerador" as UC_CadGerador
    usecase "Cadastrar Transformador" as UC_CadTransformador
    usecase "Cadastrar Painel Elétrico" as UC_CadPainel
    
    UC_CadMotor --|> UC_Cadastrar
    UC_CadGerador --|> UC_Cadastrar
    UC_CadTransformador --|> UC_Cadastrar
    UC_CadPainel --|> UC_Cadastrar

    usecase "Verificar Manutenção" as UC_Verificar
    
    usecase "Simular Falha" as UC_Simular
    usecase "Exibir Informações" as UC_Exibir
    usecase "Sugerir Correção" as UC_Corrigir
    usecase "Resetar Equipamento" as UC_Resetar
    usecase "Visualizar Relatório de Problemas" as UC_Relatorio
    
    Técnico --> UC_Cadastrar
    Técnico --> UC_Verificar
    Técnico --> UC_Resetar
    Técnico --> UC_Relatorio

    UC_Verificar --> UC_Simular : <<include>>
    UC_Verificar --> UC_Exibir : <<include>>
    UC_Verificar --> UC_Corrigir : <<extend>>

@enduml

```

![Diagrama de casos de uso](https://uml.planttext.com/plantuml/png/ZLJ1JgH04BsJy0-LkVi36pCncSnkF9WOnzshAPiQhDXqprOtYQl-ZGVZUUCNy6CM320Weq92eDvxNQ-gkZa94IMMXKqJIzi8qODmVXCXOo4JsRiq2RViTYXOm0xDBUQqYVyiGOsZoosbIPgWYLxWidenZesl8oqN5XiEaGg4ZE0N2Jd3M93JH1fO_orvj_yC2tX84z1h_om36GogNs668GhAaBq03F1xTTM3NqZFlFeRY9hlWsprYTc8tqOEAYu5NTXwAIQwKVoW-XpPaOMrhLwYQFy62-oXONM30k3ew74vquQHvyz98uEVKrkNCvn9ONz8UCkcRZkwCfAhdgkdlgWUdHtPXelIgl8dsXli96rmGbtVyJKBdBh6lkPufT0fzjXqxJBNt08hBq8ZJtM4ym-22meKvpTU2qqhvr2YvNlLN935MFqNRZRwkVXhgwSWlEiLzeeEkz2T7-tnt1YcyAIJKtXayIFOv-zd_3wtbjGDumSS7xCpjinekJnCRmVoJNRNyuPFTxfDifgU9YVwrloHwliD)

---

# Diagramas de sequência

## Código

```
@startuml
actor Técnico
participant Sistema
participant Equipamento
participant "MotorElétrico / Gerador / Transformador / Painel" as EquipamentoConcreto

== Verificação de manutenção atual ==

Técnico -> Sistema : solicitarVerificação(equipamentoID)
Sistema -> Equipamento : localizarEquipamento(equipamentoID)
Sistema -> EquipamentoConcreto : verificarManutenção()
EquipamentoConcreto --> Sistema : resultadoVerificação
Sistema --> Técnico : mostrarResultadoVerificação(resultadoVerificação)

== Simulação de falha futura ==

Técnico -> Sistema : solicitarSimulação(equipamentoID, dataSimulada)
Sistema -> Equipamento : localizarEquipamento(equipamentoID)
Sistema -> EquipamentoConcreto : simularVerificação(dataSimulada)
EquipamentoConcreto --> Sistema : resultadoSimulação
Sistema --> Técnico : mostrarResultadoSimulação(resultadoSimulação)
@enduml

```


![Diagrama de sequência](https://uml.planttext.com/plantuml/png/jPCzQiD048LxWUumkB8Xnhr1mP0Oay8GOfD-MAt8mluuixCfSfqKmUVGnJB-KRmoAfmYdLOxxvltdj0YCX8dPyi25GU2RRjNtgXG5ZkvCChiq3DiJ6JjiFzo-PxamMdFLzEZTH3KqhPx9a7135QQi1Rw3BQ4FZQ1tFdyZCPhEmACEUyXU4Nwm2sBge9NJQOn2jllzYj0hS6XJwpzwOoSq49L7OOx-p2zxqp376AmuasIza1ZVLduz3WfYquWsioBw6rGQCqdKlRwHdMNH2WVv-MqpjoFHJaqFkq581sJPQci5o3RATE_qUVWGcH2UXbKZOTXatFN6-EIlJJTe7r3Q18dmjiwpW3zZkwWHiRJTOt_ttSyRhhwvbSM_b1zbklculCkXa3YOA5zVVp_ok87)






