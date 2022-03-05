package peng.amoremc;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print")

    public static void main(String[] args) {

        class ClickListener implements Button.OnclickListener{
            public ClickListener(){
                System.out.println("I have been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());

        }
}

