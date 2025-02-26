package com.abhi.springjdbc.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.abhi.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.abhi.springjdbc.employee.entity.Employee;


@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());

		return result;
	}

	@Override
	public int update(Employee employee) {

		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		EmployeeRowMapper empRowMapper = new EmployeeRowMapper();
		String sql = "select * from employee where id=?";
		Employee emp = jdbcTemplate.queryForObject(sql, empRowMapper, id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		EmployeeRowMapper empRowMapper = new EmployeeRowMapper();
		String sql = "select * from employee";
		List<Employee> list = jdbcTemplate.query(sql, empRowMapper);
		return list;
	}

}
