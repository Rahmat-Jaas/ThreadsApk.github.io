package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Cy  reason: invalid class name and case insensitive filesystem */
public final class C70174Cy implements C33670HsH {
    public final /* synthetic */ DirectShareTarget A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void Bp6(Context context) {
        C04220Ms.A0B(context, 0);
        C50642tK.A00(new C15720rm(this.A02), this.A01, "reply_modal", C18180wK.A0n(this.A00));
        throw null;
    }

    public final void onDismiss() {
    }

    public C70174Cy(DirectShareTarget directShareTarget, UserSession userSession, String str) {
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = directShareTarget;
    }
}
