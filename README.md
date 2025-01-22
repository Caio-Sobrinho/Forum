Segue o texto reescrito como README corrigido, sem erros de formatação YAML e pronto para uso:

---

# forumAlura

## Sobre o Projeto  
O **forumAlura** é uma aplicação desenvolvida para gerenciar tópicos de um fórum, com as operações de **CRUD** (Criar, Ler, Atualizar e Deletar). O projeto utiliza **Spring Boot** e implementa autenticação e autorização via **Spring Security** com **JWT (JSON Web Tokens)**. Cada tópico contém as seguintes informações:

- **Título:** Nome do tópico.  
- **Mensagem:** Conteúdo principal do tópico.  
- **Autor:** Usuário responsável pela criação do tópico.  
- **Curso:** Curso relacionado ao tópico.  
- **Data de criação:** Data de registro do tópico.  

🔧 Além disso, o **Flyway** é utilizado para gerenciar migrações do banco de dados, com os scripts armazenados em arquivos `.txt`.

---

### 🔒 Autenticação e Autorização com JWT  
- Segurança implementada com **Spring Security**.  
- Apenas usuários autenticados podem acessar as operações da aplicação.  
- O **token JWT** é gerado no login e deve ser enviado nas requisições subsequentes.

---

### 📂 Migrações de Banco de Dados com Flyway  
- O **Flyway** é utilizado para gerenciar as versões do banco de dados.  
- Scripts de migração estão em `src/main/resources` no formato `.txt`.

---

## Tecnologias Utilizadas  

### 🚀 Ferramentas e Frameworks Principais  
- **Spring Boot:** Framework base da aplicação.  
- **Spring JPA:** Para consultas e persistência de dados.  
- **Spring Security:** Controle de autenticação e autorização.  
- **JWT (JSON Web Tokens):** Autenticação baseada em token.  
- **Flyway:** Controle de migração do banco de dados.  
- **MySQL:** Banco de dados utilizado.

---

## Como Executar o Projeto  

### Pré-requisitos  
- **Java 17** ou superior.  
- **Maven** instalado.  
- Dependências configuradas no arquivo `pom.xml`.  


## Endpoints da API  

### 🔑 Autenticação  
- **Rota:** `/login`  
- **Método:** POST  
- **Descrição:** Realiza a autenticação do usuário e retorna o token JWT.  
- **Exemplo de Corpo da Requisição:**  
  ```json
  {
    "username": "usuario",
    "password": "senha"
  }
  ```

### 📋 Gerenciamento de Tópicos  
1. **Listar todos os tópicos:**  
   - **Rota:** `/tópicos`  
   - **Método:** GET  
   - **Descrição:** Retorna todos os tópicos cadastrados.  

2. **Obter detalhes de um tópico:**  
   - **Rota:** `/tópicos/{id}`  
   - **Método:** GET  
   - **Descrição:** Retorna o tópico correspondente ao ID informado.  

3. **Criar um novo tópico:**  
   - **Rota:** `/tópicos`  
   - **Método:** POST  
   - **Descrição:** Adiciona um novo tópico ao sistema.  
   - **Exemplo de Corpo da Requisição:**  
     ```json
     {
       "titulo": "Título do tópico",
       "mensagem": "Conteúdo do tópico",
       "autor": "Nome do autor"
     }
     ```

4. **Atualizar um tópico:**  
   - **Rota:** `/tópicos/{id}`  
   - **Método:** PUT  
   - **Descrição:** Atualiza as informações de um tópico existente.  

5. **Excluir um tópico:**  
   - **Rota:** `/tópicos/{id}`  
   - **Método:** DELETE  
   - **Descrição:** Remove o tópico correspondente ao ID informado.  
