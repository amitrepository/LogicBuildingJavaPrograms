import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;



public class convertToJson {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		optimiDto user = new optimiDto();
		user.setCountry("India");
		user.setOpt(Optimize.FAIL);
		user.setId(3);

		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(user);
			System.out.println(jsonInString);
		} catch (IOException e) {
	
			System.out.println(e);
		}

	}

}

class optimiDto {
	Integer id;
	Optimize jon;
	String country;

	
	public Optimize getOpt() {
		return getOpt();
	}
	public void setOpt(Optimize opt) {
		this.jon = opt;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}

enum Optimize {
	SUBMIT, FAIL, NO_DATA;
}
