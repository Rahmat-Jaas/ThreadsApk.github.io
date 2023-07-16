package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import java.util.List;

/* renamed from: X.0zp  reason: invalid class name and case insensitive filesystem */
public final class C19410zp extends C62793ak {
    public final C86074wE A00;
    public final C86094wG A01;
    public final List A02;

    public C19410zp(C312624x r3, boolean z) {
        C312624x r0;
        AnonymousClass8AN r1 = new AnonymousClass8AN();
        if (z) {
            r0 = C312624x.ONE_MONTH;
        } else {
            r0 = C312624x.INDEFINITE;
        }
        r1.add(r0);
        r1.add(C312624x.ONE_WEEK);
        r1.add(C312624x.ONE_DAY);
        AnonymousClass0OP.A11(r1);
        this.A02 = r1;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0200000_I2(r3, (List) r1));
        this.A00 = A0z;
        this.A01 = C18230wP.A0x((C148838sG) null, A0z);
    }
}
