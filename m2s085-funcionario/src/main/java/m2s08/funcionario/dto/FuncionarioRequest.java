package m2s08.funcionario.dto;

import jakarta.validation.constraints.NotNull;
import m2s08.funcionario.models.Funcionario;

public class FuncionarioRequest {
    @NotNull(message = "O campo 'nome' é obrigatório.")
    private String nome;
    @NotNull(message = "O campo 'cargo' é obrigatório.")
    private String cargo;
    @NotNull(message = "O campo 'salario' é obrigatório.")
    private Float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public FuncionarioRequest(){};

    public FuncionarioRequest(String nome, String cargo, Float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public FuncionarioRequest(Funcionario funcionario){
        this.nome = funcionario.getNome();
        this.cargo = funcionario.getCargo();
        this.salario = funcionario.getSalario();
    }
}
