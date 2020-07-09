package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.DoanhNghiepInfo;

public class DoanhNghiepMapper implements RowMapper<DoanhNghiepInfo> {
	
	public static final String BASE_SQL//
	="Select ds.id, ds.Name, ds.Price, ds.Quantity, ds.Total, ds.Status From doanh_so ds";

	@Override
	public DoanhNghiepInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		String Name = rs.getString("Name");
		int Price = rs.getInt("Price");
		int Quantity = rs.getInt("Quantity");
		int Total = rs.getInt("Total");
		 
		
		return new DoanhNghiepInfo(id, Name, Price, Quantity, Total, false);
		
		
	}
	public static final String ADD_SQL//
	="Insert into id, Name, Price, Quantity, Total, Status values ";
	
	
	
}
 