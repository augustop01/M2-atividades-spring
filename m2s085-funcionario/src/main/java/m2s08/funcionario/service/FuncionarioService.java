package m2s08.funcionario.service;

import jakarta.transaction.Transactional;
import m2s08.funcionario.dto.FuncionarioRequest;
import m2s08.funcionario.dto.FuncionarioResponse;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Transactional
    public FuncionarioRequest cadastrar(FuncionarioRequest funcionarioRequest){
        Funcionario funcionario = funcionarioRepository.save(new Funcionario(funcionarioRequest));
        return new FuncionarioRequest(funcionario);
    }

    public Page<FuncionarioResponse> listarTodos(Pageable pageable){
        return this.funcionarioRepository.findAll(pageable).map(FuncionarioResponse::new);
    }

    public FuncionarioResponse listarFuncionario(Integer id){
        return this.funcionarioRepository.findById(id).map(FuncionarioResponse::new).orElseThrow(() -> new IllegalArgumentException("Nenhum funcionário com o id '" + id + "' foi encontrado."));
    }
}
