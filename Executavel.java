public class Executavel {

    public static void main (String[] args) {

     //APLICAÇÃO 1

     Funcionario Func1 = new Funcionario();
     Funcionario Func2 = new Funcionario();

     Cargo Atendente = new Cargo();
     Cargo Gerente = new Cargo();

     Func1.addCargo(Atendente);
     Func2.addCargo(Gerente);

     Func1.setNome("Josue");
     Func1.setCpf("881.123.600-78");
     Func1.setSalario(10000.0);

     Func2.setNome("Marquezine");
     Func2.setCpf("555.048.021-82");
     Func2.setSalario(30000.0);
     

     Cliente Ca = new Cliente();
     Ca.setNome("Carlos");
     Ca.setCpf("555.365.222-09");
     Ca.setVip(true);

     Endereco Casa1 = new Endereco();
     Casa1.setLogradouro("BJ");
     Casa1.setComplemento("Rua C");
     Casa1.setNumero("32");
     Casa1.setCidade("Nova York");
     Casa1.setUf("RJ");
     Casa1.setCep("55240-580");
     Ca.addEndereco(Casa1);

     Endereco casa2 = new Endereco();
     casa2.setLogradouro("Rua Z");
     casa2.setComplemento("Lula");
     casa2.setNumero("3214");
     casa2.setCidade("Saquarema");
     casa2.setUf("SP");
     casa2.setCep("89640-800");
     Ca.addEndereco(casa2);

     Endereco casa3 = new Endereco();
     casa3.setLogradouro("avelan");
     casa3.setComplemento("caixa Eclesiastico");
     casa3.setNumero("692");
     casa3.setCidade("Carolina do Norte");
     casa3.setUf("SA");
     casa3.setCep("52760-047");
     Ca.addEndereco(casa3);

     System.out.println("Enderecos: ");
     System.out.println(Ca.imprimirEnderecos());


     Cliente ap3c1 = new Cliente();
     ap3c1.setNome("Camilo");
     ap3c1.setCpf("582.300.837-86");
     ap3c1.setVip(true);

     ContaCorrente ap3cc = new ContaCorrente();
     ap3cc.setNumero("400");
     ap3cc.setLimite(8000.0);
     ap3c1.addConta(ap3cc);

     ap3cc.depositar(100.0);
     ap3cc.depositar(100.0);
     ap3cc.depositar(100.0);
     ap3cc.sacar(50.0);
     ap3cc.calcularSaldo();


     Cliente ap4c1 = new Cliente();
     ap4c1.setNome("Renato Cariani ");
     ap4c1.setCpf("214.586.988-58");
     ap4c1.setVip(false);

     ContaCorrente ap4cc = new ContaCorrente();
     ap4cc.setNumero("650");
     ap4cc.setLimite(1000.0);
     ap4c1.addConta(ap4cc);

     ap4cc.depositar(1000.0);

     ContaPoupanca ap4cp = new ContaPoupanca();

     ap4cp.depositar(1000.0);

     ap4cc.transferir(ap4cp, 500.0);
     ap4cp.calcularSaldo();
     ap4cc.calcularSaldo();
    }
}
