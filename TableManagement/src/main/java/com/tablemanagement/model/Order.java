package com.tablemanagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;
import java.util.List;

@Document
@ApiModel
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Order {

    @Id
    private final String id;
    private final List<Item> items;

    public Order(String id) {
        this.id = id;
        items = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalCost() {
        return items.stream().mapToDouble(item -> item.getPrice()).sum();
    }

    @Override
    public String
    toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + items +
                '}';
    }
}
