package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape0S0300001_I2;

/* renamed from: X.8YR  reason: invalid class name */
public final class AnonymousClass8YR extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C111366nD A01;
    public final /* synthetic */ C142918fo A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YR(C111366nD r2, C142918fo r3, float f) {
        super(3);
        this.A00 = f;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(modifier, 0);
        A0H.Cvb(-1498088849);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(A0H);
        Object A13 = A0Y.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = new C104186bN();
            A0Y.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        Modifier Cx6 = modifier.Cx6(C115836vz.A01(Modifier.A00, new KtLambdaShape0S0300001_I2((Object) this.A02, A13, (Object) this.A01, this.A00, 0)));
        AnonymousClass7W3.A0w(A0Y, false);
        return Cx6;
    }
}
