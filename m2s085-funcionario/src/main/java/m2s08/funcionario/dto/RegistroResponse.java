package m2s08.funcionario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.Registro;

import java.time.LocalDateTime;

public class RegistroResponse {
    private Integer id;
    private String idFuncionario;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime horaDeRegistro;

    private Funcionario funcionario;

    public RegistroResponse(Registro registro){
        this.id = registro.getId();
        this.idFuncionario = registro.getIdFuncionario();
    }
}
