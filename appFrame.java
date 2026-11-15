
import javax.swing.JFrame;


public class appFrame extends JFrame{
    
    appFrame(){
        this.setTitle("Password Manager");
        this.add(new appPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();
    }


}
