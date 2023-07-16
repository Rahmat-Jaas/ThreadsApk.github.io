package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.0oQ  reason: invalid class name and case insensitive filesystem */
public final class C13860oQ {
    public static void A01(SensorEventListener sensorEventListener, SensorManager sensorManager) {
        AnonymousClass0DA.A00.A06(sensorEventListener, (Sensor) null);
        sensorManager.unregisterListener(sensorEventListener);
    }

    public static void A00(Sensor sensor, SensorEventListener sensorEventListener, SensorManager sensorManager, int i) {
        if (sensorManager.registerListener(sensorEventListener, sensor, i)) {
            AnonymousClass0DA.A00.A05(sensorEventListener, sensor);
        }
    }
}
