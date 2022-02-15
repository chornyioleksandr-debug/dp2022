package mock;

import crud.Lab2CrudInterface;
import flower.Flowers;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Flowers readFlower() {
		return new Flowers("Flower1", "adgdag", "addfg");
	}

	@Override
	public void updateFlower(Flowers flower) {
		// TODO Auto-generated method stub

	}

}
