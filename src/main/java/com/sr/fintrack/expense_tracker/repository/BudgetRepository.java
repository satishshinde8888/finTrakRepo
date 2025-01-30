package com.sr.fintrack.expense_tracker.repository;

import com.sr.fintrack.expense_tracker.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
