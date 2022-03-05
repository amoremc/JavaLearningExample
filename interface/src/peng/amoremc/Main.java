package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;//肯德基分店在肯德基总部注册
        //DeskPhone timsPhone;//再声明别的类的时候会报错
        timsPhone = new DeskPhone(123456);//肯德基分店成立
        timsPhone.powerOn();//肯德基分店用肯德基总部制定的菜单
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();

    }
}
