# Calculadora em Java

Uma calculadora simples de console desenvolvida em Java que permite realizar operações matemáticas básicas.

## 📋 Funcionalidades

- ➕ Adição
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão (com verificação de divisão por zero)

## 🚀 Como Executar

### Pré-requisitos

- Java JDK instalado (versão 8 ou superior)
- Terminal/Prompt de Comando

### Compilação e Execução

1. Compile o arquivo Java:
```bash
javac calc.java
```

2. Execute o programa:
```bash
java Main
```

## 💻 Como Usar

1. Ao executar o programa, você verá um menu com 4 opções de operações
2. Digite o número correspondente à operação desejada (1-4)
3. Insira o primeiro número quando solicitado
4. Insira o segundo número quando solicitado
5. O resultado será exibido na tela

### Exemplo de Uso

```
Escolha o seu método de cálculo:
1 - Adicão
2 - Subtração
3 - Multiplicação
4 - Divisão
Digite qual você quer escolher: 1
Digite o primeiro número: 10
Digite o segundo número: 5
O resultado foi: 15
```

## 🛡️ Tratamento de Erros

- Divisão por zero é detectada e uma mensagem de erro é exibida
- Opções inválidas no menu são tratadas com uma mensagem apropriada

## 📝 Estrutura do Código

O programa utiliza:
- `Scanner` para entrada de dados do usuário
- `switch-case` para seleção de operações
- Validação para divisão por zero

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## 📄 Licença

Este projeto é de código aberto e está disponível para uso livre.