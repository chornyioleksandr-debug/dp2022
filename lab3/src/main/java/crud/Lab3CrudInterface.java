package crud;

import java.util.List;

import Flowers.Flower;

public interface Lab3CrudInterface {
	public List<Flower> readFlower();
	public void updateFlower(List<Flower> flower);
}
