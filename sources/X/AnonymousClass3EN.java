package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDxRImplShape194S0000000_1_I2;

/* renamed from: X.3EN  reason: invalid class name */
public final class AnonymousClass3EN {
    public final /* synthetic */ AnonymousClass3ZF A00;

    public AnonymousClass3EN(AnonymousClass3ZF r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A00(Context context) {
        C61163Sd r0;
        AnonymousClass3ZF r6 = this.A00;
        C81464nq r3 = r6.A01;
        Map map = r6.A02;
        AnonymousClass2O6 A002 = AnonymousClass2O5.A00(r3, ServerW3CShippingAddressConstants.DEFAULT, map);
        if (!(A002 instanceof AnonymousClass1pD)) {
            C86024w9 r1 = r6.A05;
            AnonymousClass0A5[] r7 = AnonymousClass3ZF.A06;
            double doubleValue = ((Number) r6.A03.BKJ(r6, r7[1])).doubleValue();
            AnonymousClass3YK r14 = new AnonymousClass3YK((AnonymousClass34V) r6.A04.BKJ(r6, r7[2]), r6.A00, (String) r1.BKJ(r6, r7[0]), map, doubleValue);
            String str = r14.A09;
            Context context2 = context;
            r14.A00 = (int) (C18190wL.A08(new IDxRImplShape194S0000000_1_I2(r14, 1).invoke(str, context2)) % ((long) 10000));
            List<C61163Sd> list = r14.A07.A00;
            int i = 0;
            int i2 = 0;
            for (C61163Sd r11 : list) {
                i += (int) (((double) 10000) * r14.A06 * r11.A00);
                if (r14.A00 >= i) {
                    i2++;
                }
            }
            if (i <= 10000) {
                r14.A01 = i;
                r14.A05 = new C61163Sd("Deploy: Not in Experiment", r14.A0A, ((double) (10000 - i)) / 10000.0d);
                r14.A03 = new AnonymousClass34U(C09120et.A3D.A01(C18230wP.A09(context2)));
                if (i2 < list.size()) {
                    r0 = (C61163Sd) list.get(i2);
                } else {
                    r0 = r14.A05;
                    if (r0 == null) {
                        C04220Ms.A0E("deployGroup");
                        throw null;
                    }
                }
                r14.A04 = r0;
                Map map2 = C60913Rb.A00;
                if (map2.get(r3) != null) {
                    throw C18180wK.A0a("Only one experiment can be registered per contract");
                }
                Map map3 = C60913Rb.A01;
                if (map3.get(str) != null) {
                    throw C18180wK.A0a(AnonymousClass00U.A0L("An experiment is already registered under the name ", str));
                }
                map2.put(r3, r14);
                map3.put(str, r14);
                return;
            }
            throw C18190wL.A0a("Total group size exceeds number of segments.");
        }
        throw C18180wK.A0a(A002.toString());
    }
}
