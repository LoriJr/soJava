# Exercício - SISTEMA BANCÁRIO

Crie um sistema bancário que gerencia contas e transações. Cada conta tem um titular, um saldo e um tipo de conta (corrente, poupança investimento). Cada transação possui um tipo (depósito, saque transferência), um valor e uma data. O sistema deve permitir:
- Criar conta e associar um titular
- Realizar transações e atualizar o saldo
- Exibir o histórico de transações

## Classes:

Conta
###Atributos: id (int), titular (Titular), saldo (double), tipoConta (TipoConta)

###Métodos: depositar(double), sacar(double), transferir(Conta, double), getSaldo()

Titular
###Atributos: id (int), nome (String), cpf (String)

###Métodos: getId(), getNome(), getCpf()

Transacao
###Atributos: id (int), data (LocalDate), valor (double), tipoTransacao (TipoTransacao)

###Métodos: getTipoTransacao(), getValor()

TipoConta (Enum)
###Valores: CORRENTE, POUPANCA, INVESTIMENTO

TipoTransacao (Enum)
###Valores: DEPOSITO, SAQUE, TRANSFERENCIA

## Diagrama UML:

Titular 1..1 ---- 1..* Conta

Conta 1..* ---- 1..* Transacao

Transacao 1..1 ---- 1..1 TipoTransacao

Conta 1..1 ---- 1..1 TipoConta


