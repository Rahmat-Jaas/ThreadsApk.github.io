package X;

import android.os.Handler;
import android.view.View;
import java.util.Map;

/* renamed from: X.42t  reason: invalid class name and case insensitive filesystem */
public final class C682142t implements C84294su {
    public final /* synthetic */ C61783Vj A00;

    public C682142t(C61783Vj r1) {
        this.A00 = r1;
    }

    public final void CGO() {
        C61783Vj r4 = this.A00;
        C34640IcN icN = r4.A02;
        C18190wL.A0M(icN).CtQ((View.OnClickListener) null, false);
        C18190wL.A0M(icN).setIsLoading(false);
        r4.A00 = false;
        if (icN instanceof C29131wm) {
            Handler A0F = AnonymousClass0wJ.A0F();
            C29131wm r3 = (C29131wm) icN;
            r3.getClass();
            A0F.post(new AnonymousClass4Q1(r3));
        }
    }

    public final void CGY() {
        C61783Vj r0 = this.A00;
        r0.A00 = true;
        C34640IcN icN = r0.A02;
        C18190wL.A0M(icN).CtQ((View.OnClickListener) null, true);
        C18190wL.A0M(icN).setIsLoading(true);
    }

    public final void CGg(AnonymousClass266 r14) {
        int i = 2131836495;
        if (r14 == AnonymousClass266.A05) {
            i = 2131836497;
        }
        C61783Vj r4 = this.A00;
        C34640IcN icN = r4.A02;
        C63813iO.A03(icN.getContext(), "switch_to_business_failed", i, 0);
        r4.A03.Bdx(new C37408JrQ("switch_professional_account_type", "setting", "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        if (icN instanceof C29201xU) {
            Handler A0F = AnonymousClass0wJ.A0F();
            C29201xU r3 = (C29201xU) icN;
            r3.getClass();
            A0F.post(new AnonymousClass4Q3(r3));
        }
    }

    public final void CGJ(String str, String str2, String str3) {
        C63813iO.A0F(str);
        this.A00.A03.Bdy(new C37408JrQ("switch_professional_account_type", "setting", "continue", str2, str3, (Map) null, (Map) null, (Map) null));
    }
}
