package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.87C  reason: invalid class name */
public final class AnonymousClass87C implements C83234r0 {
    public final /* synthetic */ KtCSuperShape0S0310000_I2 A00;
    public final /* synthetic */ KtCSuperShape0S1201000_I2 A01;
    public final /* synthetic */ C883457r A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass87C(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2, KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I2, C883457r r3, boolean z) {
        this.A02 = r3;
        this.A01 = ktCSuperShape0S1201000_I2;
        this.A03 = z;
        this.A00 = ktCSuperShape0S0310000_I2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r12) {
        KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2;
        C883457r r3;
        String str;
        C100976Pk r11 = (C100976Pk) obj;
        if (r11 instanceof AnonymousClass5z3) {
            this.A02.A05.CrC(C130127ol.A00);
        } else {
            if (r11 instanceof AnonymousClass5z1) {
                r3 = this.A02;
                str = (String) ((AnonymousClass5z1) r11).A00;
            } else if (r11 instanceof AnonymousClass5z2) {
                KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I2 = this.A01;
                if (ktCSuperShape0S1201000_I2 == null) {
                    r3 = this.A02;
                    str = "view_state_is_not_show_gifts";
                } else {
                    C883457r r9 = this.A02;
                    C105356dI r1 = r9.A01;
                    int A04 = AnonymousClass0wJ.A04(((AnonymousClass5z2) r11).A00);
                    String A012 = C120737Cg.A01(r1.A00, Integer.valueOf(A04), false);
                    C04220Ms.A06(A012);
                    List list = (List) ktCSuperShape0S1201000_I2.A02;
                    C302320f r0 = (C302320f) ktCSuperShape0S1201000_I2.A01;
                    AnonymousClass0wJ.A1Q(list, r0);
                    KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I22 = new KtCSuperShape0S1201000_I2(r0, A012, list, A04);
                    C86074wE r7 = r9.A05;
                    boolean z = this.A03;
                    KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I22 = this.A00;
                    if (ktCSuperShape0S0310000_I22 != null) {
                        AnonymousClass5Hc r4 = (AnonymousClass5Hc) ktCSuperShape0S0310000_I22.A01;
                        boolean z2 = false;
                        if (r4.A00 <= ktCSuperShape0S1201000_I22.A00) {
                            z2 = true;
                        }
                        ImageUrl imageUrl = (ImageUrl) ktCSuperShape0S0310000_I22.A00;
                        ImageUrl imageUrl2 = (ImageUrl) ktCSuperShape0S0310000_I22.A02;
                        AnonymousClass0wJ.A1O(imageUrl, imageUrl2);
                        ktCSuperShape0S0310000_I2 = new KtCSuperShape0S0310000_I2(r4, imageUrl, imageUrl2, z2);
                    } else {
                        ktCSuperShape0S0310000_I2 = null;
                    }
                    r7.CrC(new AnonymousClass5LX(ktCSuperShape0S0310000_I2, ktCSuperShape0S1201000_I22, z));
                    AnonymousClass7EX r32 = r9.A00;
                    int i = ktCSuperShape0S1201000_I22.A00;
                    C89195Ch A002 = AnonymousClass7EX.A00(r32, AnonymousClass006.A00, AnonymousClass006.A0N);
                    C86134wK.A1F(A002, i);
                    C122017Jn.A01(A002, r32);
                }
            }
            AnonymousClass7EX r2 = r3.A00;
            C13330nS r5 = r2.A02;
            String str2 = r2.A01.A03;
            C89195Ch A003 = AnonymousClass7EX.A00(r2, AnonymousClass006.A00, AnonymousClass006.A0N);
            C04220Ms.A05(r5);
            C122017Jn.A04(A003, r5, str2, "fetch_balance_failure", (String) null, str);
            r3.A05.CrC(AnonymousClass7oj.A00);
            Object Cgt = r3.A03.Cgt(new AnonymousClass5LU(new AnonymousClass3I0(C86164wN.A1T(), 2131821387), "fetch_balance_failure", true), r12);
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            if (Cgt != d0e) {
                Cgt = Unit.A00;
            }
            if (Cgt == d0e) {
                return Cgt;
            }
        }
        return Unit.A00;
    }
}
