package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass52Y;
import X.AnonymousClass5D6;
import X.AnonymousClass6ZQ;
import X.AnonymousClass7An;
import X.AnonymousClass7DB;
import X.AnonymousClass7F6;
import X.AnonymousClass7Hh;
import X.AnonymousClass7KC;
import X.AnonymousClass7X1;
import X.AnonymousClass7X9;
import X.AnonymousClass8bI;
import X.C02220Ah;
import X.C04220Ms;
import X.C104136bI;
import X.C111216my;
import X.C121127Eg;
import X.C121167El;
import X.C123657Xy;
import X.C146278lx;
import X.C146708mj;
import X.C147018nF;
import X.C147848q1;
import X.C18240wQ;
import X.C81784oM;
import X.C86104wH;
import X.C86114wI;
import X.C877253w;
import X.C877353x;
import android.graphics.Matrix;
import android.graphics.Path;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.uimanager.BaseViewManager;
import com.fbpay.logging.LoggingContext;
import kotlin.Unit;

public class KtLambdaShape2S0200100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0200100_I2(int i, long j, Object obj, Object obj2) {
        super(1);
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(obj2, 0);
                AnonymousClass52Y r6 = (AnonymousClass52Y) this.A02;
                C81784oM A002 = r6.A00.A00(r6.A03, new KtLambdaShape4S0100100_I2(this.A00, r6, 3));
                C123657Xy r62 = (C123657Xy) this.A01;
                long j = ((C121127Eg) A002.getValue()).A00;
                AnonymousClass0YY r3 = AnonymousClass6ZQ.A01;
                C04220Ms.A0B(r62, 0);
                r62.A0E(r3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7Hh.A01(j, C123657Xy.A08(r62)));
                break;
            case 4:
                C147848q1 r2 = (C147848q1) obj2;
                C04220Ms.A0B(r2, 0);
                C111216my r1 = (C111216my) this.A02;
                float A003 = C18240wQ.A00(r1.A06.getValue()) / r1.A01;
                float max = (Math.max(Math.min(1.0f, A003) - 0.4f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) * ((float) 5)) / ((float) 3);
                float A012 = AnonymousClass8bI.A01(Math.abs(A003) - 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 2.0f);
                float A013 = AnonymousClass8bI.A01(A003, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                float pow = (((0.4f * max) - 16.0f) + (A012 - (((float) Math.pow((double) A012, (double) 2)) / ((float) 4)))) * 0.5f;
                float f = (float) 360;
                float f2 = pow * f;
                float f3 = ((0.8f * max) + pow) * f;
                float min = Math.min(1.0f, max);
                long j2 = this.A00;
                C147018nF r13 = (C147018nF) this.A01;
                long AX0 = r2.AX0();
                C146708mj Ae6 = r2.Ae6();
                AnonymousClass7X9 r7 = (AnonymousClass7X9) Ae6;
                C121167El r15 = r7.A01.A02;
                long A004 = C121167El.A00(r15);
                C146278lx r14 = r7.A00;
                r14.CfJ(AX0, pow);
                float CxL = r2.CxL(AnonymousClass7DB.A00);
                float f4 = AnonymousClass7DB.A03;
                float CxL2 = CxL + (r2.CxL(f4) / 2.0f);
                long BCH = r2.BCH();
                AnonymousClass7F6 r0 = new AnonymousClass7F6(AnonymousClass7KC.A01(AnonymousClass7An.A01(BCH)) - CxL2, AnonymousClass7KC.A02(AnonymousClass7An.A01(BCH)) - CxL2, AnonymousClass7KC.A01(AnonymousClass7An.A01(BCH)) + CxL2, AnonymousClass7KC.A02(AnonymousClass7An.A01(BCH)) + CxL2);
                float f5 = r0.A01;
                float f6 = r0.A03;
                long A0C = C86104wH.A0C(f5, f6);
                float f7 = r0.A02 - f5;
                float f8 = r0.A00 - f6;
                long A0C2 = C86104wH.A0C(f7, f8);
                C147848q1 r22 = r2;
                r22.AIm((C104136bI) null, new C877253w(r2.CxL(f4), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 2, 0, 26), f2, f3 - f2, A013, 3, j2, A0C, A0C2, false);
                AnonymousClass7X1 r11 = (AnonymousClass7X1) r13;
                Path path = r11.A01;
                path.reset();
                path.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float f9 = AnonymousClass7DB.A02;
                path.lineTo(r2.CxL(f9) * min, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                path.lineTo((r2.CxL(f9) * min) / ((float) 2), r2.CxL(AnonymousClass7DB.A01) * min);
                long A0C3 = C86104wH.A0C(((Math.min(f7, f8) / 2.0f) + AnonymousClass7KC.A01(r0.A01())) - ((r2.CxL(f9) * min) / 2.0f), AnonymousClass7KC.A02(r0.A01()) + (r2.CxL(f4) / 2.0f));
                Matrix matrix = r11.A00;
                matrix.reset();
                matrix.setTranslate(AnonymousClass7KC.A01(A0C3), AnonymousClass7KC.A02(A0C3));
                path.transform(matrix);
                path.close();
                long AX02 = r2.AX0();
                long A005 = C121167El.A00(r15);
                r14.CfJ(AX02, f3);
                r2.AJ7((C104136bI) null, r13, C877353x.A00, A013, 3, j2);
                C146708mj.A00(r15, Ae6, A005);
                C146708mj.A00(r15, Ae6, A004);
                break;
            default:
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj2;
                AnonymousClass5D6 r32 = new AnonymousClass5D6();
                C86104wH.A1K(r32, (LoggingContext) this.A02);
                r32.A09("paypal_billing_agreement_id", Long.valueOf(this.A00));
                C86114wI.A1C(uSLEBaseShape0S0000000, r32);
                C86114wI.A1G(uSLEBaseShape0S0000000, this.A01);
                return uSLEBaseShape0S0000000;
        }
        return Unit.A00;
    }
}
