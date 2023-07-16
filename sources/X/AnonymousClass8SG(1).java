package X;

import android.app.Activity;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.common.dextricks.Constants;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0000001_I2;
import kotlin.jvm.internal.KtLambdaShape5S0300000_I2;

/* renamed from: X.8SG  reason: invalid class name */
public final class AnonymousClass8SG extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ AnonymousClass56U A04;
    public final /* synthetic */ C10300i6 A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0YP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SG(Activity activity, C81784oM r3, AnonymousClass56U r4, C10300i6 r5, AnonymousClass0ZU r6, AnonymousClass0YP r7, float f, int i) {
        super(2);
        this.A06 = r6;
        this.A01 = i;
        this.A00 = f;
        this.A04 = r4;
        this.A02 = activity;
        this.A07 = r7;
        this.A05 = r5;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0YY r7;
        C147188nY r3 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r3.BCM()) {
            C123327Wm r5 = Modifier.A00;
            AnonymousClass54z r0 = AnonymousClass7Kq.A01;
            Modifier A012 = AnonymousClass7FI.A01(r5.Cx6(r0));
            AnonymousClass0ZU r37 = this.A06;
            int i = this.A01;
            float f = this.A00;
            AnonymousClass56U r36 = this.A04;
            Activity activity = this.A02;
            AnonymousClass0YP r34 = this.A07;
            C10300i6 r33 = this.A05;
            C81784oM r32 = this.A03;
            C146288ly A072 = AnonymousClass7KV.A07(r3, false);
            AnonymousClass534 A0b = C147188nY.A0b(r3, -1323940314);
            Object AEA = r3.AEA(A0b);
            AnonymousClass534 r6 = AnonymousClass7DE.A07;
            Object AEA2 = r3.AEA(r6);
            AnonymousClass534 r4 = AnonymousClass7DE.A0B;
            Object AEA3 = r3.AEA(r4);
            AnonymousClass0ZU r14 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A012);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r3;
            C147188nY.A0w(r3, r1, r14);
            r1.A0T = false;
            AnonymousClass0YP r13 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r3, A072, AEA, r13);
            AnonymousClass0YP r12 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r3, AEA2, r12);
            Integer A052 = AnonymousClass7KP.A05(r3, AEA3, A013, A002);
            r3.Cvb(2058660585);
            AnonymousClass7V3 r16 = AnonymousClass7V3.A00;
            r3.Cvb(-1130411760);
            Modifier A014 = AnonymousClass7FI.A01(r5.Cx6(r0));
            C146288ly A053 = AnonymousClass7KV.A05(r3);
            Object A0t = C147188nY.A0t(r3, A0b, -1323940314);
            Object AEA4 = r3.AEA(r6);
            Object AEA5 = r3.AEA(r4);
            AnonymousClass0YM A004 = C98236Es.A00(A014);
            C147188nY.A0w(r3, r1, r14);
            r1.A0T = false;
            AnonymousClass7Ak.A02(r3, A053, r13);
            AnonymousClass7Ak.A02(r3, A0t, A003);
            A004.invoke(AnonymousClass7KP.A03(r3, AEA4, AEA5, r12, A013), r3, A052);
            r3.Cvb(2058660585);
            AnonymousClass7V5 r62 = AnonymousClass7V5.A00;
            r3.Cvb(-1260701606);
            String language = ((AnonymousClass7ZA) ((AnonymousClass79B) C102886Wx.A00.Ab9().A01.get(0)).A00).A00.getLanguage();
            C04220Ms.A06(language);
            boolean equals = language.equals("en");
            int i2 = R.drawable.login_background_non_en;
            if (equals) {
                i2 = R.drawable.login_background_en;
            }
            C115286uo A022 = AnonymousClass7FS.A02(r3, i2);
            Alignment alignment = AnonymousClass7KV.A06;
            C146878n1 r24 = AnonymousClass74L.A00;
            Modifier A005 = r62.A00(AnonymousClass7KV.A00, r5);
            if (C86164wN.A1Q(0, A005)) {
                r7 = new KtLambdaShape1S0000001_I2(f, 6);
            } else {
                r7 = InspectableValueKt.A00;
            }
            float f2 = (float) 0;
            C97846Dc.A00(r3, alignment, AnonymousClass7K4.A05(A005.Cx6(new AnonymousClass55A(r7, f, Float.NaN, f, Float.NaN, false)), f2, f2, f2, (float) 194), (C104136bI) null, A022, r24, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 27704, 96);
            C115686vk.A01(r3, r62.DB5(r5, 1.0f, true), 0);
            AnonymousClass7W3.A0v(r1, true);
            Activity activity2 = activity;
            AnonymousClass56U r63 = r36;
            KtLambdaShape10S0300000_I2 A0y = C86154wM.A0y(activity2, r63, r34, 41);
            KtLambdaShape5S0300000_I2 A15 = C86154wM.A15(activity2, r63, r33, 33);
            boolean z = ((KtCSuperShape0S0210000_I2) r32.getValue()).A02;
            AnonymousClass7V3 r02 = r16;
            C121327Fm.A02(r3, AnonymousClass7K4.A08(r02.A86(alignment, Modifier.A04(r5)), 24), (Integer) ((KtCSuperShape0S0210000_I2) r32.getValue()).A00, (List) ((KtCSuperShape0S0210000_I2) r32.getValue()).A01, r37, A15, A0y, ((i >> 6) & 14) | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 0, z);
            AnonymousClass7W3.A0v(r1, true);
        } else {
            r3.CuJ();
        }
        return Unit.A00;
    }
}
