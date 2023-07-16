package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape875S0100000_1_I2;
import java.util.Map;

/* renamed from: X.1jH  reason: invalid class name */
public final class AnonymousClass1jH extends C30814GWv {
    public final /* synthetic */ C62743ad A00;

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C62743ad r3 = this.A00;
        r3.A08.A02();
        FragmentActivity fragmentActivity = r3.A03;
        C04220Ms.A0C(fragmentActivity, "null cannot be cast to non-null type android.content.Context");
        String str = r3.A0A;
        Map map = r3.A0C;
        C04220Ms.A0C(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        M4x.A00(fragmentActivity, new C210718u(r3.A06), str, (String) null, map, 0).A6p(new IDxObserverShape875S0100000_1_I2(r3, 1));
    }

    public AnonymousClass1jH(C62743ad r1) {
        this.A00 = r1;
    }

    public final void A04() {
        C25745DrH drH;
        C62743ad r1 = this.A00;
        if (!r1.A02 && (drH = r1.A07) != null && !((C35189Ipf) drH).A0M) {
            r1.A02 = true;
            C62743ad.A02(r1);
        }
    }

    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        return null;
    }
}
