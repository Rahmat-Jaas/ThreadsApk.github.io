package X;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;

/* renamed from: X.8Jg  reason: invalid class name */
public final class AnonymousClass8Jg extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ BringIntoViewRequester A00;
    public final /* synthetic */ C113196qu A01;
    public final /* synthetic */ C121827Ii A02;
    public final /* synthetic */ C1202679l A03;
    public final /* synthetic */ C146978nB A04;
    public final /* synthetic */ AnonymousClass7HD A05;
    public final /* synthetic */ C106886fn A06;
    public final /* synthetic */ C83224qz A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jg(BringIntoViewRequester bringIntoViewRequester, C113196qu r3, C121827Ii r4, C1202679l r5, C146978nB r6, AnonymousClass7HD r7, C106886fn r8, C83224qz r9) {
        super(1);
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A07 = r9;
        this.A00 = bringIntoViewRequester;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object value;
        C142898fm r14 = (C142898fm) obj;
        C04220Ms.A0B(r14, 0);
        C113196qu r4 = this.A01;
        C147368pE r2 = r4.A09;
        if (C86104wH.A1X(r2) != r14.BUK()) {
            C147368pE.A04(r2, r14.BUK());
            C106886fn r10 = this.A06;
            if (r10 != null) {
                AnonymousClass7HD r5 = this.A05;
                C1202679l r8 = this.A03;
                C146978nB r6 = this.A04;
                if (C86104wH.A1X(r2)) {
                    C112036os r7 = r4.A0H;
                    AnonymousClass0YY r11 = r4.A0J;
                    AnonymousClass0YY r12 = r4.A0I;
                    AnonymousClass0wJ.A1R(r8, r11);
                    C04220Ms.A0B(r12, 5);
                    r4.A03 = AnonymousClass6E7.A00(r7, r8, r5, r10, r11, r12);
                    AnonymousClass7JQ.A03(r4, r6, r5);
                } else {
                    AnonymousClass7JQ.A01(r4);
                }
                if (r14.BUK() && (value = r4.A0A.getValue()) != null) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(value, r4, r5, r6, this.A00, (C146958n9) null, 2), this.A07, 3);
                }
            }
            if (!r14.BUK()) {
                this.A02.A09((AnonymousClass7KC) null);
            }
        }
        return Unit.A00;
    }
}
