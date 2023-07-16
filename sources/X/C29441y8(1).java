package X;

import android.app.Activity;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.1y8  reason: invalid class name and case insensitive filesystem */
public final class C29441y8 extends C18730xl {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C171209wF A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29441y8(Activity activity, UserSession userSession, C171209wF r3, String str, int i) {
        super(i);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, this.A01, this.A02, this.A03);
        A0Y.A07(CRA.__redex_internal_original_name);
        A0Y.A04();
    }
}
