package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Os  reason: invalid class name and case insensitive filesystem */
public final class C100806Os {
    public static Object A00(AnonymousClass601 r16, C63893iY r17) {
        Object A0d;
        C63893iY r4 = r17;
        List list = r4.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, 1);
        String A0q3 = C18190wL.A0q(list, 2);
        Map map = (Map) list.get(3);
        Object A0B = C63893iY.A0B(r4, 4);
        A0B.getClass();
        List list2 = (List) A0B;
        C109326jp A0R = C18190wL.A0R(list, 5);
        C109326jp A0R2 = C18190wL.A0R(list, 6);
        if (map == null || !map.containsKey("payload")) {
            A0d = C86144wL.A0d();
        } else {
            A0d = map.get("payload");
        }
        AnonymousClass7Ko.A0B(!list2.isEmpty());
        AnonymousClass601 r6 = r16;
        C04220Ms.A0B(r6, 0);
        FragmentActivity A05 = C63913ic.A05(r6);
        Bundle A06 = C18180wK.A06();
        A06.putString("AUTH_METHOD_TYPE", A0q3);
        A06.putString("PAYMENT_TYPE", A0q);
        A06.putString("PAYMENT_LOGGING_ID", A0q2);
        C86154wM.A1D(A06, list2);
        AnonymousClass7Hq.A03(A06, "VERIFY_BIO_TO_PAY");
        HashSet A0u = C18200wM.A0u();
        C86154wM.A1E(A06, new FBPayLoggerData(A0q2, A0q, (String) null, (String) null, A0q2, (String) null, C86104wH.A13(A0u, A0u)));
        AnonymousClass7Kx.A0F(A05, AnonymousClass7Kz.A07().A01(A05).A04(new C107266gT(A06), A0d, C18190wL.A0p(list2, 0)), new IDxObserverShape55S0300000_2_I2(r6, A0R2, A0R, 31));
        return null;
    }
}
