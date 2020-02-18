import com.clientedaconta.ClienteDaConta;
import com.conta.Conta;
import com.dataconta.DataConta;
import com.funcionario.Funcionario;
import com.controlebonificacao.ControleDeBonificacoes;
import com.gerente.Gerente;

class App {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);

        System.out.println("\n========== Dados do funcionário ==========");
        funcionario.setNome("João da Silva");
        System.out.println("Bonificação Gerente: " + gerente.getBonificacao());
        System.out.println("Bonificação Funcionario: " + funcionario.getBonificacao());

        System.out.println("\n========== Dados do Gerente ==========");
        gerente.setSenha(4231);
        gerente.autentica(4231);
        System.out.println("Nome: " + gerente.getNome()); // herdei o nome do funcionário como gerente

        System.out.println("\n========== Bonificação do funcionário ==========");
        double getBonificação =  funcionario.getBonificacao(); // referência o gerente (polimorfismo)
        System.out.println("BONIFICAÇÃO FUNCIONÁRIO " + getBonificação); // R$ 1500

        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        System.out.println("\n========== Controle Bonificação Funcionário ==========");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);
        System.out.println("CONTROLE BONIFICAÇÃO R$: " + controle.getTotalDeBonificacoes());

        String idUser = "1";
        Conta minhaConta = new Conta(56853, idUser);

        System.out.println("\n========== Total de contas ==========");
        int total = Conta.getTotalContas();
        System.out.println("Total de contas criadas: " + total);

        ClienteDaConta clientConta = new ClienteDaConta();
        minhaConta.clientAccount = clientConta;

        DataConta data = new DataConta();
        minhaConta.dataAbertura = data;

        String titular = "Mauricio";
        String agencia = "45656-8";
        double deposito = 1300;
        double saque = 300;

        minhaConta.setTitular(titular);
        minhaConta.setAgencia(agencia);
        minhaConta.depositaValor(deposito);

        String nome = "Mauricio";
        String cpf = "047.736.637-80";
        String sobrenome = "Witter";
        clientConta.setNome(nome);
        clientConta.setSobrenome(sobrenome);
        clientConta.setCPF(cpf);

        int dia = 22;
        int mes = 11;
        int ano = 2020;
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);

        minhaConta.sacarValor(saque);

        System.out.println(minhaConta.getSaldo());

        boolean consegui = minhaConta.sacarValor(saque);
        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }

        double novoSaldo = -200;
        if (novoSaldo < 0) {
            System.out.println("Não é possível realizar essa operação");
        } else {
            minhaConta.depositaValor(novoSaldo);
        }
        System.out.println(minhaConta.systemOutPrint());
        System.out.println("Rendimento atual: R$ " + minhaConta.calculaRendimento());
    }
}
