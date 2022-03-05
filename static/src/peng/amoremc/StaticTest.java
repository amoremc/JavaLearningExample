package peng.amoremc;

public class StaticTest {

    private int numInstances = 0;
    private static int staticnumInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
        staticnumInstances++;

    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    public int getStaticnumInstances() {
        return staticnumInstances;
    }
}
