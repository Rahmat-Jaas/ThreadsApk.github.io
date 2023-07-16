package androidx.recyclerview.widget;

import X.AnonymousClass5AD;
import X.AnonymousClass7I7;
import X.C002401c;
import X.C04220Ms;
import X.C108076hm;
import X.C18180wK;
import X.C41014LuD;
import X.C86124wJ;
import X.C86144wL;
import X.C91035fU;
import java.util.List;

public class IDxCallbackShape11S0200000_2_I2 extends C41014LuD {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallbackShape11S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final int A02() {
        List list;
        if (this.A02 != 0) {
            list = (List) this.A01;
        } else {
            list = ((AnonymousClass5AD) this.A00).A03;
        }
        return list.size();
    }

    public final int A03() {
        Object obj;
        if (this.A02 != 0) {
            obj = this.A00;
        } else {
            obj = this.A01;
        }
        return C86144wL.A08(obj);
    }

    public final boolean A04(int i, int i2) {
        if (this.A02 != 0) {
            return C04220Ms.A0I(C86124wJ.A0p(this.A00, i), C86124wJ.A0p(this.A01, i2));
        }
        C108076hm r3 = (C108076hm) C86124wJ.A0p(this.A01, i);
        C108076hm r2 = (C108076hm) ((AnonymousClass5AD) this.A00).A03.get(i2);
        if (!C002401c.A00(r3.A01, r2.A01)) {
            return false;
        }
        C91035fU r32 = r3.A00;
        int i3 = r32.A01;
        C91035fU r22 = r2.A00;
        if (!AnonymousClass7I7.A01(i3, r22.A01) || !AnonymousClass7I7.A01(r32.A00, r22.A00)) {
            return false;
        }
        return true;
    }

    public final boolean A05(int i, int i2) {
        if (this.A02 != 0) {
            return C04220Ms.A0I(C86124wJ.A0p(this.A00, i), C86124wJ.A0p(this.A01, i2));
        }
        return C18180wK.A1W((((long) ((C108076hm) C86124wJ.A0p(this.A01, i)).A01.A02) > ((long) ((C108076hm) ((AnonymousClass5AD) this.A00).A03.get(i2)).A01.A02) ? 1 : (((long) ((C108076hm) C86124wJ.A0p(this.A01, i)).A01.A02) == ((long) ((C108076hm) ((AnonymousClass5AD) this.A00).A03.get(i2)).A01.A02) ? 0 : -1)));
    }
}
