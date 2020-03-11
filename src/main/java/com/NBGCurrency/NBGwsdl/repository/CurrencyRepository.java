package com.NBGCurrency.NBGwsdl.repository;

import com.NBGCurrency.NBGwsdl.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
