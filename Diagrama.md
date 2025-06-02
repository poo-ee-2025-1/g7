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
