package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Lm  reason: invalid class name and case insensitive filesystem */
public final class C71974Lm implements C21659By5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C84164se A02;
    public final /* synthetic */ C696249i A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public final void Bmq() {
    }

    public C71974Lm(Context context, FragmentActivity fragmentActivity, C84164se r3, C696249i r4, UserSession userSession, String str) {
        this.A04 = userSession;
        this.A03 = r4;
        this.A05 = str;
        this.A02 = r3;
        this.A01 = fragmentActivity;
        this.A00 = context;
    }

    public final void Bmo() {
        String str;
        String str2;
        boolean z;
        C209416t A042;
        AnonymousClass20N r1;
        C320129v r3 = C320129v.DEFAULT_PRIVACY_CONSENT_BOTTOMSHEET_DISMISS_CLICK;
        UserSession userSession = this.A04;
        C696249i r2 = this.A03;
        AnonymousClass21z r0 = null;
        if (r2.A04() != null) {
            C209416t A043 = r2.A04();
            if (A043 != null) {
                r1 = A043.A02;
            } else {
                r1 = null;
            }
            str = String.valueOf(r1);
        } else {
            str = "";
        }
        C209416t A044 = r2.A04();
        if (A044 != null) {
            str2 = A044.A04;
        } else {
            str2 = null;
        }
        String str3 = this.A05;
        boolean A002 = C62183Xq.A00(userSession);
        C209416t A045 = r2.A04();
        if (A045 != null) {
            z = A045.A05;
        } else {
            z = false;
        }
        C209416t A046 = r2.A04();
        if (A046 != null) {
            r0 = A046.A01;
        }
        C59693Lv.A01(r3, userSession, str, str2, str3, String.valueOf(r0), false, A002, z);
        C209416t A047 = r2.A04();
        if (A047 != null) {
            if (!A047.A00 && C63073bQ.A02(A047) && (A042 = r2.A04()) != null) {
                A042.A00 = true;
            }
            this.A02.A4q();
            r2.A08(this.A01, this.A00, str3);
        }
    }
}
