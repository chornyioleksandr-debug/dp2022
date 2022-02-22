package Flowers;

import java.io.Serializable;

public class Flower implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String img;
	String description;
	
	public Flower() {
		
	}
	
	public Flower(int id, String name, String img, String description) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"img\":\""+ img +"\", \"description\":\""+ description +"\"}";
	}
	
	
}
