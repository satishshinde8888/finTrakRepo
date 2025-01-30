package com.sr.fintrack.expense_tracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy  = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long userId;

  @Column(name = "user_name")
  private String userName;

  @Column (name = "email")
  private String email;

  @Column (name = "mobile_number")
  private String mobileNumber;

  @Column (name = "password")
  private String password;

  @Column(name = "created_date")
  private LocalDateTime createdDate;
}
