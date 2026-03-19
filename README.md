# 💳 Sistema de Pagamentos em Java

Projeto desenvolvido com o objetivo de aplicar os conceitos de Programação Orientada a Objetos (POO) em Java.

## 🚀 Tecnologias utilizadas
- Java
- Paradigma POO

## 📚 Conceitos aplicados

- Encapsulamento
- Herança
- Polimorfismo
- Abstração

## 🏗️ Estrutura do projeto

## 💡 Funcionalidades

O sistema permite simular diferentes formas de pagamento:

- Cartão de Crédito
- Pix
- Boleto

Cada tipo de pagamento possui sua própria implementação do método `processarPagamento()`.

## 🔁 Exemplo de uso

```java
Pagamento pagamento = new Pix(100.0, "email@pix.com");
pagamento.processarPagamento();
