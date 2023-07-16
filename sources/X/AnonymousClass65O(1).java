package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.65O  reason: invalid class name */
public final class AnonymousClass65O extends C18730xl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65O(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, String str, String str2, String str3, String str4, int i) {
        super(i);
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = fragmentActivity;
        this.A03 = str4;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A02;
        C11630kW r4 = this.A01;
        AnonymousClass3WB.A00(r4, userSession, this.A05, this.A06, this.A04, "cta_url");
        C37350Jpy jpy = new C37350Jpy((Activity) this.A00, userSession, C171209wF.A0O, this.A03);
        jpy.A07(r4.getModuleName());
        jpy.A04();
    }
}
