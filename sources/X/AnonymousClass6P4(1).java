package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebook.redex.IDxObserverShape8S1300000_2_I2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.6P4  reason: invalid class name */
public final class AnonymousClass6P4 {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        Object A0d;
        AnonymousClass601 r3 = r17;
        C63893iY r4 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r3);
        List list = r4.A00;
        String A0q = C18190wL.A0q(list, 0);
        Object A0B = C63893iY.A0B(r4, A1Z ? 1 : 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str = (String) A0B;
        String A0q2 = C18190wL.A0q(list, 2);
        String str2 = (String) C63893iY.A0C(r4, A0h, 3);
        String A0q3 = C18190wL.A0q(list, 5);
        Map map = (Map) list.get(6);
        List A0k = C86164wN.A0k(list, 7);
        C109326jp A0R = C18190wL.A0R(list, 8);
        C109326jp A0R2 = C18190wL.A0R(list, 9);
        FragmentActivity A05 = C63913ic.A05(r3);
        if (A0q == null || A05 == null || map == null || A0q2 == null || A0k == null) {
            C63913ic.A0K(r3, A0R2, new Object[0]);
            return null;
        }
        AnonymousClass573 r5 = (AnonymousClass573) new AnonymousClass7IU(A05).A01(AnonymousClass573.class);
        KtLambdaShape42S0200000_I2_3 ktLambdaShape42S0200000_I2_3 = new KtLambdaShape42S0200000_I2_3(r3, A0R, 33);
        KtLambdaShape20S0200000_I2_4 ktLambdaShape20S0200000_I2_4 = new KtLambdaShape20S0200000_I2_4(r3, A0R2, 35);
        C18190wL.A1S(str, 4, str2);
        Map map2 = r5.A01;
        if (map2.get(A0q) == null) {
            if (map.containsKey("payload")) {
                A0d = map.get("payload");
            } else {
                A0d = C86144wL.A0d();
            }
            C107266gT A02 = AnonymousClass7BN.A02(str, A0q2, (String) null, (String) null, A0k);
            if (A0q3 != null) {
                A02.A00 = (C92885kB) r5.A00.A06(A0q3, C92885kB.class);
            }
            C880856r A03 = C880856r.A03();
            M5J A032 = AnonymousClass7Kz.A07().A01(A05).A03(new IDxFunctionShape152S0200000_2_I2(0, A03, ktLambdaShape42S0200000_I2_3), (C142618fJ) null, A02, A0d, str2);
            A032.A0C(A05, new IDxObserverShape8S1300000_2_I2(ktLambdaShape20S0200000_I2_4, r5, A05, A0q, 0));
            C04220Ms.A05(map2);
            map2.put(A0q, new C107246gR(A032, A03));
        }
        return null;
    }
}
