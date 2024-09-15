public class removeDublicateInRecursion {

    public static void removeDublicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // work
        char ch = str.charAt(idx);
        int mapIdx = 0;
        if (ch >= 'a' && ch <= 'z') {
            mapIdx = ch - 'a';
        } else if (ch <= 'A' && ch <= 'Z') {
            mapIdx = ch - 'A' + 26;
        } else {
            removeDublicate(str, idx + 1, newStr, map);
            return;
        }
        if(map[mapIdx]){
            removeDublicate(str, idx+1, newStr, map);
        }else{
            newStr.append(ch);
            map[mapIdx]=true;
            removeDublicate(str, idx+1, newStr, map);
        }

    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDublicate(str, 0, new StringBuilder(""), new boolean[52]);
    }
}
