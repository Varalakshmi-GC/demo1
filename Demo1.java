package day4;

public class Demo1 {

	public static void main(String[] args) {
int[] numbers = {10,20,30,20,40};
HashSet<Integers>set=new HashSet<>();
for (int number : numbers){
	if (set.contains(number)) {
		System.out.println("Duplicate:"+ number);
	}else {
		set.add(number);
	}
}
	}

}
