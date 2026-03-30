///Time Complexity (TC)

Steps:Traverse string → O(n)
Sorting:
even1 → O(n log n)
even2 → O(n log n)
odd1 → O(n log n)
odd2 → O(n log n)

👉 Total:O(n log n)(Since constants are ignored)
📦 Space Complexity (SC)
You created:4 lists → each can hold ~ n/2 elements
👉 Total space:O(n)
code:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-
class Solution {
    public boolean checkStrings(String s1, String s2) {
        List<Character> even1 = new ArrayList<>();
        List<Character> even2 =  new ArrayList<>();
        List<Character> odd1 = new ArrayList<>();
        List<Character> odd2 = new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even1.add(s1.charAt(i));
                even2.add(s2.charAt(i));
            }else{
                odd1.add(s1.charAt(i));
                odd2.add(s2.charAt(i));
            }
        }
        Collections.sort(even1);
        Collections.sort(even2);
        Collections.sort(odd1);
        Collections.sort(odd2);

        return even1.equals(even2) && odd1.equals(odd2);
    }
}
