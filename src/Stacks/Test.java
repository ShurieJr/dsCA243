package Stacks;

public class Test <ca243 , E>{
    ca243 data;
    E data2;

    void setData(ca243 value){
        data = value;
    }
    ca243 getData(){
        return data;
    }

    static void main() {
        Test<String , String> ob = new Test();
        Test<Integer , String> ob2 = new Test();
        Test<Character , Boolean> ob3 = new Test();
        Test<Boolean , Double> ob4 = new Test();
        Test ob5 = new Test();
        ob.setData("ali");
        ob.data2 = "farah";
        ob2.data = 45;
        ob3.data = 'A';
        ob4.data = true;

        ob5.data = 66;
        System.out.println(ob.getData());
    }
}
