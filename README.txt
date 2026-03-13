# 🧪 APP Java With Junit tests

Repositório dedicado à prática de **testes unitários em Java utilizando JUnit 5**, explorando diferentes recursos do framework para organização, repetição e execução controlada de testes.

O objetivo é demonstrar **boas práticas de escrita e estruturação de testes**, fundamentais para garantir qualidade e confiabilidade em aplicações Java.

---

# 🚀 O que este repositório demonstra

* Criação de **testes unitários em Java**
* Controle da **ordem de execução dos testes**
* Execução **repetida de testes**
* Estruturação clara de classes de teste
* Validação de lógica de aplicação com JUnit

---

# 📂 Classes de Teste

### `CalculatorTest`

Testes unitários para validar operações de uma classe calculadora.

Demonstra:

* validação de resultados esperados
* organização de cenários de teste
* testes de lógica de negócio simples

---

### `DemoRepeatedTest`

Demonstra o uso de:

```
@RepeatedTest
```

Permite executar o mesmo teste **múltiplas vezes**, útil para validar:

* estabilidade de código
* cenários repetitivos
* testes que dependem de múltiplas execuções

---

### `MethodOrderedByNameTest`

Mostra como controlar a ordem de execução dos testes utilizando:

```
@TestMethodOrder(MethodOrderer.MethodName.class)
```

Os testes são executados **em ordem alfabética pelo nome do método**.

---

### `MethodOrderedByOrderIndexTest`

Demonstra o uso de:

```
@Order
```

junto com:

```
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
```

Permite definir **explicitamente a ordem de execução dos testes**.

---

### `MethodOrderedRandomly`

Demonstra execução de testes em **ordem aleatória** utilizando:

```
@TestMethodOrder(MethodOrderer.Random.class)
```

Útil para identificar **dependências indesejadas entre testes**.

---

# 🧱 Estrutura do Projeto

```
appjava-test-with-junit
│
├── src/
│   └── código da aplicação
│
├── test/
│   ├── CalculatorTest.java
│   ├── DemoRepeatedTest.java
│   ├── MethodOrderedByNameTest.java
│   ├── MethodOrderedByOrderIndexTest.java
│   └── MethodOrderedRandomly.java
```

---

# 🛠 Stack

| Tecnologia  | Uso                           |
| ----------- | ----------------------------- |
| **Java**    | Linguagem principal           |
| **JUnit 5** | Framework de testes unitários |

---

# 🎯 Objetivo

Explorar recursos importantes do **JUnit 5** utilizados no desenvolvimento profissional, incluindo:

* organização de testes
* controle de execução
* repetição de cenários
* validação de lógica de aplicação

Este repositório funciona como um **laboratório prático de testes unitários em Java**, reforçando fundamentos essenciais para desenvolvimento de software confiável.
