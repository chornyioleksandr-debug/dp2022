package crud;

import fileIO.FileIO;
import fileIO.FileIOInterface;
import flower.Flowers;

public class FileCrud implements Lab2CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Flowers readFlower() {
		return (Flowers) fio.loadFromFile();
	}

	@Override
	public void updateFlower(Flowers flower) {
		fio.saveToFile(flower);
	}

}
