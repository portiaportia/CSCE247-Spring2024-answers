package decorator;

public class Warrior extends Player {

	public Warrior(String name) {
		super(FileReader.getLines("decorator/txt/warrior.txt"), name);
	}
}
