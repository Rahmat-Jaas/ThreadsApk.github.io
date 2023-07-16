package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Cx  reason: invalid class name and case insensitive filesystem */
public final class C70164Cx implements C33670HsH {
    public final /* synthetic */ UserSession A00;

    public final void onDismiss() {
    }

    public C70164Cx(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void Bp6(Context context) {
        FragmentActivity A06 = H5O.A01().A06();
        C04220Ms.A06(A06);
        C34552Jz.A00().A01(A06, this.A00, "notification", (String) null, false);
    }
}
