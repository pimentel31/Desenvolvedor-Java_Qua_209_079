package com.crud.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    public String cadastrar(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/";
    }
    // lista todos os usuarios cadastrados
    @RequestMapping(value="/listarUsuario" , method=RequestMethod.GET)
    public ModelAndView listarUsuario() {
        ModelAndView mv = new ModelAndView("listarUsuario");
        Iterable<Pessoa> usuarios = csr.findAll();
        mv.addObject("usuarios", usuarios);
        return mv;
    }

@RequestMapping(value = "/alterarUsuario/{idPessoa}", method = RequestMethod.GET)
public ModelAndView alterarUsuario(@PathVariable("idPessoa")long idPessoa){
    Pessoa usuario = csr.findByIdPessoa(idPessoa);
    ModelAndView mv = new ModelAndView("alterarUsuario");
    mv.addObject("usuario",usuario);
    return mv;
}

@RequestMapping(value = "/alterarUsuario/{idPessoa}", method = RequestMethod.POST)
public String alterarUsuario(@Validated Pessoa usuario, BindingResult result, RedirectAttributes attributes){
    csr.save(usuario);
    return "redirect:/listarUsuario";
}

//excluir usuario
@RequestMapping("/confirmarExclusao/{idPessoa}")
public ModelAndView confirmarexclusao(@PathVariable("idPessoa") long idPessoa){
Pessoa usuario = csr.findByIdPessoa(idPessoa);
ModelAndView mv = new ModelAndView("excluirUsuario");
mv.addObject("usuario", usuario);
return mv;
}

@RequestMapping("/excluirUsuario")
public String excluirUsuario(long idPessoa){
    Pessoa usuario = csr.findByIdPessoa(idPessoa);
    csr.delete(usuario);
    return "redirect:/listarUsuario";
}

}
