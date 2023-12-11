package m2s08.funcionario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.Registro;
import m2s08.funcionario.models.enums.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroResponse {
    private Integer id;
    private Integer idFuncionario;

    private TipoRegistro tipoRegistro;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime horaDeRegistro;
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public LocalDateTime getHoraDeRegistro() {
        return horaDeRegistro;
    }

    public void setHoraDeRegistro(LocalDateTime horaDeRegistro) {
        this.horaDeRegistro = horaDeRegistro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public RegistroResponse(Registro registro){
        this.id = registro.getId();
        this.idFuncionario = registro.getIdFuncionario();
        this.horaDeRegistro = LocalDateTime.now();
    }
}
