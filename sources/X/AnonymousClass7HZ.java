package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import java.util.Map;
import kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape2S1410000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1210000_I2;

/* renamed from: X.7HZ  reason: invalid class name */
public final class AnonymousClass7HZ {
    public static final Modifier A00(C142668fO r13, C147258p3 r14, Modifier modifier, AnonymousClass799 r16, String str, AnonymousClass0ZU r18, boolean z) {
        AnonymousClass0YY r0;
        C147258p3 r3 = r14;
        boolean A1Y = AnonymousClass0wJ.A1Y(modifier, r14);
        AnonymousClass0ZU r4 = r18;
        C142668fO r2 = r13;
        AnonymousClass799 r1 = r16;
        String str2 = str;
        boolean z2 = z;
        if (C86164wN.A1Q(6, r4)) {
            r0 = new KtLambdaShape2S1410000_I2(r1, r2, r3, r4, str2, A1Y ? 1 : 0, z2);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new C140858Yt(r13, r14, r1, str2, r4, z2));
    }

    public static Modifier A01(Modifier modifier, AnonymousClass799 r3, AnonymousClass0ZU r4) {
        return A02(modifier, r3, r4, 3, false);
    }

    public static /* synthetic */ Modifier A02(Modifier modifier, AnonymousClass799 r8, AnonymousClass0ZU r9, int i, boolean z) {
        AnonymousClass0YY r1;
        AnonymousClass799 r2 = r8;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            r2 = null;
        }
        AnonymousClass0ZU r3 = r9;
        C18180wK.A1Q(modifier, 0, r9);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r1 = new KtLambdaShape3S1210000_I2(r2, r3, (String) null, 0, z2);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r1, new IDxLambdaShape13S0210000_2_I2(0, r9, r2, z2));
    }

    public static Modifier A03(Modifier modifier, AnonymousClass0ZU r3, boolean z) {
        return A02(modifier, (AnonymousClass799) null, r3, 7, z);
    }

    public static final void A04(C147258p3 r6, C147188nY r7, C147368pE r8, Map map, int i) {
        C147258p3 r5 = r6;
        C04220Ms.A0B(r6, 0);
        C147368pE r62 = r8;
        Map map2 = map;
        AnonymousClass0wJ.A1O(r8, map);
        r7.Cvd(1297229208);
        AnonymousClass7K5.A04(r7, r5, C86154wM.A0y(map, r8, r5, 5));
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i, 0, map2, r5, r62));
        }
    }
}
