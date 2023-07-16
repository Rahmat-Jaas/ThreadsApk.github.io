package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0101000_I2_6;

/* renamed from: X.10F  reason: invalid class name */
public final class AnonymousClass10F extends C62793ak {
    public final AnonymousClass49L A00;
    public final AnonymousClass1oR A01;
    public final AnonymousClass34C A02;
    public final AnonymousClass0BO A03;
    public final C86064wD A04 = new C27444Ena(AnonymousClass006.A00, AnonymousClass743.A00);

    public AnonymousClass10F(AnonymousClass49L r4, AnonymousClass1oR r5, AnonymousClass34C r6, AnonymousClass0BO r7) {
        C18180wK.A1Q(r4, 2, r7);
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
        this.A03 = r7;
    }

    public final boolean A00() {
        String str;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 45), AnonymousClass3J5.A00(this), 3);
        Integer A012 = this.A00.A01();
        Integer num = AnonymousClass006.A0C;
        boolean A1Z = C18180wK.A1Z(A012, num);
        AnonymousClass1oR r1 = this.A01;
        if (A1Z) {
            str = "HARD_BLOCK_CLOSED";
        } else {
            str = "SOFT_BLOCK_CLOSED";
        }
        r1.A03("END_REASON", str);
        r1.A02(str);
        r1.A01(num);
        return true;
    }
}
