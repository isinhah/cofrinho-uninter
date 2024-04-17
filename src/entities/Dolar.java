package entities;

// subclasse herdando as caracteristicas da classe Moeda
public class Dolar extends Moeda {

    // construtor recebendo os atributos da classe Moeda
    public Dolar(Double valor) {
        super(valor);
    }

    //  sobrescrita do método info retornando o tipo de moeda e valor
    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

    // sobrescrita do método convertendo a moeda dolar em real (cotação em 17/04/2024)
    @Override
    public double converter() {
        return valor * 5.25;
    }

    //  métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
