package com.liuzg.study.filter;

/**
 * Desc: 线程容器
 *
 * @author liuzg
 * @date 2017/10/23
 */
public class VariableContainer {
    private String name;
    private Integer age;
    private String other;

    private static ThreadLocal<VariableContainer> threadLocal = new ThreadLocal<>();

    /**
     * 获取当前线程中绑定的变量容器   外部可以往容器中设值
     */
    public static VariableContainer getThreadInstance(){
        VariableContainer container = threadLocal.get();
        if (container==null){
            container = new VariableContainer();
            threadLocal.set(container);
        }
        return  container;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "VariableContainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", other='" + other + '\'' +
                '}';
    }
}
