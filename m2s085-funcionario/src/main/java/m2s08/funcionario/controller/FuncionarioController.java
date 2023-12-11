package m2s08.funcionario.controller;

import m2s08.funcionario.dto.FuncionarioRequest;
import m2s08.funcionario.repository.FuncionarioRepository;
import m2s08.funcionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping()
    public ResponseEntity<FuncionarioRequest> cadastrarFuncionario(@RequestBody FuncionarioRequest funcionarioRequest){
        var result = funcionarioService.cadastrar(funcionarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
