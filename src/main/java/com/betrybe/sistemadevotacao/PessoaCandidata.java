package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Constroi a classe Pessoa candidata com o método de incrementacao
   * de voto.
   * @param nome recebe o nome do candidato
   * @param numero recebe o numero do candidato
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return this.numero;
  }

  public int getVotos() {
    return this.votos;
  }

  public void setNumero(int novoNumero) {
    this.numero = novoNumero;
  }

  public void setVotos(int novosVotos) {
    this.votos = novosVotos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
