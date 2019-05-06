package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes {

	public final static String ID = "SelectionAttributes";

	private boolean selected;
	
	public SelectionAttributes() {
		this.selected = false;
	}

	public boolean isSelected() {
		return this.selected;
	}

	public void select() {
		this.selected = true;
		this.notifyObserver();
	}

	public void unselect() {
		this.selected = false;
		this.notifyObserver();
	}

	public void toggleSelection() {
		this.selected = !this.selected;
		this.notifyObserver();
	}

	@Override
	public String getId() {
		return ID;
	}

}