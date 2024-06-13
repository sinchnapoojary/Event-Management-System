/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Sinchana Poojary
 */
public class Dashboard2 extends JFrame {
    Dashboard2(){
        setBounds(300,300,1366,768);
        
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\Sinchana Poojary\\Desktop\\emslogin12.jpeg");
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        JLabel AirlineManagementSystem = new JLabel("Origami Crane Event Planners Welcomes You");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(200, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
        JMenu jm1 = new JMenu("Reception");
        jm1.setForeground(Color.RED);
	menuBar.add(jm1);

        
        JMenuItem a1 = new JMenuItem("Add an event");
	jm1.add(a1);
        a1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                setVisible(false);
                    new addevent().setVisible(true);
                
                
                }catch(Exception e ){}
            }
        });
            
        /*JMenuItem a2 = new JMenuItem("Choose your menu");
	jm1.add(a2);
        JMenuItem a3 = new JMenuItem("Update Profile details");
	jm1.add(a3);
        JMenuItem a4 = new JMenuItem("Edit an event");
	jm1.add(a4);*/
                JMenuItem b2 = new JMenuItem("Back");
	b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new Event_Management_System().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
	
	jm1.add(b2);
        
        JMenu jm2 = new JMenu("Event MANAGEMENT");
        jm2.setForeground(Color.BLUE);
	menuBar.add(jm2);
		
        
		
	
        
        JMenuItem venue = new JMenuItem("Venue");
	jm2.add(venue);
        venue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("venue").setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem photographer = new JMenuItem("photographer");
	jm2.add(photographer);
        photographer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("photographer").setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem caterer = new JMenuItem("Caterer");
	jm2.add(caterer);
        caterer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("caterer").setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
   setLayout(null);
        
        
        setVisible(true);
        
        
}
    public static void main(String args[]){
        Dashboard2 d = new Dashboard2();
        
    }
}
