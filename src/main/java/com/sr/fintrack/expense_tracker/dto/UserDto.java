package com.sr.fintrack.expense_tracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserDto {

  private Long userId;

  private String userName;

  private String email;

  private String mobileNumber;

  private String password;

  private LocalDateTime createdDate;
}
