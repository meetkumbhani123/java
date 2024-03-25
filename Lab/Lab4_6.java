public class Lab4_6 {
    public static void main(String[] args) {
        int length=args.length;
        for(int i=0;i<length;i++){
            String str= args[i];
            if (str.charAt(0)<65 || str.charAt(0)>90) {
                System.out.println("Error:at index "+i +"string is not at uppercase");
                return;
            }
        }
        System.out.println("all strins start with upeercase");
    }
    
}
