package com.andremachado.br.service;
import com.andremachado.br.dto.TestDTO;
import java.util.List;

public interface TestService {
    List<TestDTO> testQueryInTwoDataBases();
}
