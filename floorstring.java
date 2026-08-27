package day7;

public class floorstring {

    public static void main(String[] args) {

        String[] sizes = {
            "Apple",
            "Banana",
            "Mango",
            "Orange",
            "Peach"
        };

        String target = "Grapes";

        int start = 0;
        int end = sizes.length - 1;

        String floor = null;
        String ceil = null;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (sizes[mid].compareTo(target) == 0) {

                floor = sizes[mid];
                ceil = sizes[mid];

                break;
            }

            else if (sizes[mid].compareTo(target) < 0) {

                floor = sizes[mid];    // Possible floor
                start = mid + 1;       // Go RIGHT
            }

            else {

                ceil = sizes[mid];     // Possible ceil
                end = mid - 1;         // Go LEFT
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}

