package Session;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CloneObject17 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Pulsar p = new Pulsar("Black", 117.0, 75.5, 100);
		Pulsar p1 = (Pulsar) p.clone();
		Pulsar p2 = (Pulsar) p.clone();
		Pulsar p3 = (Pulsar) p.clone();
		Pulsar p4 = (Pulsar) p.clone();
		Pulsar p5 = (Pulsar) p.clone();

		List<Pulsar> pul = new ArrayList<Pulsar>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String outputFile = "Resource/pulsar.txt";

		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			pul.add(p1);
			pul.add(p2);
			pul.add(p3);
			pul.add(p4);
			pul.add(p5);

			for (Pulsar pulsar : pul)
				oos.writeObject(pulsar);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ois = new ObjectInputStream(new FileInputStream(outputFile));
			for (Pulsar pulsar : pul)
				System.out.println("Color : " + pulsar.getColor() + "\tHeight : " + pulsar.getHeight() + "\tWidth : "
						+ pulsar.getWidth() + "\tSpeed : " + pulsar.getSpeed());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Pulsar implements Cloneable {
	String color;
	double height;
	double width;
	double speed;

	public Pulsar(String color, double height, double width, double speed) {
		super();
		this.color = color;
		this.height = height;
		this.width = width;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}