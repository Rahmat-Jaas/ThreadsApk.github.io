package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tF  reason: invalid class name and case insensitive filesystem */
public final class C132057tF implements AnonymousClass0i4 {
    public KtCSuperShape0S1000000_I2 A00;
    public E1T A01;
    public String A02 = "";
    public boolean A03;
    public final FragmentActivity A04;
    public final KtCSuperShape0S1000000_I2 A05;
    public final UserSession A06;
    public final String A07;

    public final void onSessionWillEnd() {
        E1T e1t = this.A01;
        if (e1t != null) {
            e1t.A00.A0C();
        }
    }

    public C132057tF(FragmentActivity fragmentActivity, KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2, UserSession userSession, String str) {
        this.A07 = str;
        this.A04 = fragmentActivity;
        this.A06 = userSession;
        this.A05 = ktCSuperShape0S1000000_I2;
    }
}
