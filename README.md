📚 Módulo 03 — Classes e Encapsulamento
Exercícios desenvolvidos durante o Bootcamp NTT Data, aplicando conceitos de classes, encapsulamento e estruturas de controle em Java.

📁 Estrutura
src/
└── exercicios03_classes_encapsulamento/
    ├── Exercicio01.java  → Conta Bancária
    ├── Exercicio02.java  → Controle do Carro
    └── Exercicio03.java  → Máquina de Banho Petshop

🏦 Exercício 01 — Conta Bancária
Simulação das operações básicas de uma conta bancária com sistema de cheque especial.
Funcionalidades

Consultar saldo
Consultar limite do cheque especial
Depositar dinheiro
Sacar dinheiro
Pagar boleto
Verificar se está usando o cheque especial

Regras de Negócio
Depósito InicialLimite do Cheque EspecialAté R$ 500,00R$ 50,00Acima de R$ 500,0050% do valor depositado

O limite disponível é: saldo + cheque especial
Se o cheque especial for usado, uma taxa de 20% sobre o valor usado será cobrada no próximo depósito

Exemplo de Execução
Digite o valor do depósito inicial: R$ 1000
Conta criada! Cheque especial: R$ 500.00

===== MENU =====
Escolha: 4
Valor do saque: R$ 1200.00
Saque realizado! Usando R$ 200.00 do cheque especial.

Escolha: 3
Valor do depósito: R$ 500.00
Taxa de 20% sobre cheque especial usado (R$ 200.00): R$ 40.00
Depósito realizado! Saldo: R$ 260.00
Conceitos Praticados

Estruturas condicionais if / else
Estrutura switch para menu interativo
Loop while
Métodos estáticos
Formatação de saída com printf


🚗 Exercício 02 — Controle do Carro
Simulação do controle de funções de um carro com sistema de marchas e velocidade.
Funcionalidades

Ligar e desligar o carro
Acelerar e diminuir velocidade
Virar para esquerda ou direita
Verificar velocidade atual
Trocar a marcha

Regras de Negócio
MarchaVelocidade MínimaVelocidade Máxima0 — Ponto Morto—não pode acelerar1ª0 km20 km2ª20 km40 km3ª40 km60 km4ª60 km80 km5ª80 km100 km6ª100 km120 km

Carro começa desligado, em ponto morto e com velocidade 0km
Carro desligado não realiza nenhuma função
Não é permitido pular marchas
Para desligar: deve estar em ponto morto e velocidade 0
Para virar: velocidade entre 1km e 40km

Exemplo de Execução
Escolha: 1
Carro ligado!

Escolha: 8
Digite a marcha desejada (0 a 6): 1
Marcha trocada para: 1

Escolha: 3
Velocidade: 1km — Marcha: 1

Escolha: 5
Virando para esquerda!
Conceitos Praticados

Variáveis de estado com boolean e int
Estrutura switch para menu interativo
Loop while
Métodos estáticos para lógica de limites de marcha
Validações encadeadas com if / else if


🐾 Exercício 03 — Máquina de Banho Petshop
Simulação do controle de uma máquina de banho para pets em um petshop.
Funcionalidades

Dar banho no pet
Abastecer água e shampoo
Verificar níveis de água e shampoo
Colocar e retirar pet da máquina
Limpar a máquina

Regras de Negócio
RecursoCapacidade MáximaÁgua30 litrosShampoo10 litrosPets simultâneos1 pet por vez
OperaçãoÁguaShampooBanho10L2LLimpeza3L1LAbastecimento+2L por vez+2L por vez

Se o pet for retirado sem banho, a máquina ficará suja e precisará ser limpa antes de receber outro pet

Exemplo de Execução
Escolha: 7
Digite o nome do pet: Rex
Rex colocado na máquina!

Escolha: 1
Rex tomou banho! Água: 0.0L | Shampoo: 0.0L

Escolha: 8
Rex retirado limpo e cheiroso!
Conceitos Praticados

Variáveis de estado com double, boolean e String
Estrutura switch para menu interativo
Loop while
Validações de estado encadeadas com if / else


🛠️ Tecnologias

Java
IntelliJ IDEA


▶️ Como Executar

Abra o projeto no IntelliJ IDEA
Navegue até src/exercicios03_classes_encapsulamento
Abra o exercício desejado
Clique no botão ▶ ao lado do método main
Siga as instruções no terminal
