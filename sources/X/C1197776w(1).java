package X;

import com.facebook.redex.IDxFlowShape253S0100000_4_I2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.76w  reason: invalid class name and case insensitive filesystem */
public final class C1197776w {
    public C104236bS A00;
    public C104236bS A01;
    public C104236bS A02;
    public C1201779c A03;
    public C1201779c A04;
    public boolean A05;
    public final CopyOnWriteArrayList A06 = new CopyOnWriteArrayList();
    public final C84714tk A07;
    public final C86074wE A08;

    public static final void A00(C1197776w r9) {
        C104236bS r2;
        C104236bS r22;
        C104236bS r23;
        C104236bS r3 = r9.A02;
        C1201779c r7 = r9.A04;
        C104236bS r4 = r7.A02;
        C104236bS r1 = r4;
        C1201779c r8 = r9.A03;
        if (!(r8 == null || (r23 = r8.A02) == null)) {
            if (!(r3 instanceof AnonymousClass59J) || (((r4 instanceof AnonymousClass59K) && (r23 instanceof AnonymousClass59K)) || (r23 instanceof AnonymousClass59I))) {
                r3 = r23;
            }
            r4 = r3;
        }
        r9.A02 = r4;
        C104236bS r32 = r9.A01;
        C104236bS r5 = r7.A01;
        if (!(r8 == null || (r22 = r8.A01) == null)) {
            if (!(r32 instanceof AnonymousClass59J) || (((r1 instanceof AnonymousClass59K) && (r22 instanceof AnonymousClass59K)) || (r22 instanceof AnonymousClass59I))) {
                r32 = r22;
            }
            r5 = r32;
        }
        r9.A01 = r5;
        C104236bS r33 = r9.A00;
        C104236bS r6 = r7.A00;
        if (!(r8 == null || (r2 = r8.A00) == null)) {
            if (!(r33 instanceof AnonymousClass59J) || (((r1 instanceof AnonymousClass59K) && (r2 instanceof AnonymousClass59K)) || (r2 instanceof AnonymousClass59I))) {
                r33 = r2;
            }
            r6 = r33;
        }
        r9.A00 = r6;
        if (r9.A05) {
            C115226ui r34 = new C115226ui(r4, r5, r6, r7, r8);
            r9.A08.CrC(r34);
            Iterator it = r9.A06.iterator();
            while (it.hasNext()) {
                C86134wK.A1L(it.next(), r34);
            }
        }
    }

    public C1197776w() {
        AnonymousClass59K r0 = AnonymousClass59K.A01;
        this.A02 = r0;
        this.A01 = r0;
        this.A00 = r0;
        this.A04 = C1201779c.A03;
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A08 = A0z;
        this.A07 = new IDxFlowShape253S0100000_4_I2((C84714tk) A0z, 50);
    }
}
