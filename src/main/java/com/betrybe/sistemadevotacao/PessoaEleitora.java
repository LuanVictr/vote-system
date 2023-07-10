package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    setNome(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String novoCpf) {
    this.cpf = novoCpf;
  }

  @Override
  public String getNome() {
    return super.getNome();
  }

  @Override
  public void setNome(String novoNome) {
    super.setNome(novoNome);
  }
}
