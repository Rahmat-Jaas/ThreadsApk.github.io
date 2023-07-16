package X;

import android.view.View;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape46S0200000_I2_7;

/* renamed from: X.6Oj  reason: invalid class name and case insensitive filesystem */
public final class C100716Oj {
    public static Object A00(AnonymousClass601 r12, C63893iY r13) {
        UserSession A0J = C63913ic.A0J(r12);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, A0J, 36310868996129039L)) {
            return null;
        }
        List list = r13.A00;
        C127397h3 A0S = C86164wN.A0S(list, 0);
        String A0q = C18190wL.A0q(list, 1);
        String A0q2 = C18190wL.A0q(list, 2);
        C130667qT A08 = C63913ic.A08(r12);
        C04220Ms.A0B(r12, 0);
        C30938GbW A0I = C63913ic.A0I(C63913ic.A0D(r12));
        if (A0S == null || A0q == null) {
            return null;
        }
        AnonymousClass3HX r3 = r12.A00;
        C18230wP.A1R(A08, 4, A0J);
        KtLambdaShape46S0200000_I2_7 ktLambdaShape46S0200000_I2_7 = new KtLambdaShape46S0200000_I2_7(29, A0J, A08);
        Map map = C103326Yt.A00;
        C108446iN r8 = (C108446iN) map.get(A08);
        if (r8 == null) {
            r8 = new C108446iN(A0I);
            map.put(A08, r8);
            A08.A04(new IDxLListenerShape21S0300000_2_I2(4, (Object) A08, (Object) ktLambdaShape46S0200000_I2_7, (Object) r8));
        }
        String A0N = AnonymousClass00U.A0N(A0q, A0S.A0M(), Rfc3492Idn.delimiter);
        View A0J2 = A0S.A0J(r3);
        if (A0J2 == null || r8.A01.containsKey(A0N)) {
            return null;
        }
        C132737uQ r5 = new C132737uQ(A0J2, A0S, r8, A0N, A0q, A0q2);
        C30938GbW gbW = r8.A00;
        if (gbW == null) {
            return null;
        }
        Unit unit = Unit.A00;
        C37021Jix A00 = C37284Jnx.A00(unit, unit, String.valueOf(A0J2.getId()));
        A00.A01(r5);
        gbW.A03(A0J2, A00.A02());
        return null;
    }
}
