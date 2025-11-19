import java.util.*;
class solstring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] nums = s.split(" ");
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			list.add(Integer.parseInt(nums[i]));
		}
		for(int i =0; i< list.size(); i++){
			
			System.out.println(list.get(i));
		}
	}
}