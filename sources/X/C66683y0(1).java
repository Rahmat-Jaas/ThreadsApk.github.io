package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3y0  reason: invalid class name and case insensitive filesystem */
public final class C66683y0 implements C013606i {
    public final /* synthetic */ C697249u A00;

    public C66683y0(C697249u r1) {
        this.A00 = r1;
    }

    public final void CHE(int i, Object obj) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0W(this.A00.A06), "ig_android_profile_installer"), 779);
        try {
            str = String.valueOf(obj);
        } catch (Exception unused) {
            str = null;
        }
        C18190wL.A1I(A0I, "profile_write_result");
        A0I.A0S("result_code", C18230wP.A0f(i));
        A0I.A0T("extra_result_data", str);
        A0I.Bb4();
    }
}
