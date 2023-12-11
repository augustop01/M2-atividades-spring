package m2s08.funcionario.service;

import jakarta.transaction.Transactional;
import m2s08.funcionario.dto.FuncionarioRequest;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Transactional
    public FuncionarioRequest cadastrar(FuncionarioRequest funcionarioRequest){
        Funcionario funcionario = funcionarioRepository.save(new Funcionario(funcionarioRequest));
        return new FuncionarioRequest(funcionario);
    }
}
