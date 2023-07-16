package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape1S0000001_I2;

/* renamed from: X.8RJ  reason: invalid class name */
public final class AnonymousClass8RJ extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C970267q A02;
    public final /* synthetic */ C968366w A03;
    public final /* synthetic */ AnonymousClass0YP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RJ(C970267q r2, C968366w r3, AnonymousClass0YP r4, float f, int i) {
        super(2);
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = f;
        this.A04 = r4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0YY r0;
        C147188nY r11 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r11.BCM()) {
            C123327Wm r6 = Modifier.A00;
            C970267q r5 = this.A02;
            C970267q r4 = C970267q.TARGET_POST;
            int i = 100;
            float f = (float) 100;
            if (r5 == r4) {
                f = (float) 116;
            }
            if (this.A03 != C968366w.Video) {
                i = 60;
            }
            float f2 = (float) i;
            int i2 = 450;
            if (r5 == r4) {
                i2 = 520;
            }
            Modifier A0E = AnonymousClass7Kq.A0E(r6, f, f2, Float.NaN, (float) i2);
            float f3 = this.A00;
            if (C86164wN.A1Q(0, A0E)) {
                r0 = new KtLambdaShape1S0000001_I2(f3, 12);
            } else {
                r0 = InspectableValueKt.A00;
            }
            long j = C120537Bh.A00(r11).A0W;
            Modifier A022 = AnonymousClass7Ac.A02(A0E.Cx6(new AnonymousClass555(r0, f3)), AnonymousClass7G5.A00((float) 8), (float) 1, j);
            AnonymousClass0YP r8 = this.A04;
            int i3 = this.A01;
            C146288ly A07 = AnonymousClass7KV.A07(r11, true);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A022);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r1, r2);
            AnonymousClass7W3.A0a(r11, r1, A07, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A002);
            r11.Cvb(-161624920);
            C86104wH.A1S(r11, r8, i3 >> 18);
            AnonymousClass7W3.A0v(r1, true);
        } else {
            r11.CuJ();
        }
        return Unit.A00;
    }
}
