package day12;

public class RabinKarp {

	    static void search(String text, String pattern) {

	        int n = text.length();
	        int m = pattern.length();

	        int base = 256;
	        int prime = 101;

	        int patternHash = 0;
	        int textHash = 0;

	        int h = 1;

	        for (int i = 0; i < m - 1; i++) {
	            h = (h * base) % prime;
	        }

	        for (int i = 0; i < m; i++) {
	            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
	            textHash = (base * textHash + text.charAt(i)) % prime;
	        }

	        for (int i = 0; i <= n - m; i++) {

	            if (patternHash == textHash) {

	                boolean match = true;

	                for (int j = 0; j < m; j++) {

	                    if (text.charAt(i + j) != pattern.charAt(j)) {
	                        match = false;
	                        break;
	                    }
	                }

	                if (match) {
	                    System.out.println("Pattern found at index " + i);
	                }
	            }

	            if (i < n - m) {

	                textHash = (base * (textHash
	                        - text.charAt(i) * h)
	                        + text.charAt(i + m)) % prime;

	                if (textHash < 0) {
	                    textHash = textHash + prime;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {

	        String text = "ABCCDABC";
	        String pattern = "ABC";

	        search(text, pattern);
	    }
	}

