package com.example.demo.dao;

import javax.sql.DataSource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.DoanhNghiepMapper;
import com.example.demo.model.DoanhNghiepInfo;
@Repository
@Transactional
public class DoanhNghiepDAO extends JdbcDaoSupport {
	
	 @Autowired
	 public DoanhNghiepDAO(DataSource dataSource) {
		 this.setDataSource( dataSource);
		 
	 }
	 Object[] params = new Object[] {};
		DoanhNghiepMapper mapper = new DoanhNghiepMapper();
	 
	 public List<DoanhNghiepInfo> getDoanhNghiep() {
	        // Select cac cot
	        try {
				String sql = DoanhNghiepMapper.BASE_SQL;
 
			
				List<DoanhNghiepInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
				return list;
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return null;
	    }
	 public DoanhNghiepInfo adDoanhNghiep(DoanhNghiepInfo dn) {
		 
		return dn;
		 
	 }

	 
	
}
