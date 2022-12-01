package com.andremachado.br.model.two;

import lombok.Data;

import javax.persistence.*;

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
