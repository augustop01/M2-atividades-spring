package m2s08.funcionario.dto;

import m2s08.funcionario.models.Registro;

import java.util.List;

public class FuncionarioResponse {
    private Integer id;
    private String nome;
    private String cargo;
    private Float salario;
    private List<Registro> registros;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public FuncionarioResponse(){}

    public FuncionarioResponse(Integer id, String nome, String cargo, Float salario, List<Registro> registros) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.registros = registros;
    }
    
}
