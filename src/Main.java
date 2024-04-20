import javax.swing.*;

class MainWindow extends JFrame{
    MainWindow(){
        this.setTitle("Property Games");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new MainWindow();
    }
}