package com.empresa.exemplo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

  @Id
  private Long id;
  private String nome;
  private String email;
}
