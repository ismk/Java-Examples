public class temp {
    public static void main(String[] args) {
        
        String sen = "Now is the time for all good men to come to the aid of their country";
        String[] parts = sen.split(" ");
        for (int i=0;i<parts.length;i++){
            for(int j=i+1;j<parts.length;j++){
                if (parts[j].compareTo(parts[i])<0){
                    String temp = parts[i];
                    parts[i] = parts[j];
                    parts[j] = temp;
                }
            }
        System.out.println(parts[i]);
        }
        String str1 = "Now";
        String str2 = "is";
        int n = str1.compareTo(str2);
        System.out.println(n);

    }
}