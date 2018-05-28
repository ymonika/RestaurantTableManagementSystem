package com.tablemanagement.resource;

import com.tablemanagement.dto.TableDto;
import com.tablemanagement.model.Table;
import com.tablemanagement.service.TableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;


@Component
@Path("tables")
@Api(value = "tables", description = "Perform add, search & getById operations for Table")
public class TableResource {

    @Autowired
    TableService tableService;

    @POST
    @ApiResponses(value = {@ApiResponse(code = 200, message = "New table added")})
    public Table addTable(@RequestBody TableDto tableDto) {
        return tableService.addTable(tableDto);
    }

    @GET
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }

    @GET
    @Path("available")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> getAllAvailableTables() {
        return tableService.getAllAvailableTables();
    }

    @GET
    @Path("{capacity}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "returns all all available tables by capacity"),
            @ApiResponse(code = 400, message = "tables not found")})
    public List<Table> findByChoice(@PathParam("capacity") Integer capacity) {
        return tableService.findByChoice(capacity);
    }
}
