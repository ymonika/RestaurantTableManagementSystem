package com.service;

import com.dto.*;
import com.mapper.TableMapper;
import com.model.Table;
import com.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    @Autowired
    TableRepository tableRepository;

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Table addTable(TableDto tableDto){
        Table table = new Table();
        table = TableMapper.map(tableDto, table);
        return tableRepository.save(table);
    }

    public List<Table> getAllAvailableTables() {
        boolean isEmpty = true;
        return tableRepository.findAllByIsEmpty( isEmpty);
    }

    public List<Table> findByChoice(int capacity) {
        return tableRepository.findByCapacityGreaterThanEqual(capacity);
    }
}
