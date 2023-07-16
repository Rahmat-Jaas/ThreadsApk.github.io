package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.8ar  reason: invalid class name and case insensitive filesystem */
public final class C141378ar extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C105496dW A03;
    public final /* synthetic */ AnonymousClass75b A04;
    public final /* synthetic */ C146638ma A05;
    public final /* synthetic */ C884057x A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ AnonymousClass0YC A08;
    public final /* synthetic */ C83224qz A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141378ar(C147368pE r2, C81784oM r3, C105496dW r4, AnonymousClass75b r5, C146638ma r6, C884057x r7, List list, AnonymousClass0YC r9, C83224qz r10, int i) {
        super(4);
        this.A07 = list;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A00 = i;
        this.A08 = r9;
        this.A01 = r2;
        this.A09 = r10;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r14 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r14, obj5);
        } else {
            i = A043;
        }
        int i4 = 32;
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r14, A042);
        }
        if ((i & 731) != 146 || !r14.BCM()) {
            int i5 = (i & 112) | (i & 14);
            C146628mY r11 = (C146628mY) this.A07.get(A042);
            r14.Cvb(-1325332499);
            if ((i5 & 112) == 0) {
                if (!r14.ACW(A042)) {
                    i4 = 16;
                }
                i2 = i4 | i5;
            } else {
                i2 = i5;
            }
            if ((i5 & 896) == 0) {
                i3 = C147188nY.A0H(r14, r11) | i2;
            } else {
                i3 = i2;
            }
            if ((i3 & 5841) != 1168 || !r14.BCM()) {
                C146638ma r15 = this.A05;
                C884057x r8 = this.A06;
                C81784oM r7 = this.A02;
                int i6 = this.A00;
                AnonymousClass0YC r5 = this.A08;
                C147368pE r4 = this.A01;
                int i7 = A042;
                C83224qz r24 = this.A09;
                AnonymousClass0YC r23 = r5;
                C884057x r22 = r8;
                C146638ma r21 = r15;
                C146628mY r20 = r11;
                AnonymousClass75b r19 = this.A04;
                C105496dW r18 = this.A03;
                C81784oM r17 = r7;
                C147368pE r16 = r4;
                AnonymousClass7JR.A05(r14, new AnonymousClass8Tb(r16, r17, r18, r19, r20, r21, r22, r23, r24, i7, i6, i3), new AnonymousClass7DS[0], 225168173);
            } else {
                r14.CuJ();
            }
            AnonymousClass7W3.A0z(r14, false);
        } else {
            r14.CuJ();
        }
        return Unit.A00;
    }
}
