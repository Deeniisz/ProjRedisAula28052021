
package br.com.ProjRedisAula.controller;

import br.com.ProjRedisAula.model.Avaliacao;
import br.com.ProjRedisAula.service.AvaliacaoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.x509.AVA;

@RestController
public class AvaliacaoController {
    @Autowired
    private AvaliacaoService avaliacaoService;

    public AvaliacaoController() {
    }

    @GetMapping({"/api/avaliacao"})
    public List<Avaliacao> findAll() {
        return this.avaliacaoService.findAll();
    }

    @PostMapping({"/api/avaliacao"})
    public void save(Avaliacao avaliacao) {
        this.avaliacaoService.save(avaliacao);
    }

    @GetMapping({"/api/avaliacao/{id}"})
    @Cacheable({"avaliacao"})
    public Avaliacao findById(@PathVariable("id") String id) {
        System.out.println("Find Information.. " + id);
        return this.avaliacaoService.findById(id);
    }
}
