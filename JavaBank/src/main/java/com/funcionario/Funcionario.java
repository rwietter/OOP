package com.funcionario;

import com.gerente.Gerente;

// superclasse do Gerente
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public boolean setNome(String nomeFuncionario) {
        this.nome = nomeFuncionario;
        return true;
    }

    public void setSalario(double salarioGerente) {
        this.salario = salarioGerente;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }
}

