package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.0ph  reason: invalid class name and case insensitive filesystem */
public class C14570ph extends Service implements AnonymousClass066 {
    public final AnonymousClass7AA A00 = new AnonymousClass7AA(this);

    public final AnonymousClass062 getLifecycle() {
        return this.A00.A01();
    }

    public IBinder onBind(Intent intent) {
        this.A00.A02();
        return null;
    }

    public final void onStart(Intent intent, int i) {
        this.A00.A05();
        super.onStart(intent, i);
    }

    public void onCreate() {
        int A04 = C14030oh.A04(786295562);
        this.A00.A03();
        super.onCreate();
        C14030oh.A0B(619807071, A04);
    }

    public void onDestroy() {
        int A04 = C14030oh.A04(1661363161);
        this.A00.A04();
        super.onDestroy();
        C14030oh.A0B(-1692196149, A04);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(-1616539017);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C14030oh.A0B(-35702725, A04);
        return onStartCommand;
    }
}
