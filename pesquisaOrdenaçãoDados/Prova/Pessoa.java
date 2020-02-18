/*
 * Pesquisa e OrdenaÃ§Ã£o de Dados
 */
package ordenaObjeto;

/**
 *
 * @author joel
 * 
 */
public class Pessoa {
  private int id;
  private String sobrenome;
  private String nome;
  private int idade;

  /**
   * MÃ©todo Construtor
   * 
   * @param int    id identificador Ãºnico
   * @param String nome nome a pessoal
   * @param String sobrenome sobrenome da pessoa
   * @param int    idade idade da pessoa
   * 
   */
  public Pessoa(int id, String nome, String sobrenome, int idade) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
  }

  /**
   * Imprime
   */
  public void imprimePessoa() {
    System.out.print(id + " - ");
    System.out.print(sobrenome + ", ");
    System.out.print(nome + " - ");
    System.out.print(idade);
  }

  /**
   * Retorna o nome da pessoa
   */
  public int getId() {
    return this.id;
  }

  /**
   * Retorna o nome da pessoa
   */
  public String getNome() {
    return this.nome;
  }

  /**
   * Retorna o sobrenome da pessoa
   */
  public String getSobrenome() {
    return this.sobrenome;
  }

  /**
   * Retorna a idade da pessoa
   */
  public int getIdade() {
    return this.idade;
  }

}
