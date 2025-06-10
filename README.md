# 💼 RH-Tech API

API RESTful desenvolvida com **Spring Boot** para gerenciamento de funcionários e cargos em um sistema de RH. Os dados são armazenados em um banco de dados relacional e integrados a um front-end web simples para cadastro de usuários.

## 🔧 Funcionalidades

- Cadastro de funcionários e cargos  
- Listagem completa de registros  
- Busca por ID  
- Atualização de dados  
- Exclusão de registros  

## 📄 Entidades

- Funcionário
- Cargo

## 🌐 Integração com o Front-End

A interface web envia os dados do formulário de cadastro via **JavaScript (Fetch API)** para os endpoints da aplicação. O retorno é tratado com mensagens de sucesso ou erro para o usuário.
> ⚠️ Importante: O repositório da interface front-end está mantido em projeto separado para melhor modularização e organização do sistema. Para mais informações, acesse o repositório https://github.com/yasminmartimiano/InterfaceCepAPI.git
## ⚙️ Tecnologias

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- HTML/CSS/JavaScript  

## ▶️ Como Executar

1. Clone este repositório:  
   ```bash
   git clone https://github.com/yasminmartimiano/rh-tech
2. Configure o banco de dados MySQL e atualize o application.properties com as credenciais corretas.
3. Rode a aplicação:
   ```bash
   ./mvnw spring-boot:run
4. Acesse a aplicação pelo navegador e utilize o front-end para realizar cadastros e testes.
