public class coordinate {
    public static float getShortPath(String str){
        int x=0;int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='W'){
                x--;
            }else{
                x++;
            }
        }

        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String STR ="NS";
        System.out.println(getShortPath(STR));
    }
}
