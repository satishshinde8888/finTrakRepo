package com.sr.fintrack.expense_tracker.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table (name = "budget")
@Getter
@Setter
public class Budget {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "amount")
  private double amount;

  @Column(name = "month")
  private String month;

  @Column (name = "year")
  private int year;

}
