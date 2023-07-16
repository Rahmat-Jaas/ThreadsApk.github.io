package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Aw  reason: invalid class name and case insensitive filesystem */
public final class C69884Aw implements C83504rU {
    public final /* synthetic */ C696249i A00;
    public final /* synthetic */ String A01;

    public C69884Aw(C696249i r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void Bxq() {
        String str;
        boolean z;
        C320129v r3 = C320129v.DEFAULT_PRIVACY_OPT_IN_MUTATION_FAILURE;
        C696249i r2 = this.A00;
        UserSession userSession = r2.A05;
        C209416t A04 = r2.A04();
        AnonymousClass21z r0 = null;
        if (A04 != null) {
            str = A04.A04;
        } else {
            str = null;
        }
        String str2 = this.A01;
        C209416t A042 = r2.A04();
        if (A042 != null) {
            z = A042.A05;
        } else {
            z = false;
        }
        C209416t A043 = r2.A04();
        if (A043 != null) {
            r0 = A043.A01;
        }
        C59693Lv.A01(r3, userSession, "", str, str2, String.valueOf(r0), false, false, z);
    }

    public final void onSuccess() {
        AnonymousClass20N r0;
        String str;
        boolean z;
        C696249i r1 = this.A00;
        if (r1.A04() != null) {
            C209416t A04 = r1.A04();
            if (A04 != null) {
                A04.A00 = true;
            }
        } else {
            r1.A0B(new C209416t(AnonymousClass21z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, AnonymousClass20N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "", "", true, false));
        }
        C209416t A042 = r1.A04();
        if (A042 != null) {
            r0 = A042.A02;
        } else {
            r0 = AnonymousClass20N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        C320129v r3 = C320129v.DEFAULT_PRIVACY_OPT_IN_MUTATION_SUCCESS;
        UserSession userSession = r1.A05;
        String obj = r0.toString();
        C209416t A043 = r1.A04();
        AnonymousClass21z r02 = null;
        if (A043 != null) {
            str = A043.A04;
        } else {
            str = null;
        }
        String str2 = this.A01;
        C209416t A044 = r1.A04();
        if (A044 != null) {
            z = A044.A05;
        } else {
            z = false;
        }
        C209416t A045 = r1.A04();
        if (A045 != null) {
            r02 = A045.A01;
        }
        C59693Lv.A01(r3, userSession, obj, str, str2, String.valueOf(r02), true, true, z);
    }
}
