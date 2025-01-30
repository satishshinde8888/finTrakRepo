package com.sr.fintrack.expense_tracker.service;

import com.sr.fintrack.expense_tracker.entity.Expense;

public interface ExpenseService {

  Expense createExpense (Expense expense);

  Expense getExpenseById (Long id);

  Expense updateExpenseById (Long id, Expense expense);

  void deleteExpenseById(Long id);

  void deleteAllExpense();
}
