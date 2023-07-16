package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.0Di  reason: invalid class name and case insensitive filesystem */
public final class C02900Di {
    public final Sensor A00;
    public final SensorEventListener A01;

    public C02900Di(SensorEventListener sensorEventListener, Sensor sensor) {
        this.A01 = sensorEventListener;
        this.A00 = sensor;
    }
}
