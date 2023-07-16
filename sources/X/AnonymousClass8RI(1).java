package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;

/* renamed from: X.8RI  reason: invalid class name */
public final class AnonymousClass8RI extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ MutableTransitionState A00;
    public final /* synthetic */ C110696m7 A01;
    public final /* synthetic */ AnonymousClass0YY A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RI(MutableTransitionState mutableTransitionState, C110696m7 r3, AnonymousClass0YY r4, boolean z, boolean z2) {
        super(2);
        this.A01 = r3;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = r4;
        this.A00 = mutableTransitionState;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int intValue;
        C147188nY r0 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
            Modifier modifier = Modifier.A00;
            C110696m7 r6 = this.A01;
            Integer num = r6.A01;
            float f = (float) 20;
            float f2 = f;
            if (num != null) {
                f = (float) 16;
            }
            if (this.A03) {
                f2 = (float) 0;
            }
            float f3 = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(modifier, f, f3, f2, f3);
            C141758cu r7 = AnonymousClass7KV.A04;
            boolean z = this.A04;
            AnonymousClass0YY r37 = this.A02;
            MutableTransitionState mutableTransitionState = this.A00;
            C146288ly A0g = C147188nY.A0g(r0, r7);
            Object A0p = C147188nY.A0p(r0);
            Object A0n = C147188nY.A0n(r0);
            Object A0m = C147188nY.A0m(r0);
            AnonymousClass0ZU r8 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A05);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r8);
            AnonymousClass7W3.A0a(r0, r2, A0g, A0p);
            AnonymousClass7KP.A07(r0, A0n, A0m, A002);
            AnonymousClass7VA r72 = AnonymousClass7VA.A00;
            r0.Cvb(317318560);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1) {
                if (intValue == 0) {
                    r0.Cvb(1492534259);
                    C101286Qp.A00(r0, AnonymousClass7K4.A05(modifier, f3, f3, (float) 10, f3), C101296Qq.A00(r0), 6, 0, C147188nY.A0R(r0, AnonymousClass6YS.A00));
                } else if (intValue != 1) {
                    r0.Cvb(1492534859);
                    AnonymousClass7W3.A0w(r2, false);
                } else {
                    r0.Cvb(1492534506);
                    C147188nY r18 = r0;
                    C1190173e.A00(r18, AnonymousClass7Kq.A0F(AnonymousClass7Kq.A03((Alignment) null, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(modifier, f3, f3, (float) 10, f3), 24), 3), 16), AnonymousClass6QP.A00(r0, R.drawable.instagram_check_pano_filled_24), (String) null, 440, 0, C147188nY.A0R(r0, AnonymousClass6YS.A00));
                }
                AnonymousClass7W3.A0w(r2, false);
            } else {
                r0.Cvb(1492534845);
                AnonymousClass7W3.A0w(r2, false);
            }
            String str = r6.A03;
            int i = 12;
            if (z) {
                i = 16;
            }
            Modifier A06 = AnonymousClass7K4.A06(modifier, f3, i);
            if (z) {
                modifier = C146818mu.A00(r72, modifier, true);
            }
            Modifier Cx6 = A06.Cx6(modifier);
            int i2 = 3;
            if (z) {
                i2 = 5;
            }
            C147188nY r182 = r0;
            AnonymousClass7I9.A02(r182, Cx6, AnonymousClass7J9.A04(r0), (C114236su) null, (C134817yQ) null, C121117Ee.A01(i2), str, 0, 0, 0, 0, 0, 1980, 0, 0, false);
            String str2 = r6.A02;
            if (str2 != null) {
                C117726z9.A01(new KtLambdaShape18S0200000_I2_2(44, r37, mutableTransitionState), str2, r0, 0);
            }
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r0.CuJ();
        }
        return Unit.A00;
    }
}
