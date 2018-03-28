package com.repository;

import com.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends MongoRepository<Table, String> {

    List<Table> findAllByIsEmpty(boolean isEmpty);
    List<Table> findByCapacityGreaterThanEqual(int capacity);

}
