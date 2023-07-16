package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape2S0000000_I2;

/* renamed from: X.8TK  reason: invalid class name */
public final class AnonymousClass8TK extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass79L A04;
    public final /* synthetic */ C147258p3 A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C142918fo A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YP A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TK(AnonymousClass79L r2, C147258p3 r3, Modifier modifier, C142918fo r5, AnonymousClass0ZU r6, AnonymousClass0YP r7, float f, float f2, int i, long j, boolean z) {
        super(2);
        this.A06 = modifier;
        this.A07 = r5;
        this.A03 = j;
        this.A00 = f;
        this.A02 = i;
        this.A04 = r2;
        this.A01 = f2;
        this.A05 = r3;
        this.A0A = z;
        this.A08 = r6;
        this.A09 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0YY r1;
        C147188nY r15 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r15.BCM()) {
            Modifier modifier = this.A06;
            if (C86164wN.A1Q(0, modifier)) {
                r1 = new KtLambdaShape2S0000000_I2(6);
            } else {
                r1 = InspectableValueKt.A00;
            }
            Modifier A022 = C120417Am.A02(modifier, r1, AnonymousClass8Zh.A00);
            C142918fo r8 = this.A07;
            long j = this.A03;
            float f = this.A00;
            int i = this.A02;
            long A002 = AnonymousClass7Ah.A00((C141708cp) r15.AEA(AnonymousClass6ZL.A01), r15, f, j);
            AnonymousClass79L r6 = this.A04;
            float f2 = this.A01;
            long j2 = C102736Wi.A00;
            Modifier A003 = AnonymousClass6EW.A00(A022, r8, f2, j2, j2, false);
            Modifier modifier2 = Modifier.A00;
            if (r6 != null) {
                modifier2 = AnonymousClass7Ac.A01(r6, modifier2, r8);
            }
            Modifier A012 = C115826vy.A01(C115656vh.A01(A003.Cx6(modifier2), r8, A002), r8);
            C147258p3 r5 = this.A05;
            Modifier A004 = AnonymousClass7HZ.A00(AnonymousClass72Y.A00(r15, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 7, 0, false), r5, A012, (AnonymousClass799) null, (String) null, this.A08, this.A0A);
            AnonymousClass0YP r82 = this.A09;
            C146288ly A072 = AnonymousClass7KV.A07(r15, true);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A005 = C98236Es.A00(A004);
            AnonymousClass7W3 r12 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r12, r2);
            AnonymousClass7W3.A0a(r15, r12, A072, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A005);
            C86104wH.A1S(r15, r82, i >> 27);
            AnonymousClass7W3.A0w(r12, false);
            AnonymousClass7W3.A0e(r12);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
