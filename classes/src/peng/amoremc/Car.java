package peng.amoremc;

import java.util.Locale;

public class Car {
    //objects = state + behavior
    //state components
    //five fields
    private int doors;
    private int wheels;
    //private means do not allow other class(except Car class) access to these fields.
    private String model;//声明称public,有违encapsulation的原则
    private String engine;
    private String colour;

    //updating one field by using method without accessing the field directly from other class -> good for encapsulation;
    //setter in class -> 更新（set）field
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            //"this" is to refer to the class
            //这句话是通过参数更新field变量；
            //参数是model，field里也有一个叫model的；
            this.model = model;
        }else{
            this.model = "unkown";
        }
    }
    //getter in class->把class的内容反馈给外界，让别的class看到
    public String getModel(){
        return this.model;
    }
}
