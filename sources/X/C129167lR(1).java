package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7lR  reason: invalid class name and case insensitive filesystem */
public abstract class C129167lR implements AnonymousClass8eE {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C146788mr A03;
    public final C108946jD A04;
    public final AnonymousClass7AL A05;
    public final C113816sC A06;
    public final String A07;
    public final C142198eH A08;
    public final AnonymousClass7MI A09;

    public static final AnonymousClass7HU A01(C129167lR r14, AnonymousClass76Q r15, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        C113426rN r4 = new C113426rN();
        AnonymousClass7MI r8 = r14.A09;
        C142198eH r3 = r14.A08;
        int i2 = r15.A00;
        if (i2 != 0) {
            C113816sC r7 = r14.A06;
            if (r8.A06()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = AnonymousClass7DN.A00().A00;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.A03) {
                        boolean z = rootTelemetryConfiguration.A04;
                        AnonymousClass7lO r2 = (AnonymousClass7lO) r8.A09.get(r7);
                        if (r2 != null) {
                            C148598rX r1 = r2.A04;
                            if (r1 instanceof C121837Ij) {
                                C121837Ij r12 = (C121837Ij) r1;
                                if (r12.A0Q != null && !r12.BST()) {
                                    ConnectionTelemetryConfiguration A002 = C129687mK.A00(r2, r12, i2);
                                    if (A002 != null) {
                                        r2.A00++;
                                        z = A002.A03;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            C129687mK r6 = new C129687mK(r7, r8, i2, currentTimeMillis, elapsedRealtime);
                            AnonymousClass7HU r5 = r4.A00;
                            Handler handler = r8.A06;
                            handler.getClass();
                            r5.A03.A00(new AnonymousClass7mP(r6, new AnonymousClass853(handler)));
                            AnonymousClass7HU.A02(r5);
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                C129687mK r62 = new C129687mK(r7, r8, i2, currentTimeMillis, elapsedRealtime);
                AnonymousClass7HU r52 = r4.A00;
                Handler handler2 = r8.A06;
                handler2.getClass();
                r52.A03.A00(new AnonymousClass7mP(r62, new AnonymousClass853(handler2)));
                AnonymousClass7HU.A02(r52);
            }
        }
        C86124wJ.A1E(r8.A06, new C108956jE(r14, new C93475lf(r3, r15, r4, i), r8.A0C.get()), 4);
        return r4.A00;
    }

    public C129167lR(Activity activity, Context context, C146788mr r8, C108946jD r9, C1195075p r10) {
        C13320nQ.A02(context, "Null context is not permitted.");
        C13320nQ.A02(r9, "Api must not be null.");
        C13320nQ.A02(r10, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.A01 = context.getApplicationContext();
        String str = null;
        if (AnonymousClass6J0.A00()) {
            try {
                str = (String) C86114wI.A0g(context, Context.class, "getAttributionTag");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.A07 = str;
        this.A04 = r9;
        this.A03 = r8;
        this.A02 = r10.A00;
        C113816sC r3 = new C113816sC(r8, r9, str);
        this.A06 = r3;
        this.A05 = new C93275lI(this);
        AnonymousClass7MI A012 = AnonymousClass7MI.A01(this.A01);
        this.A09 = A012;
        this.A00 = A012.A0B.getAndIncrement();
        this.A08 = r10.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C146168ll A013 = LifecycleCallback.A01(new C105036cm(activity));
            C93505li r1 = (C93505li) A013.AV4(C93505li.class, "ConnectionlessLifecycleHelper");
            r1 = r1 == null ? new C93505li(GoogleApiAvailability.A00, A012, A013) : r1;
            r1.A00.add(r3);
            A012.A05(r1);
        }
        C86124wJ.A1E(A012.A06, this, 7);
    }

    public static final void A02(C129167lR r4, C93345lQ r5, int i) {
        r5.A06();
        AnonymousClass7MI r0 = r4.A09;
        C86124wJ.A1E(r0.A06, new C108956jE(r4, new C93495lh(r5, i), r0.A0C.get()), 4);
    }
}
