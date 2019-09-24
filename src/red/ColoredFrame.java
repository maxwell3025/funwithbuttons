package red;

import java.awt.Color;
import java.awt.Frame;

class ColoredFrame extends Frame{
ColoredFrame(String s, Color color, int x, int y){
	super(s+color.toString());
	setBackground(color);
	setSize(350,100);
	setLocation(x,y);
	setVisible(true);
}
}
