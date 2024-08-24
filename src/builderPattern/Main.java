package builderPattern;

public class Main {
    public static void main(String[] args){
        User user = new User.Builder(
                "Waseem",
                28,
                "akramwaseem@gmail.com")
                .setIsStudying(false)
                .build();
        System.out.println(user.toString());
    }
}
