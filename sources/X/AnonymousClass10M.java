package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0101000_I2_9;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;

/* renamed from: X.10M  reason: invalid class name */
public final class AnonymousClass10M extends C62793ak {
    public int A00 = -1;
    public final int A01;
    public final IGRevShareProductType A02;
    public final C559035a A03;
    public final UserSession A04;
    public final C86064wD A05;
    public final C84714tk A06;
    public final C86074wE A07 = C18190wL.A0z(C18180wK.A0X());
    public final C86074wE A08;

    public AnonymousClass10M(IGRevShareProductType iGRevShareProductType, C559035a r7, UserSession userSession, int i) {
        this.A04 = userSession;
        this.A03 = r7;
        this.A02 = iGRevShareProductType;
        this.A01 = i;
        C27441EnX enX = new C27441EnX();
        this.A05 = enX;
        this.A06 = AnonymousClass7C4.A02(enX);
        this.A08 = C18190wL.A0z(C23243Cor.A00);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0101000_I2_9(this, (C146958n9) null, 34), AnonymousClass3J5.A00(this), 3);
    }

    public final void A00(AnonymousClass2SB r23) {
        KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I2;
        AnonymousClass2SB r2 = r23;
        if (r2 instanceof C28121th) {
            C86074wE r5 = this.A08;
            if (r5.getValue() instanceof C23242Coq) {
                Object value = r5.getValue();
                C04220Ms.A0C(value, "null cannot be cast to non-null type com.instagram.partnerprogram.viewmodel.BlockedCategoriesViewModel.BlockedCategoriesScreenState.BlockedCategoryDetails");
                List list = ((C23242Coq) value).A00;
                int i = ((C28121th) r2).A00;
                boolean z = ((KtCSuperShape0S2020000_I2) list.get(i)).A02;
                int i2 = this.A00;
                int i3 = i2 - 1;
                if (!z) {
                    i3 = i2 + 1;
                }
                this.A00 = i3;
                int i4 = this.A01;
                boolean z2 = false;
                if (i4 != -1 && i3 >= i4) {
                    z2 = true;
                }
                if (z2) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0101000_I2_9(this, (C146958n9) null, 35), AnonymousClass3J5.A00(this), 3);
                }
                ArrayList A0w = AnonymousClass0wJ.A0w(list);
                int i5 = 0;
                for (Object next : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I22 = (KtCSuperShape0S2020000_I2) next;
                    if (i5 == i) {
                        ktCSuperShape0S2020000_I2 = new KtCSuperShape0S2020000_I2(ktCSuperShape0S2020000_I22.A01, ktCSuperShape0S2020000_I22.A00, 0, !ktCSuperShape0S2020000_I22.A02, ktCSuperShape0S2020000_I22.A03);
                    } else if (z2) {
                        boolean z3 = ktCSuperShape0S2020000_I22.A02;
                        ktCSuperShape0S2020000_I2 = new KtCSuperShape0S2020000_I2(ktCSuperShape0S2020000_I22.A01, ktCSuperShape0S2020000_I22.A00, 0, z3, z3);
                    } else {
                        ktCSuperShape0S2020000_I2 = new KtCSuperShape0S2020000_I2(ktCSuperShape0S2020000_I22.A01, ktCSuperShape0S2020000_I22.A00, 0, ktCSuperShape0S2020000_I22.A02, true);
                    }
                    A0w.add(ktCSuperShape0S2020000_I2);
                    i5 = i6;
                }
                C86074wE r3 = this.A07;
                do {
                } while (!r3.ADi(r3.getValue(), true));
                r5.CrC(new C23242Coq(A0w));
            }
        } else if (r2 instanceof C28141tj) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7(this, (C146958n9) null, 34), AnonymousClass3J5.A00(this), 3);
        } else if (r2 instanceof C28131ti) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0101000_I2_9(this, (C146958n9) null, 36), AnonymousClass3J5.A00(this), 3);
        }
    }
}
