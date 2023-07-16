package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Bv  reason: invalid class name and case insensitive filesystem */
public final class C70004Bv implements C83564rc {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C70004Bv(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onFailure() {
        C63813iO.A07(this.A00);
    }

    public final void onSuccess() {
        C35442Nl.A00(this.A00, this.A01);
    }
}
