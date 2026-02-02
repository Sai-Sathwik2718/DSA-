class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char c:"AEIOUaeiou".toCharArray()){
            set.add(c);
        }
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right && !set.contains(arr[left])){
                left++;
            }
            while(left<right && !set.contains(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}