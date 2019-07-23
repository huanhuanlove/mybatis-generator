package entities;

import java.io.Serializable;

public class Store implements Serializable {
    private Integer id;

    private String type;

    private Integer number;

    private static final long serialVersionUID = 1L;

    public Store(Integer id, String type, Integer number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public Store() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}