package solid.di.before;

import lombok.Data;

@Data
public class User {
	
	
	
	//Violate DI principle 
	/*
	 *  we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
	 *  High-level modules should not depend on the low-level  module
	 *  both should depend on the abstraction
	 *
	 * Here: user is depends on SmartPhone: low level and a detail implementation
	 * => it should depend on high level and abstract Phone
	 */
	private SmartPhone smartPhone;
	
	public void call(String destNumber) {
		this.smartPhone.call(destNumber);
	}
}
