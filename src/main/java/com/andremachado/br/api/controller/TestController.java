package com.andremachado.br.api.controller;

import com.andremachado.br.dto.TestDTO;
import com.andremachado.br.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @GetMapping("/getDataOfTwoDataBases")
    public ResponseEntity<List<TestDTO>>find(){
        return ResponseEntity.ok(testService.testQueryInTwoDataBases());
    }
}
