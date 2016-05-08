package mycompany.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by 91986 on 2016/5/8.
 */
public class Person implements Parcelable {
    private String name;
    private int age;
    private ArrayList<String> list;


    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Person(){
        super();
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);//写出name
        dest.writeInt(age);//写出age
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator<Person>(){

        @Override
        public Person createFromParcel(Parcel source) {
            Person person = new Person();
            person.name = source.readString();
            person.age = source.readInt();
            return person;
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[0];
        }

    };
}
