package com.AppRH.AppRH.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.AppRH.AppRH.models.Candidato;
import com.AppRH.AppRH.models.Vaga;
import com.AppRH.repository.CandidatoRepository;
import com.AppRH.repository.VagaRepository;


@Controller
public class VagaController {
    
    private VagaRepository vr;
    private CandidatoRepository cr;


    //CADASTRAR VAGA
    @RequestMapping(value = "/cadastrarVaga", method = RequestMethod.GET)
    public String form(){
        return "vaga/formVaga";
    }



    


}
