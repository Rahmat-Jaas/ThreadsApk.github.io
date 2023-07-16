package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hc  reason: invalid class name and case insensitive filesystem */
public final class C24181hc extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ BKH A02;
    public final /* synthetic */ C82954qY A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C24181hc(Context context, C11630kW r2, BKH bkh, C82954qY r4, UserSession userSession, String str, boolean z) {
        this.A01 = r2;
        this.A05 = str;
        this.A04 = userSession;
        this.A02 = bkh;
        this.A03 = r4;
        this.A00 = context;
        this.A06 = z;
    }

    public final void onFail(AnonymousClass3XX r14) {
        String A33;
        int i;
        int A032 = C14030oh.A03(302857530);
        super.onFail(r14);
        C11630kW r6 = this.A01;
        String str = this.A05;
        UserSession userSession = this.A04;
        BKH bkh = this.A02;
        BKU bku = bkh.A0M;
        if (bku == null) {
            A33 = "";
        } else {
            A33 = bku.A33();
        }
        if (bkh.A0H() == null) {
            i = -1;
        } else {
            i = bkh.A0H().A00;
        }
        C62943bB.A04(r6, userSession, str, A33, "one_tap_share", r14.A01, i);
        AnonymousClass2SK.A00(userSession, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "self_story", C25567Do3.A02(userSession).A0K, str);
        C82954qY r4 = this.A03;
        Context context = this.A00;
        r4.Bxd(AnonymousClass24M.NOT_SHARED, bkh);
        C63813iO.A0A(context, 2131835729, 0);
        C14030oh.A0A(1938137912, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A33;
        int i;
        int A032 = C14030oh.A03(1433957780);
        int A033 = C14030oh.A03(-121153653);
        super.onSuccess(obj);
        C11630kW r8 = this.A01;
        String str = this.A05;
        UserSession userSession = this.A04;
        BKH bkh = this.A02;
        BKU bku = bkh.A0M;
        if (bku == null) {
            A33 = "";
        } else {
            A33 = bku.A33();
        }
        if (bkh.A0H() == null) {
            i = -1;
        } else {
            i = bkh.A0H().A00;
        }
        C62943bB.A02(r8, userSession, str, A33, "one_tap_share", i);
        AnonymousClass2SK.A00(userSession, "success", "self_story", C25567Do3.A02(userSession).A0K, str);
        C82954qY r6 = this.A03;
        Context context = this.A00;
        boolean z = this.A06;
        r6.Bxd(AnonymousClass24M.SHARING, bkh);
        if (z) {
            C63813iO.A0A(context, 2131835730, 0);
        }
        C14030oh.A0A(25250952, A033);
        C14030oh.A0A(-321497427, A032);
    }
}
