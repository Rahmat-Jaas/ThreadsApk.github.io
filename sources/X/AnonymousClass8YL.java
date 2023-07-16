package X;

import androidx.compose.ui.Modifier;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;

/* renamed from: X.8YL  reason: invalid class name */
public final class AnonymousClass8YL extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ AnonymousClass8cZ A00;
    public final /* synthetic */ AnonymousClass0ZU A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YL(AnonymousClass8cZ r2, AnonymousClass0ZU r3) {
        super(3);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        A0H.Cvb(-1792953471);
        C81784oM A012 = C115806vw.A01(A0H, false);
        C81784oM A013 = C115806vw.A01(A0H, this.A01);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(A0H, -492369756);
        Object A13 = A0Z.A13();
        Object obj4 = AnonymousClass7GN.A00;
        if (A13 == obj4) {
            A13 = new C27442EnY();
            A0Z.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C86064wD r9 = (C86064wD) A13;
        A0H.Cvb(-2078701928);
        AnonymousClass8cZ r1 = this.A00;
        AnonymousClass7K5.A05(A0H, r1, new KtSLambdaShape4S0501000_I2(r1, (C146958n9) null, r9));
        AnonymousClass7W3.A0w(A0Z, false);
        Object A0r = C147188nY.A0r(A0H, A0Z, -492369756);
        if (A0r == obj4) {
            A0r = new KtSLambdaShape4S0401000_I2((Object) A012, (Object) A013, (Object) r9, (C146958n9) null, 37);
            A0Z.A14(A0r);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        Modifier A014 = AnonymousClass7CA.A01(Modifier.A00, r9, (AnonymousClass0YP) A0r);
        AnonymousClass7W3.A0w(A0Z, false);
        return A014;
    }
}
