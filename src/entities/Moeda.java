package entities;

import java.util.Objects;

// classe abstrata Moeda
public abstract class Moeda {
    protected Double valor;

    public Moeda(Double valor) {
        this.valor = valor;
    }

    // método getValor para poder acessar o valor
    public Double getValor() {
        return valor;
    }

    // métodos abstratos info e converter
    public void info() {}

    public double converter() {
        return this.valor;
    }

    // métodos equals e hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Moeda moeda = (Moeda) object;
        return Objects.equals(valor, moeda.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
