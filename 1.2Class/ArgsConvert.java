public class ArgsConvert {
    public static void main (String[] args){
        System.out.println(args[0]);
        int num=0;
        int sum=0;
        for(String s:args){
            sum+=Integer.parseInt(s);
            num++;
        }
        System.out.println(num);
        System.out.println(sum);
    }  
}
