package m2s08.funcionario.service;

import m2s08.funcionario.dto.RegistroRequest;
import m2s08.funcionario.dto.RegistroResponse;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.Registro;
import m2s08.funcionario.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    @Autowired
    RegistroRepository registroRepository;

    public Registro salvarRegistro(Registro registro){
        return registroRepository.save(registro);
    }

}
