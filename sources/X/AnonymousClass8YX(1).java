package X;

import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8;

/* renamed from: X.8YX  reason: invalid class name */
public final class AnonymousClass8YX extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C144678it A01;
    public final /* synthetic */ AnonymousClass0YY A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YX(C144678it r2, AnonymousClass0YY r3, int i) {
        super(3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r7 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r7.BCM()) {
            C144678it r14 = this.A01;
            if (r14 instanceof AnonymousClass5MW) {
                r7.Cvb(305674025);
                C121417Fv.A03(((AnonymousClass5MW) r14).A00, r7, 0);
            } else if (r14 instanceof AnonymousClass5MX) {
                r7.Cvb(305674106);
                AnonymousClass5MX r1 = (AnonymousClass5MX) r14;
                C115286uo A022 = AnonymousClass7FS.A02(r7, r1.A00);
                String str = r1.A01;
                AnonymousClass0wJ.A1N(A022, str);
                r7.Cvd(-496698969);
                C121417Fv.A02(r7, A022, str, C103826an.A01, 56);
                C147178nW AKE = r7.AKE();
                if (AKE != null) {
                    C147178nW.A06(AKE, A022, str, 8, 6);
                }
            } else if (r14 instanceof AnonymousClass5MY) {
                r7.Cvb(305674315);
                AnonymousClass5MY r12 = (AnonymousClass5MY) r14;
                C121417Fv.A01(r7, AnonymousClass7FS.A02(r7, r12.A00), r12.A01, r12.A02, (String) null, 64, 8);
            } else {
                r7.Cvb(305674503);
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r7, false);
            AnonymousClass0YY r4 = this.A02;
            boolean A10 = C147188nY.A10(r7, r4, r14, 511388516);
            Object A13 = A04.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape24S0200000_I2_8(r14, r4, 8);
                A04.A14(A13);
            }
            AnonymousClass6QO.A00(r7, r14, AnonymousClass7W3.A09(A04, A13, false), (AnonymousClass0ZU) null, (this.A00 >> 3) & 14, 4);
        } else {
            r7.CuJ();
        }
        return Unit.A00;
    }
}
