package Servlets;

import java.io.IOException;
import java.util.List;

import java.util.Iterator;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import Flowers.Flower;
import jakarta.servlet.http.HttpServletRequest;

public class Helpers {
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Flower flowerParse(HttpServletRequest request) {
		Flower flower = new Flower();
		JsonElement jsonElement = bodyParse(request);
		flower.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		flower.setName(jsonElement.getAsJsonObject().get("name").getAsString());
		flower.setImg(jsonElement.getAsJsonObject().get("img").getAsString());
		flower.setDescription(jsonElement.getAsJsonObject().get("description").getAsString());
		return flower;
	}
	
	public static int getNextId(List<Flower> list) {
		int maxId = 0;
		if (list == null) return 0;
		Iterator<Flower> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByFlowerId(int id,List<Flower> list) {
		int listId = id;
		
		Iterator<Flower> iterator = list.iterator();
		while(iterator.hasNext()) {
			Flower temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
}
