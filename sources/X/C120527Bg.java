package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.instagram.compose.core.SwipeableState;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0400000_I2;

/* renamed from: X.7Bg  reason: invalid class name and case insensitive filesystem */
public final class C120527Bg {
    public static final SwipeableState A01(C147188nY r14, Object obj, AnonymousClass0YY r16) {
        r14.Cvb(447125456);
        C122777Tu r4 = C103596Zu.A01;
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r14;
        Object A13 = r1.A13();
        Object obj2 = AnonymousClass7GN.A00;
        Object obj3 = obj;
        if (A13 == obj2) {
            A13 = new SwipeableState(r4, obj, C79024jN.A00);
            r1.A14(A13);
        }
        SwipeableState swipeableState = (SwipeableState) A13;
        Object A132 = r1.A13();
        if (A132 == obj2) {
            A132 = AnonymousClass7WR.A00(r1, false);
        }
        C147368pE r10 = (C147368pE) A132;
        r14.Cvb(773894976);
        Object A0r = C147188nY.A0r(r14, r1, -492369756);
        AnonymousClass7K5.A03(r14, obj, r10.getValue(), new KtSLambdaShape1S0300000_I2(obj3, swipeableState, AnonymousClass7WN.A00(r1, C86104wH.A0b(r14, r1, A0r, obj2, A0r)), (C146958n9) null, 25));
        AnonymousClass7K5.A04(r14, swipeableState.A07.getValue(), new KtLambdaShape6S0400000_I2(25, r10, obj, swipeableState, r16));
        AnonymousClass7W3.A0w(r1, false);
        return swipeableState;
    }

    public static /* synthetic */ Modifier A00(C967266l r14, C147258p3 r15, Modifier modifier, SwipeableState swipeableState, Map map, boolean z) {
        C114416tG r5;
        AnonymousClass0YY r2;
        C80914mg r8 = C80914mg.A00;
        Map map2 = map;
        Set keySet = map2.keySet();
        C04220Ms.A0B(keySet, 0);
        if (keySet.size() <= 1) {
            r5 = null;
        } else {
            r5 = new C114416tG(C86164wN.A02(AnonymousClass00J.A04(keySet)) - C86164wN.A02(AnonymousClass00J.A05(keySet)));
        }
        float f = C103596Zu.A00;
        Modifier modifier2 = modifier;
        C967266l r3 = r14;
        C147258p3 r4 = r15;
        SwipeableState swipeableState2 = swipeableState;
        boolean z2 = z;
        if (C86164wN.A1Q(0, modifier2)) {
            r2 = new AnonymousClass8Jk(r3, r4, r5, swipeableState2, map2, r8, f, z2);
        } else {
            r2 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier2, r2, new AnonymousClass8Z4(r14, r15, r5, swipeableState2, map2, r8, f, z));
    }

    public static final Float A02(Object obj, Map map) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C04220Ms.A0I(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }
}
