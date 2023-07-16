package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import java.util.List;

/* renamed from: X.10Y  reason: invalid class name */
public abstract class AnonymousClass10Y extends C62793ak {
    public static final AnonymousClass17I A0B = new AnonymousClass17I(AnonymousClass2LU.A00(""), AnonymousClass2LU.A00(""), 0, false, true, false);
    public final int A00;
    public final C86064wD A01;
    public final C84714tk A02;
    public final C86074wE A03;
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final C86094wG A09;
    public final C86094wG A0A;

    public final void A01() {
        String str;
        if (this instanceof AnonymousClass1f8) {
            AnonymousClass1f8 r0 = (AnonymousClass1f8) this;
            C695348z r8 = r0.A02;
            Integer num = AnonymousClass006.A01;
            String str2 = r0.A06;
            C86094wG r1 = r0.A07;
            Object value = r1.getValue();
            ((Number) value).longValue();
            if (C18180wK.A1W((C18190wL.A08(r1.getValue()) > 0 ? 1 : (C18190wL.A08(r1.getValue()) == 0 ? 0 : -1))) || value == null) {
                str = null;
            } else {
                str = value.toString();
            }
            r8.A00(num, (String) null, str2, str);
        }
    }

    public AnonymousClass10Y(long j, int i) {
        this.A00 = i;
        C27441EnX enX = new C27441EnX();
        this.A01 = enX;
        this.A02 = AnonymousClass7C4.A02(enX);
        Object valueOf = Long.valueOf(j);
        C27457Enn A0z = C18190wL.A0z(valueOf == null ? DIV.A01 : valueOf);
        this.A03 = A0z;
        this.A07 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass2LU.A00(""));
        this.A04 = A0z2;
        this.A08 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(false);
        this.A05 = A0z3;
        this.A09 = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(new KtCSuperShape0S0210000_I2(new KtCSuperShape0S0400000_I2((C302720j) null, (Integer) null, (Integer) null, 15), (List) AnonymousClass0ZV.A00, true));
        this.A06 = A0z4;
        this.A0A = C18230wP.A0x((C148838sG) null, A0z4);
    }
}
