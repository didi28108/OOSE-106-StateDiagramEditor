package model;

public class State extends DiagramElement {
		
	public State(){
		// initialize the location of State
		setPositionX(150);
		setPositionY(150);
		setName("STATE");
	}
	
	@Override
	public State clone() {
        State state = new State();
        state.setPositionX(getPositionX());
        state.setPositionY(getPositionY());
        state.setName(new String(getName()));
        return state;
    }
	
}
