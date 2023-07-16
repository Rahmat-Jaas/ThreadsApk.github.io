package X;

import androidx.compose.ui.Modifier;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0411000_I2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape51S0100000_I2_31;

/* renamed from: X.8YW  reason: invalid class name */
public final class AnonymousClass8YW extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C147258p3 A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YW(C147258p3 r2, float f, boolean z) {
        super(3);
        this.A00 = f;
        this.A01 = r2;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(A0H, -1279351527);
        Object A13 = A0Z.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass6DU.A00(1.0f);
            A0Z.A14(A13);
        }
        C123267Wf A012 = C123267Wf.A01(new KtLambdaShape51S0100000_I2_31(A13, 10));
        C81784oM A013 = C115806vw.A01(A0H, Float.valueOf(this.A00));
        C147258p3 r7 = this.A01;
        boolean z = this.A02;
        AnonymousClass7K5.A03(A0H, r7, Boolean.valueOf(z), new KtSLambdaShape1S0411000_I2(A13, r7, A013, (C146958n9) null, 2, z));
        if (C86104wH.A1X(A012)) {
            obj4 = C115876w3.A01(Modifier.A00, new KtLambdaShape156S0100000_I2_11(A13, 23));
        } else {
            obj4 = Modifier.A00;
        }
        AnonymousClass7W3.A0w(A0Z, false);
        return obj4;
    }
}
