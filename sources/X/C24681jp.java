package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxAListenerShape163S0000000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1jp  reason: invalid class name and case insensitive filesystem */
public class C24681jp extends C19819BBt {
    public boolean A00;
    public final Fragment A01;
    public final Fragment A02;
    public final C11630kW A03;
    public final C82394pY A04 = C18220wO.A0P(this, 81);
    public final C82394pY A05 = C18220wO.A0P(this, 82);
    public final C82394pY A06 = C18220wO.A0P(this, 83);
    public final UserSession A07;
    public final AnonymousClass264 A08;
    public final C83964sH A09;

    public /* synthetic */ C24681jp(Fragment fragment, C11630kW r4, C83474rR r5, UserSession userSession, AnonymousClass264 r7) {
        IDxAListenerShape163S0000000_1_I2 iDxAListenerShape163S0000000_1_I2 = new IDxAListenerShape163S0000000_1_I2(2);
        C04220Ms.A0B(userSession, 1);
        this.A07 = userSession;
        this.A01 = fragment;
        this.A03 = r4;
        this.A08 = r7;
        this.A09 = iDxAListenerShape163S0000000_1_I2;
        this.A02 = fragment.mParentFragment;
        r5.registerLifecycleListener(this);
    }

    public final void A00() {
        if (this instanceof C29561yo) {
            C14020og.A00(((C29561yo) this).A00.A09, 1393977277);
        }
    }

    public final void onCreate() {
        C38039KHq A002 = AnonymousClass3LY.A00(this.A07);
        A002.A01(this.A04, C687545i.class);
        A002.A01(this.A05, AnonymousClass462.class);
        A002.A01(this.A06, C688245p.class);
    }

    public final void onDestroy() {
        C38039KHq A002 = AnonymousClass3LY.A00(this.A07);
        A002.A02(this.A04, C687545i.class);
        A002.A02(this.A05, AnonymousClass462.class);
        A002.A02(this.A06, C688245p.class);
    }
}
