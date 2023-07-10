package com.betrybe.sistemadevotacao;

import java.awt.SystemTray;
import java.util.Scanner;

public class Principal {

  /**
   * Inicia o programa de votação.
   *
   * @param args Sinceramente eu nao sei o que é.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int resposta = Integer.parseInt(scanner.next());
      if (resposta == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());
        votacao.cadastrarPessoaCandidata(nome,numero);
        continue;
      } else {
        break;
      }
    }
    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int resposta = Integer.parseInt(scanner.next());
      if (resposta == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        votacao.cadastrarPessoaEleitora(nome,cpf);
        continue;
      } else {
        break;
      }
    }
    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      int resposta = Integer.parseInt(scanner.next());
      if (resposta == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());
        votacao.votar(cpf, numero);
        continue;
      } else if (resposta == 2) {
        votacao.mostrarResultado();
        continue;
      } else {
        votacao.mostrarResultado();
        break;
      }
    }
  }
}

// 08370647392
//088999384
// 5859382394
