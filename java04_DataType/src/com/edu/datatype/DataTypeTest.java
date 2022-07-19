package com.edu.datatype;
/*
 * madeCompany --- "동신사"
 * color --- W
 * price --- 300.23
 * scratch --- 있다. / 없다.
 * material --- 합판과 알루미늄
 * buyDate --- 2022-07-19 (class MyDate)
 * 
 * set() / get()
 */
class WhiteBoard{
	public String madeCompany;
	public String color;
	public double price;
	public boolean scratch;
	public String material;
	public BuyDate buyDate;
	public void setWhiteBoardInfo(String madeCompany, String color, double price, boolean scratch, String material, BuyDate buyDate) {		
		this.madeCompany = madeCompany;
		this.color = color;
		this.price = price;
		this.scratch = scratch;
		this.material = material;
		this.buyDate = buyDate;
	}
	public String getWhiteBoardInfo() {
		return madeCompany + ", " + color + ", " + price + ", " + scratch + ", " + material + ", " + buyDate.getBuyDate();
	}
}

class BuyDate{
	public int year;
	public int month;
	public int day;
	public void setBuyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getBuyDate() {
		return year + "-" + month + "-" + day;
	}
}

public class DataTypeTest {
	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 2. 함수 호출
		 */
		WhiteBoard wb = new WhiteBoard();
		BuyDate bd = new BuyDate();
		bd.setBuyDate(2022, 7, 19);
		wb.setWhiteBoardInfo("동신사", "W", 300.23, false, "합판과 알루미늄", bd);
		System.out.println(wb.getWhiteBoardInfo());
	}
}
