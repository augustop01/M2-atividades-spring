package m2s08.funcionario.models;

import jakarta.persistence.*;
import m2s08.funcionario.models.enums.TipoRegistro;
import java.time.LocalDateTime;

@Entity
@Table(name = "REGISTROS")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idFuncionario;

    private LocalDateTime horaDoRegistro;

    @Enumerated(EnumType.STRING)
    private TipoRegistro tipoDeRegistro;

    @ManyToOne
    @JoinColumn(name = "registros", nullable = false, referencedColumnName = "id")
    private Funcionario funcionario;


    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
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

    public LocalDateTime getHoraDoRegistro() {
        return horaDoRegistro;
    }

    public void setHoraDoRegistro(LocalDateTime horaDoRegistro) {
        this.horaDoRegistro = horaDoRegistro;
    }

    public TipoRegistro getTipoDeRegistro() {
        return tipoDeRegistro;
    }

    public void setTipoDeRegistro(TipoRegistro tipoRegistro) {
        this.tipoDeRegistro = tipoRegistro;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id +
                ", idFuncionario=" + idFuncionario +
                ", horaDoRegistro=" + horaDoRegistro +
                ", tipoDeRegistro=" + tipoDeRegistro +
                ", funcionario=" + funcionario +
                '}';
    }
    public Registro(){}

    public Registro(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
