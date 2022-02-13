  #Author: your.email@your.domain.com


Feature: Abrir conta no banco Next
  Como ususario quero acessar o formulario de abertura de conta para abrir uma conta digital

Background: Acessar formulario de abertura de conta
   Given que esteja no formulario de conta

  Scenario: Abertura de conta valida
    When preencher os dados obrigatorios 
    Then enviado com sucesso
    
 Scenario: Dados invalidos
    When preencher os dados obrigatorios invalidos
    Then apresenta indicacoes de erro no preenchimento
    
     Scenario: Dados em branco
    When nao preencher os dados obrigatorios
    Then apresenta indicacoes de erro no preenchimento
    
     Scenario: Emails diferente
    But preencher emails diferentes
    Then apresenta indicacoes de erro no preenchimento
    
    Scenario: Dados ja cadastrados
    When preencher os dados obrigatorios 
    Then apresenta indicacoes de erro no preenchimento
