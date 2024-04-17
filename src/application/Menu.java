package application;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    // instanciação da classe scanner (ler entradas de dados do usuário) e cofrinho
    private Scanner sc;
    private Cofrinho cofrinho;

    // construtor instanciando as classes
    public Menu() {
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }

    // menu principal exibido para o usuário
    public void exibirMenuPrincipal() {

        // menu principal exibido para o usuário
        System.out.println("\nCOFRINHO:");
        System.out.println("1. Adicionar moeda" + "\n2. Remover moeda" + "\n3. Listar moedas" + "\n4. Calcular total convertido para Real" + "\n5. Encerrar");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        // estrutura de controle switch para executar as operações escolhidas pelo usuário
        switch (opcao) {
            case 1:
                exibirSubMenuAdicionarMoedas();
                exibirMenuPrincipal();
                break;
            case 2:
                exibirSubMenuRemoverMoedas();
                exibirMenuPrincipal();
                break;
            case 3:
                cofrinho.listagemMoedas();
                exibirMenuPrincipal();
                break;
            case 4:
                double valorTotalConvertido = cofrinho.totalConvertido();
                String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
                valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".", ",");
                System.out.println("Valor total convertido para real: " + valorTotalConvertidoTextual);
                break;
            case 5:
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente");
                exibirMenuPrincipal();
                break;
        }
    }

    // método para exibir o menu da operação de adicionar moedas
    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("1. Real" + "\n2. Dolar" + "\n3. Euro");
        int opcaoMoeda = sc.nextInt();
        System.out.print("Digite o valor: ");
        String valorTextualMoeda = sc.next();

        valorTextualMoeda = valorTextualMoeda.replace(",", ".");
        double valorMoeda = Double.parseDouble(valorTextualMoeda);

        Moeda moeda = null;

        switch (opcaoMoeda) {
            case 1:
                moeda  = new Real(valorMoeda);
                break;
            case 2:
                moeda = new Dolar(valorMoeda);
                break;
            case 3:
                moeda = new Euro(valorMoeda);
                break;
            default:
                System.out.println("Não existe essa moeda!");
                exibirMenuPrincipal();
        }

        cofrinho.adicionarMoeda(moeda);
        System.out.println("Moeda adicionada!");
    }

    // método para exibir o menu da operação de remover moedas
    private void exibirSubMenuRemoverMoedas() {
        System.out.println("1. Real" + "\n2. Dolar" + "\n3. Euro");
        int opcaoMoeda = sc.nextInt();
        System.out.print("Digite o valor: ");
        String valorTextualMoeda = sc.next();

        valorTextualMoeda = valorTextualMoeda.replace(",", ".");
        double valorMoeda = Double.parseDouble(valorTextualMoeda);

        Moeda moeda = null;

        switch (opcaoMoeda) {
            case 1:
                moeda  = new Real(valorMoeda);
                break;
            case 2:
                moeda = new Dolar(valorMoeda);
                break;
            case 3:
                moeda = new Euro(valorMoeda);
                break;
            default:
                System.out.println("Não existe essa moeda!");
                exibirMenuPrincipal();
        }

        boolean removeuMoeda = cofrinho.removerMoeda(moeda);
        if (removeuMoeda) {
            System.out.println("moeda removida com sucesso!");
        } else {
            System.out.println("não foi encontrada nenhuma moeda com esse valor!");
        }
    }
}
