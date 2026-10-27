# 🧮 Calculadora de Console

Calculadora feita em Java que roda no terminal, com menu de operações e submenu para as operações mais avançadas.

## Funcionalidades

**Menu principal**
- Adição
- Subtração
- Divisão (mostra também o resto)
- Multiplicação e outras (submenu)
- Sair

**Submenu "Multiplicação e outras"**
- Multiplicação
- Raiz quadrada
- Raiz cúbica
- Potência (base e expoente)
- Voltar

## Tratamentos incluídos

- Divisão por zero exibe uma mensagem em vez de quebrar o programa.
- Raiz quadrada de número negativo é bloqueada com aviso.
- Opções inválidas nos menus são identificadas.
- Letras no lugar de números não derrubam o programa: ele pede o valor de novo.


## Exemplo de execução

```
Qual tipo de conta voce quer?
1 - Adição, 2 - Subtração, 3 - Divisão, 4 - Multiplicação e outras, 5 - Sair
3
Digite 2 numeros para a divisão
17 5
A divisão de 17 ÷ 5 é igual a 3
O resto da divisão é: 2
```

## Conceitos praticados

- Menus aninhados com `do/while` e `switch`
- Leitura de `int` e `double` com `Scanner`
- Classe `Math` (`sqrt`, `cbrt`, `pow`)
- Validação de entrada com `if/else` e `try/catch` (`InputMismatchException`)

## Possíveis melhorias

- Separar cada operação em um método
- Guardar um histórico das operações em um `ArrayList`
- Usar `double` também em soma, subtração e divisão
