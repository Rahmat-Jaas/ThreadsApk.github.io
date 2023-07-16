package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: X.4JU  reason: invalid class name */
public final class AnonymousClass4JU implements C83714rr {
    public static final EnumSet A03 = EnumSet.of(AnonymousClass268.A0E, new AnonymousClass268[]{AnonymousClass268.A07, AnonymousClass268.A0I, AnonymousClass268.A0S, AnonymousClass268.A0T, AnonymousClass268.A0H, AnonymousClass268.A05});
    public WeakReference A00;
    public final UserSession A01;
    public final String A02;

    public final C82924qU AlJ(AnonymousClass268 r6) {
        String str;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A00.get();
        if (fragmentActivity == null) {
            AnonymousClass44Y A022 = C36622Sa.A00().A02(this.A01);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A022, A022.A00), "ig_qp_action_without_activity"), 1404);
            if (r6 == null || (str = r6.name()) == null) {
                str = "unknown";
            }
            A0I.A0T("action_name", str);
            A0I.Bb4();
        } else {
            if (r6 == null) {
                r6 = AnonymousClass268.A0E;
            }
            switch (AnonymousClass31H.A00[r6.ordinal()]) {
                case 1:
                    return new C71014He(fragmentActivity, this.A01);
                case 2:
                    return new AnonymousClass4JH(fragmentActivity, AnonymousClass06E.A00(fragmentActivity), this.A01);
                case 3:
                case 4:
                    return new AnonymousClass4JM(fragmentActivity, this.A01, this.A02);
                case 5:
                    return new AnonymousClass4I6(fragmentActivity, this.A01);
                case 6:
                    return new BPU(fragmentActivity, this.A01);
                case 7:
                    break;
                default:
                    throw C18190wL.A0a(AnonymousClass00U.A0L("Don't have a handler for ", r6.toString()));
            }
        }
        return null;
    }

    public final EnumSet BF6() {
        return A03;
    }

    public AnonymousClass4JU(FragmentActivity fragmentActivity, C11630kW r3, UserSession userSession) {
        this.A00 = new WeakReference(fragmentActivity);
        this.A01 = userSession;
        this.A02 = r3.getModuleName();
    }
}
