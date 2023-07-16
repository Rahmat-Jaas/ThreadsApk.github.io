package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.44X  reason: invalid class name */
public final class AnonymousClass44X implements C11630kW, C10390iG {
    public static AnonymousClass44X A02 = null;
    public static final String __redex_internal_original_name = "FacebookSessionStore";
    public Context A00;
    public AnonymousClass3AB A01;

    public final String A02(C10300i6 r3, String str) {
        AnonymousClass3AB r0;
        C566037v r02;
        AnonymousClass0wJ.A1M(r3, 0, str);
        if ((!C63693i8.A09(str, new AnonymousClass4VE(r3, (String) null))) || (r0 = this.A01) == null || (r02 = r0.A00) == null) {
            return null;
        }
        return r02.A01;
    }

    public final String A03(C10300i6 r3, String str) {
        AnonymousClass3AB r0;
        AnonymousClass0wJ.A1M(r3, 0, str);
        if ((!C63693i8.A09(str, new AnonymousClass4VE(r3, (String) null))) || (r0 = this.A01) == null) {
            return null;
        }
        return r0.A02;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static synchronized AnonymousClass44X A00() {
        AnonymousClass44X r1;
        synchronized (AnonymousClass44X.class) {
            r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass44X(C10600ic.A00);
                A02 = r1;
            }
        }
        return r1;
    }

    public final void A04(C10300i6 r3, AnonymousClass265 r4) {
        if (this.A01 != null || !C63443hU.A05(this.A00)) {
            C38040KHr.A01.CWx(new AnonymousClass45A());
        } else {
            C31155GhB.A03(new AnonymousClass1lZ(r3, this, r4));
        }
    }

    public AnonymousClass44X(Context context) {
        this.A00 = context;
        C691847d.A02(this);
        AnonymousClass3R8.A00(context);
    }

    public static boolean A01(C10300i6 r0, AnonymousClass44X r1, String str) {
        return !TextUtils.isEmpty(r1.A03(r0, str));
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(1545735477);
        this.A01 = null;
        C14030oh.A0A(-863540580, A03);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(189128367, C14030oh.A03(391739263));
    }
}
