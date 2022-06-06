package com.example.demo.flower;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "flowers")
public class Flower {
    @Id
    @GeneratedValue
    Long id;
    String name; 
    String description; 
    String img;

    public Flower() {

    }

    public Flower(String name, String description, String img) {
        super();
        this.name = name;
        this.description = description;
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    @Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"img\":"+img+"\", \"description\":"+description+"}";
	}
}
