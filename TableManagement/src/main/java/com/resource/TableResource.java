package com.resource;

import com.dto.TableDto;
import com.model.Table;
import com.service.TableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping(value = "tables")
@Api(value = "tables", description = "Perform add, search & getById operations for Table")
public class TableResource {

    @Autowired
    TableService tableService;

    @PostMapping
    @ApiResponses(value = {@ApiResponse(code = 200, message = "New table added")})
    public Table addTable(@RequestBody TableDto tableDto) {
        return tableService.addTable(tableDto);
    }

    @GetMapping
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }

    @GetMapping(value = "available")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> getAllAvailableTables() {
        return tableService.getAllAvailableTables();
    }

    @GetMapping(value = "{capacity}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables by capacity"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> findByChoice(@PathParam("capacity") Integer capacity) {
        return tableService.findByChoice(capacity);
    }
}
