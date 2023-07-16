package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0En  reason: invalid class name and case insensitive filesystem */
public final class C03150En extends C11940l3 {
    public static final ListenableFuture A01(C09350fH r6, AnonymousClass0XV r7, AnonymousClass0XV r8) {
        if (!(r7 == null || r8 == null)) {
            r6.AvU().A02("app_init_ms", r8.A00);
            r6.AvU().A02("time_since_app_init_ms", r6.AwQ() - r8.A00);
            r6.AvU().A03("startup_status", r8.A01);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "startup_stats";
    }

    public final int B52() {
        return 12;
    }

    public static final AnonymousClass0XV A00() {
        AnonymousClass0XV r2 = new AnonymousClass0XV();
        r2.A00 = C25756DrT.A02();
        r2.A01 = C25756DrT.A04();
        return r2;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A01(r2, (AnonymousClass0XV) obj, (AnonymousClass0XV) obj2);
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        return A00();
    }

    public final Class BCf() {
        return AnonymousClass0XV.class;
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36319317196870745L));
    }
}
