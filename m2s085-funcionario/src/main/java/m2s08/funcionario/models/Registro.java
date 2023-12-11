package m2s08.funcionario.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "REGISTROS")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String idFuncionario;

    @ManyToOne
    @JoinColumn(name = "registros", nullable = false, referencedColumnName = "id")
    private Funcionario funcionario;


    public Registro(){}

    public Registro(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id + '\''+
                "idFuncionario='" + idFuncionario + '\'' +
                ", funcionario=" + funcionario +
                '}';
    }
}
