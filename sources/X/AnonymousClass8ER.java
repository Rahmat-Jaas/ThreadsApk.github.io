package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.facebook.redex.IDxCListenerShape218S0100000_2_I2;
import kotlin.Unit;

/* renamed from: X.8ER  reason: invalid class name */
public final class AnonymousClass8ER extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ KtCSuperShape0S2210000_I2 A00;
    public final /* synthetic */ KtCSuperShape0S2210000_I2 A01;
    public final /* synthetic */ KtCSuperShape0S2210000_I2 A02;
    public final /* synthetic */ C25828Dsm A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ER(KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I2, KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I22, KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I23, C25828Dsm dsm, String str, String str2, boolean z, boolean z2) {
        super(0);
        this.A03 = dsm;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = ktCSuperShape0S2210000_I2;
        this.A01 = ktCSuperShape0S2210000_I22;
        this.A02 = ktCSuperShape0S2210000_I23;
        this.A06 = z;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C25828Dsm dsm = this.A03;
        dsm.A02 = this.A05;
        String str = this.A04;
        if (!(str == null || str.length() == 0)) {
            dsm.A0p(str);
        }
        KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I2 = this.A00;
        if (ktCSuperShape0S2210000_I2 != null) {
            String str2 = ktCSuperShape0S2210000_I2.A03;
            if (str2.length() > 0) {
                String str3 = ktCSuperShape0S2210000_I2.A02;
                dsm.A0V(C86154wM.A0N(ktCSuperShape0S2210000_I2, 49), AnonymousClass6QX.A00((Integer) ktCSuperShape0S2210000_I2.A01), str2, str3, ktCSuperShape0S2210000_I2.A04);
            }
        }
        KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I22 = this.A01;
        if (ktCSuperShape0S2210000_I22 != null) {
            String str4 = ktCSuperShape0S2210000_I22.A03;
            if (str4.length() > 0) {
                String str5 = ktCSuperShape0S2210000_I22.A02;
                IDxCListenerShape218S0100000_2_I2 A0N = C86154wM.A0N(ktCSuperShape0S2210000_I22, 50);
                boolean z = ktCSuperShape0S2210000_I22.A04;
                dsm.A0Q(A0N, dsm.A08, dsm.A0F, AnonymousClass6QX.A00((Integer) ktCSuperShape0S2210000_I22.A01), str4, str5, -1, z);
            }
        }
        KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I23 = this.A02;
        if (ktCSuperShape0S2210000_I23 != null) {
            String str6 = ktCSuperShape0S2210000_I23.A03;
            if (str6.length() > 0) {
                String str7 = ktCSuperShape0S2210000_I23.A02;
                dsm.A0U(C86154wM.A0N(ktCSuperShape0S2210000_I23, 51), AnonymousClass6QX.A00((Integer) ktCSuperShape0S2210000_I23.A01), str6, str7, ktCSuperShape0S2210000_I23.A04);
            }
        }
        dsm.A0q(this.A06);
        dsm.A0r(this.A07);
        dsm.A0G();
        return Unit.A00;
    }
}
