package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.ManuelSuarez;
import co.edu.eci.cvds.service.ManuelSuarezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/manuelsuarez")
public class ManuelSuarezController {

    private final ManuelSuarezService manuelSuarezService;

    @Autowired
    public ManuelSuarezController(ManuelSuarezService manuelSuarezService) {
        this.manuelSuarezService = manuelSuarezService;
    }

    @GetMapping("/preguntas")
    public String getPreguntas(Model model) {
        List<ManuelSuarez> preguntas = manuelSuarezService.getAllPreguntas();
        model.addAttribute("preguntas", preguntas);
        return "preguntas"; // Nombre de la vista para mostrar las preguntas
    }

    @PostMapping("/preguntas")
    public String addPregunta(@RequestParam int pregunta, @RequestParam String respuesta, @RequestParam String argumento) {
        ManuelSuarez nuevaPregunta = new ManuelSuarez(pregunta, respuesta, argumento);
        manuelSuarezService.addPregunta(nuevaPregunta);
        return "redirect:/manuelsuarez/preguntas"; // Redirecciona de nuevo a la página de preguntas
    }

    @GetMapping("/preguntas/{pregunta}")
    public String getPregunta(@PathVariable int pregunta, Model model) {
        ManuelSuarez preguntaObtenida = manuelSuarezService.getPregunta(pregunta);
        model.addAttribute("pregunta", preguntaObtenida);
        return "pregunta"; // Nombre de la vista para mostrar una pregunta específica
    }

    @PostMapping("/preguntas/{pregunta}")
    public String editarPregunta(@PathVariable int pregunta, @RequestParam String respuesta, @RequestParam String argumento) {
        ManuelSuarez preguntaEditada = new ManuelSuarez(pregunta, respuesta, argumento);
        manuelSuarezService.editPregunta(preguntaEditada);
        return "redirect:/manuelsuarez/preguntas"; // Redirecciona de nuevo a la página de preguntas
    }

    @PostMapping("/preguntas/{pregunta}/eliminar")
    public String eliminarPregunta(@PathVariable int pregunta) {
        manuelSuarezService.deletePregunta(pregunta);
        return "redirect:/manuelsuarez/preguntas"; // Redirecciona de nuevo a la página de preguntas
    }
}
