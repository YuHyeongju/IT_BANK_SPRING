package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private JdbcTemplate jt;
	

	public List<BoardVO> selectAll(){
		String sql = "select * from board order by idx desc";
		
		RowMapper<BoardVO> rm = (ResultSet rs, int rowNum) ->{
			BoardVO row = new BoardVO();
			
			row.setIdx(rs.getInt("idx"));
			row.setTitle(rs.getString("title"));
			row.setContents(rs.getString("contents"));
			row.setWriter(rs.getString("writer"));
			row.setVcount(rs.getInt("vcount"));
			row.setWdate(rs.getDate("wdate"));
			return row;
			
		};
		return jt.query(sql,rm);
	}
}
