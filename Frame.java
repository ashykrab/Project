import javax.swing.*;
public class Frame extends JFrame {
    Frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);//play area size will be fixed,same for all& can't be changed
        this.pack();//gives authority to windows/linux manager
    }
}
