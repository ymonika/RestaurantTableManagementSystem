package com.resource;


import com.model.Item;
import com.model.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.UUID;

@RestController
@RequestMapping(value = "{tableId}/orders")
@Api(value = "orders", description = "A resource endpoint for managing the orders related to a table")
public class OrderResource {

    @GetMapping
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Order currently available on the given table", response = Order.class)})
    public Order getOrderBy(@PathParam("tableId") String tableId) {
        final Order order = new Order(UUID.randomUUID().toString());
        order.getItems().add(new Item("100", "Apple", 54.25));
        order.getItems().add(new Item("200", "Orange", 65.23));
        return order;
    }

}
