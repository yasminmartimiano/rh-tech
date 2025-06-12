package com.martimianoyasmin.rh_tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martimianoyasmin.rh_tech.Model.FuncionarioModel;
import com.martimianoyasmin.rh_tech.Service.FuncionarioService;



@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    public List<FuncionarioModel> listarFuncionario(){
        return funcionarioService.listarFuncionario();
    }

    @PutMapping("/{id}")
    public FuncionarioModel atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioModel funcionarioModel) {
        return funcionarioService.atualizarFuncionario(id, funcionarioModel);
    }

    @PostMapping
    public FuncionarioModel salvarFuncionario(@RequestBody FuncionarioModel funcionarioModel) {
        return funcionarioService.salvarFuncionario(funcionarioModel);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> buscarPorId(@RequestParam Long id) {
        return funcionarioService.buscarPorId(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        funcionarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
