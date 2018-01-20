package eecs2030.lab4;

import java.awt.Color;

public class SBlock extends Block {

	private int state;

	public SBlock(Point2 pos, Color col) {
		super(3, pos, col);
		this.position = new Point2(pos);
		this.color = col;
		this.setState1();
	}

	public void setState1() {
		this.state = 1;
		this.grid.clearAll();
		this.grid.set(0, 1);
		this.grid.set(0, 2);
		this.grid.set(1, 0);
		this.grid.set(1, 1);
	}

	public void setState2() {
		this.state = 2;
		this.grid.clearAll();
		this.grid.set(0, 1);
		this.grid.set(1, 1);
		this.grid.set(1, 2);
		this.grid.set(2, 2);
	}

	public void setState3() {
		this.state = 3;
		this.grid.clearAll();
		this.grid.set(1, 1);
		this.grid.set(1, 2);
		this.grid.set(2, 0);
		this.grid.set(2, 1);
	}

	public void setState4() {
		this.state = 4;
		this.grid.clearAll();
		this.grid.set(0, 0);
		this.grid.set(1, 0);
		this.grid.set(1, 1);
		this.grid.set(2, 1);
	}

	public void spinLeft() {
		switch (state) {
		case 1:
			this.setState4();
			break;
		case 2:
			this.setState1();
			break;
		case 3:
			this.setState2();
			break;
		default:
			this.setState3();
			break;
		}

	}

	public void spinRight() {
		switch (state) {
		case 1:
			this.setState2();
			break;
		case 2:
			this.setState3();
			break;
		case 3:
			this.setState4();
			break;
		default:
			this.setState1();
			break;
		}
	}
}
