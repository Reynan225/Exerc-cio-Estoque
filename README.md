# 🧱 Exercício/Demonstração: Instanciação, Construtor, Sobrecarga e Encapsulamento (Java)

Este repositório contém 4 versões progressivas de um mesmo exercício, focado nos pilares básicos da Programação Orientada a Objetos em Java:

1. **Versão 1 - Instanciação Simples**
2. **Versão 2 - Uso de Construtor**
3. **Versão 3 - Sobrecarga de Construtores**
4. **Versão 4 - Encapsulamento com Getters e Setters**

---

## 📚 Conceitos Envolvidos

### ✅ Construtor
- Serve para **inicializar objetos** da classe.
- Usamos o `this` como **referência do próprio objeto**, para diferenciar os atributos dos parâmetros.
- Também é útil para **evitar ambiguidade** entre os nomes.

---

### 🔁 Sobrecarga de Construtores
- Permite criar **várias versões do construtor** dentro da mesma classe.
- Você pode instanciar objetos de **formas diferentes**, dependendo dos dados disponíveis no momento.
- **Resumindo:** é poder disponibilizar **mais de uma versão da mesma operação**, diferenciando pelos **parâmetros**.

---

### 🔒 Encapsulamento
- É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
- Serve para **proteger os atributos e métodos** de uma classe.
- Garante que eles sejam **acessados e modificados de forma controlada**.
- Um objeto **NÃO** deve expor nenhum atributo(modificador de acesso **private**) 

#### 🛠️ Getters
- Servem para **obter (pegar)** o valor de um atributo privado.  
- Usam `return`.

#### 🛠️ Setters
- Servem para **modificar (setar)** o valor de um atributo privado.  
- Usam `void` e o `this`.
