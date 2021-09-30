package br.com.kadubomfim.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false, length = 255)
    private String nome;


}
