package X;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0w5  reason: invalid class name and case insensitive filesystem */
public abstract class C18080w5 extends Service implements C03640Kc {
    public C18040w1 A00;

    private synchronized C18040w1 A00() {
        C18040w1 r0;
        Throwable th;
        synchronized (this) {
            C14640ps.A00.block();
            r0 = this.A00;
            if (r0 == null) {
                try {
                    r0 = (C18040w1) Class.forName("com.facebook.rti.push.service.FbnsServiceDelegate").getDeclaredConstructor(new Class[]{C18080w5.class}).newInstance(new Object[]{this});
                    this.A00 = r0;
                } catch (InvocationTargetException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    if (e instanceof RuntimeException) {
                        throw e;
                    }
                    th = new RuntimeException(e);
                    throw th;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e2) {
                    th = new IllegalArgumentException(e2);
                    throw th;
                }
            }
            r0.A08();
        }
        return r0;
    }

    public final void A01() {
        super.onCreate();
    }

    public final void A02() {
        super.onDestroy();
    }

    public final void A03() {
        super.stopSelf();
    }

    public final void A06(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public final boolean A07(Intent intent) {
        return super.onUnbind(intent);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        A00();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A00().A0A(fileDescriptor, printWriter, strArr);
    }

    public final IBinder onBind(Intent intent) {
        return A00().A0B(intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(340973479);
        A00().A0C();
        C14030oh.A0B(647427856, A04);
    }

    public final void onDestroy() {
        int A04 = C14030oh.A04(1471674110);
        A00().A0F();
        C14030oh.A0B(1522077922, A04);
    }

    public final void onLowMemory() {
        super.onLowMemory();
    }

    public final void onRebind(Intent intent) {
        int A04 = C14030oh.A04(151367287);
        A00().A0D(intent);
        C14030oh.A0B(1952635755, A04);
    }

    public final void onStart(Intent intent, int i) {
        A00().A09(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(957196320);
        int A07 = A00().A07(intent, i, i2);
        C14030oh.A0B(-453467911, A04);
        return A07;
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    public final boolean onUnbind(Intent intent) {
        return A00().A0E(intent);
    }

    public final void A04(Intent intent) {
        super.onRebind(intent);
    }

    public final void A05(Intent intent, int i) {
        super.onStart(intent, i);
    }
}
