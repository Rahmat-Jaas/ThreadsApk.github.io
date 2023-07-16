package X;

import com.facebook.redex.IDxComparatorShape302S0100000_1_I2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2FU  reason: invalid class name */
public final class AnonymousClass2FU {
    public static final List A00(Iterable iterable, List list) {
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            A0w.add(AnonymousClass0wJ.A10(next, i));
            i = i2;
        }
        return AnonymousClass00J.A0W(iterable, new IDxComparatorShape302S0100000_1_I2((Object) AnonymousClass4WJ.A0B(A0w), 0));
    }
}
