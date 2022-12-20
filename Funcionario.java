import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario {

    private Double salario;
    private Collection<Cargo> cargos = new ArrayList<>();

    public void addCargo(Cargo cargo) {
        boolean add = this.cargos.add(cargo);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Collection<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(Collection<Cargo> cargos) {
        this.cargos = cargos;
    }

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean autenticar(String nome, String senha) {
        if (this.getNome() == nome) {
            if (this.getSenha() == senha) {
                return true;
            } else {
                System.out.println("Senha Incorreta");
            }
            return false;
        }
        System.out.println("Nome incorreto");
        {
            return true;
        }
    }
}

