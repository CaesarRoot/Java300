package SixChapter.clone;

public class Address implements Cloneable{
	private String state;
	private String province;
	private String city;
	
	public Address(String state,String province,String city)
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
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(" state: "+state);
		sb.append(" province: "+province);
		sb.append(" city: "+city);
		return sb.toString();
	}
	
	public Address clone()
	{
		Address address=null;
		try
		{
			address=(Address)super.clone();
		}catch(CloneNotSupportedException e) {e.printStackTrace();}
	    return address;
	}
}
