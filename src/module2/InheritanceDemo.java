package module2;

public class InheritanceDemo {
	public static void main(String[] args) {
		Environment env = new Environment();

		System.out.println(env.shark.kind + " is an " + env.shark.family + " which lives in " + env.shark.habitat
				+ ", hence it is " + env.shark.type+".");

	}
}

class Animal {
	String family = "Animal";
}

class Fish extends Animal {
	String habitat = "Water";
	String type = "Aquatic";
}

class Shark extends Fish {
	String kind = "Shark";
}

class Environment {
	Shark shark = new Shark();

}
