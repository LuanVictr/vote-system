package com.betrybe.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String novoNome) {
    this.nome = novoNome;
  }
}
