package mycompany.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        Person person = new Person("zhangsan", 2);
        intent.putExtra("person",person);
        startActivity(intent);
    }
}
