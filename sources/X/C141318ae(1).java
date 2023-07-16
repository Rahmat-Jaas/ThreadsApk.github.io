package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;

/* renamed from: X.8ae  reason: invalid class name and case insensitive filesystem */
public final class C141318ae extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ AnonymousClass75b A00;
    public final /* synthetic */ C146638ma A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C83224qz A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141318ae(AnonymousClass75b r2, C146638ma r3, String str, C83224qz r5) {
        super(4);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj3;
        boolean A1X = AnonymousClass0wJ.A1X(obj4);
        C04220Ms.A0B(str, 0);
        if (A1X) {
            this.A01.BhK(str, str2);
        } else {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(this.A00, this.A02, (C146958n9) null, 11), this.A03, 3);
        }
        return Unit.A00;
    }
}
