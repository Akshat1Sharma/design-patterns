package Builderdesignpattern.SQlBuilder;

public class Builder {
    public String select;
    public String from;
    public String where;

    public Builder select(String select) {
        this.select = select;
        return this;
    }

    public Builder from(String from) {
        this.from = from;
        return this;
    }

    public Builder where(String where) {
        this.where = where;
        return this;
    }

    public SqlQuery build() {
        return new SqlQuery(this);
    }
}
