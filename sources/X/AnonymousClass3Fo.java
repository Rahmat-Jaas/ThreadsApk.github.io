package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.api.base.IDxACallbackShape1S0210000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Fo  reason: invalid class name */
public final class AnonymousClass3Fo {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final C82394pY A03 = C18220wO.A0P(this, 1);
    public final UserSession A04;

    public final void A00(FragmentActivity fragmentActivity, boolean z) {
        if (this.A02) {
            this.A02 = false;
            UserSession userSession = this.A04;
            C04220Ms.A0B(userSession, 1);
            XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.LOGIN_INFO;
            IDxACallbackShape1S0210000_1_I2 iDxACallbackShape1S0210000_1_I2 = new IDxACallbackShape1S0210000_1_I2(0, fragmentActivity, this, z);
            try {
                C32165H8c A002 = AnonymousClass2D0.A00(new KtCSuperShape0S0100000_I2(xFBFXIGPCEntryPoint), userSession);
                A002.A00 = iDxACallbackShape1S0210000_1_I2;
                C31155GhB.A03(A002);
            } catch (Exception e) {
                C63003bJ.A01(userSession, xFBFXIGPCEntryPoint, e);
            }
        }
    }

    public AnonymousClass3Fo(UserSession userSession) {
        this.A04 = userSession;
    }
}
