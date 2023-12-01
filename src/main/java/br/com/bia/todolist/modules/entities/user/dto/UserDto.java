package br.com.bia.todolist.modules.entities.user.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserDto {
  private UUID id;
  private String name;
  private String username;
//  TODO: pesquisar como faz para criar uma senha que tenha caracteres especiais
  private String password;
  private LocalDateTime createdAt;


}
