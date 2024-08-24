package builderPattern;

public class User{

    // Mandatory properties
    private final String name;
    private final int age;
    private final String email;

    // Optional properties
    private boolean isStudying;
    private String address;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.isStudying = builder.isStudying;
        this.address = builder.address;
    }

    public  String getName(){
        return  name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", isStudying=" + isStudying +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{

        // Mandatory properties
        private  String name;
        private  int age;
        private String email;

        // Optional properties
        private boolean isStudying;
        private String address;

        Builder(String name, int age, String email){
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public Builder setIsStudying(boolean isStudying){
            this.isStudying = isStudying;
            return  this;
        }

        public  Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
