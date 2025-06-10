package com.martimianoyasmin.rh_tech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martimianoyasmin.rh_tech.Model.FuncionarioModel;
import com.martimianoyasmin.rh_tech.Service.FuncionarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    /*
● GET → Listar todos e funcionários e cargos
● DELETE {id} → Remover funcionários e cargos
● PUT {id} → Atualizar funcionários e cargos
    */
    @PostMapping
    public FuncionarioModel salvar(@RequestBody FuncionarioModel funcionarioModel) {
        return service.salvar(funcionarioModel);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> buscarPorId(@RequestParam Long id) {
        return service.buscarPorId(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }
    
    
}
