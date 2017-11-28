package com.noeurng.basicdagger2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.noeurng.basicdagger2.model.Vehicle;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getVehicleComponent().inject(this);

        vehicle.accelerate(120);

        Toast.makeText(this, "Vehicle Speed: "+vehicle.getSpeed(), Toast.LENGTH_SHORT).show();
    }
}
