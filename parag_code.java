
package com.datametica.test;

public class App {
public static void main(String[] args) {
int i = 0, j = 0;
for (i=0; i<5; i++) {
        for (j=0; j<5-i; j++) {
                System.out.print("_");
        }
        System.out.println("*");
        }
}
}
