package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42f  reason: invalid class name and case insensitive filesystem */
public final class C680942f implements C39528KvC {
    public final /* synthetic */ C34620Ibt A00;
    public final /* synthetic */ KFB A01;

    public C680942f(C34620Ibt ibt, KFB kfb) {
        this.A00 = ibt;
        this.A01 = kfb;
    }

    public final void onComplete() {
        C34620Ibt ibt = this.A00;
        FragmentActivity requireActivity = ibt.requireActivity();
        UserSession userSession = ibt.A0J;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        }
        String str = this.A01.A0B;
        if (str != null) {
            Bundle A06 = C18180wK.A06();
            A06.putString("paymentAccountID", str);
            AnonymousClass4u1.A01(A06, requireActivity, userSession, "wizardName", "PAY_NOW");
            return;
        }
        throw C18180wK.A0a("ad account ID should not be null, if payment_anomaly is not null");
    }
}
