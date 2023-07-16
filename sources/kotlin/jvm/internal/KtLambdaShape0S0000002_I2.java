package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.AnonymousClass7F6;
import X.AnonymousClass7KC;
import X.AnonymousClass7KE;
import X.AnonymousClass7X0;
import X.C02220Ah;
import X.C04220Ms;
import X.C104136bI;
import X.C134847yT;
import X.C1371586i;
import X.C146678mg;
import X.C147558pX;
import X.C147848q1;
import X.C86104wH;
import X.C877353x;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import kotlin.Unit;

public class KtLambdaShape0S0000002_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public float A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0000002_I2(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 6:
                this.A00 = f;
                this.A01 = f2;
                break;
            default:
                this.A01 = f;
                this.A00 = f2;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1371586i r2;
        C134847yT r1;
        String str;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
                r2 = AnonymousClass75O.A00(obj2);
                r2.A01("x", C134847yT.A00(this.A00));
                r1 = C134847yT.A00(this.A01);
                str = "y";
                break;
            case 1:
                r2 = AnonymousClass75O.A00(obj2);
                r2.A01("horizontal", C134847yT.A00(this.A00));
                r1 = C134847yT.A00(this.A01);
                str = "vertical";
                break;
            case 2:
                r2 = AnonymousClass75O.A00(obj2);
                r2.A01("minWidth", C134847yT.A00(this.A01));
                r1 = C134847yT.A00(this.A00);
                str = "minHeight";
                break;
            case 3:
            case 5:
                r2 = AnonymousClass75O.A00(obj2);
                r2.A01("min", C134847yT.A00(this.A01));
                r1 = C134847yT.A00(this.A00);
                str = "max";
                break;
            case 4:
                r2 = AnonymousClass75O.A00(obj2);
                r2.A01(IgReactMediaPickerNativeModule.WIDTH, C134847yT.A00(this.A01));
                r1 = C134847yT.A00(this.A00);
                str = IgReactMediaPickerNativeModule.HEIGHT;
                break;
            default:
                C147558pX r9 = (C147558pX) obj2;
                C04220Ms.A0B(r9, 0);
                C146678mg A012 = C147848q1.A01(r9);
                long j = AnonymousClass7KC.A03;
                float A002 = C147848q1.A00(r9);
                AnonymousClass7F6 r12 = new AnonymousClass7F6(AnonymousClass7KC.A01(j) - A002, AnonymousClass7KC.A02(j) - A002, AnonymousClass7KC.A01(j) + A002, AnonymousClass7KC.A02(j) + A002);
                AnonymousClass7X0 r0 = new AnonymousClass7X0();
                float f = this.A00;
                float f2 = this.A01;
                try {
                    A012.Cfv(r12, r0);
                    r9.AIq();
                    float A003 = C147848q1.A00(r9);
                    long j2 = AnonymousClass7KE.A05;
                    r9.AIp((C104136bI) null, C877353x.A00, (A003 / ((float) 2)) + r9.CxL(f), 1.0f, 5, j2, AnonymousClass7KC.A04(r9.AX0(), C86104wH.A0C(A003 - r9.CxL(f2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)));
                    break;
                } finally {
                    A012.Ces();
                }
        }
        r2.A01(str, r1);
        return Unit.A00;
    }
}
