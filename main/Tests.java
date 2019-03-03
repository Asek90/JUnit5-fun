package main;


public class Tests {
	public int adding(int x , int y) {
		return x+y;
	}
public boolean checkRange(int RangeMin, int RangeMax, int number) {
	if(number>=RangeMin && number <=RangeMax) {
		return true;
	}else {
		return false;
	}
}
public double computeCircleArea(double radius) {
	return Math.PI * radius * radius;
}

}
