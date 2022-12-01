package com.andremachado.br.model.one;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_TEST_ONE")
public class TestOne {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ONE_ID")
    private Long id;

    @Column(name = "ONE_DESCRIPTION ")
    private String description;
}
