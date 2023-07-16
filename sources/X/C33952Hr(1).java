package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2Hr  reason: invalid class name and case insensitive filesystem */
public final class C33952Hr {
    public static Object A00(AnonymousClass601 r9, C63893iY r10) {
        C04220Ms.A0B(r9, 0);
        C10300i6 A0F = C63913ic.A0F(r9);
        if (!(A0F instanceof UserSession)) {
            return null;
        }
        UserSession A02 = C05030Qo.A02(A0F);
        FragmentActivity A05 = C63913ic.A05(r9);
        String obj = C63893iY.A07(r10).toString();
        IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(2, r9, C63893iY.A06(r10, 1));
        User A0P = C18210wN.A0P(A02, obj);
        if (A0P != null) {
            C25791Ds4.A00(A05, (C15680ri) null, iDxACallbackShape35S0200000_1_I2, (BKU) null, (C20066BMj) null, A02, A0P);
            return null;
        }
        AnonymousClass3Y8.A02.A00(A02, new C72104Mf(A05, iDxACallbackShape35S0200000_1_I2, A02), obj);
        return null;
    }
}
