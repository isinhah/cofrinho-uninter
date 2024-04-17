package entities;

// subclasse herdando as caracteristicas da classe Moeda
public class Euro extends Moeda {

    // construtor recebendo os atributos da classe Moeda
    public Euro(Double valor) {
        super(valor);
    }

    //  sobrescrita do método info retornando o tipo de moeda e valor
    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

    // sobrescrita do método convertendo a moeda euro em real (cotação em 17/04/2024)
    @Override
    public double converter() {
        return valor * 5.59;
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