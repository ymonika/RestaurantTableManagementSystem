package com.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@ApiModel
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Table {

    @Id
    private String tableId;
    private int capacity;
    private boolean isCornerTable;
    private Order order;
    private boolean isEmpty;

    public Table() {
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCornerTable() {
        return isCornerTable;
    }

    public void setCornerTable(boolean cornerTable) {
        isCornerTable = cornerTable;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Table{" +
                " tableId='" + tableId + '\'' +
                ", capacity=" + capacity +
                ", getIsCornerTable=" + isCornerTable +
                ", order=" + order +
                ", getIsEmpty=" + isEmpty +
                '}';
    }
}
