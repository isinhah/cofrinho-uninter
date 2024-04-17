package entities;

import java.util.ArrayList;

// classe Cofrinho
public class Cofrinho {

    // instanciação da lista de moedas
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    // método que adiciona moeda na lista
    public ArrayList<Moeda> adicionarMoeda(Moeda moeda) {
        listaMoedas.add(moeda);
        return listaMoedas;
    }

    // método que remove moeda da lista
    public boolean removerMoeda(Moeda moeda) {
        return listaMoedas.remove(moeda);
    }

    // método que lista todas as moedas
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Não existe moedas no cofrinho!");
            return;
        }

        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
    }

    public double totalConvertido() {
        if (listaMoedas.isEmpty()) {
            return 0;
        }

        double valorAcumulado = 0.0;
        for (Moeda m : listaMoedas) {
            valorAcumulado += m.converter();
        }

        return valorAcumulado;
    }
}
