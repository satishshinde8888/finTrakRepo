package com.sr.fintrack.expense_tracker.repository;

import com.sr.fintrack.expense_tracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
