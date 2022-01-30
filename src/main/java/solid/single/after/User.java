package solid.single.after;

import java.util.UUID;

import lombok.Data;

@Data
public class User {
	
	private UUID uuid;
	
	private String name;
	
	private Role  role;
	
	private Address address;
	
}
