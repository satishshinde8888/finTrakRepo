package com.sr.fintrack.expense_tracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "expense")
@Getter
@Setter

public class Expense {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "amount")
  private double amount;

  @Column(name = "category")
  private String category;

  @Column (name = "description")
  private String description;

  @Column (name = "expense_date")
  private LocalDateTime date;

  @Column (name ="payment_method")
  private String paymentMethod;

}