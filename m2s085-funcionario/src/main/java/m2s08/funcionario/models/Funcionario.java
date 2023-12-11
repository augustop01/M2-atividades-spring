package m2s08.funcionario.models;

import jakarta.persistence.*;
import m2s08.funcionario.dto.FuncionarioRequest;

import java.util.List;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cargo;
    private Float salario;
    @OneToMany(mappedBy = "funcionario", orphanRemoval = true, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Registro> registros;

    public Funcionario(){}

    public Funcionario(String nome, String cargo, Float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.nome = funcionarioRequest.getNome();
        this.cargo = funcionarioRequest.getCargo();
        this.salario = funcionarioRequest.getSalario();
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id + '\''+
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", registros=" + registros +
                '}';
    }
}
