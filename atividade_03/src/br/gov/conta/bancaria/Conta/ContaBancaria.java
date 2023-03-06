package br.gov.conta.bancaria.Conta;

public class ContaBancaria {
    public String instituicaoFinanceira;
    public String titularDaConta;
    public int agencia;
    public int conta;
    public long cpf;
    public double valorEmConta = 1000;
    public ContaBancaria(String banco, String titularDaConta, int agencia, int conta, long cpf){
        this.instituicaoFinanceira = banco;
        this.titularDaConta = titularDaConta;
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
    }
    public void depositar(double valor) {this.valorEmConta += valor;}
    public void retirar(double valor) {this.valorEmConta -= valor;}
}
