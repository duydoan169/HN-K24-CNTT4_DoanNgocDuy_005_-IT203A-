package bai02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine().toLowerCase();

        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        while (m.find()){
            String currentKey = m.group();
            if (map.containsKey(currentKey)){
                map.put(currentKey, map.get(currentKey) + 1);
            }else {
                map.put(currentKey, 1);
            }
        }

        System.out.println("\n" + map + "\n");

        System.out.print("Nhap danh muc muon tim: ");
        String search = sc.nextLine();
        if (search.isBlank() ){
            System.out.println("Chuoi khong hop le");
            return;
        }
        if(!map.containsKey(search.toLowerCase())){
            System.out.println("Khong ton tai danh muc");
            return;
        }

        System.out.println("Ket qua cho \"" + search + "\": " + map.get(search.toLowerCase()));
    }
}
