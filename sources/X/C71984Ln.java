package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ln  reason: invalid class name and case insensitive filesystem */
public final class C71984Ln implements C21659By5 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C171799zz A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ C3T A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public final void Bmq() {
    }

    public C71984Ln(Activity activity, C171799zz r2, C11630kW r3, C3T c3t, UserSession userSession, String str, String str2, String str3, boolean z) {
        this.A08 = z;
        this.A04 = userSession;
        this.A00 = activity;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r3;
        this.A07 = str3;
        this.A01 = r2;
        this.A03 = c3t;
    }

    public final void Bmo() {
        if (this.A08) {
            UserSession userSession = this.A04;
            Activity activity = this.A00;
            String str = this.A05;
            String str2 = this.A06;
            C11630kW r1 = this.A02;
            String str3 = this.A07;
            C171799zz r3 = this.A01;
            Bundle A0E = AnonymousClass0wJ.A0E(userSession);
            A0E.putString("media_id", str);
            A0E.putString(I17.A00(133), str2);
            A0E.putString("prior_module", r1.getModuleName());
            A0E.putString("viewer_session_id", str3);
            A0E.putSerializable("camera_entry_point_type", r3);
            C18210wN.A0x(A0E, AnonymousClass25K.STORIES_VIEWER_TOP_PARTICIPANTS_BOTTOMSHEET.toString());
            C63863iT.A0A(activity, A0E, userSession, "prompts_discover_trending");
        }
        C3T c3t = this.A03;
        if (c3t != null) {
            c3t.CeG();
        }
    }
}
