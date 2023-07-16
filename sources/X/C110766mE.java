package X;

import android.content.Context;
import com.facebookpay.connect.models.ConnectPayload;
import com.instagram.service.session.UserSession;

/* renamed from: X.6mE  reason: invalid class name and case insensitive filesystem */
public final class C110766mE {
    public ConnectPayload A00;
    public final AnonymousClass4x8 A01;
    public final UserSession A02;
    public final C04530Oa A03 = C86104wH.A16(this, 9);
    public final C04530Oa A04 = C86104wH.A16(this, 10);
    public final C04530Oa A05 = C86104wH.A16(this, 11);

    public C110766mE(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A01 = AnonymousClass4x8.A00(context);
        this.A02 = userSession;
    }
}
