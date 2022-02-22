package crud;

import java.util.List;

import Flowers.Flower;
import fileIO.FileIO;
import fileIO.FileIOInterface;

public class FileCrud implements Lab3CrudInterface {

	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public List<Flower> readFlower(){
		return (List<Flower>) fio.loadFromFile();
	}
	
	@Override
	public void updateFlower(List<Flower> flower) {
		fio.saveToFile(flower);
	}
}
