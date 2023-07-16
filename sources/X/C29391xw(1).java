package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1xw  reason: invalid class name and case insensitive filesystem */
public final class C29391xw extends C18720xk {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29391xw(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        super(i);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, this.A01, C171209wF.A20, this.A02);
        A0Y.A07("promote");
        A0Y.A04();
    }
}
