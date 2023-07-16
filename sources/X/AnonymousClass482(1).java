package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.482  reason: invalid class name */
public final class AnonymousClass482 implements C144608im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ UserSession A05;

    public AnonymousClass482(Activity activity, Fragment fragment, AnonymousClass601 r3, C109326jp r4, C109326jp r5, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A05 = userSession;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final void CAi(Map map) {
        C61043Rr r3;
        C109326jp r2;
        if (C971568d.GRANTED.equals(map.get("android.permission.READ_CONTACTS"))) {
            Activity activity = this.A00;
            LinkedHashMap A022 = AnonymousClass3WE.A02(activity);
            AnonymousClass06E A002 = AnonymousClass06E.A00(this.A01);
            String A012 = AnonymousClass3WE.A01(A022);
            UserSession userSession = this.A05;
            Boolean A0X = C18180wK.A0X();
            C31155GhB.A01(activity, A002, AnonymousClass3Zx.A00(activity, userSession, A0X, A0X, A012, "find_friends_contacts", "ci"));
            r3 = new C61043Rr(this.A02);
            r2 = this.A04;
        } else {
            r3 = new C61043Rr(this.A02);
            r2 = this.A03;
        }
        C61043Rr.A00(r3.A00, C63893iY.A01, r2);
    }
}
