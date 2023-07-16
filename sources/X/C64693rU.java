package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rU  reason: invalid class name and case insensitive filesystem */
public final class C64693rU implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ C61743Ve A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass3TG A04;
    public final /* synthetic */ String A05;

    public C64693rU(FragmentActivity fragmentActivity, C11630kW r2, C61743Ve r3, UserSession userSession, AnonymousClass3TG r5, String str) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = str;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(2046141235);
        C61743Ve r4 = this.A02;
        C61743Ve.A00(this.A00, this.A01, r4, this.A03, this.A04, (String) null, this.A05, 2);
        C14030oh.A0C(1992139274, A052);
    }
}
