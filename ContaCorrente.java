import java.util.ArrayList;
import java.util.Collection;

public class ContaCorrente extends Conta {

    private Double limite;

    private Collection<Integer> listDep = new ArrayList<>();


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor) {
        Debito transferenciaDebito = new Debito (this);
        transferenciaDebito.setValor(valor);
        this.addDebitos(transferenciaDebito);

        Credito CredTransf = new Credito (contaDestino);
        CredTransf.setValor(valor);
        contaDestino.addCreditos(CredTransf);
    }

    public void calcularSaldo() {
        Double saldo = 0.0, cDebito = 0.0, cCredito = 0.0;
        for (Debito debito: getListaDebito()) {
            cDebito +=debito.getValor();
        }
        for (Credito credito: getListaCredito()) {
            cCredito +=credito.getValor();
        }

        saldo = (cDebito - cCredito) + limite;
            System.out.println("Saldo atual =" +saldo);
    }
}
