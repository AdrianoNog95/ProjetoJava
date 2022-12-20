import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {

    private String numero;
    private Double saldo;

    private Collection<Debito> listaDebito = new ArrayList<>();
    private Collection<Credito> listaCredito = new ArrayList<>();


    public Conta(String numero) {
        this.numero=numero;
    }

    protected Conta() {

    }

    public void addDebitos(Debito debito) {
        this.listaDebito.add(debito);
    }

    public void addCreditos(Credito credito) {
        this.listaCredito.add(credito);
    }

    public Collection<Debito> getListaDebito() {
        return listaDebito;
    }

    public void setListaDebito(Collection<Debito> listaDebito) {
        this.listaDebito = listaDebito;
    }

    public Collection<Credito> getListaCredito() {
        return listaCredito;
    }

    public void setListaCredito(Collection<Credito> listaCredito) {
        this.listaCredito = listaCredito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void depositar(Double valorDepots){
        Credito Cred = new Credito(this);
        Cred.setValor(valorDepots);
        this.addCreditos(Cred);
    }

    public void sacar(Double valorSaque){
         Debito Deb = new Debito(this);
         Deb.setValor(valorSaque);
         this.addDebitos(Deb);
    }
}
