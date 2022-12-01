package com.andremachado.br.repository.two;

import com.andremachado.br.model.two.TestTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTwoRepository extends JpaRepository<TestTwo,Long> {
}
