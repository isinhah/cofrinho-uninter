package entities;

// subclasse herdando as caracteristicas da classe Moeda
public class Real extends Moeda {

    // construtor recebendo os atributos da classe Moeda
    public Real(Double valor) {
        super(valor);
    }

    //  sobrescrita do método info retornando o tipo de moeda e valor
    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

    // sobrescrita do método para retornar o próprio valor em real
    @Override
    public double converter() {
        return valor;
    }

//
//    @Override
//    public boolean equals(Object object) {
//        if (this.getClass() != object.getClass()) {
//            return false;
//        }
//
//        Real objetoDeReal = (Real) object;
//        if (this.valor != objetoDeReal.valor) {
//            return false;
//        }
//
//        return true;
//    }

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
