package co.gc.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDetailsDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addPerson(String firstName, String lastName, String email, String phoneNumber, String address) {
		String addPersonQuery = "insert into users (firstName, lastName, email, phoneNumber, address) value(?,?,?,?,?)";
		return jdbcTemplate.update(addPersonQuery, firstName, lastName, email, phoneNumber, address);
		
	}

}
