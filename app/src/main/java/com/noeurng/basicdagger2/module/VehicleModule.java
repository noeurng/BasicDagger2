package com.noeurng.basicdagger2.module;

import com.noeurng.basicdagger2.model.Motor;
import com.noeurng.basicdagger2.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {

    @Singleton
    @Provides
    Vehicle provideVehicle() {
        return new Motor();
    }

}
