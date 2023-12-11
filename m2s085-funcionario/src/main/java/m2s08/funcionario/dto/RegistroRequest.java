package m2s08.funcionario.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.enums.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroRequest {
    @NotNull(message = "O campo 'tipoDeRegistro' é obrigatório.")
    private TipoRegistro tipoDeRegistro;

    public TipoRegistro getTipoDeRegistro() {
        return tipoDeRegistro;
    }

    public void setTipoDeRegistro(TipoRegistro tipoDeRegistro) {
        this.tipoDeRegistro = tipoDeRegistro;
    }

    public RegistroRequest(){}

    public RegistroRequest(TipoRegistro tipoDeRegistro) {
        this.tipoDeRegistro = tipoDeRegistro;
    }
}
