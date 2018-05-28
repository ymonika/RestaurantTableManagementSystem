package com.tablemanagement.dto;


public class TableDto {

    private String tableId;
    private int capacity;
    private boolean cornerTable;
    private boolean empty;

    public TableDto() {
        this.empty = true;
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
        return cornerTable;
    }

    public void setCornerTable(boolean cornerTable) {
        this.cornerTable = cornerTable;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "TableDto{" +
                " tableId='" + tableId + '\'' +
                ", capacity=" + capacity +
                ", isCornerTable=" + cornerTable +
                ", isEmpty=" + empty +
                '}';
    }
}
