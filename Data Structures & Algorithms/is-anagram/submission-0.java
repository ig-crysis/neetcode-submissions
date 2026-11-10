class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(tA);
        if(Arrays.equals(sA,tA)){
            return true;
        } else {
            return false;
        }
    }
}
