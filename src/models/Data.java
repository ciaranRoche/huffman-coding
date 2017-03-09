package models;

/**
 * Created by muldoon on 09/03/17.
 */
public class Data {
    private String data;

    public Data(String data){
        this.data = data;
    }

    public String toString(){
        return data;
    }

    public void addData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

}
