package com.itbank.model;


import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository   //DB 접근과 관련된 Spring Bean 등록
public class PersonDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	public String test() {
		String sql  = "select banner from v$version";
		
		
		return jt.queryForObject(sql, String.class);
	}

	public List<PersonVO> selectAll() {
		String sql = "select * from person";
		
		RowMapper<PersonVO> rm = (ResultSet rs, int rowNum) -> { //행을 매핑
			PersonVO row = new PersonVO();
			
			row.setName(rs.getString("name"));
			row.setHeight(rs.getDouble("height"));  
			row.setBirth(rs.getDate("birth"));
			
			return row;
		};
		
		return  jt.query(sql, rm); //여러 행을 받아서 리스트타입으로 반환 (PersonVO타입으로 반환)
	}//selectAll -> dao.selectAll()로가서 getList()로 리턴
}
//mapping 데이터 베이스와 자바 사이에 데이터를 주고받는 과정