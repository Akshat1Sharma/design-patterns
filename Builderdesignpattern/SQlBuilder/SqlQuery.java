package Builderdesignpattern.SQlBuilder;

public class SqlQuery {
    private String select;
    private String from;
    private String where;

    public SqlQuery(Builder builder){
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
    }

    @Override
    public String toString() {
        return "SELECT " + select + " FROM " + from + (where != null ? " WHERE " + where : "");
    }
}
