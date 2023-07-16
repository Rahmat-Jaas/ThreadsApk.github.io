package X;

import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.7De  reason: invalid class name and case insensitive filesystem */
public final class C120937De {
    public final C121787Id A00;
    public final AnonymousClass7HG A01;
    public final AnonymousClass7Dh A02;
    public final AnonymousClass75a A03;
    public final Executor A04;

    public static final AnonymousClass7HU A00(Bundle bundle, C120937De r5, String str, String str2, String str3) {
        String str4;
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String A0N;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        C121787Id r0 = r5.A00;
        C121787Id.A01(r0);
        bundle.putString("gmp_app_id", r0.A01.A01);
        AnonymousClass7HG r2 = r5.A01;
        bundle.putString("gmsv", Integer.toString(r2.A04()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", r2.A05());
        synchronized (r2) {
            if (r2.A00 == null) {
                AnonymousClass7HG.A02(r2);
            }
            str4 = r2.A00;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        AnonymousClass75a r1 = r5.A03;
        Set set = r1.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            A0N = r1.A01;
        } else {
            String str5 = r1.A01;
            synchronized (set) {
                unmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            A0N = AnonymousClass00U.A0N(str5, AnonymousClass75a.A00(unmodifiableSet2), ' ');
        }
        bundle.putString("Firebase-Client", A0N);
        C113426rN r22 = new C113426rN();
        r5.A04.execute(new AnonymousClass82S(bundle, r22, r5));
        return r22.A00;
    }

    public static final AnonymousClass7HU A01(AnonymousClass7HU r5, C120937De r6) {
        Executor executor = r6.A04;
        C129597mA r3 = new C129597mA(r6);
        AnonymousClass7HU r2 = new AnonymousClass7HU();
        r5.A03.A00(new AnonymousClass7mN(r3, r2, executor));
        AnonymousClass7HU.A02(r5);
        return r2;
    }

    public C120937De(C121787Id r3, AnonymousClass7HG r4, AnonymousClass75a r5, Executor executor) {
        C121787Id.A01(r3);
        AnonymousClass7Dh r0 = new AnonymousClass7Dh(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r5;
    }
}
