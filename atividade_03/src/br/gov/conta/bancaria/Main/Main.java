package br.gov.conta.bancaria.Main;

import br.gov.conta.bancaria.Conta.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("BNDS", "Jose Duarte", 1203, 123435, 24546363476L);

        ContaBancaria conta02 = new ContaBancaria("BB", "Maria Pereira", 3424, 765389, 39439439454L);

        ContaBancaria[] listaDeContas = new ContaBancaria[2];
        listaDeContas[0] = conta01;
        listaDeContas[1] = conta02;

        int agencia;
        int conta;
        long cpf;
        int metodo;
        double trans;

        Scanner buscar = new Scanner(System.in);

        System.out.println("Qual o numero de sua agencia: ");
        agencia = buscar.nextInt();

        System.out.println("Qual o numero de sua conta: ");
        conta = buscar.nextInt();

        System.out.println("Qual o seu cpf: ");
        cpf = buscar.nextLong();

        if (listaDeContas[0].agencia == agencia){
            if(listaDeContas[0].conta == conta){
                if(listaDeContas[0].cpf == cpf){
                    System.out.println("Deseja transferir(1) ou depositar(2)?");
                    metodo = buscar.nextInt();
                    if(metodo == 1){
                        System.out.println("Qual o valor?");
                        trans = buscar.nextDouble();
                        conta01.depositar(trans);
                        conta02.retirar(trans);
                        System.out.printf("Seu valor em conta é %.2f\n", conta01.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", conta02.valorEmConta);
                    }
                    else if (metodo == 2){
                        System.out.println("Qual o valor?");
                        trans = buscar.nextDouble();
                        conta01.retirar(trans);
                        conta02.depositar(trans);
                        System.out.printf("Seu valor em conta é %.2f\n", conta01.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", conta02.valorEmConta);
                    }
                }
            }
        }
        else if(listaDeContas[1].agencia == agencia){
            if(listaDeContas[1].conta == conta){
                if(listaDeContas[1].cpf == cpf){
                    System.out.println("Deseja transferir(1) ou depositar(2)?");
                    metodo = buscar.nextInt();
                    if(metodo == 1){
                        System.out.println("Qual o valor?");
                        trans = buscar.nextDouble();
                        conta02.depositar(trans);
                        conta01.retirar(trans);
                        System.out.printf("Seu valor em conta é %.2f\n", conta02.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", conta01.valorEmConta);
                    }
                    else if (metodo == 2){
                        System.out.println("Qual o valor?");
                        trans = buscar.nextDouble();
                        conta02.retirar(trans);
                        conta01.depositar(trans);
                        System.out.printf("Seu valor em conta é %.2f\n", conta02.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", conta01.valorEmConta);
                    }
                }
            }
        }
        }
    }

