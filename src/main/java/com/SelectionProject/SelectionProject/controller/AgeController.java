package com.SelectionProject.SelectionProject.controller;

        import com.SelectionProject.SelectionProject.model.Age;
        import com.SelectionProject.SelectionProject.repository.AgeRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import javax.validation.Valid;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(value = "/age")
public class AgeController {

    @Autowired
    AgeRepository ageRepository;

    @GetMapping("/age/{id}")
    public Age getAge(@PathVariable(value = "id") long id){
        return ageRepository.findById(id);
    }

    @PostMapping("/age")
    public Age saveAge(@RequestBody @Valid Age age) {
        return ageRepository.save(age);
    }


}
