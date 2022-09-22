package com.bankapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.bankapp.entity.Logger;

public interface LoggerRepository extends JpaRepository<Logger, Integer> {

}
