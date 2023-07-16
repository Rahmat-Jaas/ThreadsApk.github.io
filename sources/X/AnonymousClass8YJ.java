package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0000100_I2;

/* renamed from: X.8YJ  reason: invalid class name */
public final class AnonymousClass8YJ extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ long A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YJ(long j) {
        super(3);
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(modifier, 0);
        A0H.Cvb(1824033098);
        long j = this.A00;
        boolean ACX = A0H.ACX(j);
        AnonymousClass7W3 r5 = (AnonymousClass7W3) A0H;
        Object A13 = r5.A13();
        if (ACX || A13 == AnonymousClass7GN.A00) {
            A13 = new KtLambdaShape2S0000100_I2(j, 4);
            r5.A14(A13);
        }
        Modifier A002 = C115836vz.A00(modifier, (AnonymousClass0YY) A13);
        AnonymousClass7W3.A0w(r5, false);
        return A002;
    }
}
