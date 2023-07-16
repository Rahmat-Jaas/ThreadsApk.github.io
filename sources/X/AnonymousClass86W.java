package X;

import com.facebookpay.widget.navibar.NavigationBar;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

/* renamed from: X.86W  reason: invalid class name */
public abstract class AnonymousClass86W implements C86024w9 {
    public Object A00;

    public abstract void A02(Object obj, Object obj2, AnonymousClass0A5 r3);

    public final void CrD(Object obj, Object obj2, AnonymousClass0A5 r4) {
        C04220Ms.A0B(r4, 1);
        Object obj3 = this.A00;
        this.A00 = obj2;
        A02(obj3, obj2, r4);
    }

    public static NavigationBar A00(IDxOPropertyShape881S0100000_2_I2 iDxOPropertyShape881S0100000_2_I2) {
        return ((AnonymousClass5qq) iDxOPropertyShape881S0100000_2_I2.A00).A06;
    }

    public static IDxOPropertyShape881S0100000_2_I2 A01(Object obj, int i) {
        return new IDxOPropertyShape881S0100000_2_I2(obj, i);
    }

    public AnonymousClass86W(Object obj) {
        this.A00 = obj;
    }

    public final Object BKJ(Object obj, AnonymousClass0A5 r3) {
        return this.A00;
    }
}
