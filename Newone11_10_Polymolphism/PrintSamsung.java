package Newone11_10_Polymolphism;

public class PrintSamsung implements PrintTable{
    @Override
    public void print(String doc) {
        System.out.println("from Samsung printer");
        System.out.println(doc);
    }
}
