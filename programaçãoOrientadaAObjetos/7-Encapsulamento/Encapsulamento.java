class Cliente {
  private String nome;
  private String endereco;
  private String cpf;
  private int idade;

  public void mudaCPF(String cpf) {
    validaCPF(cpf);
    this.cpf = cpf;
  }

  private void validaCPF(String cpf) {
    // série de regras aqui, falha caso não seja válido
    /*
      Se alguém tentar criar um Cliente e não usar o mudaCPF para alterar
      um cpf diretamente, vai receber um erro de compilação, já que o
      atributo CPF é privado.
    
      O controle sobre o CPF está centralizado: ninguém consegue
      acessá-lo sem passar por aí, a classe Cliente é a única
      responsável pelos seus próprios atributos!
    */
  }
}
