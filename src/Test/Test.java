package Test;

import java.util.*;

public class Test {


    public static void main(String[] args) {



        String s = "I I I ";
        String t = "i";
        System.out.println(new Test().NumberOfcount(new int[]{4,5,12,20,60}, 5));

//        Test test = new Test();
//        System.out.println("apple2".substring(2,4));
//        Map<String, CardValidator> result = validateEachCard("67248437110601489",new String[]{"60","11","3434","67453","9"});
//
//        System.out.println(result.get("67248437110601489").toString());
    }

    public int NumberOfcount(int[] arr, int given) {

        int count = 0;
        ArrayList<Set<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Set<Integer>> oList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                Set<Integer> set = new HashSet<>();
                for (Set<Integer> inn : oList) {
                    set.addAll(inn);

                }
                set.add(arr[j]);
                oList.add(set);

            }
            outerList.addAll(oList);
        }

        for (Set<Integer> set : outerList) {
            int sum = 0;
            for (int num : set) {
                sum += num;
            }
            if (sum < given) {
                count++;
            }
            //System.out.println(Arrays.toString(set.toArray()));
        }

        return count;

    }


    public static Map<String, CardValidator> validateEachCard(String cardNumber, String[] prefix) {

        char[] toArray = cardNumber.toCharArray();
        int sum = 0;
        boolean cardValid = false;
        boolean isAllowed = true;
        for (int i = 0; i < toArray.length-1; i++) {
            int numbers = toArray[i] - '0';
            sum += 2 * numbers;
        }
        int rem = sum % 10;
        if (rem == toArray[toArray.length - 1] - '0') {
            cardValid = true;
        }

        for (int j = 0; j < prefix.length; j++) {
            if (prefix[j].equals(cardNumber.substring(0, prefix[j].length()))) {
                isAllowed = false;
                break;
            }
        }

        CardValidator cv = new CardValidator(cardNumber,cardValid,isAllowed);
        Map<String, CardValidator> map = new HashMap<>();
        map.put(cardNumber,cv);
        return map;




    }

    static class CardValidator extends Object {

        String cardNo;
        boolean isValid;
        boolean isAllowed;

        public CardValidator(String cardNo, boolean isValid, boolean isAllowed) {
            this.cardNo = cardNo;
            this.isValid = isValid;
            this.isAllowed = isAllowed;
        }

        @Override
        public String toString() {
            return  cardNo+"   "+isValid+"   "+isAllowed;

        }
    }
}
