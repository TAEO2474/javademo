package java012_api.part4;

public class Java118_object {
//	•	shallow: 표면만 복사. 깊은 건 공유.
//	•	deep: 뿌리까지 다 새로 복사. 완전 다른 애.
//	•	clone() 쓰려면 Cloneable 붙여야 함!

	public static void main(String[] args) {
		House house = new House("홍길동", 30, new Address("서울", "서초동"));// new Address("서울", "서초동") 힙영역에 생성.
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city,house.address.dong);

		//shallow copy (얕은 복사):house2주소= house주소
		House house2 = house; // shallow copy  house주소가 복사 -> house2로 주소 저장.
		System.out.println(house2);//java012_api.part4.House@6d311334
		System.out.println(house);//java012_api.part4.House@6d311334 (주소house2 =house 같음)
		
		house2.name ="TaeO";
		house2.address.city ="경기";
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city,house.address.dong);
		
		//House houseCopy = house.shallowCopy();(shallowCopy변경해서 사용해보기)
		House houseCopy = house.deepCopy();
		houseCopy.name="Steven";
		houseCopy.address.city ="제주";
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city,house.address.dong);
		System.out.printf("%s %d %s %s\n", houseCopy.name, houseCopy.age, houseCopy.address.city,houseCopy.address.dong);
		}
	
	

}
