package m2s08.funcionario.controller;

import m2s08.funcionario.dto.RegistroRequest;
import m2s08.funcionario.dto.RegistroResponse;
import m2s08.funcionario.models.Funcionario;
import m2s08.funcionario.models.Registro;
import m2s08.funcionario.repository.FuncionarioRepository;
import m2s08.funcionario.repository.RegistroRepository;
import m2s08.funcionario.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    RegistroRepository registroRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    RegistroService registroService;

    @PostMapping("/{id}")
    public ResponseEntity<RegistroResponse> criarRegistro(@PathVariable("id") Integer id, @RequestBody RegistroRequest registroRequest){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Não foi encontrando nenhum funcionário com o id " + id + "."));
        Registro registro = new Registro(id);
        registro.setHoraDoRegistro(LocalDateTime.now());
        registro.setTipoDeRegistro(registroRequest.getTipoDeRegistro());
        registro.setFuncionario(funcionario);
        registroService.salvarRegistro(registro);
        var result = new RegistroResponse(registro);
        return ResponseEntity.ok(result);
    }
}
