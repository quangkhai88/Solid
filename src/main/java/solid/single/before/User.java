package solid.single.before;

import java.util.UUID;

import lombok.Data;

@Data
public class User {
	
	private UUID uuid;
	
	private String name;
	
	private String roleName;
	
	private String roleId;
	
	private String adressNumber;
	
	private String addressCity;
	
}
