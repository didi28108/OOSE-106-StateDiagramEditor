package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;

public class Transition extends DiagramElement {
	//endPoint for the transition
	private DoubleProperty destinationX = new SimpleDoubleProperty();
	private DoubleProperty destinationY = new SimpleDoubleProperty();
	
	public Transition() {
		setPositionX(150);
		setPositionY(150);
		setDestinationX(150);
		setDestinationY(150);
		setName("TRANSITION");
	}

	public Double getDestinationX() {
		return destinationX.get();
	}

	public void setDestinationX(double x) {
		destinationX.set(x);
	}

	public Double getDestinationY() {
		return destinationY.get();
	}

	public void setDestinationY(double y) {
		destinationY.set(y);
	}
	
	@Override
	public Transition clone() {
        Transition transition = new Transition();
        transition.setPositionX(getPositionX());
        transition.setPositionY(getPositionY());
        transition.setDestinationX(getDestinationX());
        transition.setDestinationY(getDestinationY());
        transition.setName(new String(getName()));
        return transition;
    }
	
}
