package SevenChapter.Abstract;

public abstract class Shape {
    public String getName()
    {
        return this.getClass().getSimpleName();//ǰһ�����ش� Object ������ʱ��.��һ������Դ�����и����ĵײ���ļ�ơ�
    }
    public abstract double getArea();    //���ࣨ������ǳ����ࣩ����븲д������֮�е�ȫ�����󷽷����������û��ʵ�ָ���ĳ��󷽷�������뽫����Ҳ����ΪΪabstract�ࡣ��
}
