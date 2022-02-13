#Author: your.email@your.domain.com


Feature: Abrir conta no banco Next
  Como ususario quero acessar o formulario de abertura de conta para abrir uma conta digital

  Scenario: Abertura de conta valida
    Given que esteja no formulario de conta
    When quando preencher os dados obrigatorios
    And enviar o formulario
    Then enviado com sucesso
    
 Scenario: Dados invalidos
    Given que esteja no formulario de conta
    When quando preencher os dados obrigatorios 
    And enviar o formulario
    Then apresenta indicacoes de erro no preenchimento
    
     Scenario: Dados em branco
    Given que esteja no formulario de conta
    When nao preencher os dados obrigatorios
    And enviar o formulario
    Then apresenta indicacoes de erro no preenchimento
    
     Scenario: Emails diferente
    Given que esteja no formulario de conta
    But preencher os emails diferentes
    And enviar o formulario
    Then apresenta indicacoes de erro no preenchimento
    
    Scenario: Dados ja cadastrados
    Given que esteja no formulario de conta
    But preencher os dados ja cadastrados
    And enviar o formulario
    Then apresenta indicacoes de erro no preenchimento
