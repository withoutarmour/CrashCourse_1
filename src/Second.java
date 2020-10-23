import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String [] args) throws IOException {
        int a, b, c, y, x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 3 грані цеглини та 2 грані отвору:");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        if(a>b && a>c){
            if(b>c) {
                if (x > y) {
                    if (b == x || b < x && c == y || c < y) {
                        System.out.println("Влізе)");
                    } }
                if (y > x) {
                    if (b == y || b < y && c == x || c < x) {
                        System.out.println("Влізе)");
                    } } }
            if(c>b){
                if (x > y) {
                    if (c == x || c < x && b == y || b < y) {
                        System.out.println("Влізе)");
                    } }
                if (y > x) {
                    if (c == y || c < y && b == x || b < x) {
                        System.out.println("Влізе)");
                    } } } }
        if(b>a && b>c){
            if(a>c){
                if(x>y){
                    if(a==x || a<x && c==y || c<y){
                        System.out.println("Влізе)");
                    } }
                if (y>x){
                    if(a==y || a<y && c==x || c<x){
                        System.out.println("Влізе)");
                    } } }
            if(c>a){
                if(x>y){
                    if(c==x || c<x && a==y || a<y){
                        System.out.println("Влізе)");
                    } }
                if (y>x){
                    if(c==y || c<y && a==x || a<x){
                        System.out.println("Влізе)");
                    } } } }
        if(c>b && c>a){
            if(a>b){
                if(x>y){
                    if(a==x || a<x && b==y || b<y){
                        System.out.println("Влізе)");
                    } }
                if (y>x){
                    if(a==y || a<y && b==x || b<x){
                        System.out.println("Влізе)");
                    } } }
            if(b>a){
                if(b==x || b<x && a==y || a<y){
                    System.out.println("Влізе)");
                } }
            if (y>x){
                if(b==y || b<y && a==x || a<x){
                    System.out.println("Влізе)");
                } } } }}