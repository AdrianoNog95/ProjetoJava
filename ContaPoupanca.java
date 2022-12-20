public class ContaPoupanca extends Conta {


    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
     }

    public void calcularSaldo() {
        Double saldo = 0.0, cDebito = 0.0, cCredito = 0.0;
        for (Debito debito: getListaDebito()) {
            cDebito+=debito.getValor();
        }
        for (Credito credito: getListaCredito()) {
            cCredito+=credito.getValor();
        }

        saldo = (cDebito - cCredito);
        System.out.println("Saldo Poupança =" + saldo);
    }
}
