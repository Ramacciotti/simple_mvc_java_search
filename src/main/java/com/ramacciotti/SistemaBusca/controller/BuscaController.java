package com.ramacciotti.SistemaBusca.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@Slf4j
public class BuscaController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView abrirIndex(){
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá, seja bem-vinda(o)!";
        mv.addObject("msg", mensagem);

        return mv;
    }


    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView buscarIndex(@RequestParam("buscar") String buscar) {
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Resultado da Busca !";
        mv.addObject("msg", mensagem);
        mv.addObject("buscar", buscar);

        return mv;
    }

}
