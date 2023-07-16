package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6NI  reason: invalid class name */
public final class AnonymousClass6NI {
    public static final KtCSuperShape0S0110000_I2 A00(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2) {
        KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I2 = (KtCSuperShape0S0302000_I2) ktCSuperShape0S0200000_I2.A01;
        if (ktCSuperShape0S0302000_I2 != null) {
            int ordinal = ((C970767v) ktCSuperShape0S0302000_I2.A03).ordinal();
            if (ordinal == 3) {
                Iterable<AnonymousClass5IJ> iterable = (Iterable) ktCSuperShape0S0302000_I2.A04;
                ArrayList A0x = AnonymousClass0wJ.A0x(iterable, 10);
                for (AnonymousClass5IJ r0 : iterable) {
                    A0x.add(r0.A02);
                }
                return new KtCSuperShape0S0110000_I2((List) A0x, 3, true);
            } else if (ordinal == 1) {
                Iterable<AnonymousClass5IJ> iterable2 = (Iterable) ktCSuperShape0S0302000_I2.A02;
                ArrayList A0x2 = AnonymousClass0wJ.A0x(iterable2, 10);
                for (AnonymousClass5IJ r02 : iterable2) {
                    A0x2.add(r02.A02);
                }
                return new KtCSuperShape0S0110000_I2((List) A0x2, 3, false);
            } else if (ordinal == 0) {
                return new KtCSuperShape0S0110000_I2((List) AnonymousClass0ZV.A00, 3, false);
            } else {
                if (ordinal != 2) {
                    throw AnonymousClass4VZ.A00();
                }
            }
        }
        return new KtCSuperShape0S0110000_I2((List) AnonymousClass0ZV.A00, 3, true);
    }
}
