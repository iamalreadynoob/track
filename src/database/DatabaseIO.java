package database;

import fileReading.DataReading;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DatabaseIO
{

    private String path;
    private Integer page;
    private ArrayList<ArrayList<String>> data;

    public DatabaseIO()
    {
        path = null;
        page = null;
        data = new ArrayList<>();
    }

    public void loadData(String path, int page)
    {
        this.path = path;
        this.page = page;

        DataReading reading = new DataReading();
        reading.scan(path);
        ArrayList<String> headers = reading.getHeaders();
        for (String h: headers) data.add(reading.getColumn(h));
    }

    public void reset()
    {
        path = null;
        page = null;
        for (int i = 0; i < data.size(); i++) data.remove(0);
    }

    public void fillData(ArrayList<JTextField> names, ArrayList<JButton> openButtons, ArrayList<JButton> deleteButtons, ArrayList<JComboBox<String>> scores)
    {
        int from = 10 * page;

        int to;
        if (data.get(0).size() >= from + 10) to = from + 10;
        else to = data.get(0).size();

        int loc = 0;
        int objLoc = from;

        while (objLoc < to && loc < 10)
        {
            names.get(loc).setText(data.get(0).get(objLoc));
            scores.get(loc).setSelectedIndex(Integer.parseInt(data.get(4).get(objLoc)) - 1);

            names.get(loc).setVisible(true);
            scores.get(loc).setVisible(true);
            openButtons.get(loc).setVisible(true);
            deleteButtons.get(loc).setVisible(true);
            scores.get(loc).setVisible(true);

            objLoc++;
            loc++;
        }

        if (to - from < 10)
        {
            int diff = to - from;

            for (int i = diff; i < 10; i++)
            {
                names.get(i).setText(null);
                names.get(i).setVisible(false);

                openButtons.get(i).setVisible(false);
                deleteButtons.get(i).setVisible(false);

                scores.get(i).setSelectedItem(null);
                scores.get(i).setVisible(false);
            }
        }

     }

     public int getPageSize()
     {
         int size = data.get(0).size() / 10;

         String items = Integer.toString(data.get(0).size());
         if (items.charAt(items.length() - 1) != '0') size += 1;

         return size;
     }

     public void setPage(Integer page) {this.page = page;}
     public void setData(ArrayList<ArrayList<String>> data, int page)
     {
         for (ArrayList<String> innerList : this.data)
         {
             Iterator<String> iterator = innerList.iterator();
             while (iterator.hasNext())
             {
                 iterator.next();
                 iterator.remove();
             }
         }

         this.data = data;
         this.page = page;

     }

     public void setData(String path, int page)
     {
         if (data != null)
         {

             loadData(path, page);
         }
     }

}
