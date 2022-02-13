#Author: your.email@your.domain.com


Feature: Abrir conta no banco Next
  Como usuario quero acessar o formulario de abertura de conta para abrir uma conta digital

  Scenario Outline: Acessar formulario de abertura de conta
    Given que esteja no formulario de conta
    When informar o nome <nome>
    And o cpf <cpf>
    And o email <email>
    And confirmar o email <confirmar email>
    Then enviado com sucesso <status>

    Examples: 
      | nome          |        cpf       | email                |  confirmar email    | status  |
      | "Helena Lima" | "070.197.580-61" | "teste@teste.com.br" | "teste@teste.com.br"| true    |
      | "1515121515"  | "000.000.000-00" | "testetestecombr"    | "testetestecombr"   | false   |
      | "Helena Lima" | "070.197.580-61" | "teste@teste.com.br" | "teste@tudo.com.br" | false   |
      | " "           | " "              | " "                  | " "                 | false   |
      | "Helena Lima" | "070.197.580-61" | "teste@teste.com.br" | "teste@teste.com.br"| true    |
