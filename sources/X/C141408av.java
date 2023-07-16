package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape49S0200000_I2_1;

/* renamed from: X.8av  reason: invalid class name and case insensitive filesystem */
public final class C141408av extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AnonymousClass0ZU A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0YY A04;
    public final /* synthetic */ AnonymousClass0YP A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ AnonymousClass0YP A07;
    public final /* synthetic */ AnonymousClass0YP A08;
    public final /* synthetic */ AnonymousClass0YP A09;
    public final /* synthetic */ AnonymousClass0YP A0A;
    public final /* synthetic */ AnonymousClass0YP A0B;
    public final /* synthetic */ AnonymousClass0YP A0C;
    public final /* synthetic */ AnonymousClass0YC A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141408av(List list, AnonymousClass0ZU r3, AnonymousClass0ZU r4, AnonymousClass0YY r5, AnonymousClass0YP r6, AnonymousClass0YP r7, AnonymousClass0YP r8, AnonymousClass0YP r9, AnonymousClass0YP r10, AnonymousClass0YP r11, AnonymousClass0YP r12, AnonymousClass0YP r13, AnonymousClass0YC r14, int i) {
        super(4);
        this.A01 = list;
        this.A02 = r3;
        this.A00 = i;
        this.A03 = r4;
        this.A0D = r14;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A08 = r9;
        this.A0A = r10;
        this.A0B = r11;
        this.A0C = r12;
        this.A09 = r13;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r3 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r3, obj5);
        } else {
            i = A043;
        }
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r3, A042);
        }
        if ((i & 731) != 146 || !r3.BCM()) {
            C108316iA r10 = (C108316iA) this.A01.get(A042);
            if (r10 instanceof AnonymousClass62S) {
                r3.Cvb(-677244038);
                AnonymousClass7W3 A0Z = C147188nY.A0Z(r3, -492369756);
                Object A13 = A0Z.A13();
                if (A13 == AnonymousClass7GN.A00) {
                    AnonymousClass0YC r5 = this.A0D;
                    A13 = new AnonymousClass3CI(r10, this.A05, this.A06, this.A07, r5);
                    A0Z.A14(A13);
                }
                AnonymousClass7W3.A0w(A0Z, false);
                AnonymousClass62S r1 = (AnonymousClass62S) r10;
                String str = r1.A06;
                String str2 = r1.A05;
                String str3 = r1.A07;
                String str4 = r1.A09;
                boolean z = r1.A0B;
                boolean z2 = r1.A0C;
                boolean z3 = r1.A0D;
                Integer num = r1.A03;
                AnonymousClass7KS.A05(r3, (AnonymousClass3CI) A13, num, str, str2, str3, str4, r10.A01, AnonymousClass7JR.A00(r3, new KtLambdaShape49S0200000_I2_1(21, r10, this.A04), -82170419), 805306368, 6, z, z2, z3);
            } else if (r10 instanceof AnonymousClass62Q) {
                r3.Cvb(-677242529);
                AnonymousClass62Q r102 = (AnonymousClass62Q) r10;
                AnonymousClass7KS.A06(r3, AnonymousClass7JS.A01(r3, r102.A01), AnonymousClass7JS.A01(r3, r102.A00), 0);
            } else if (r10 instanceof AnonymousClass62P) {
                r3.Cvb(-677242308);
                AnonymousClass7KS.A09(r3, this.A02, ((AnonymousClass62P) r10).A00, (this.A00 >> 3) & 112);
            } else if (r10 instanceof AnonymousClass62T) {
                r3.Cvb(-677242135);
                AnonymousClass7KS.A02(r3, 0);
            } else if (r10 instanceof AnonymousClass62R) {
                r3.Cvb(-677242054);
                AnonymousClass7W3 A0Z2 = C147188nY.A0Z(r3, -492369756);
                Object A132 = A0Z2.A13();
                if (A132 == AnonymousClass7GN.A00) {
                    A132 = new AnonymousClass3CJ(r10, this.A08, this.A0A, this.A0B, this.A0C);
                    A0Z2.A14(A132);
                }
                AnonymousClass7W3.A0w(A0Z2, false);
                AnonymousClass62R r12 = (AnonymousClass62R) r10;
                String str5 = r12.A06;
                String str6 = r12.A05;
                String str7 = r12.A08;
                String str8 = r12.A04;
                String str9 = r12.A03;
                boolean z4 = r12.A09;
                boolean z5 = r12.A0A;
                boolean z6 = r12.A0B;
                boolean z7 = r12.A0C;
                C147188nY r122 = r3;
                AnonymousClass3CJ r13 = (AnonymousClass3CJ) A132;
                AnonymousClass71R.A01(r122, r13, str5, str6, r12.A07, str7, str8, str9, r10.A01, AnonymousClass7JR.A00(r3, new KtLambdaShape49S0200000_I2_1(22, r10, this.A09), -906072975), 0, 432, z4, z5, z6, z7);
            } else if (r10 instanceof AnonymousClass62U) {
                r3.Cvb(-677240503);
                AnonymousClass71R.A00(r3, 0);
            } else if (r10 instanceof AnonymousClass62V) {
                r3.Cvb(-677240397);
                AnonymousClass7KS.A08(r3, this.A03, (this.A00 >> 9) & 14);
            } else {
                r3.Cvb(-677240316);
            }
            AnonymousClass7W3.A0z(r3, false);
        } else {
            r3.CuJ();
        }
        return Unit.A00;
    }
}
