package model;

import java.util.ArrayList;

public class StateDiagram extends DiagramElement{
	ArrayList<DiagramElement> diagramElements = new ArrayList<>();
	
	public void add(DiagramElement children){
		diagramElements.add(children);
	}
	public void remove(DiagramElement children) {
		diagramElements.remove(children);
	}
	public int indexOf(DiagramElement children) {
		return diagramElements.indexOf(children);
	}
	public DiagramElement get(int index) {
		return diagramElements.get(index);
	}
	public DiagramElement get(DiagramElement children) {
		int index = indexOf(children);
		if(index < 0) {
			return null;
		}else {
			return get(index);
		}
	}
	
	//missing memento part
}
