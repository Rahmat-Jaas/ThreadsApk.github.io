package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Pi  reason: invalid class name and case insensitive filesystem */
public final class C100956Pi {
    public static final void A00(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, Integer num, List list) {
        AnonymousClass9S0 r4 = (AnonymousClass9S0) ktCSuperShape0S0200000_I2.A01;
        Integer num2 = r4.A05;
        Integer num3 = AnonymousClass006.A0C;
        if (num2 != num3 && r4.A04 == num) {
            list.add(r4);
            KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = (KtCSuperShape0S0300000_I2) ktCSuperShape0S0200000_I2.A00;
            AnonymousClass5IG r2 = (AnonymousClass5IG) ktCSuperShape0S0300000_I2.A00;
            if (r2.A07) {
                String str = r4.A08;
                list.add(new AnonymousClass5y9(AnonymousClass006.A01, r2.A03, str, r2.A04, r2.A01));
            }
            list.addAll((Collection) ktCSuperShape0S0300000_I2.A02);
            Iterator A0q = C86154wM.A0q(ktCSuperShape0S0300000_I2.A01);
            while (A0q.hasNext()) {
                AnonymousClass9S0 r1 = (AnonymousClass9S0) A0q.next();
                if (r1.A05 != num3) {
                    list.add(r1);
                }
            }
            if (r2.A06) {
                String str2 = r4.A08;
                list.add(new AnonymousClass5y9(AnonymousClass006.A00, r2.A02, str2, r2.A05, r2.A00));
            }
        }
    }
}
