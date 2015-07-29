import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		
		String Dog=JOptionPane.showInputDialog("Do You Know How To Write Code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (Dog.equals("yes")){
		JOptionPane.showMessageDialog(null, ("Then You Will Rule The Unicorn World!"));	
		}
		else {
		JOptionPane.showMessageDialog(null, ("Then Good Luck Licking Plates"));	
		}
		

	}
}