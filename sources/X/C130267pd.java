package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.7pd  reason: invalid class name and case insensitive filesystem */
public final class C130267pd implements C39764KzY {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C130267pd(FragmentActivity fragmentActivity, AnonymousClass601 r2, C109326jp r3, C109326jp r4, UserSession userSession, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A04 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final void CRL() {
        C86124wJ.A1Q(this.A01, this.A02, "Failed to acquire access token");
    }

    public final void CXi(String str) {
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass601 r6 = this.A01;
        UserSession userSession = this.A04;
        new C112536pl(fragmentActivity, new C133817wV(r6, this.A03, this.A02), userSession).A00(this.A05, this.A06, str);
    }

    public final void CXj() {
        C86124wJ.A1Q(this.A01, this.A02, "Failed to acquire access token");
    }
}
