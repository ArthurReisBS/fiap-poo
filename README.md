---
# Fiap - Programação Orientada a Objetos (POO)

### Índice dos tópicos:

1. [Sobre o projeto](#sobre-o-projeto)

2. [Aulas](#aulas)

3. [Explicações sobre as Classes](#explicações-sobre-as-classes) 

4. [Erros corrigidos](#erros-corrigidos)

### Sobre o projeto:
Esse repositório diz respeito às aulas dadas na FIAP, no segundo ano de Ciência da Computação.
A ideia é seguir semanalmente o conteúdo da aula de forma prática.
O README será após esse dia (0904) atualizado também semanalmente, para explicar o conteúdo da aula referente ao commit dado.
O índice serve para melhor "viagem entre tópicos", basta clicar no assunto que deseja ler que ele te leva até lá.

FiapRide é um sistema dentro deste projeto, pode se dizer que é como se fosse um "Uber", é neste sistema que tudo feito em aula está.

---
# Aulas:
Este tópico mostra o que foi aprendido em cada aula, e quais são os commits que dizem respeito à elas.

### Aula 1 Fundamentos de OO - Classes e Objetos
- Sobre a aula: 
Demos todo o "pontapé" inicial no projeto (aprendendo a criar estes arquivos no Eclipse), aprendemos sobre Classes e Objetos, o que os diferenciam, para que servem e como utilizá-los.
Fizemos isso tanto no arquivo Java quanto no Astah (Igual em todas as outras aulas).
No final mandamos tudo para este repositório.

- Commits relacionados:
feat: aula01 - implementa a classe Caderno e desafio pessoal

### Aula 2 - Métodos e Comportamentos
- Sobre a aula:
Aprendemos a como adicionar métodos e comportamentos às Classes.
Fizemos a cadeia de testes e etc.

- Commits relacionados:
feat: adiciona métodos de comportamento e atualiza README

### Aula 3 - Protegendo o Sistema - Encapsulamento (Getters e Setters)
- Sobre a aua:
Aprendemos como utilizar os termos "private" e "public" nas Classes.
Aprendemos também sobre o que são Getters e Setters, e sua importância.

- Commits relacionados:
Atualizando a segurança das classes

### Aula 4 - Construtores
- Sobre a aula:
Essa foi uma aula mais tranquila, vimos sobre Construtores de Objetos, como implementá-los, para que servem e alguns cuidados a se tomar ao criar.

- Commits relacionados:
*Como eu já tinha implementado construtores na minha classe no commit passado, não tiveram commits (na minha classe Caderno) para essa aula*

### Aula 5 - Quando os Objetos Conversam - Relacionamentos (Associação)
- Sobre a aula:
Aprendemos que classes podem utilizar outros objetos dentro de si mesma, por exemplo, criamos a classe Viagem, que possuia um Passageiro (solicitante) e um Veiculo (veiculoUtilizado)

- Commits relacionados:
Atualizando (e praticamente adicionando) classe Autor, e classe Viagem

---
# Explicações sobre as Classes
Este tópico possui dois caminhos, "Minhas Classes" que se referem a classes criadas por mim, e "Classes das Aulas" que se referem a classes dadas em aula.

## Minhas Classes

### Caderno:

Essa é a classe autoral inicial do projeto. Na aula 0 preparamos uma classe fictícia com pelo menos 3 atributos e 2 métodos.
Ela cria objetos que tem alguns dos conceitos que cadernos ou livros tem.

Atributos: 
tituloCapa (o título do caderno)
marcaPagina (o marca página do caderno)
totalFolhas (o total de folhas do caderno)
escritor (classe Autor)

Métodos:
arrancarFolha (remove folhas do caderno)
mudarMarcaPagina (muda o local do marca página)
exibirResumo (mostra resumo sobre tudo do caderno)

(esses setters servem para a construção dos objetos)
setTituloCapa
setMarcaPagina
setTotalFolhas

(servem para mostrar o valor que cada atributo tem)
getTituloCapa
getMarcaPagina
getTotalFolhas

### Autor:

A classe que foi criada para o aprendizado da aula 5, sobre relacionamentos entre Objetos.
É o "escritor" dos Cadernos.

Atributos:
nome
nacionalidade
anoNascimento
cadernosPublicados (que mostra um inteiro do total de cadernos da sua autoria que o objeto possui)

Métodos:
adicionarAutoriaDeCadernos (adiciona quantos cadernos o autor possui em sua autoria)

Tem também os getters de todos os atributos, servindo para mostrar o valor deles.

## Classes das aulas

### Passageiro:

Primeira classe dada em aula, representa o passageiro do APP "FiapRide".

Atributos:
nome
cpf
saldo

Métodos:
adicionarSaldo
pagarViagem

também com getters (para mostrar valores) e setters (para criação de objetos)

### Veiculo:

Classe que representa o carro que o passageiro vai entrar para chegar ao seu destino.

Atributos:
placa
modelo

Métodos:
atualizarPlaca

setPlaca (único setter)

getPlaca
getModelo

### Viagem:

Essa classe faz a intermediação entre os objetos do Veiculo e do Passageiro.

Atributos:
destino
valor
solicitante (classe Passageiro)
veiculoUtilizado (classe Veiculo)

Métodos:
exibirResumo (exibe um resumo com dados sobre a viagem)

e getters para os atributos.

---
# Erros Corrigidos:

Alguns commits foram dados para corrigir certos erros que acabei cometendo, este tópico se refere a eles.

## Commits:
### Removendo arquivos desnescessários
Quando dei meus primeiros commits vários arquivos que não precisavam ter sido commitados também foram (obviamente)
Excluí eles no git e criei um gitignore

### Removendo o que sobrou
Alguns desses arquivos que era pra remover no primeiro commit eu acabei esquecendo...

### Adicionando Classe Passageiro e refatorando sistemas
Eu não tinha entendido que era para commitar o código dado em aula pelo professor
Após esse commit todos os códigos dados em aula também foram incluídos

### Atualizando novo README
Não atualizei o README regularmente, então esse commit de agora vai atualizar muita coisa
Além de que após ele vou começar a atualizar aqui toda aula

---
