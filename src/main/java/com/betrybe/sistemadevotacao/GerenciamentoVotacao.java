package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * Instancia a classe de Gerenciamento de votacao, Iniciando as listas de
   * pessoas candidatas pessoas eleitoras e cpfs computados.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.cpfsComputados = new ArrayList<String>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }
    PessoaCandidata pessoaCadastrada = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(pessoaCadastrada);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < this.pessoasEleitoras.size(); i += 1) {
      if (cpf == this.pessoasEleitoras.get(i).getCpf()) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
    PessoaEleitora pessoaEleitoraCadastrada = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(pessoaEleitoraCadastrada);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (int i = 0; i < this.cpfsComputados.size(); i += 1) {
      if (cpfPessoaEleitora == this.cpfsComputados.get(i)) {
        System.out.println("Pessoa eleitora já votou!");
      }
    }
    for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
      if (numeroPessoaCandidata == this.pessoasCandidatas.get(i).getNumero()) {
        this.pessoasCandidatas.get(i).receberVoto();
      }
    }
    this.cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    if (this.cpfsComputados.size() == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
        float porcentagem = ((float) this.pessoasCandidatas.get(i).getVotos()
            / this.cpfsComputados.size()) * 100;
        String porcentagemMostrada = Math.round(porcentagem) + "%";
        System.out.println(String.format("Nome: %s - %d votos ( %s )",
            this.pessoasCandidatas.get(i).getNome(),
            this.pessoasCandidatas.get(i).getVotos(),
            porcentagemMostrada));
      }
      System.out.println(String.format("Total de votos: %d", this.cpfsComputados.size()));
    }
  }
}
