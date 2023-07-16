package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3Xa  reason: invalid class name and case insensitive filesystem */
public final class C62073Xa {
    public final C81464nq A00;
    public final String A01;
    public final AnonymousClass0A5 A02;

    public static /* synthetic */ Object A00(C10300i6 r17, C62073Xa r18) {
        C08960ea r0;
        Integer num = AnonymousClass006.A00;
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        String A04 = C09140ev.A02.A04(context);
        AnonymousClass3YK A002 = C60913Rb.A00(r18.A00);
        if (A04 != null && System.currentTimeMillis() < Long.MAX_VALUE && A002.A00 < A002.A01 && SystemClock.elapsedRealtime() - A002.A02 >= AnonymousClass3YK.A0B && ((r0 = A002.A08) == null || !C18190wL.A1Z(r0.A02(), false))) {
            A002.A02 = SystemClock.elapsedRealtime();
            boolean equals = num.equals(num);
            C10680ik r1 = new C10680ik(r17);
            if (equals) {
                r1.A01 = C10690il.A06;
            }
            C13330nS A003 = r1.A00();
            double A004 = C18200wM.A00();
            double A005 = AnonymousClass269.A00();
            C10690il r12 = A003.A00;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(A003.A03(r12, "ig_local_exposure"), 1326);
            AnonymousClass269.A05(A0I);
            String str = A002.A09;
            A0I.A0T("experiment", str);
            A0I.A0T("test_group", AnonymousClass3YK.A00(A002).A01);
            A0I.A0T("guid", A04);
            A0I.A0T("containermodule", "waterfall_log_in");
            Double valueOf = Double.valueOf(A004 - A005);
            A0I.A0R("elapsed_time", valueOf);
            Double valueOf2 = Double.valueOf(A005);
            A0I.A0R(TraceFieldType.StartTime, valueOf2);
            A0I.A0R("current_time", Double.valueOf(A004));
            A0I.Bb4();
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(A003.A03(r12, "initial_app_launch_experiment_exposure"), 1577);
            A0I2.A0T("exp_name", str);
            A0I2.A0T("exp_group", AnonymousClass3YK.A00(A002).A01);
            A0I2.A0T("app_device_id", A04);
            A0I2.A0T("containermodule", "waterfall_log_in");
            A0I2.A0R("elapsed_time", valueOf);
            A0I2.A0R(TraceFieldType.StartTime, valueOf2);
            A0I2.A0S("current_time", Long.valueOf((long) A004));
            A0I2.Bb4();
        }
        return A01(r18);
    }

    public static final Object A01(C62073Xa r3) {
        C61163Sd r0;
        AnonymousClass3YK A002 = C60913Rb.A00(r3.A00);
        String str = ((C02240Aj) r3.A02).name;
        C04220Ms.A0B(str, 0);
        C08960ea r02 = A002.A08;
        if (r02 == null || !C18190wL.A1Z(r02.A02(), false)) {
            r0 = AnonymousClass3YK.A00(A002);
        } else {
            r0 = A002.A05;
            if (r0 == null) {
                C04220Ms.A0E("deployGroup");
                throw null;
            }
        }
        Object obj = r0.A02.get(str);
        if (obj != null) {
            C04220Ms.A0C(obj, "null cannot be cast to non-null type T of com.instagram.experiments.LandingExperimentParameter");
            return obj;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0d("Parameter ", str, " was not set for group ", r0.A01));
    }

    public C62073Xa(C81464nq r2, AnonymousClass0A5 r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = ((C02240Aj) r3).name;
    }
}
