package database;

import fileReading.DataReading;

import java.util.ArrayList;

public class SearchBarHandling
{
    private String search, path;

    public SearchBarHandling(String search, String path)
    {
        this.search = search;
        this.path = path;
    }

    public ArrayList<ArrayList<String>> retrieve()
    {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        ArrayList<ArrayList<String>> rawData = new ArrayList<>();

        DataReading reading = new DataReading();
        reading.scan(path);
        ArrayList<String> headers = reading.getHeaders();
        for (String h: headers) rawData.add(reading.getColumn(h));

        for (int i = 0; i < rawData.size(); i++) data.add(new ArrayList<>());

        for (int i = 0; i < rawData.get(0).size(); i++)
        {
            for (int j = 0; j < rawData.size(); j++)
            {
                if (rawData.get(j).get(i).contains(search))
                {
                    for (int k = 0; k < rawData.size(); k++) data.get(k).add(rawData.get(k).get(i));
                    break;
                }
            }
        }

        return data;
    }

}
