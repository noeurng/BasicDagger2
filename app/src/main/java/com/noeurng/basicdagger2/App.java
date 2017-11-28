package com.noeurng.basicdagger2;

import android.app.Application;

import com.noeurng.basicdagger2.component.DaggerVehicleComponent;
import com.noeurng.basicdagger2.component.VehicleComponent;
import com.noeurng.basicdagger2.module.VehicleModule;

public class App extends Application {

    VehicleComponent vehicleComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        vehicleComponent = DaggerVehicleComponent
                .builder()
                .vehicleModule(new VehicleModule())
                .build();

    }

    public VehicleComponent getVehicleComponent() {
        return vehicleComponent;
    }
}
