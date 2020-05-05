package Exercises;

public class StringArray1 {
    String name;
    StringArray1(String name){
        this.name=name;
            }
            public boolean equals(Object obj){
        if(obj instanceof StringArray1){
            StringArray1 str= (StringArray1)obj;
            boolean isEqual= str.name.equals(this.name);
            return isEqual;
        }
        else{
            return false;
        }
            }

    public static void main(String[] args) {
        StringArray1 str1= new StringArray1("ali");
        System.out.println(str1.equals("ali"));
    }

}
