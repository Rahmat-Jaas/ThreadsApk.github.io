package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass572;
import X.AnonymousClass7HL;
import X.AnonymousClass7Kx;
import X.C104616c4;
import X.C107276gU;
import X.C110986mb;
import X.C120967Dk;
import X.C120977Dl;
import X.C121157Ek;
import X.C146958n9;
import X.C18250wR;
import X.C30378GBb;
import X.C41253M5p;
import X.C63893iY;
import X.C86104wH;
import X.M11;
import android.util.Pair;
import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;
import java.util.Collection;
import java.util.List;
import kotlin.Function;

public class IDxObjectShape133S0200000_2_I2 implements Function, AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape133S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A02) {
            case 0:
                List list = ((C110986mb) obj).A06;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                int A04 = AnonymousClass0wJ.A04(((Pair) this.A01).second);
                if (A04 >= list.size()) {
                    A04 = C86104wH.A0B(list);
                }
                return list.get(A04);
            case 4:
                AnonymousClass7Kx r7 = (AnonymousClass7Kx) obj;
                if (AnonymousClass7Kx.A0O(r7)) {
                    return AnonymousClass7Kx.A0B((Object) null, r7.A02);
                }
                if (!AnonymousClass7Kx.A0R(r7)) {
                    return AnonymousClass7Kx.A09((Object) null);
                }
                FBPayAuthTicketFragmentImpl fBPayAuthTicketFragmentImpl = ((C107276gU) AnonymousClass7Kx.A0D(r7)).A00;
                AnonymousClass7HL r4 = ((C121157Ek) this.A00).A00.A01;
                for (C120967Dk r2 : ((C120977Dl) this.A01).A08) {
                    if (r2.A05.equalsIgnoreCase(fBPayAuthTicketFragmentImpl.getStringValue("fingerprint"))) {
                        return AnonymousClass7Kx.A0A(r4.A04(fBPayAuthTicketFragmentImpl, r2));
                    }
                }
                throw C18250wR.A0V("Not found!");
            case 5:
                return AnonymousClass7Kx.A07((AnonymousClass7Kx) obj, this, 48);
            case 6:
                return C41253M5p.A01((C41253M5p) this.A00, (C30378GBb) this.A01, (C146958n9) obj);
            case 7:
                return M11.A00((M11) this.A00, (Collection) this.A01, (C146958n9) obj);
            case 8:
            case 9:
                ((AnonymousClass0YY) this.A01).invoke(C63893iY.A0B((C63893iY) obj, 0));
                return null;
            default:
                AnonymousClass572 r0 = (AnonymousClass572) this.A01;
                return r0.A01.A04((C104616c4) obj, r0.A00);
        }
    }
}
