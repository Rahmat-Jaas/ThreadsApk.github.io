package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1y1  reason: invalid class name and case insensitive filesystem */
public final class C29421y1 extends C18720xk {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C58923Id A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29421y1(FragmentActivity fragmentActivity, C58923Id r2, UserSession userSession, String str, String str2, int i) {
        super(i);
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = fragmentActivity;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A02;
        C37741K2b.A01(userSession).A0I(this.A01.A01, this.A03);
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, userSession, C171209wF.A20, this.A04);
        A0Y.A07("promote");
        A0Y.A04();
    }
}
