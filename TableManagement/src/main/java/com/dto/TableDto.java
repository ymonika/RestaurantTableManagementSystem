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

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getIsCornerTable() {
        return isCornerTable;
    }

    public void setCornerTable(boolean cornerTable) {
        isCornerTable = cornerTable;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
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
