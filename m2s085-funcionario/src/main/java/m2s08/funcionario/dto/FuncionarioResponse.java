package m2s08.funcionario.dto;

import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.Registro;
import m2s08.funcionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FuncionarioResponse {
    private Integer id;
    private String nome;
    private String cargo;
    private Float salario;
    private List<RegistroResponse> registros;


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

    public FuncionarioResponse(){}

    public FuncionarioResponse(String nome, String cargo, Float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public FuncionarioResponse(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.cargo = funcionario.getCargo();
        this.salario = funcionario.getSalario();
        this.registros = funcionario.getRegistrosDTO();
    }
}
