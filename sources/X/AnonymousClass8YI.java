package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0010100_I2;

/* renamed from: X.8YI  reason: invalid class name */
public final class AnonymousClass8YI extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YI(boolean z) {
        super(3);
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        Modifier modifier = (Modifier) obj;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(modifier, 0);
        A0H.Cvb(173917668);
        boolean z = this.A00;
        if (z) {
            j = C120537Bh.A01(A0H, -1732951918).A0g;
        } else {
            j = C120537Bh.A01(A0H, -1732951886).A0W;
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(A0H, false);
        boolean A10 = C147188nY.A10(A0H, Boolean.valueOf(z), C86134wK.A0I(j), 511388516);
        Object A13 = A04.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new KtLambdaShape2S0010100_I2(3, j, z);
            A04.A14(A13);
        }
        Modifier A08 = Modifier.A08(modifier, AnonymousClass7W3.A0B(A04, A13, false));
        AnonymousClass7W3.A0w(A04, false);
        return A08;
    }
}
