# Game List API

Este projeto é uma API REST desenvolvida com **Spring Boot** para gerenciar listas de jogos. A API permite buscar jogos, listar jogos por categorias e reorganizar as listas de jogos.

## 📌 Funcionalidades

- Listagem de jogos disponíveis.
- Recuperação de informações detalhadas de um jogo.
- Organização de jogos dentro de listas personalizadas.
- Reorganização de jogos em uma lista.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória para testes)
- **Maven** (gerenciamento de dependências)

## 🔥 Endpoints da API

### 🎮 Jogos

#### 🔍 Listar todos os jogos
- **GET** `/games`
- Retorna a lista de jogos disponíveis.

#### 🔍 Buscar um jogo por ID
- **GET** `/games/{id}`
- Retorna os detalhes completos do jogo com o ID especificado.

### 📋 Listas de Jogos

#### 🔍 Listar todas as listas de jogos
- **GET** `/lists`
- Retorna todas as listas de jogos cadastradas.

#### 🔍 Listar jogos de uma lista específica
- **GET** `/lists/{listId}/games`
- Retorna os jogos pertencentes à lista com o ID especificado.

#### 🔄 Reorganizar jogos dentro de uma lista
- **POST** `/lists/{listId}/replacement`
- Permite alterar a posição de um jogo dentro de uma lista.

## 🛠️ Como Executar o Projeto

### Pré-requisitos:
- **Java 17** instalado
- **Maven** instalado

### Passos para execução:
1. Clone o repositório:
   ```bash
   git clone https://github.com/Luis-Gustavo-MC/dslist.git

