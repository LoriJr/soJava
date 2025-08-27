#Exercício 3 - Sistema de Reservas de Hotel

Enunciado:
Desenvolva um sistema para um hotel que gerencia reservas e quartos. Cada reserva possui um cliente, um quarto e um status (Reservada, Em andamento, Finalizada, Cancelada). Cada quarto tem um número, tipo (Simples, Duplo, Luxo) e preço por noite. O sistema deve:

Criar reservas e associá-las a clientes e quartos.

Atualizar o status da reserva usando um enum.

Calcular o valor total da reserva com base no preço por noite e duração.

Classes:

Cliente

Quarto

Reserva

StatusReserva (Enum)

TipoQuarto (Enum)

Diagrama UML:

Cliente 1..1 ---- 0..* Reserva

Reserva 1..1 ---- 1..1 Quarto

Reserva 1..1 ---- 1..1 StatusReserva

Quarto 1..1 ---- 1..1 TipoQuarto

##############################################

#1. Classe Cliente
###Atributos:

id (int)

nome (String)

cpf (String)

###Métodos:

getId()

getNome()

getCpf()

toString()

#2. Classe Quarto
###Atributos:

numero (int)

tipo (TipoQuarto) - Enum (SIMPLES, DUPLO, LUXO)

precoPorNoite (double)

###Métodos:

getNumero()

getTipo()

getPrecoPorNoite()

toString()

#3. Classe Reserva
###Atributos:

id (int)

cliente (Cliente)

quarto (Quarto)

dataCheckIn (LocalDate)

dataCheckOut (LocalDate)

status (StatusReserva) - Enum (RESERVADA, EM_ANDAMENTO, FINALIZADA, CANCELADA)

###Métodos:

getId()

getCliente()

getQuarto()

getDataCheckIn()

getDataCheckOut()

getStatus()

calcularValorTotal() - Calcula o valor total da reserva com base no preço por noite e na quantidade de dias.

atualizarStatus(StatusReserva status) - Atualiza o status da reserva.

toString()

#4. Enum StatusReserva
###Valores:

RESERVADA

EM_ANDAMENTO

FINALIZADA

CANCELADA

#5. Enum TipoQuarto
###Valores:

SIMPLES

DUPLO

LUXO

