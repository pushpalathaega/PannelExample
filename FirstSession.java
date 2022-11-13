import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class FirstSession implements ActionListener {
    JFrame frame;
    FirstSession(){
        frame = new JFrame("frame");
        pannel pannel = new pannel(600,600);
        //pannel.setBounds(0,0,200,200);
        pannel.setBackground(Color.black);
        Container c = frame.getContentPane();
        c.setBackground(Color.blue);
        c.add(pannel);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);


    }
    public static void main(String arg[]){
        FirstSession firstSession = new FirstSession();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
