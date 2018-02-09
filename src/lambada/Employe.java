package lambada;

public class Employe implements Comparable<Employe>{

    private String name;
    private int age;

    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employe o) {
        if(this.getName().compareTo(o.getName())<0)
            return -1;
        else if(this.getName().compareTo(o.getName())>0)
            return 1;
        else
            return 0;
    }
}
