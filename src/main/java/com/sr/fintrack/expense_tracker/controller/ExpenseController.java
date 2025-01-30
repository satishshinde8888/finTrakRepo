package com.sr.fintrack.expense_tracker.controller;

import com.sr.fintrack.expense_tracker.entity.Expense;
import com.sr.fintrack.expense_tracker.service.ExpenseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

  private final ExpenseService expenseService;

  public ExpenseController(ExpenseService expenseService) {
    this.expenseService = expenseService;
  }

  @PostMapping
  public ResponseEntity<Expense> CreateExpense(@RequestBody Expense expense) {
    Expense savedExpense = expenseService.createExpense(expense);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
    Expense expense = expenseService.getExpenseById(id);
    if (expense == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(expense, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Expense> updateExpense(@PathVariable Long id, @RequestBody Expense expense) {
    Expense updateExpense = expenseService.updateExpenseById(id, expense);
    if (updateExpense == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(updateExpense, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteExpenseById(@PathVariable Long id) {
    try {
      expenseService.deleteExpenseById(id);

      return ResponseEntity.ok("Expense deleted successfully");
    } catch (EntityNotFoundException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }

  @DeleteMapping
  public ResponseEntity<String> deleteAllExpense(){
    expenseService.deleteAllExpense();
    return ResponseEntity.ok("deleted All expenses successfully");
  }
}