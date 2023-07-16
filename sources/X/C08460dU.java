package X;

import android.app.Application;
import com.facebook.endtoend.EndToEnd;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0dU  reason: invalid class name and case insensitive filesystem */
public final class C08460dU extends AnonymousClass4TI {
    public static final AtomicReference A00 = new AtomicReference();

    public static /* synthetic */ String A00() {
        C04560Oe r0 = (C04560Oe) A00.get();
        if (r0 != null) {
            return (String) r0.get();
        }
        return null;
    }

    public final void A03() {
        AnonymousClass0OK r1 = C08470dV.A01;
        if (r1 == null || r1.A01 == null) {
            AnonymousClass0LU.A0C("lacrima", "LacrimaEarlyInitializer wasn't called.");
            return;
        }
        AnonymousClass0LU.A0C("lacrima", "LacrimaInitializer.init");
        Application application = r1.A0L;
        C04100Mg A02 = r1.A02();
        C1189072t.A00(application);
        if (EndToEnd.isRunningEndToEndTest()) {
            C06910aa.A00(new C10240hx(), A02, AnonymousClass0ND.CRITICAL_REPORT);
        }
        C126137ee r0 = new C126137ee(application);
        AnonymousClass0ND r2 = AnonymousClass0ND.LARGE_REPORT;
        C06910aa.A00(r0, A02, r2);
        C06910aa.A00(new K3D(), A02, r2);
        C04210Mr r12 = new C04210Mr(C09230f5.A00);
        C07140ax.A00(r12, A02, r2);
        C06910aa.A00(r12, A02, r2);
        AnonymousClass0PC r02 = (AnonymousClass0PC) A02.A03(C07290bH.class);
        if (r02 == null) {
            AnonymousClass0LU.A0C("lacrima", "Cannot find registered detector");
        } else {
            A02.A05(r12, r2, r02);
        }
        AnonymousClass0ND r22 = AnonymousClass0ND.CRITICAL_REPORT;
        C07220b8.A01(r12, A02, r22);
        if (!C07960cV.A05(AnonymousClass0e5.A00(36323612164104152L))) {
            C09160ex r03 = new C09160ex();
            C07140ax.A00(r03, A02, r22);
            C06910aa.A00(r03, A02, r22);
            C07220b8.A01(r03, A02, r22);
        }
        C10290i5 r04 = new C10290i5();
        C07140ax.A00(r04, A02, r22);
        C06910aa.A00(r04, A02, r22);
        C07220b8.A01(r04, A02, r22);
    }
}
