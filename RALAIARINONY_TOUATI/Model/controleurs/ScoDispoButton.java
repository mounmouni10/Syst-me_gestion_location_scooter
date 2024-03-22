package controleurs;
import vue.*;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import java.time.*;
import java.util.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class ScoDispoButton implements ActionListener {
	Parc p;
	JDateChooser db ; 
	JDateChooser ddf;
	JTextField id;
	public ScoDispoButton(Parc p2,JDateChooser d ,JDateChooser f,JTextField idd)
	{
		p=p2;
		db=d;
		ddf=f;
		id=idd;
	}
	
	public ScoDispoButton() {}
public void actionPerformed(ActionEvent e) 
{
    String txt= id.getText();
      int idt=Integer.parseInt(txt);
      Date d= db.getDate();
      
       Date f =ddf.getDate();
       LocalDate dd;
       LocalDate df;
       if (d != null && f != null) {
        dd=d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       df=f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
       else {dd=LocalDate.now();df=LocalDate.now(); }
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	ListScoDispowin r= new ListScoDispowin(p,dd,df,idt);
	r.setVisible(true);
	r.setSize(1000,700);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
  }
}