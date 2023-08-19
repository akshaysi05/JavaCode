public class StringLargestWord {
    public static void main(String[] args) {
        String s="india is My Country";
        String sb[]=s.split(" ");
        for(int i=0;i<sb.length;i++){
            for(int j=i+1;i<sb.length;j++){
                if (sb[i].length()<sb[j].length()) {
                    System.out.println(sb[j]);
                }

            }

        }
    }
}
