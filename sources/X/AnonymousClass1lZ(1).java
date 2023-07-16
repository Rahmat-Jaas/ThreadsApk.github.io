package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1lZ  reason: invalid class name */
public final class AnonymousClass1lZ extends FR1 {
    public long A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ AnonymousClass44X A02;
    public final /* synthetic */ AnonymousClass265 A03;

    public final int getRunnableId() {
        return 262;
    }

    public AnonymousClass1lZ(C10300i6 r1, AnonymousClass44X r2, AnonymousClass265 r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str;
        AnonymousClass44X r2 = this.A02;
        r2.A01 = (AnonymousClass3AB) obj;
        C38040KHr.A01.CWx(new AnonymousClass45A());
        AnonymousClass3AB r5 = r2.A01;
        long currentTimeMillis = System.currentTimeMillis();
        long A012 = AnonymousClass269.A01();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(this.A01), "facebook_first_party_auth"), 607);
        if (AnonymousClass0wJ.A1U(A0I)) {
            double d = (double) currentTimeMillis;
            C18180wK.A1B(A0I, d);
            double d2 = (double) A012;
            AnonymousClass0wJ.A1A(A0I, d, d2);
            AnonymousClass269.A06(A0I, d2);
            A0I.A0Q("has_facebook_session", Boolean.valueOf(AnonymousClass0wJ.A1W(r5)));
            A0I.A0Q("is_facebook_app_installed", Boolean.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())));
            C18180wK.A19(A0I);
            A0I.A0S("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
            C18190wL.A1K(A0I);
            C18180wK.A1G(A0I);
            String str2 = null;
            if (r5 == null) {
                str = null;
            } else {
                str = r5.A01.A01;
            }
            A0I.A0T("sso_package_name", str);
            AnonymousClass265 r0 = this.A03;
            if (r0 != null) {
                str2 = r0.A01;
            }
            C18190wL.A1I(A0I, str2);
            A0I.A0Q("is_internal_build", C18180wK.A0X());
            A0I.Bb4();
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        C566037v r0;
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass44X r6 = this.A02;
        Context context = r6.A00;
        C10300i6 r4 = this.A01;
        AnonymousClass4C1 r3 = AnonymousClass4C1.A00;
        C04220Ms.A0B(r4, 0);
        Boolean bool = (Boolean) C62073Xa.A00(r4, (C62073Xa) AnonymousClass4C1.A01.BKJ(r3, AnonymousClass4C1.A02[0]));
        AnonymousClass3AB r02 = r6.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        return AnonymousClass2OO.A00(context, r4, bool, str);
    }
}
