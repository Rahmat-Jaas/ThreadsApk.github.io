package X;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4T7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4T7 implements Runnable {
    public final /* synthetic */ AnonymousClass3XX A00;
    public final /* synthetic */ AnonymousClass3GF A01;
    public final /* synthetic */ C24431ij A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicBoolean A04;

    public /* synthetic */ AnonymousClass4T7(AnonymousClass3XX r1, AnonymousClass3GF r2, C24431ij r3, String str, AtomicBoolean atomicBoolean) {
        this.A02 = r3;
        this.A04 = atomicBoolean;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
    }

    public final void run() {
        C24431ij r3 = this.A02;
        AtomicBoolean atomicBoolean = this.A04;
        AnonymousClass3GF r4 = this.A01;
        AnonymousClass3XX r1 = this.A00;
        String str = this.A03;
        atomicBoolean.set(true);
        String str2 = r3.A0A;
        C84634tZ r6 = r3.A05;
        C07530bf r7 = r3.A07;
        Activity activity = r3.A01;
        C26641qy r5 = (C26641qy) r1.A00;
        if (r5 != null) {
            AnonymousClass3NC.A01(activity, r4, r5, r6, r7, str2, str);
        }
    }
}
