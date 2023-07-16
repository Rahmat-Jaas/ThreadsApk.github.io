package X;

import com.facebook.redex.IDxPObserverShape271S0200000_2_I2;
import com.fbpay.ptt.impl.Ptt;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.76p  reason: invalid class name and case insensitive filesystem */
public final class C1197276p {
    public final C107416gi A00;
    public final AnonymousClass5k3 A01;
    public final Executor A02;
    public final C143688h9 A03;
    public final C110356lY A04;
    public final C107436gk A05;

    public static void A00(Ptt ptt, C1197276p r9, C105016ck r10, Map map, Executor executor) {
        C1197276p r6 = r9;
        C105016ck r7 = r10;
        try {
            String createPtt = ptt.createPtt(new JSONObject(map).toString());
            C107436gk r4 = r9.A05;
            createPtt.getClass();
            ((C145388kQ) r4.A00.apply(new AnonymousClass79P(createPtt, r4.A01))).A6o(new IDxPObserverShape271S0200000_2_I2(2, new C109836kh(ptt, r9, r10, executor), r4));
        } catch (IllegalArgumentException e) {
            executor.execute(new AnonymousClass835(r6, r7, (Object) null, (String) null, e));
        }
    }

    public C1197276p(C143688h9 r1, C110356lY r2, C107416gi r3, AnonymousClass5k3 r4, C107436gk r5, Executor executor) {
        this.A00 = r3;
        this.A05 = r5;
        this.A02 = executor;
        this.A01 = r4;
        this.A04 = r2;
        this.A03 = r1;
    }
}
