package Builderdesignpattern.ComplexDatabaseQuery;

public class Client {
    public static void main(String[] args) {
        
       
        
        String sqlQuery = 
            new SqlBuilder()
                .setSelect("name,age")
                .setFrom("emp")
                .setWhere("age > 60")
                .setOrderBy("name Asc")
                .setLimit(10)
                .build();
        System.out.println(sqlQuery);
    }
}
