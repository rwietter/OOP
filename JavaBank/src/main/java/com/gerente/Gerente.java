package com.gerente;

import com.funcionario.Funcionario;

// subclasse do Funcionario
// Gerente é um Funcionário
// Funcionario é classe mãe de Gerente e Gerente é classe filha de Funcionario	.
public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;

    Funcionario funcionario = new Funcionario();

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public boolean setSenha(int passwordGerente) {
        this.senha = passwordGerente;
        return true;
    }

    @Override // reescrita do método
    public double getBonificacao() {
        return this.salario * 0.15;
        // return super.getBonificacao() + 1000;
        // super: procura uma super classe de Gerente
    }

    public String getNome() {
        return this.nome;
    }
}
