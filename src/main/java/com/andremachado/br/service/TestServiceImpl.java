package com.andremachado.br.service;

import com.andremachado.br.dto.TestDTO;
import com.andremachado.br.repository.one.TestOneRepository;
import com.andremachado.br.repository.two.TestTwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestOneRepository oneRepository;

    @Autowired
    private TestTwoRepository twoRepository;

    @Override
    public List<TestDTO> testQueryInTwoDataBases() {
        var one = oneRepository.findAll();
        var two = twoRepository.findAll();
        List<TestDTO> response = new ArrayList<>();

        one.forEach(testOne -> {
            var testDTO = new TestDTO();
            testDTO.setId(testOne.getId());
            testDTO.setDescription(testOne.getDescription());
            response.add(testDTO);
        });

        two.forEach(tesTwo -> {
            var testDTO = new TestDTO();
            testDTO.setId(tesTwo.getId());
            testDTO.setDescription(tesTwo.getDescription());
            response.add(testDTO);
        });

        return response;
    }
}
