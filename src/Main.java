import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static String Yes;
    public static void main(String [] args) throws IOException {
        System.out.println("Введіть число:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int N = Integer.parseInt(n);
       // System.out.println(N);


       /**  a)
        ArrayList <Character> list = new ArrayList<Character>();
        String n2 = Integer.toString(N*N);
        System.out.println(n2);
        for(int i=0;i<n2.length();i++) {
            list.add(n2.charAt(i));

            if(list.get(i).equals('3')){
                Yes = "Yes";
                break;
            }else{
                Yes = "No";
            }}
         System.out.println(Yes);
        **/


      /** b)
        ArrayList <Character> list = new ArrayList<Character>();
        ArrayList <Character> list2 = new ArrayList<Character>();
        int c = n.length();
        for(int i=0;i<n.length();i++) {
            list.add(n.charAt(i));
        }
        for(int i=n.length();i>0;i--) {
            list2.add(list.get(i-1));
        }
        n="";
        for(int i = 0; i<c;i++){
           String k = Character.toString(list2.get(i));
           n += k;
        }
System.out.println(n);
**/


      /** v)
        ArrayList <Character> list = new ArrayList<Character>();
        int c = n.length();
        for(int i=0;i<n.length();i++) {
            list.add(n.charAt(i));
        }
        char h = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, h);
        n="";
        for(int i = 0; i<c;i++){
            String k = Character.toString(list.get(i));
            n += k;
        }
        System.out.println(n);
       **/


      /** g)
      String f = "1";
      f += n;
      f += "1";
      n = f;
      System.out.println(n);
**/


        }

    }

