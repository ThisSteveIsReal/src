import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String Fun=JOptionPane.showInputDialog(" What Animals Do You LIke");
	String Fun2=JOptionPane.showInputDialog("How Old Are You");
	String Fun3=JOptionPane.showInputDialog("On A Scale of 1-10 How Awesome Are You");
	String Fun4=JOptionPane.showInputDialog("What Do you Like More Cats Or Dogs");
	String Fun5=JOptionPane.showInputDialog("Do You Like Trains");
	JOptionPane.showMessageDialog(null, "I Know You Like "+ Fun+" And I Know That You Are "+ Fun2+ "And I Know That You Rated Your Self "+ Fun3+ "And I know You like "+ Fun4+ "And I Know You Like "+ Fun5);
}
}
