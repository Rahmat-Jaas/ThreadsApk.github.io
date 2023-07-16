package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxDListenerShape328S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.3jd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64113jd implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ C37383Jqm A02;
    public final /* synthetic */ C37032Jj9 A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ C84404t5 A06;
    public final /* synthetic */ C307722x A07;
    public final /* synthetic */ JSONObject A08;

    public /* synthetic */ C64113jd(Context context, C13330nS r2, C37383Jqm jqm, C37032Jj9 jj9, UserSession userSession, User user, C84404t5 r7, C307722x r8, JSONObject jSONObject) {
        this.A01 = r2;
        this.A07 = r8;
        this.A05 = user;
        this.A04 = userSession;
        this.A08 = jSONObject;
        this.A02 = jqm;
        this.A03 = jj9;
        this.A00 = context;
        this.A06 = r7;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C13330nS r8 = this.A01;
        C307722x r11 = this.A07;
        User user = this.A05;
        UserSession userSession = this.A04;
        JSONObject jSONObject = this.A08;
        C37383Jqm jqm = this.A02;
        C37032Jj9 jj9 = this.A03;
        Context context = this.A00;
        C84404t5 r4 = this.A06;
        C63773iK.A06(r8, r11, "click", "optimistic_restrict_learn_more_button", user.getId());
        dialogInterface.dismiss();
        AnonymousClass1dG A002 = C36480JXd.A02.A01().A00(user.B4M(), userSession, r11, user.getId(), user.BK7(), jSONObject, true, false);
        if (jqm == null || jj9 == null) {
            IDxDListenerShape328S0100000_1_I2 iDxDListenerShape328S0100000_1_I2 = new IDxDListenerShape328S0100000_1_I2(r4, 10);
            C37032Jj9 A0L = C18210wN.A0L(userSession);
            A0L.A0J = iDxDListenerShape328S0100000_1_I2;
            C18200wM.A16(context, A002, A0L);
            return;
        }
        jj9.A0I = A002;
        jqm.A09(A002, jj9);
    }
}
