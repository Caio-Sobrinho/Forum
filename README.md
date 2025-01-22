forumAlura
Sobre o Projeto
O forumAlura é uma aplicação desenvolvida como um sistema de CRUD (Criar, Ler, Atualizar e Deletar) para gerenciar tópicos de um fórum. O projeto utiliza o Spring Boot e incorpora autenticação e autorização através de Spring Security com JWT (JSON Web Tokens). Ele foi criado com o propósito de gerenciar tópicos que contêm as seguintes informações:

Título: Nome do tópico.
Mensagem: Conteúdo principal do tópico.
Autor: Usuário responsável pela criação do tópico.
Curso: Indica o curso relacionado ao tópico.
Data de Criação: Registro do momento em que o tópico foi criado.
📋 Além disso, a aplicação vem documentada com o Swagger, permitindo uma interface interativa para explorar e testar os endpoints disponíveis.

🔧 O projeto também utiliza Flyway para gerenciar as migrações do banco de dados, com scripts de configuração armazenados em arquivos no formato .txt.

🔒 Autenticação e Autorização com JWT

Implementação de segurança com Spring Security.
Usuários precisam estar autenticados para acessar as operações do sistema.
O token JWT é gerado no login e utilizado para validar as requisições subsequentes.

📂 Migrações com Flyway

Gerenciamento eficiente das migrações do banco de dados utilizando Flyway.
Scripts de migração localizados em src/main/resources no formato .txt.

🚀 Principais Ferramentas e Frameworks

Spring Boot: Framework principal da aplicação.
Spring JPA: Gerenciamento de consultas e persistência de dados.
Spring Security: Controle de autenticação e autorização.
JWT (JSON Web Tokens): Para autenticação baseada em token.
Flyway: Controle de versionamento e migrações no banco de dados.
MySQL: Banco de dados utilizado.

Pré-requisitos:
Java 17 ou superior.
Maven instalado.
Dependências configuradas no arquivo pom.xml.
Endpoints da API

🛠️ Endpoints implementados:

- Autenticação de Usuário

Rota: /login
Método: POST
Descrição: Autentica o usuário e retorna o token JWT.
Exemplo de Corpo da Requisição:
json
Copiar
Editar
{
  "username": "usuario",
  "password": "senha"
}

- Listagem de Tópicos

Rota: /tópicos
Método: GET
Descrição: Retorna todos os tópicos cadastrados.
Detalhamento de um Tópico Específico

Rota: /tópicos/{id}
Método: GET
Descrição: Retorna o tópico correspondente ao ID fornecido.

- Criação de Novo Tópico

Rota: /tópicos
Método: POST
Descrição: Cria um novo tópico no fórum.
Exemplo de Corpo da Requisição:
json
Copiar
Editar
{
  "titulo": "Título do tópico",
  "mensagem": "Conteúdo do tópico",
  "autor": "Nome do autor"
}

- Atualização de Tópico

Rota: /tópicos/{id}
Método: PUT
Descrição: Atualiza os dados de um tópico pelo ID.

- Exclusão de Tópico

Rota: /tópicos/{id}
Método: DELETE
Descrição: Remove um tópico baseado no ID fornecido.
