package X;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape171S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape20S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0102000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0102000_I2;

/* renamed from: X.8UG  reason: invalid class name */
public final class AnonymousClass8UG extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BringIntoViewRequester A02;
    public final /* synthetic */ AnonymousClass7EJ A03;
    public final /* synthetic */ C113196qu A04;
    public final /* synthetic */ C121827Ii A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ Modifier A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ Modifier A09;
    public final /* synthetic */ C121807If A0A;
    public final /* synthetic */ C146978nB A0B;
    public final /* synthetic */ AnonymousClass7HD A0C;
    public final /* synthetic */ C146898n3 A0D;
    public final /* synthetic */ C147168nV A0E;
    public final /* synthetic */ AnonymousClass0YY A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8UG(BringIntoViewRequester bringIntoViewRequester, AnonymousClass7EJ r3, C113196qu r4, C121827Ii r5, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, C121807If r10, C146978nB r11, AnonymousClass7HD r12, C146898n3 r13, C147168nV r14, AnonymousClass0YY r15, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A04 = r4;
        this.A0A = r10;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r3;
        this.A0C = r12;
        this.A0D = r13;
        this.A06 = modifier;
        this.A07 = modifier2;
        this.A09 = modifier3;
        this.A08 = modifier4;
        this.A02 = bringIntoViewRequester;
        this.A05 = r5;
        this.A0H = z;
        this.A0G = z2;
        this.A0F = r15;
        this.A0B = r11;
        this.A0E = r14;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0YY r1;
        Modifier r12;
        C147188nY r11 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r11.BCM()) {
            C123327Wm r13 = Modifier.A00;
            C113196qu r0 = this.A04;
            C113196qu r21 = r0;
            Modifier A062 = AnonymousClass7Kq.A06(r13, ((C134847yT) r0.A0B.getValue()).A00);
            C121807If r10 = this.A0A;
            int i = this.A01;
            int i2 = this.A00;
            boolean A1Z = AnonymousClass0wJ.A1Z(A062, r10);
            if (InspectableValueKt.isDebugInspectorInfoEnabled) {
                r1 = new KtLambdaShape5S0102000_I2(r10, i, i2, 2);
            } else {
                r1 = InspectableValueKt.A00;
            }
            Modifier A022 = C120417Am.A02(A062, r1, new KtLambdaShape6S0102000_I2(r10, i, i2, 0));
            AnonymousClass7EJ r7 = this.A03;
            AnonymousClass7HD r19 = this.A0C;
            C146898n3 r18 = this.A0D;
            KtLambdaShape20S0100000_I2 A12 = C86154wM.A12(r21, 29);
            C04220Ms.A0B(A022, 0);
            C967266l r132 = (C967266l) r7.A04.getValue();
            long j = r19.A00;
            int i3 = (int) (j >> 32);
            long j2 = r7.A00;
            if (i3 == ((int) (j2 >> 32)) && (i3 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                i3 = C121767Ia.A01(j);
            }
            r7.A00 = j;
            C134747yH r14 = r19.A01;
            C04220Ms.A0B(r14, A1Z ? 1 : 0);
            C114576tW AMa = r18.AMa(r14);
            C134747yH r5 = AMa.A00;
            C114576tW r2 = new C114576tW(r5, new AnonymousClass7Z0(AMa.A01, r14.length(), r5.length()));
            int ordinal = r132.ordinal();
            if (ordinal == 0) {
                r12 = new AnonymousClass7XZ(r7, r2, A12, i3);
            } else if (ordinal == A1Z) {
                r12 = new AnonymousClass7XY(r7, r2, A12, i3);
            } else {
                throw AnonymousClass4VZ.A00();
            }
            Modifier Cx6 = C115826vy.A00(A022).Cx6(r12).Cx6(this.A06).Cx6(this.A07);
            C04220Ms.A0B(Cx6, 0);
            KtLambdaShape171S0100000_I2 A0w = C86164wN.A0w(r10, 7);
            AnonymousClass0YY r3 = InspectableValueKt.A00;
            Modifier Cx62 = C120417Am.A02(Cx6, r3, A0w).Cx6(this.A09).Cx6(this.A08);
            BringIntoViewRequester bringIntoViewRequester = this.A02;
            C04220Ms.A0B(Cx62, 0);
            if (C86164wN.A1Q(A1Z, bringIntoViewRequester)) {
                r3 = C86154wM.A0z(bringIntoViewRequester, 9);
            }
            Modifier A012 = C120417Am.A01(Cx62, bringIntoViewRequester, r3, 4);
            C121827Ii r6 = this.A05;
            boolean z = this.A0H;
            boolean z2 = this.A0G;
            AnonymousClass0YY r32 = this.A0F;
            AnonymousClass6E9.A00(r11, A012, AnonymousClass7JR.A00(r11, new AnonymousClass8SZ(r21, r6, this.A0B, r19, this.A0E, r32, i2, z, z2), -363167407), 48, 0);
        } else {
            r11.CuJ();
        }
        return Unit.A00;
    }
}
