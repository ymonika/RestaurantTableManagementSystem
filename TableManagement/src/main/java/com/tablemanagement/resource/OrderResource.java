package com.tablemanagement.resource;


import com.tablemanagement.model.Item;
import com.tablemanagement.model.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.UUID;

@Controller
@Path(value = "{tableId}/orders")
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
