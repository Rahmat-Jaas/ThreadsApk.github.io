package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1ud  reason: invalid class name and case insensitive filesystem */
public final class C28581ud extends AnonymousClass9UH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28581ud(Activity activity, C12560m7 r2, C11630kW r3, UserSession userSession, User user, String str, String str2) {
        super(r2);
        this.A05 = str;
        this.A03 = user;
        this.A01 = r3;
        this.A02 = userSession;
        this.A00 = activity;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(851837239);
        int A033 = C14030oh.A03(-356920776);
        String str = ((AnonymousClass1SZ) obj).A00;
        String str2 = this.A05;
        User user = this.A03;
        String id = user.getId();
        C11630kW r5 = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass3iG.A0A(r5, userSession, str2, id, str);
        Bundle A06 = C18180wK.A06();
        A06.putString("android.intent.extra.TEXT", str);
        AnonymousClass3iG.A02(this.A00, A06, r5, userSession, user, str, this.A04);
        C63673i6.A0A(r5, userSession, str2, "live_action_sheet", "system_share_sheet", str);
        C14030oh.A0A(1472368949, A033);
        C14030oh.A0A(-1072322573, A032);
    }

    public final void onFail(AnonymousClass3XX r10) {
        int A032 = C14030oh.A03(1785885196);
        UserSession userSession = this.A02;
        C11630kW r3 = this.A01;
        String str = this.A05;
        C63673i6.A09(r3, userSession, str, "live_action_sheet", "system_share_sheet", r10.A01);
        AnonymousClass3iG.A0A(r3, userSession, str, this.A03.getId(), (String) null);
        C14030oh.A0A(-1524273916, A032);
    }
}
