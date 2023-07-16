package X;

import androidx.compose.foundation.gestures.DragLogic;
import androidx.compose.foundation.gestures.DraggableKt$draggable$9$3;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0701000_I2;
import kotlin.jvm.internal.KtLambdaShape39S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape50S0200000_I2;

/* renamed from: X.8Z8  reason: invalid class name */
public final class AnonymousClass8Z8 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ C142698fR A00;
    public final /* synthetic */ C967266l A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0YY A04;
    public final /* synthetic */ AnonymousClass0YM A05;
    public final /* synthetic */ AnonymousClass0YM A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z8(C142698fR r2, C967266l r3, C147258p3 r4, AnonymousClass0ZU r5, AnonymousClass0YY r6, AnonymousClass0YM r7, AnonymousClass0YM r8, boolean z, boolean z2) {
        super(3);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = z;
        this.A08 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass0YY r0;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(obj, 0);
        A0H.Cvb(597193710);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(A0H, -492369756);
        Object A13 = A0Z.A13();
        Object obj4 = AnonymousClass7GN.A00;
        if (A13 == obj4) {
            A13 = AnonymousClass7WR.A00(A0Z, (Object) null);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C147368pE r8 = (C147368pE) A13;
        C147258p3 r7 = this.A02;
        boolean A10 = C147188nY.A10(A0H, r8, r7, 511388516);
        Object A132 = A0Z.A13();
        if (A10 || A132 == obj4) {
            A132 = new KtLambdaShape39S0200000_I2(r7, r8, 23);
            A0Z.A14(A132);
        }
        AnonymousClass7W3.A0c(A0H, A0Z, A132, r7, false);
        Object A0r = C147188nY.A0r(A0H, A0Z, -492369756);
        if (A0r == obj4) {
            A0r = new C27442EnY();
            A0Z.A14(A0r);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C86064wD r12 = (C86064wD) A0r;
        C81784oM A012 = C115806vw.A01(A0H, this.A03);
        C81784oM A013 = C115806vw.A01(A0H, this.A04);
        C81784oM A014 = C115806vw.A01(A0H, new DragLogic(r7, r8, this.A05, this.A06));
        C142698fR r02 = this.A00;
        C967266l r82 = this.A01;
        AnonymousClass7K5.A05(A0H, r02, new KtSLambdaShape1S0701000_I2((Object) A014, (Object) r82, (Object) r02, (Object) r12, (C146958n9) null, 1));
        C123327Wm r6 = Modifier.A00;
        boolean z = this.A07;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = this.A08;
        Object[] objArr = {r82, valueOf, Boolean.valueOf(z2)};
        DraggableKt$draggable$9$3 draggableKt$draggable$9$3 = new DraggableKt$draggable$9$3(r82, A013, A012, (C146958n9) null, r12, z, z2);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86164wN.A11(objArr, draggableKt$draggable$9$3, 12);
        } else {
            r0 = InspectableValueKt.A00;
        }
        Modifier A022 = C120417Am.A02(r6, r0, new KtLambdaShape50S0200000_I2(15, objArr, draggableKt$draggable$9$3));
        AnonymousClass7W3.A0w(A0Z, false);
        return A022;
    }
}
