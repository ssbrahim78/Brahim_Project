package charArray1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class data_provider {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        List<Integer> mylist = new ArrayList<Integer>();
        // *add elements to Arraylist
        mylist.add(67);
        mylist.add(11);
        mylist.add(65);
        mylist.add(8);
        mylist.add(1);
        mylist.add(5);

        Object[][] dataArray = new Object[5][4];
        int i = 0;
        int j = 0;
        for (Integer element : mylist) {    //
            dataArray[0][0] = element;
            dataArray[1][0] = element;
            dataArray[2][0] = element;
            dataArray[3][0] = element;
            dataArray[4][0] = element;

            i++;


            // System.out.print(dataArray[i][j]);
        }
        System.out.println(dataArray[0][1]);

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        //addind some stuff



        int size = list.size();
        System.out.println(size);
        char[][] tab2d = new char[size][size];

        for ( i = 0; i < size; i++) {
            for ( j = 0; j < size; j++) {
                tab2d[i][j] = list.get(i).charAt(j);
                ;
            }

        }
        System.out.println(tab2d[0][0]);
        System.out.println(tab2d[1][1]);
        System.out.println(tab2d[0][2]);
    }

    }





