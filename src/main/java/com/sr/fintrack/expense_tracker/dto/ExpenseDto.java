package com.sr.fintrack.expense_tracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExpenseDto {

  private Long id;

  private double amount;

  private String category;

  private String description;

  private LocalDateTime date;

  private String paymentMethod;

}
