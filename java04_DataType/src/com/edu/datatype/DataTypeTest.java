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
	// 필드는 기본값을 가진다...
	// 로컬 변수는 기본값이 없다. 그래서 사용하기전 반드시 초기화해야한다...!!
	public String madeCompany;
	public String color;
	public float price;
	public boolean scratch;
	public String material;
	public MyDate buyDate;
	public void setWhiteBoardInfo(String madeCompany, String color, float price, boolean scratch, String material, MyDate buyDate) {		
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

class MyDate{
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
		MyDate bd = new MyDate();
		bd.setBuyDate(2022, 7, 19);
		wb.setWhiteBoardInfo("동신사", "W", 34.25f, false, "합판과 알루미늄", bd);
		System.out.println(wb.getWhiteBoardInfo());
	}
}
