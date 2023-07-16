package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.7Ig  reason: invalid class name and case insensitive filesystem */
public final class C121817Ig {
    public QuickPerformanceLogger A00;
    public C556434a A01;
    public C124867bs A02;
    public AnonymousClass6S3 A03;
    public AnonymousClass77R A04;
    public C143688h9 A05;
    public AnonymousClass751 A06;
    public AnonymousClass752 A07;
    public final Context A08;
    public final UserSession A09;
    public final C04560Oe A0A;
    public final C04560Oe A0B;

    public static void A03(Bundle bundle, Fragment fragment) {
        C99156Ii.A00(bundle, fragment, true);
        new C25786Drz(fragment.requireActivity(), AnonymousClass7Kz.A0K().A07().A00).A0D((String) null, 0);
    }

    public final Fragment A04(Bundle bundle, String str) {
        Fragment A002 = ((C113376rI) this.A0B.get()).A00(bundle, str);
        A002.getClass();
        return A002;
    }

    public final Fragment A05(Bundle bundle, String str) {
        Fragment A012 = ((C113376rI) this.A0B.get()).A01(bundle, str);
        A012.getClass();
        return A012;
    }

    public final C143688h9 A06() {
        C143688h9 r1 = this.A05;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass7kf r12 = new AnonymousClass7kf(new C113386rJ(C13330nS.A00(new AnonymousClass7q4(this), C10690il.A06, this.A09)));
        this.A05 = r12;
        return r12;
    }

    public final AnonymousClass751 A07() {
        AnonymousClass751 r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass751 r12 = new AnonymousClass751(this.A09);
        this.A06 = r12;
        return r12;
    }

    public final AnonymousClass752 A08() {
        AnonymousClass752 r1 = this.A07;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass752 r12 = new AnonymousClass752(this.A09);
        this.A07 = r12;
        return r12;
    }

    public C121817Ig(Context context, UserSession userSession, C04560Oe r3, C04560Oe r4) {
        this.A08 = context;
        this.A0B = r3;
        this.A0A = r4;
        this.A09 = userSession;
    }

    public static AnonymousClass7IU A00(AnonymousClass06C r15) {
        C121817Ig A0K = AnonymousClass7Kz.A0K();
        C124867bs r2 = A0K.A02;
        if (r2 == null) {
            UserSession userSession = A0K.A09;
            IGPaymentMethodsAPI iGPaymentMethodsAPI = new IGPaymentMethodsAPI(userSession, "FBPAY_HUB");
            C04560Oe r3 = A0K.A0A;
            C112706q3 r9 = new C112706q3((C104996ci) r3.get(), iGPaymentMethodsAPI);
            C109796kd r5 = new C109796kd((C104996ci) r3.get(), new AnonymousClass34Z(userSession));
            C104996ci r22 = (C104996ci) r3.get();
            C556434a r0 = A0K.A01;
            if (r0 == null) {
                r0 = new C556434a(userSession);
                A0K.A01 = r0;
            }
            C107346gb r6 = new C107346gb(r22, r0);
            C107366gd r8 = new C107366gd((C104996ci) r3.get(), new C108236i2(A0K.A08, userSession));
            C107396gg r10 = new C107396gg((C104996ci) r3.get(), new C106126eX(userSession));
            C107356gc r7 = new C107356gc((C104996ci) r3.get(), new C106116eW(userSession));
            C108916jA r4 = new C108916jA((C104996ci) r3.get(), new C111576nu());
            C112716q4 r12 = new C112716q4((C104996ci) r3.get(), new C108246i3(userSession));
            C1194375i r13 = new C1194375i(userSession);
            C143688h9 A062 = A0K.A06();
            QuickPerformanceLogger quickPerformanceLogger = A0K.A00;
            if (quickPerformanceLogger == null) {
                quickPerformanceLogger = AnonymousClass01V.A0p;
                A0K.A00 = quickPerformanceLogger;
            }
            r2 = new C124867bs(quickPerformanceLogger, r4, r5, r6, r7, r8, r9, r10, A062, r12, r13, userSession);
            A0K.A02 = r2;
        }
        return new AnonymousClass7IU((C147138nS) r2, r15);
    }

    public static QuickPerformanceLogger A01() {
        C121817Ig A0K = AnonymousClass7Kz.A0K();
        QuickPerformanceLogger quickPerformanceLogger = A0K.A00;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        A0K.A00 = r0;
        return r0;
    }

    public static C143688h9 A02(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return AnonymousClass7Kz.A0K().A06();
    }
}
