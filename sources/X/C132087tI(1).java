package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import kotlin.Pair;

/* renamed from: X.7tI  reason: invalid class name and case insensitive filesystem */
public final class C132087tI implements AnonymousClass0i4 {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final void onSessionWillEnd() {
        this.A01 = 0;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = 0;
        this.A05 = false;
    }

    public final void A00(Activity activity, UserSession userSession) {
        String str;
        String str2;
        String str3;
        boolean A1Y = AnonymousClass0wJ.A1Y(activity, userSession);
        if (this.A00 == 0) {
            long j = this.A01;
            if (j >= 5000 && (str = this.A02) != null && (str2 = this.A03) != null && (str3 = this.A04) != null && AnonymousClass3IR.A00 != null) {
                Pair A0p = C18180wK.A0p("time_spent", String.valueOf(((float) j) / ((float) 1000)));
                if (str != null) {
                    Pair A0p2 = C18180wK.A0p("merchant_id", str);
                    if (str2 != null) {
                        Pair A0p3 = C18180wK.A0p("merchant_name", str2);
                        if (str3 != null) {
                            C50202sc.A00().A00(activity, userSession, "530613820963047", AnonymousClass4WJ.A0H(A0p, A0p2, A0p3, C18180wK.A0p("shopping_session_id", str3), C18180wK.A0p("search_action_completed", String.valueOf(this.A05))));
                            this.A01 = 0;
                            this.A02 = null;
                            this.A03 = null;
                            this.A04 = null;
                            this.A00 = A1Y ? 1 : 0;
                            this.A05 = A1Y;
                            return;
                        }
                        throw C18190wL.A0a("Required value was null.");
                    }
                    throw C18190wL.A0a("Required value was null.");
                }
                throw C18190wL.A0a("Required value was null.");
            }
        }
    }
}
