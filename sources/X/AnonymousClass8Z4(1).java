package X;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.ui.Modifier;
import com.instagram.compose.core.SwipeableKt$swipeable$3$3;
import com.instagram.compose.core.SwipeableState;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0200001_I2;

/* renamed from: X.8Z4  reason: invalid class name */
public final class AnonymousClass8Z4 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C967266l A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ C114416tG A03;
    public final /* synthetic */ SwipeableState A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z4(C967266l r2, C147258p3 r3, C114416tG r4, SwipeableState swipeableState, Map map, AnonymousClass0YP r7, float f, boolean z) {
        super(3);
        this.A05 = map;
        this.A04 = swipeableState;
        this.A01 = r2;
        this.A07 = z;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        A0H.Cvb(310308941);
        Map map = this.A05;
        if (!C86164wN.A1R(map)) {
            throw C18190wL.A0a("You must have at least one anchor.");
        } else if (AnonymousClass00J.A0J(map.values()).size() == map.size()) {
            C147168nV r4 = (C147168nV) A0H.AEA(AnonymousClass7DE.A02);
            SwipeableState swipeableState = this.A04;
            if (C86154wM.A0t(swipeableState.A05).isEmpty()) {
                Float A022 = C120527Bg.A02(swipeableState.A07.getValue(), map);
                if (A022 != null) {
                    swipeableState.A09.CrC(A022);
                    swipeableState.A04.CrC(A022);
                } else {
                    throw C18190wL.A0a("The initial value must have an associated anchor.");
                }
            }
            AnonymousClass7K5.A03(A0H, map, swipeableState, new SwipeableKt$swipeable$3$3(r4, this.A03, swipeableState, map, (C146958n9) null, this.A06, this.A00));
            C123327Wm r12 = Modifier.A00;
            boolean A1X = C86104wH.A1X(swipeableState.A08);
            C142698fR r9 = swipeableState.A03;
            C967266l r10 = this.A01;
            boolean z = this.A07;
            C147258p3 r11 = this.A02;
            boolean A0y = C147188nY.A0y(A0H, swipeableState);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) A0H;
            Object A13 = r0.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtSLambdaShape1S0200001_I2(swipeableState, (C146958n9) null, 2);
                r0.A14(A13);
            }
            AnonymousClass7W3.A0w(r0, false);
            Modifier A002 = DraggableKt.A00(r9, r10, r11, r12, (AnonymousClass0YM) A13, 32, z, A1X);
            AnonymousClass7W3.A0w(r0, false);
            return A002;
        } else {
            throw C18190wL.A0a("You cannot have two anchors mapped to the same state.");
        }
    }
}
