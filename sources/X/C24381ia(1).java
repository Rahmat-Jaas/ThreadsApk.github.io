package X;

import android.text.TextUtils;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public final class C24381ia extends C63873iU {
    public UserSession A00;
    public boolean A01;

    public static void A00(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C15730rn A002 = C63313hF.A00(userSession, "AgeVerificationFragment.java");
        A002.A09("has_email", Boolean.valueOf(z2));
        A002.A09("used_oauth", Boolean.valueOf(z3));
        A002.A09("success", Boolean.valueOf(z));
        C18180wK.A1K(A002, userSession);
    }

    public C24381ia(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A03 = C14030oh.A03(1857572247);
        A00(this.A00, false, false, this.A01);
        C14030oh.A0A(-502944996, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C566738c r1;
        int A03 = C14030oh.A03(2066736474);
        AnonymousClass1TS r10 = (AnonymousClass1TS) obj;
        int A032 = C14030oh.A03(-1643876087);
        if (!TextUtils.isEmpty(r10.A00)) {
            UserSession userSession = this.A00;
            Object A012 = userSession.A01(AnonymousClass3AS.class, AnonymousClass4UY.A00);
            AnonymousClass3AS r6 = (AnonymousClass3AS) A012;
            synchronized (A012) {
                r1 = r6.A00;
            }
            if (r1 == null || TextUtils.isEmpty(r1.A00) || (!r1.A01 && this.A01)) {
                C566738c r0 = new C566738c(r10.A00, this.A01);
                synchronized (A012) {
                    r6.A00 = r0;
                }
            }
            A00(userSession, true, true, this.A01);
        } else {
            A00(this.A00, true, false, this.A01);
        }
        C14030oh.A0A(1512760609, A032);
        C14030oh.A0A(-647594029, A03);
    }
}
