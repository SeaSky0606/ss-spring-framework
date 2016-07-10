package seasky.spring.framework.expression;

import java.util.Date;

public class Inventor {

	private String name;
	private Date data;
	private String intro;
	public Inventor(String name, Date data, String intro) {
		super();
		this.name = name;
		this.data = data;
		this.intro = intro;
	}
	PlaceOfBirth placeOfBirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getData() {
		return data;
	}
	public Inventor(String name, Date data, String intro,
			PlaceOfBirth placeOfBirth) {
		super();
		this.name = name;
		this.data = data;
		this.intro = intro;
		this.placeOfBirth = placeOfBirth;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public PlaceOfBirth getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	

}
