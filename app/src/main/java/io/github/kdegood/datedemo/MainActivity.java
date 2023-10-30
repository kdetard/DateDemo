package io.github.kdegood.datedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;

public class MainActivity extends AppCompatActivity {
    TextView dateTxt;
    Button datePickerBtn;
    MaterialDatePicker<Long> datePicker;

    FragmentManager supportFragmentManager;

    CardView danCard;
    CardView khanhCard;
    CardView hanCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        supportFragmentManager = getSupportFragmentManager();

        dateTxt = findViewById(R.id.dateTxt);

        datePicker = MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Select date")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .build();

        datePicker.addOnPositiveButtonClickListener(selection -> {
            dateTxt.setText("Selected date is " + datePicker.getHeaderText());
        });

        datePickerBtn = findViewById(R.id.datePickerBtn);
        datePickerBtn.setOnClickListener(view -> {
            datePicker.show(supportFragmentManager, "tag");
        });*/

        danCard = findViewById(R.id.danCard);
        danCard.setOnClickListener(view -> {
            Toast t = Toast.makeText(getApplicationContext(), "This is Phan Văn Đô", Toast.LENGTH_LONG);
            t.show();
        });

        khanhCard = findViewById(R.id.khanhCard);
        khanhCard.setOnClickListener(view -> {
            Toast t = Toast.makeText(getApplicationContext(), "This is Lê Hoàng Khánh", Toast.LENGTH_LONG);
            t.show();
        });

        hanCard = findViewById(R.id.hanCard);
        hanCard.setOnClickListener(view -> {
            Toast t = Toast.makeText(getApplicationContext(), "This is Lê Ngọc Hân", Toast.LENGTH_LONG);
            t.show();
        });
    }
}