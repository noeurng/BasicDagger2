package com.noeurng.basicdagger2.component;

import com.noeurng.basicdagger2.MainActivity;
import com.noeurng.basicdagger2.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = VehicleModule.class)
public interface VehicleComponent {
    void inject(MainActivity mainActivity);
}
