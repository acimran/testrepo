import javax.swing.plaf.synth.SynthOptionPaneUI;

public interface demoInterface{
	void eat();
	
	
}


public class ImplInterface implements demoInterface {
	
	public void eat()
	{
      System.out.println("Hello eat is here ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
