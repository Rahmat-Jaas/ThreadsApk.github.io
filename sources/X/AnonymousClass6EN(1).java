package X;

import java.util.Arrays;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

/* renamed from: X.6EN  reason: invalid class name */
public final class AnonymousClass6EN {
    public static final Object A00(C147188nY r11, C141738cs r12, AnonymousClass0ZU r13, Object[] objArr, int i) {
        Object AEF;
        C18180wK.A1P(objArr, 0, r13);
        r11.Cvb(441892779);
        if ((i & 2) != 0) {
            r12 = C102696We.A00;
            C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r11, 1059366469);
        int i2 = A0Z.A02;
        AnonymousClass725.A00(36);
        String num = Integer.toString(i2, 36);
        C04220Ms.A06(num);
        AnonymousClass7W3.A0w(A0Z, false);
        C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        C146078lb r6 = (C146078lb) r11.AEA(C102686Wd.A00);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        r11.Cvb(-568225417);
        boolean z = false;
        for (Object A12 : copyOf) {
            z = C147188nY.A12(r11, A12, z);
        }
        Object A13 = A0Z.A13();
        if (z || A13 == AnonymousClass7GN.A00) {
            if (r6 == null || (AEF = r6.AEF(num)) == null || (A13 = AnonymousClass7Wc.A00(r12, AEF)) == null) {
                A13 = r13.invoke();
            }
            A0Z.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        if (r6 != null) {
            AnonymousClass7K5.A02(r11, r6, num, new KtLambdaShape3S1300000_I2((Object) r6, (Object) C115806vw.A01(r11, r12), (Object) C115806vw.A01(r11, A13), num, 0));
        }
        AnonymousClass7W3.A0w(A0Z, false);
        return A13;
    }
}
