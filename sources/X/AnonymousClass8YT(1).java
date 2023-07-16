package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;

/* renamed from: X.8YT  reason: invalid class name */
public final class AnonymousClass8YT extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C89955Hr A01;
    public final /* synthetic */ AnonymousClass56Y A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YT(Context context, C89955Hr r3, AnonymousClass56Y r4) {
        super(3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r6 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r6.BCM()) {
            C89955Hr r3 = this.A01;
            if (r3.A0H) {
                r6.Cvb(-197844128);
                AnonymousClass6M7.A00(r6, (Modifier) null, (C146458mH) null, AnonymousClass6MN.A00(r3.A04, true, false), C86154wM.A15(this.A00, this.A02, r3, 23), 0, 12);
            } else if (r3.A0I) {
                r6.Cvb(-197843504);
                AnonymousClass56Y r5 = this.A02;
                boolean A10 = C147188nY.A10(r6, r3, r5, 511388516);
                AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
                Object A13 = r2.A13();
                if (A10 || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtLambdaShape18S0200000_I2_2(34, r3, r5);
                    r2.A14(A13);
                }
                AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r2, A13, false);
                boolean A102 = C147188nY.A10(r6, r3, r5, 511388516);
                Object A132 = r2.A13();
                if (A102 || A132 == AnonymousClass7GN.A00) {
                    A132 = new KtLambdaShape18S0200000_I2_2(35, r3, r5);
                    r2.A14(A132);
                }
                AnonymousClass6M0.A00(r6, (Modifier) null, A08, AnonymousClass7W3.A08(r2, A132, false), 0, 4);
            } else {
                r6.Cvb(-197843068);
            }
            AnonymousClass7W3.A0y(r6);
        } else {
            r6.CuJ();
        }
        return Unit.A00;
    }
}
