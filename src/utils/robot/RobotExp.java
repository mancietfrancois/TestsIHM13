/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.robot;

import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 

public class RobotExp { 

public static void main(String[] args) { 

try { 

Robot robot = new Robot(); 
// Creates the delay of 5 sec so that you can open notepad before 
// Robot start writting 
robot.keyPress(KeyEvent.VK_F5);

} catch (AWTException e) { 
e.printStackTrace(); 
} 
} 
}
