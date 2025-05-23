package java018_collection.part14;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}

//public class HomeAgency implements Rentable{
	
//	@Override
//	public Object rent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	//핵심포인트 : public class HomeAgency implements Rentable ()<-이거 안하면 오버라이딩 Object를 가져옴!
