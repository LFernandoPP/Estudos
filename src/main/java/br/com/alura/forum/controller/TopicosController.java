package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos") //sem31
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
  //  @RequestMapping(value = "/topicos", method = RequestMethod.GET)//sem31
    public List<TopicoDTO> lista(String nomeCurso) {
        if (nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDTO.converter(topicos);
        } else {
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDTO.converter(topicos);
        }
    }

    @PostMapping
  //  @RequestMapping(value = "/topicos", method = RequestMethod.POST)//sem31
    public void cadastrar(TopicoForm topico) {

    }
}