package input;
import java.awt.Button;
import java.awt.Frame;

public class Input {

	Frame frame = new Frame("ggg");
	Button button = new Button("zzz");
	
	public void createFrame(){
		frame.add(button);
		
		frame.setSize(300,600);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Input input = new Input();
		input.createFrame();

	}

}
