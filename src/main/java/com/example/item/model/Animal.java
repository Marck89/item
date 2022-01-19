package com.example.item.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animal")
public class Animal {
  @Id
  private String id;
  private String nome;
  private String specie;
  private boolean estinto;

  public String getId() 
  {
      return id;
  }

  public void setId(String id) 
  {
      this.id = id;
  }

  public String getNome() 
  {
      return nome;
  }

  public void setNome(String nome) 
  {
      this.nome = nome;
  }

  public String getSpecie() 
  {
      return specie;
  }

  public void setSpecie(String specie) 
  {
      this.specie = specie;
  }

 
  public void setEstinto(boolean estinto) 
  {
      this.estinto = estinto;
  }

  public boolean getEstinto() 
  {
      return estinto;
  }
}