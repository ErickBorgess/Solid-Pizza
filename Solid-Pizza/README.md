# 🍕 Solid-Pizza

Projeto desenvolvido para a disciplina **Padrões de Projeto** (IFBA – Santo Antônio de Jesus).  
O objetivo é demonstrar **más práticas de design (anti-patterns)** e depois **refatorar o código aplicando SOLID, IoC e padrões de projeto**.

---

## 📂 Estrutura do projeto

Solid-Pizza/
- ├── versao_inicial/ # Código propositalmente mal projetado
- └── versao_refatorada/ # Código refatorado com SOLID + IoC + Padrões

---

## ⚠️ Versão Inicial (versao_inicial/)

Características da má arquitetura:

- Classe `Caixa` atua como **God Object**, concentrando todas as responsabilidades.
- Classe `Pedido` com atributos públicos (violação de encapsulamento).
- Classe `CatalogoPizza` com métodos `static` e dados hardcoded (forte acoplamento).
- Regras de pagamento implementadas com `switch` (**violação do OCP**).
- Código rígido, de difícil manutenção.

---

## ✅ Versão Refatorada (versao_refatorada/)

Principais melhorias:

- Aplicação dos princípios **SOLID**:
  - **SRP** → cada classe tem apenas uma responsabilidade.
  - **OCP** → novos métodos de pagamento podem ser adicionados sem modificar o `Caixa` (Strategy).
  - **LSP/ISP** → interfaces bem definidas (`RepositorioPizza`, `PagamentoStrategy`).
  - **DIP** → o `Caixa` depende de abstrações, não de implementações concretas.
- Uso de **Repository Pattern** para acesso ao catálogo de pizzas.
- Implementação do **Strategy Pattern** para diferentes formas de pagamento.
- Injeção de dependências (IoC) aplicada manualmente no `Main`.
- Organização em pacotes:
  - `model/` → entidades (`Pedido`, `Pizza`).
  - `repository/` → repositórios de dados (`RepositorioPizza`, `CatalogoPizzaRepositorio`).
  - `pagamento/` → estratégias de pagamento.
  - `service/` → regras de negócio (`Caixa`, `ReciboService`).

---

## ▶️ Como executar

O projeto pode ser executado diretamente via linha de comando em um ambiente com o JDK configurado.

#### Para executar a **versão inicial**:

1.  Compile os arquivos:
    ```bash
    javac src/versao_inicial/*.java
    ```
2.  Execute a classe principal:
    ```bash
    java -cp src versao_inicial.Main
    ```

#### Para executar a **versão refatorada**:

1.  Compile os arquivos:
    ```bash
    javac src/versao_refatorada/**/*.java
    ```
2.  Execute a classe principal:
    ```bash
    java -cp src versao_refatorada.App
    ```

## 👨‍💻 Autor

* **Erick Borges**
