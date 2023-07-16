package kotlin.jvm.internal;

import X.AnonymousClass019;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass67E;
import X.C04220Ms;
import X.C104236bS;
import X.C112356pR;
import X.C34588IbI;
import kotlin.Unit;

public class IDxRImplShape195S0000000_2_I2 extends AnonymousClass019 implements AnonymousClass0YP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxRImplShape195S0000000_2_I2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.IbI> r3 = X.C34588IbI.class
            java.lang.String r4 = "toggleSwitch"
            java.lang.String r5 = "toggleSwitch(Ljava/lang/String;Z)V"
        L_0x000b:
            r1 = 2
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.6pR> r3 = X.C112356pR.class
            java.lang.String r4 = "setState"
            java.lang.String r5 = "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V"
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxRImplShape195S0000000_2_I2.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            String str = (String) obj;
            boolean A1X = AnonymousClass0wJ.A1X(obj2);
            C04220Ms.A0B(str, 0);
            C34588IbI ibI = (C34588IbI) this.receiver;
            if (str.equals("CONTACT_AUTOFILL")) {
                C34588IbI.A05(ibI, A1X);
            }
        } else {
            AnonymousClass67E r4 = (AnonymousClass67E) obj;
            C104236bS r5 = (C104236bS) obj2;
            AnonymousClass0wJ.A1N(r4, r5);
            ((C112356pR) this.receiver).A00(r5, r4);
        }
        return Unit.A00;
    }
}
