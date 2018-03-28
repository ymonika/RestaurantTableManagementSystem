package com.mapper;

import com.dto.TableDto;
import com.model.Table;

public class TableMapper {

    public static Table map(TableDto tableDto, Table table) {
        table.setCapacity(tableDto.getCapacity());
        table.setCornerTable(tableDto.getIsCornerTable());
        table.setTableId(tableDto.getTableId());
        table.setEmpty(tableDto.getIsEmpty());
        return table;
    }
}
