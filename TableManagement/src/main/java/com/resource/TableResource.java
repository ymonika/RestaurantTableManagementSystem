package com.resource;

import com.model.*;
import com.dto.*;
import com.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping(value = "/table")
@Api(value = "/table", description = "Perform add, search & getById operations for Table")
public class TableResource {

    @Autowired
    TableService tableService;

    @ApiOperation(value = "/")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "New table added")})
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Table addTable(@RequestBody TableDto tableDto) {
        return tableService.addTable(tableDto);
    }

    @ApiOperation(value = "/", response = Table.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }

    @ApiOperation(value = "/getavailabletables", response = Table.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    @RequestMapping(value = "/getavailabletables", method = RequestMethod.GET)
    public List<Table> getAllAvailableTables() {
        return tableService.getAllAvailableTables();
    }

    @ApiOperation(value = "/findbychoice", response = Table.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables by capacity"),
            @ApiResponse(code = 400, message = "tables not found")})
    @RequestMapping(value = "/findbychoice", method = RequestMethod.GET)
    public List<Table> findByChoice(@PathParam("capacity") Integer capacity) {
        return tableService.findByChoice(capacity);
    }
}
