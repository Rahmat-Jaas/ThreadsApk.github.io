package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;

/* renamed from: X.57q  reason: invalid class name and case insensitive filesystem */
public final class C883357q extends C62793ak {
    public Bundle A00;
    public final M5J A01;
    public final C880756q A02;
    public final C880756q A03;
    public final C880856r A04 = C880856r.A03();
    public final C880856r A05 = C880856r.A03();
    public final AnonymousClass583 A06;

    public static String A00(C883357q r1) {
        String string = r1.A00.getString("PAYMENT_TYPE");
        if (TextUtils.isEmpty(string)) {
            return "fbpay_hub";
        }
        return string;
    }

    public C883357q(AnonymousClass583 r7, C121157Ek r8) {
        C880756q A012 = C880756q.A01();
        this.A03 = A012;
        C880756q A013 = C880756q.A01();
        this.A02 = A013;
        this.A06 = r7;
        M5J A022 = r8.A02();
        this.A01 = A022;
        C880856r.A05(A022, A012, C86114wI.A0Q(this, 213), 277);
        M5J[] m5jArr = {A022, r7.A04, r7.A03, r7.A02};
        IDxObserverShape99S0200000_2_I2 A0O = C86164wN.A0O(A013, m5jArr, 23);
        int i = 0;
        do {
            A013.A0K(m5jArr[i], A0O);
            i++;
        } while (i < 4);
    }
}
