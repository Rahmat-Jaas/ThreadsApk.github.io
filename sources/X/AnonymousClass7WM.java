package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxMPolicyShape843S0100000_2_I2;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0102000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0102000_I2;

/* renamed from: X.7WM  reason: invalid class name */
public final class AnonymousClass7WM implements C145728kz {
    public C146388mA A00;
    public C146858my A01;
    public Modifier A02;
    public Modifier A03;
    public final C111156ms A04;
    public final C146288ly A05 = new IDxMPolicyShape843S0100000_2_I2(this, 0);
    public final Modifier A06;

    public final void A02(C114016sY r5) {
        C111156ms r2 = this.A04;
        if (r2.A02 != r5) {
            r2.A09.CrC(Unit.A00);
            r2.A02 = r5;
            this.A03 = AnonymousClass6FI.A00(Modifier.A00, C86164wN.A10(r5.A05, this, 39), false);
        }
    }

    public AnonymousClass7WM(C111156ms r20) {
        C111156ms r5 = r20;
        this.A04 = r5;
        C123327Wm r2 = Modifier.A00;
        long j = AnonymousClass79F.A01;
        C142918fo r7 = C102746Wj.A00;
        long j2 = C102736Wi.A00;
        this.A06 = C98246Et.A00(C115836vz.A00(r2.Cx6(new GraphicsLayerModifierNodeElement(r7, 1.0f, 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j, j2, j2, false)), C86154wM.A0z(this, 21)), C86154wM.A0z(this, 19));
        this.A03 = AnonymousClass6FI.A00(r2, C86164wN.A10(r5.A02.A05, this, 39), false);
        this.A02 = r2;
    }

    public static final boolean A00(AnonymousClass7WM r4, long j, long j2) {
        AnonymousClass7AW r1 = r4.A04.A05;
        if (r1 == null) {
            return false;
        }
        int A022 = C134747yH.A02(r1.A04.A03);
        int A07 = r1.A07(j);
        int A072 = r1.A07(j2);
        int i = A022 - 1;
        if ((A07 < i || A072 < i) && (A07 >= 0 || A072 >= 0)) {
            return false;
        }
        return true;
    }

    public final Modifier A01() {
        AnonymousClass0YY r0;
        Modifier modifier = this.A06;
        C114016sY r02 = this.A04.A02;
        C121807If r5 = r02.A06;
        int i = r02.A03;
        boolean A1Y = AnonymousClass0wJ.A1Y(modifier, r5);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape5S0102000_I2(r5, i, Integer.MAX_VALUE, 2);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new KtLambdaShape6S0102000_I2(r5, i, Integer.MAX_VALUE, A1Y ? 1 : 0)).Cx6(this.A03).Cx6(this.A02);
    }

    public final void A03(C146858my r6) {
        Modifier modifier;
        this.A01 = r6;
        if (r6 != null) {
            C123177Vs r3 = new C123177Vs(this, r6);
            this.A00 = r3;
            modifier = AnonymousClass7CA.A01(Modifier.A00, r3, new KtSLambdaShape14S0201000_I2(this, (C146958n9) null, 17));
        } else {
            modifier = Modifier.A00;
        }
        this.A02 = modifier;
    }

    public final void Biz() {
        C146858my r0;
        C145708kx r1 = this.A04.A03;
        if (r1 != null && (r0 = this.A01) != null) {
            r0.D8V(r1);
        }
    }

    public final void Bzv() {
        C146858my r0;
        C145708kx r1 = this.A04.A03;
        if (r1 != null && (r0 = this.A01) != null) {
            r0.D8V(r1);
        }
    }

    public final void CFR() {
        C146858my r8 = this.A01;
        if (r8 != null) {
            C111156ms r7 = this.A04;
            C123197Vu r6 = new C123197Vu(C86154wM.A12(this, 39), C86154wM.A12(this, 40), r7.A07);
            C123207Vw r82 = (C123207Vw) r8;
            long j = r6.A02;
            if (j != 0) {
                Map map = r82.A0B;
                Long valueOf = Long.valueOf(j);
                if (!map.containsKey(valueOf)) {
                    map.put(valueOf, r6);
                    r82.A0A.add(r6);
                    r82.A08 = false;
                    r7.A03 = r6;
                    return;
                }
                StringBuilder A0s = C18190wL.A0s("Another selectable with the id: ");
                A0s.append(r6);
                throw C18190wL.A0a(C18180wK.A0i(".selectableId has already subscribed.", A0s));
            }
            throw C18190wL.A0a(AnonymousClass00U.A08(j, "The selectable contains an invalid id: "));
        }
    }
}
