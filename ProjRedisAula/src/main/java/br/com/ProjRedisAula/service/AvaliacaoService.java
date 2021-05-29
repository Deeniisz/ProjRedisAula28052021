package br.com.ProjRedisAula.service;


import java.util.List;

import br.com.ProjRedisAula.model.Avaliacao;
import br.com.ProjRedisAula.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public AvaliacaoService() {
    }

    public List<Avaliacao> findAll() {
        return this.avaliacaoRepository.findAll();
    }

    public void save(Avaliacao avaliacao) {
        this.avaliacaoRepository.save(avaliacao);
    }

    public Avaliacao findById(String id) {
        return (Avaliacao)this.avaliacaoRepository.findById(id).get();
    }
}
