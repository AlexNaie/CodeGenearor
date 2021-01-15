package com.tropical.codegeneratorapp.controller;

import com.tropical.codegeneratorapp.model.Code;
import com.tropical.codegeneratorapp.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/codes")
public class CodeController {

    @Autowired
    private CodeRepository codeRepository;

    public CodeController(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
    }

    @GetMapping("/all")
    List<Code> all() {
        return codeRepository.findAll();
    }

    @GetMapping("/get/{code}")
    Code codeByCode(@PathVariable String code) {
        return codeRepository.findByCode(code);
    }

    @GetMapping("/{id}")
    Code codeById(@PathVariable Integer id) throws Exception {
        return codeRepository.findById(id).orElseThrow(() -> new Exception(String.valueOf(id)));
    }

    @GetMapping("/used")
    List<Code> findUsedCodes() {
        return codeRepository.findAllByUsedTrue();
    }

    // Posts not winning code
    @RequestMapping(path = "/add/{codeLength}", method = RequestMethod.POST)
    Code addCode(@PathVariable int codeLength) {
        return codeRepository.save(Code.generateOneCode(codeLength, false));
    }

    //Posts winning code
    @RequestMapping(path = "/addwinner/{codeLength}", method = RequestMethod.POST)
    Code addWinningCode(@PathVariable int codeLength) {
        return codeRepository.save(Code.generateOneCode(codeLength, true));
    }

    @PutMapping(path = "/redeem/{code}/{winning}")
    Code updateUsed(@PathVariable String code) throws Exception {
        Code myCode = codeRepository.findByCode(code);
        if(myCode.isUsed()) {
            throw new Exception("Code already entered!"); //Make an exception to print "Code already entered!"
        }
        System.out.println(myCode.isWinning() ? "You won!" : "You loose..");
        myCode.setUsed(true);
        return codeRepository.save(myCode);
    }
}
