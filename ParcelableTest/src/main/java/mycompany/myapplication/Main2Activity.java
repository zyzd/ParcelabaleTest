package mycompany.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView mtvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");
        String name = person.getName();
        int age = person.getAge();

        mtvText = (TextView)  findViewById(R.id.tv_text);
        mtvText.setText("name:"+name+"---------age:"+age);

    }
}
