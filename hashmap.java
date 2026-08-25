package day5;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();
		        
		        HashMap<Character, Integer> map = new HashMap<>();
		        
		        // for loop to count
		        for(int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            
		            if(ch == ' ') continue; // skip spaces if you want
		            
		            if(map.containsKey(ch)) {
		                map.put(ch, map.get(ch) + 1);
		            } else {
		                map.put(ch, 1);
		            }
		        }
		        
		        // print only repeated chars
		        System.out.println("Repeated characters:");
		        for(char key : map.keySet()) {
		            if(map.get(key) > 1) {
		                System.out.println(key + " -> " + map.get(key) + " times");
		            }
		        }
		        
		        sc.close();
		    }
		}

