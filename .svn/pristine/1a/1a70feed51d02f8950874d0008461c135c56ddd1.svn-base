package com.ljs.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.ljs.model.Emp;
import com.ljs.model.User;

public class UserJdbcTest {
	
	private JdbcTemplate jt ;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int updateUser(User u)
	{
		//准备sql脚本
		String sql = "update user t set t.uname = ? , t.upass=? where t.id = ?";
		//执行sql语句
		return jt.update(sql,new Object[]{u.getUname(),u.getUpass(),u.getId()},new int[]{java.sql.Types.VARCHAR,java.sql.Types.VARCHAR,java.sql.Types.INTEGER});
	}
	
	
	
//
//	public int deleteUser(User u)
//	{
//		String sql = "delete from user  where id = ?";
//		return jdbcTemplate.update(sql,new Object[]{u.getId()},new Object[]{java.sql.Types.INTEGER});
//	}
//	
//	public int insertUser(User u)
//	{
//		String sql = "insert into user values(?,?,?,?,?)";
//		return jdbcTemplate.update(sql,new Object[]{u.getId(),u.getUname(),u.getUpass(),null,null});
//	}
//	
//
	public List<User> getUsersByRowCallbackHandler()
	{
		List<User> ls = new ArrayList<User>();
		jt.query("select * from user where uname=?",new Object[]{"史玉然"},new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				User u  = new User();
				u.setId(rs.getInt("id"));
				u.setUname(rs.getString("uname"));
				u.setUpass(rs.getString("upass"));
				ls.add(u);
			}
		});
		return ls;
	}

	
	public List<User> getUsersByRowMapper()
	{
		List<User> ls = new ArrayList<User>();
		ls = jt.query("select * from user",new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
//				System.out.println("当前行索引"+arg1);
				User u = new User();
				u.setUname(rs.getString("uname"));
				u.setUpass(rs.getString("upass"));
				return u;
			}
			
		});
		return ls;
	}
	
//	 public int queryUserCount(User user) {  
//	        return jdbcTemplate.queryForObject("select count(1) from user where id = ?",new Object[]{user.getId()},Integer.class);
//     }  
//		
//		
//	public List<Emp> getEmpsByRowCallbackHandler()
//	{
//		List<Emp> ls = new ArrayList<Emp>();
//		jdbcTemplate.query("select t.name,t.sex,d.deptname from emp t,dept d where t.dept= d.deptno",new RowCallbackHandler() {
//			@Override
//			public void processRow(ResultSet rs) throws SQLException {
//				Emp u = new Emp();
//				u.setName(rs.getString("name"));
//				u.setSex(rs.getString("sex"));
//				u.setDeptName(rs.getString("deptname"));
//				ls.add(u);
//			}
//		},null);
//		return ls;
//	}	
}
