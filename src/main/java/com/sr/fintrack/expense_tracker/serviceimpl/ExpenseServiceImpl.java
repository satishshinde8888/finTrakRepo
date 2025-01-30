package com.sr.fintrack.expense_tracker.serviceimpl;

import com.sr.fintrack.expense_tracker.entity.Expense;
import com.sr.fintrack.expense_tracker.repository.ExpenseRepository;
import com.sr.fintrack.expense_tracker.service.ExpenseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {
  @Autowired
  ExpenseRepository expenseRepository;
  @Override
  public Expense createExpense(Expense expense) {

    return expenseRepository.save(expense);
  }

  @Override
  public Expense getExpenseById(Long id) {

    return expenseRepository.findById(id).orElse(null);
  }

  @Override
  public Expense updateExpenseById(Long id, Expense expense){

    Expense existingExpense = expenseRepository.findById(id).orElse(null);
    if(existingExpense != null){
      existingExpense.setCategory(expense.getCategory());
      existingExpense.setDescription(expense.getDescription());
      existingExpense.setAmount(expense.getAmount());
      existingExpense.setDate(expense.getDate());
      existingExpense.setPaymentMethod(expense.getPaymentMethod());
      return expenseRepository.save(existingExpense);
    }
    else return null;
  }

  @Override
  public void deleteExpenseById(Long id){
    if(!expenseRepository.existsById(id)){
    throw new EntityNotFoundException("Expense not found with id :" + id);

  }
    expenseRepository.deleteById(id);
  }

  @Override
  public void deleteAllExpense() {
    expenseRepository.deleteAll();
  }
}
