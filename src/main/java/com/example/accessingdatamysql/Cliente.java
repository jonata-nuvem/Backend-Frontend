package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="clientes")
public class Cliente {
  @Id
  //postegreS
  //@GeneratedValue(strategy=GenerationType.IDENTITY)

  //MYSQL
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String nome;
  private String email;
  private String cpf;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getCpf() {
	    return cpf;
	  }

	  public void setCpf(String cpf) {
	    this.cpf = cpf;
	  }
}