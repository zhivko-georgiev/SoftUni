package org.softuni.main;

import org.softuni.data.Student;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.dialog.MessageBox;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Svetlin Nakov");
		student.setEmail("info@softuni.bg");
		
		GUIScreen gui = TerminalFacade.createGUIScreen();
		gui.getScreen().startScreen();
		MessageBox.showMessageBox(gui, "Student", 
			"Name: " + student.getName() + "\n" +
			"Email: " + student.getEmail());
		gui.getScreen().stopScreen();
	}
}
