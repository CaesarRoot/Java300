package SevenChapter.Super;

public class Car {
    private String name;
    private double speed;

    public void setName(String name)
    {
        this.name=name;
    }

    public void setSpeed(double speed)
    {
        this.speed=speed;
    }

    public double getSpeed()
    {
        return speed;
    }

    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("车名:"+name+",");
        sb.append("速度:"+speed+",");
        return sb.toString();
    }
}
