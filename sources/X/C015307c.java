package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.07c  reason: invalid class name and case insensitive filesystem */
public final class C015307c extends AnonymousClass0DX {
    public final C002000x A00 = new C002000x();
    public final C015407d A01 = new C015407d(true);
    public final ArrayList A02 = new ArrayList();
    public volatile boolean A03 = true;

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new C015407d(false);
    }

    public final synchronized void A05(SensorEventListener sensorEventListener, Sensor sensor) {
        if (this.A03) {
            this.A02.add(new C02900Di(sensorEventListener, sensor));
            C002000x r3 = this.A00;
            C02890Dh r1 = (C02890Dh) r3.get(sensor);
            if (r1 == null) {
                r3.put(sensor, new C02890Dh(SystemClock.elapsedRealtime()));
            } else {
                r1.A00++;
            }
        }
    }

    public final synchronized void A06(SensorEventListener sensorEventListener, Sensor sensor) {
        int i;
        if (this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C02900Di r1 = (C02900Di) it.next();
                if (sensorEventListener == r1.A01) {
                    if (sensor == null || sensor == r1.A00) {
                        it.remove();
                        C002000x r2 = this.A00;
                        Sensor sensor2 = r1.A00;
                        C02890Dh r3 = (C02890Dh) r2.get(sensor2);
                        if (!(r3 == null || (i = r3.A00) == 0)) {
                            if (i > 1) {
                                r3.A00 = i - 1;
                            } else {
                                r2.remove(sensor2);
                                int type = sensor2.getType();
                                C015407d r4 = this.A01;
                                SparseArray sparseArray = r4.A01;
                                C015607g r6 = (C015607g) sparseArray.get(type, (Object) null);
                                if (r6 == null) {
                                    r6 = new C015607g();
                                    sparseArray.put(type, r6);
                                }
                                long j = elapsedRealtime - r3.A01;
                                r6.A01 += j;
                                C015607g r7 = r4.A02;
                                r7.A01 += j;
                                double power = ((((double) sensor2.getPower()) * ((double) j)) / 3600.0d) / 1000.0d;
                                r6.A00 += power;
                                r7.A00 += power;
                                if (sensor2.isWakeUpSensor()) {
                                    r6.A02 += j;
                                    r7.A02 += j;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r17) {
        C015407d r8 = (C015407d) r17;
        synchronized (this) {
            AnonymousClass0DZ.A00(r8);
            if (!this.A03) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r8.A04(this.A01);
            C002000x r10 = this.A00;
            int size = r10.size();
            for (int i = 0; i < size; i++) {
                Object[] objArr = r10.A02;
                Sensor sensor = (Sensor) objArr[i << 1];
                C02890Dh r1 = (C02890Dh) objArr[(i << 1) + 1];
                if (r1.A00 > 0) {
                    long j = elapsedRealtime - r1.A01;
                    double power = ((((double) sensor.getPower()) * ((double) j)) / 3600.0d) / 1000.0d;
                    C015607g r11 = r8.A02;
                    r11.A01 += j;
                    r11.A00 += power;
                    boolean z = false;
                    if (sensor.isWakeUpSensor()) {
                        z = true;
                        r11.A02 += j;
                    }
                    if (r8.A00) {
                        int type = sensor.getType();
                        SparseArray sparseArray = r8.A01;
                        C015607g r9 = (C015607g) sparseArray.get(type);
                        if (r9 == null) {
                            r9 = new C015607g();
                            sparseArray.put(type, r9);
                        }
                        r9.A01 += j;
                        r9.A00 += power;
                        if (z) {
                            r9.A02 += j;
                        }
                    }
                }
            }
            return true;
        }
    }
}
