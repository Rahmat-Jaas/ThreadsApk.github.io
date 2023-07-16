package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.4Lu  reason: invalid class name and case insensitive filesystem */
public final class C72034Lu implements C21660By6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C84404t5 A04;
    public final /* synthetic */ C307722x A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ JSONObject A07;

    public final void BuI() {
    }

    public C72034Lu(Context context, C13330nS r2, UserSession userSession, User user, C84404t5 r5, C307722x r6, String str, JSONObject jSONObject) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r2;
        this.A06 = str;
        this.A07 = jSONObject;
        this.A05 = r6;
        this.A03 = user;
        this.A04 = r5;
    }

    public final void BuH() {
        UserSession userSession = this.A02;
        Context context = this.A00;
        C13330nS r1 = this.A01;
        String str = this.A06;
        JSONObject jSONObject = this.A07;
        C61913Wi.A01(context, r1, (C37383Jqm) null, (C37032Jj9) null, userSession, this.A03, this.A04, this.A05, str, jSONObject);
    }
}
