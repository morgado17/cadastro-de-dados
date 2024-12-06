**Cadastro de nomes**
Irei desenvolver um sistema que permite o cadastro dos seguintes dados para entrar em um portaria

**Pessoas**

- ID: Numerico sequencial chave primarias
- Nome : Campo Texto 200 caracteres, Obrigatório 
- Data NAscimento : Campo Data  minimo 100 anos para tras ou 100 para frente, Obrigatório
- E-amil : Campo Texto 200 caracteres
- RG : Campo Texto 14  caracteres, Obrigatório
- Data e hora do cadastro Campo Data  minimo 100 anos para tras ou 100 para frente, Obrigatório


**Entradas**
- ID: Numerico sequencial chave primarias
- id_usuario: Numerico sequencial chave secundaria, Obrigatório esse campo guarda id da tabela de pessoas 
- Data e hora da entrada, Obrigatório

crud cadastra alterar e registrar quando uma pessoa.
  Permitir consutla por :
  - Nome
  - RG
Registrar a entrada no comdominio da pessas.
