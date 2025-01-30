package com.sr.fintrack.expense_tracker.dto;

import lombok.Setter;
import lombok.Getter;
@Setter
@Getter
public class BudgetDto {

  private Long id;

  private double amount;

  private String month;

  private int year;
}
