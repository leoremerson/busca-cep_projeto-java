# 📍 Busca CEP

Este é um projeto simples desenvolvido em Java que permite ao usuário buscar informações de endereço a partir de um CEP utilizando a API ViaCEP. O objetivo é praticar conceitos de **requisições HTTP**, **tratamento de exceções**, **serialização de objetos JSON** e **entrada de dados via console**.

---

## 🚀 Funcionalidades

* 🔎 Consulta de endereço a partir do CEP informado.
* ⚠️ Validação de formato do CEP.
* 📁 Geração de arquivo `.json` com os dados dos endereços buscados
* 💬 Interface via linha de comando com opção para múltiplas consultas

---

## 📦 Estrutura do Projeto

```
src/
├── Main.java                 # Classe principal com o menu e lógica da aplicação
├── BuscaCep.java              # Record com os campos retornados da API
└── CepInvalidoException.java   # Classe de exceção personalizada para CEPs inválidos
```

---

## 🛠️ Tecnologias Utilizadas

* Java 17+ ☕
* IntelliJ IDEA
* Biblioteca `HttpClient` para requisições HTTP
* Biblioteca `Gson` para conversão JSON
* API ViaCEP: https://viacep.com.br

---

## 📌 Conceitos Trabalhados

* Requisições HTTP com `HttpClient`
* Manipulação e escrita de arquivos `.json`
* Validação e tratamento de exceções com classe personalizada
* Uso de records
* Entrada de dados com `Scanner`
* Boas práticas de organização de código

---

## 📷 Demonstração

Abaixo, uma execução típica da aplicação:

```
----------------------------------------------
                 Busca CEP
Após a conclusão, digite 'sair' para encerrar.
----------------------------------------------
Digite o CEP:
01001000

CEP: 01001-000
Logradouro: Praça da Sé
Complemento: lado ímpar
Bairro: Sé
Cidade: São Paulo - SP
```

Exemplo de saída JSON:

```
  {
    "cep": "01001000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP"
  }
```

---

## 📄 Licença

Este projeto é de uso livre para fins de estudo e aprendizagem.

---

## ✍️ Autor

[Leo Remerson](https://github.com/leoremerson)

Desenvolvido como parte da minha jornada de aprendizado em Java no programa Oracle Next Education (ONE) - Alura.
