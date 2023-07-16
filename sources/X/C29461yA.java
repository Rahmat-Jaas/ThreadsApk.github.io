package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1yA  reason: invalid class name and case insensitive filesystem */
public final class C29461yA extends C18730xl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29461yA(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, String str, String str2, String str3, int i) {
        super(i);
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A02;
        C11630kW r3 = this.A01;
        AnonymousClass3WB.A00(r3, userSession, this.A04, this.A05, this.A03, "learn_more");
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, userSession, C171209wF.A0M, "https://help.instagram.com/1022082264667994");
        A0Y.A07(r3.getModuleName());
        A0Y.A04();
    }
}
