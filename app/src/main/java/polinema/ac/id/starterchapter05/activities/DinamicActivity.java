package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragmen;
import polinema.ac.id.starterchapter05.fragments.RedFragmen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DinamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamic);
    }

    public void handlerClickLoadRedFragment(View view) {
        Intent intent = new Intent(this, RedFragmen.class);
        startActivity(intent);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragmen());
        fragmentTransaction.commit();

    }

    public void handlerClickLoadBlueFragment(View view) {
        Intent intent = new Intent(this, BlueFragmen.class);
        startActivity(intent);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.btn_load_red_fragment, new BlueFragmen());
        fragmentTransaction.commit();
    }
}
