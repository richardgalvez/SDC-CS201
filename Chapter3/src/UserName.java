public class UserName {
    public static void main(String[] args) {
        String userName = "Jane Austin&";
            char[] checkUserName = userName.toCharArray();
            for (int i = 0; i < checkUserName.length; i++) {
                if(userName.charAt(i) != '&') {
                    System.out.println("Error!");
                }
                else{
                    System.out.println("Success!");
                }
            }
    }
}