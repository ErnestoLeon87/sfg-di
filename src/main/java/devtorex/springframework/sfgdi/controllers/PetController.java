package devtorex.springframework.sfgdi.controllers;

import devtorex.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getBestPet(){
        return petService.getPetType();
    }
}
