package com.andremachado.br.model.two;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_TEST_TWO")
public class TestTwo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TWO_ID")
    private Long id;

    @Column(name = "TWO_DESCRIPTION ")
    private String description;
}
