package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hX  reason: invalid class name */
public final class AnonymousClass1hX extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C83754rw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass1hX(Context context, UserSession userSession, C83754rw r3, String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(-636012745);
        C63813iO.A03(this.A00, "presence_settings_failed", 2131831662, 0);
        this.A02.Bxq();
        C14030oh.A0A(-451204943, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = C14030oh.A03(-507128856);
        AnonymousClass1T9 r6 = (AnonymousClass1T9) obj;
        int A033 = C14030oh.A03(1330334790);
        if (r6 == null) {
            onFail(new AnonymousClass3XX((Object) null));
            i = 196433934;
        } else {
            String str = this.A03;
            if (str.equals("copresence_disabled")) {
                C28161tl A012 = AnonymousClass3WS.A01(this.A01);
                boolean z = this.A04;
                AnonymousClass0wJ.A13(C28161tl.A02(A012), "is_copresence_enabled", z);
                this.A02.CNS(!r6.A01, z);
            } else if (str.equals("disabled")) {
                boolean z2 = this.A04;
                UserSession userSession = this.A01;
                C62423Zt.A02(userSession);
                AnonymousClass3WS.A01(userSession).A0O(z2);
                this.A02.CNS(z2, !r6.A00);
            }
            i = 404096449;
        }
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-372811829, A032);
    }
}
