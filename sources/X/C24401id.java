package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.1id  reason: invalid class name and case insensitive filesystem */
public final class C24401id extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C696249i A03;
    public final /* synthetic */ String A04;

    public C24401id(Context context, C696249i r2, String str, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A02 = context;
    }

    public static void A00(C021109v r1, AnonymousClass0A3 r2, int i, int i2, boolean z) {
        r2.A0O(r1, "action_name");
        r2.A0S("old_setting", Long.valueOf((long) i));
        r2.A0S("new_setting", Long.valueOf((long) i2));
        r2.A0Q("has_media_id", Boolean.valueOf(z));
    }

    public final void onFail(AnonymousClass3XX r9) {
        int A032 = C14030oh.A03(443889440);
        C696249i r0 = this.A03;
        int i = this.A00;
        r0.A00 = i;
        C320129v r5 = C320129v.UPDATE_SETTING_FAILURE;
        UserSession userSession = r0.A05;
        int i2 = this.A01;
        boolean A1W = AnonymousClass0wJ.A1W(this.A04);
        USLEBaseShape0S0000000 A07 = USLEBaseShape0S0000000.A07(C13330nS.A02(userSession));
        if (AnonymousClass0wJ.A1U(A07)) {
            A00(r5, A07, i, i2, A1W);
            A07.A0T("exception_message", "update setting failed");
            A07.Bb4();
        }
        C14030oh.A0A(-1835311273, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1677539903);
        int A033 = C14030oh.A03(-858831005);
        C320129v r5 = C320129v.UPDATE_SETTING_SUCCESS;
        UserSession userSession = this.A03.A05;
        int i = this.A00;
        int i2 = this.A01;
        boolean A1W = AnonymousClass0wJ.A1W(this.A04);
        USLEBaseShape0S0000000 A07 = USLEBaseShape0S0000000.A07(C13330nS.A02(userSession));
        if (AnonymousClass0wJ.A1U(A07)) {
            A00(r5, A07, i, i2, A1W);
            A07.Bb4();
        }
        C14030oh.A0A(-1344896068, A033);
        C14030oh.A0A(-1505535849, A032);
    }
}
