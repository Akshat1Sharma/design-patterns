package Builderdesignpattern.SQlBuilder;

public class MainClass {

    public static void main(String[] args) {
        SqlQuery query = new Builder()
        .select("name,age,id")
        .from("Users")
        .where("age > 30")
        .build();

        System.out.println(query);
    }
   
}
