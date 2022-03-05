package peng.amoremc;

import java.util.ArrayList;

public class GroceryList {
    //ArrayList can hold objects; we do not need to say the type like in creating the array;
    private int[] myNumbers = new int[50]; //int[] after private is the type of the variable the array is goint to hold

    //ArrayList is actually a class, so we can call its constructor;
    //here we call the ArrayList's empty constructor;
    private ArrayList<String> groceryList = new ArrayList<String>();

    //add item to list
    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    //get one item in list
    public void printGroceryList(){
        System.out.println("you have "+groceryList.size() +" items in your grocery list");
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }



    public void modifyGroceryItem(String newItem){
        int position = searchItem(newItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    //update one item in list
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);//but we want to find a way not to specify the postion number;
        System.out.println("Grocery item " + (position+1) + "has been modified.");
    }




    public void removeGroceryItem(String item){
        int position = searchItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    //remove one item in list
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);//position is counted from 0;
    }





    //find one item in list
//    public String searchItem(String searchItem){
////        boolean exists = groceryList.contains(searchItem); //"contains" is the arraylist in-build function, used to search whether the target item in arraylist or not;
//          int position = groceryList.indexOf(searchItem); //return the position of the target in arraylist
//          if (position >= 0){
//              return groceryList.get(position);
//          }else {
//              return null;
//          }
//    }


    //check whether one item in list or not
    public boolean onFile(String searchItem){
        int position = searchItem(searchItem);
        if (position >= 0){
            return true;
        }else {
            return false;
        }
    }

    private int searchItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
