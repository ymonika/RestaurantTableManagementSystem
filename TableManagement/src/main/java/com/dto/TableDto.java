package com.dto;


public class TableDto {

    private String tableId;
    private int capacity;
    private boolean isCornerTable;
    private boolean isEmpty;

    public TableDto() {
        this.isEmpty = true;
    }

    public String getTableId() {
        return tableId;
    }

    public TableDto withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public TableDto withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public boolean isCornerTable() {
        return isCornerTable;
    }

    public TableDto withCornerTable(boolean cornerTable) {
        isCornerTable = cornerTable;
        return this;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public TableDto withEmpty(boolean empty) {
        isEmpty = empty;
        return this;
    }

    @Override
    public String toString() {
        return "TableDto{" +
                " tableId='" + tableId + '\'' +
                ", capacity=" + capacity +
                ", isCornerTable=" + isCornerTable +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
