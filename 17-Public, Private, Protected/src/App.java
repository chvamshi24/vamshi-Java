import world.Plant;

/*
 *  private --- onl;y with in the same class
 *  public --- from anywhere
 *  protected --- same class, subclass, and same package
 *  no modifier --- same package only
 */


public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// won't work -- type is private
		// System.out.println(plant.type);
		
		// size is protected; App is not in the same package as plant
		// won't work
		//System.out.println(plant.size);
		
		// won't work; App and plant in different packages, height has package.level visibility.
		// System.out.println(plant.height);
		
	}
}
