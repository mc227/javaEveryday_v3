package hfj3e;

import java.awt.*;
import java.awt.event.*;

public class Party {
    public void buildInvite() {
        // Create the frame
        Frame f = new Frame("Party at Tim's");

        // Create label and buttons
        Label l = new Label("Party at Tim's");
        Button b = new Button("Count me in");
        Button c = new Button("Shoot me");

        // Create panel and add components
        Panel p = new Panel();
        p.add(l);
        p.add(b);
        p.add(c);

        // Set layout and add panel to frame
        f.setLayout(new FlowLayout());
        f.add(p);

        // Add action listeners
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Count me in button clicked");
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Shoot me button clicked");
            }
        });

        // Set frame properties
        f.setSize(300, 150);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.buildInvite();
    }
}
