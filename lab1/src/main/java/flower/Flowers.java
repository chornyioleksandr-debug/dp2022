package flower;

public class Flowers {
	String title;
	String img;
	String description;
	public Flowers(String title, String img, String descritpion) {
		super();
		this.title = title;
		this.img = img;
		this.description = descritpion;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescritpion() {
		return description;
	}
	public void setDescritpion(String descritpion) {
		this.description = descritpion;
	}
	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"img\": \""+img+"\", \"description\": \""+description+"\"}";
	}

}
