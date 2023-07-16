package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;

/* renamed from: X.3XQ  reason: invalid class name */
public final class AnonymousClass3XQ {
    public static final C70424Ek A00 = new C70424Ek(new C70414Ej(new KtSLambdaShape0S0000000_I2(27, (C146958n9) null)));
    public static final C70424Ek A01 = C70424Ek.A00(32);
    public static final C70424Ek A02 = C70424Ek.A00(33);
    public static final C70424Ek A03 = C70424Ek.A00(34);
    public static final C70424Ek A04 = C70424Ek.A00(35);
    public static final C70424Ek A05 = C70424Ek.A00(36);
    public static final C70424Ek A06 = C70424Ek.A00(37);
    public static final C70424Ek A07 = C70424Ek.A00(38);
    public static final C70424Ek A08 = C70424Ek.A00(39);
    public static final C70424Ek A09 = C70424Ek.A00(40);
    public static final AnonymousClass0ZU A0A = C76354dt.A00;

    public static final C34640IcN A00(FragmentActivity fragmentActivity) {
        List A042 = fragmentActivity.getSupportFragmentManager().A0T.A04();
        C04220Ms.A06(A042);
        int size = A042.size() - 1;
        C34640IcN icN = null;
        while (size >= 0) {
            Fragment fragment = (Fragment) A042.get(size);
            if (fragment instanceof C34640IcN) {
                icN = (C34640IcN) fragment;
            }
            size--;
            if (icN != null) {
                break;
            }
        }
        return icN;
    }
}
