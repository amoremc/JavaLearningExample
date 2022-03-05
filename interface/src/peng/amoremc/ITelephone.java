package peng.amoremc;

public interface ITelephone {// the name of interface is started with " I ", stands for interface->name convention

    //在这里只"声明:调用该interface的class需要用的method；
    //并不真正写出这些method的代码
    //就像是肯德基总部制定的一个菜单一样
    void powerOn();//public is redundant here. because you define the method in class actually.
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

}
