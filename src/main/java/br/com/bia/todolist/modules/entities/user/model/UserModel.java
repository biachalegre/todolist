package br.com.bia.todolist.modules.entities.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
// TODO: descobrir como que faz para criar a tabela com as colunas na ordem de declaração e não em ordem alfabética
@Entity(name = "users")
public class UserModel {
  @Id
  @GeneratedValue(generator = "UUID")
  @Column(name = "id")
  private UUID id;

  @Column(name = "name")
  private String name;

  @Column(name = "username")
  private String username;

//  TODO: pesquisar como faz para criar uma senha que tenha caracteres especiais
  @Column(name = "password")
  private String password;

  @CreationTimestamp
  @Column(name = "createdAt")
  private LocalDateTime createdAt;
}
