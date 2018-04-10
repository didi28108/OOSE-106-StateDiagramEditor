package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class DiagramElement {
	//Location of the element
	private DoubleProperty positionX = new SimpleDoubleProperty();
	private DoubleProperty positionY = new SimpleDoubleProperty();
	//String name of the element
	private StringProperty name = new SimpleStringProperty("");
	//getter & setter generated by IDE
	public Double getPositionX() {
		return positionX.get();
	}
	public void setPositionX(double x) {
		positionX.set(x);;
	}
	public Double getPositionY() {
		return positionY.get();
	}
	public void setPositionY(double y) {
		positionY.set(y);
	}
	public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }
	
	// copy this object
	public DiagramElement clone() {
		return this.clone();
	}
	 
	
}