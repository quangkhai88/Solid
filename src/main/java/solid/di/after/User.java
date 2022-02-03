package solid.di.after;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private Phone phone;
	
	public void call(String destNumber) {
		this.phone.call(destNumber);
	}
}
