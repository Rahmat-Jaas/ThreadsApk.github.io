package X;

import com.facebook.redex.IDxObjectShape308S0100000_2_I2;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.logging.FBPayLoggerData;
import java.util.Map;

/* renamed from: X.57v  reason: invalid class name and case insensitive filesystem */
public final class C883857v extends C62793ak {
    public C883057n A00;
    public FormParams A01;
    public C114026sZ A02;
    public final C880756q A03;
    public final C880756q A04;
    public final C880756q A05;
    public final C880856r A06;
    public final C880856r A07 = C880856r.A03();
    public final C880856r A08;
    public final C107346gb A09;
    public final C143688h9 A0A;
    public final C143158gC A0B;
    public final AnonymousClass0YY A0C;

    public static Map A00(C883857v r2, Throwable th) {
        Map r1 = new C013306f();
        FBPayLoggerData fBPayLoggerData = r2.A01.A02;
        if (fBPayLoggerData != null) {
            r1 = C122037Js.A06(fBPayLoggerData);
        }
        String str = r2.A01.A03;
        if (str != null) {
            C86164wN.A1J(AnonymousClass0wJ.A0d(str), r1);
        }
        if (th != null) {
            r1.put("throwable", th);
        }
        return r1;
    }

    public C883857v(C107346gb r8, C143688h9 r9) {
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 232);
        this.A0B = A0Q;
        IDxObjectShape308S0100000_2_I2 iDxObjectShape308S0100000_2_I2 = new IDxObjectShape308S0100000_2_I2((Object) this, 23);
        this.A0C = iDxObjectShape308S0100000_2_I2;
        C880756q A012 = C880756q.A01();
        this.A03 = A012;
        C880856r A032 = C880856r.A03();
        this.A08 = A032;
        C880856r A033 = C880856r.A03();
        this.A06 = A033;
        C880756q A013 = C880756q.A01();
        this.A04 = A013;
        this.A05 = C880756q.A01();
        this.A09 = r8;
        this.A0A = r9;
        M5J A022 = C30821GXg.A02(A032, iDxObjectShape308S0100000_2_I2);
        M5J A023 = C30821GXg.A02(A033, iDxObjectShape308S0100000_2_I2);
        C880856r.A05(A022, A012, this, 233);
        C880856r.A05(A023, A012, this, 234);
        A013.A0K(A022, A0Q);
        A013.A0K(A023, A0Q);
    }
}
