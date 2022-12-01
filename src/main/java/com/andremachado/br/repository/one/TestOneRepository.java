package com.andremachado.br.repository.one;

import com.andremachado.br.model.one.TestOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestOneRepository extends JpaRepository<TestOne,Long> {
}
