package SixChapter.clone2;

import java.io.Serializable;

public class Address implements Serializable{
    private static final long serialVersionUID=4983187287403615604L;
    private String state;
    private String province;
    private String city;
    public Address(String state, String province, String city)
    {
        this.state=state;
        this.province=province;
        this.city=city;
    }

    public void setState(String state)
    {
        this.state=state;
    }

    public void setProvince(String province)
    {
        this.province=province;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("国家: " + state + "，");
        sb.append("省:" + province + "，");
        sb.append("市:" + city + "，");
        return sb.toString();
    }
}
