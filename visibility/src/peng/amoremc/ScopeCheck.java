package peng.amoremc;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + "; PrivateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

//java对于变量会从小到大，一级一级的向上索引，直到找到对应的变量初始化为止; 比如这里的" privateVar"
    //不会从上往下找， 比如这里的 " i "
    //又比如 这里的timesTwo（）和InnerClass 平级，所以他俩里面的privateVar不会相互覆盖，若不定义，也不会相互索引。

    public void timesTwo() {
        int privateVar = 5;//local to method -> the scope of this variable is limited to this method
        // if I want to specify I want to use the specified variable initiated in Class, rather than in method(假设这两个变量重名，如这里的 privateVar)
        //use " this. "
        for (int i = 0; i < 10; i++) {// " i " can only be used in for loop
            System.out.println(i + "times two is " + i * privateVar + "---> this is using the variable limited to this method ");
            System.out.println(i + "times two is " + i * this.privateVar + "--> this is using the current Class defined variable");
        }
        //System.out.println("Value of i is " +i);
    }

    //inner class---> class scope
    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
            System.out.println("InnerClass created, witout defining publicVar, but publicVar is " + publicVar);
        }

        public void timesTwo() {
            int privateVar = 2;//local to method -> the scope of this variable is limited to this method
            // if I want to specify I want to use the specified variable initiated in Class, rather than in method(假设这两个变量重名，如这里的 privateVar)
            //use " this. "
            for (int i = 0; i < 10; i++) {// " i " can only be used in for loop
                System.out.println(i + "times two is " + i * privateVar + "---> this is using the variable limited to this method ");
                System.out.println(i + "times two is " + i * this.privateVar + "--> this is using the current Class defined variable");
                System.out.println(i + "times two is " + i * ScopeCheck.this.privateVar +"this is using parent class defined variable");
            }

        }
    }
}
