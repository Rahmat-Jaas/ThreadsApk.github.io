package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass8bI;
import X.C02220Ah;
import X.C86144wL;
import com.facebook.react.uimanager.BaseViewManager;

public class KtLambdaShape2S0000001_I2 extends C02220Ah implements AnonymousClass0ZU {
    public float A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0000001_I2(float f, int i) {
        super(0);
        this.A01 = i;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        float A012;
        int i = this.A01;
        float f = this.A00;
        if (i != 0) {
            float f2 = (f - 0.2f) / 0.8f;
            A012 = C86144wL.A00(((float) 1) - f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, 1.0f);
        } else {
            float f3 = f / 0.3f;
            A012 = AnonymousClass8bI.A01(C86144wL.A00(((float) 1) - f3, 1.0f, f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        }
        return Float.valueOf(A012);
    }
}
