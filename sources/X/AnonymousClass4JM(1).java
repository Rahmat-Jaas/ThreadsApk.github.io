package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JM  reason: invalid class name */
public final class AnonymousClass4JM implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public final void BN1(Uri uri, Bundle bundle) {
        C37412JrW.A06(this.A00, this.A01, C171209wF.A21, (Long) null, uri.toString(), this.A02);
    }

    public AnonymousClass4JM(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }
}
