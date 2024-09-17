package Builderdesignpattern.ComplexDatabaseQuery;

public class SqlBuilder {
    private String select;
    private String from;
    private String where;
    private String orderBy;
    private int limit;


    public SqlBuilder setSelect(String select) {
        this.select = select;
        return this;
    }
    public SqlBuilder setFrom(String from) {
        this.from = from;
        return this;
    }
    public SqlBuilder setWhere(String where) {
        this.where = where;
        return this;
    }
    public SqlBuilder setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public SqlBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public String buildQuery(){
        StringBuilder query = new StringBuilder();
        
        //Select clause

        if(select != null){
            query.append("SELECT ").append(select);
        }else{
            throw new IllegalStateException("SELECT clause is mandatory.");
        }

        // FROM clause
        if (from != null) {
            query.append(" FROM ").append(from);
        } else {
            throw new IllegalStateException("FROM clause is mandatory.");
        }

        // WHERE clause (optional)
        if (where != null) {
            query.append(" WHERE ").append(where);
        }

        // ORDER BY clause (optional)
        if (orderBy != null) {
            query.append(" ORDER BY ").append(orderBy);
        }

        // LIMIT clause (optional)
        if (limit != 0) {
            query.append(" LIMIT ").append(limit);
        }

        return query.toString();
    }

    public String build(){
        return buildQuery();
    }
}
