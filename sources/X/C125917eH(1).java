package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* renamed from: X.7eH  reason: invalid class name and case insensitive filesystem */
public final class C125917eH implements C146918n5 {
    public final C121547Gq A00;
    public final C147128nR A01;
    public final C98796Gy A02;

    public final AnonymousClass5Id CX6(AnonymousClass68S r14, List list) {
        Object A0n;
        int i;
        FeatureData featureData;
        Type type;
        C04220Ms.A0B(r14, 1);
        try {
            C147128nR r3 = this.A01;
            KtCSuperShape1S2110000_I2 A0N = C86134wK.A0N("use_case_name", r3.BJq(), 4, 0);
            C121547Gq r6 = this.A00;
            r6.A02(r14, A0N, "no_use_case");
            r6.A02(r14, C86134wK.A0N("use_case_version", r3.BJs(), 4, 0), "no_use_case");
            HashMap hashMap = ((Example) list.get(0)).A02;
            if (hashMap.isEmpty()) {
                A0n = AnonymousClass0ZV.A00;
            } else {
                List list2 = C103946az.A02;
                int size = list2.size();
                float[] fArr = new float[size];
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    FeatureData featureData2 = (FeatureData) hashMap.get(list2.get(i2));
                    if (featureData2 == null || (type = featureData2.A02) == null) {
                        i = -1;
                    } else {
                        i = type.ordinal();
                    }
                    float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    if (i == 1) {
                        FeatureData featureData3 = (FeatureData) hashMap.get(list2.get(i2));
                        if (featureData3 != null) {
                            f = (float) featureData3.A00;
                        }
                    } else if (i == 0 && (featureData = (FeatureData) hashMap.get(list2.get(i2))) != null) {
                        f = (float) featureData.A01;
                    }
                    fArr[i2] = f;
                }
                r6.A02(r14, C86134wK.A0N("transform_features", (String) null, 6, 1), "no_use_case");
                int i3 = size + 1;
                float[] fArr2 = new float[i3];
                Random random = new Random();
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr2[i4] = random.nextFloat();
                }
                int i5 = 0;
                float f2 = fArr2[0];
                while (i5 < size) {
                    int i6 = i5 + 1;
                    f2 = C86164wN.A03(fArr, fArr2[i6], f2, i5);
                    i5 = i6;
                }
                A0n = C18180wK.A0n(Double.valueOf((double) f2));
                r6.A02(r14, C86134wK.A0N("prediction_computations_complete", (String) null, 6, 1), "no_use_case");
            }
            return AnonymousClass5Id.A01(A0n, (String) null, true);
        } catch (Exception e) {
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, e.getMessage(), false);
        }
    }

    public C125917eH(C121547Gq r2, C147128nR r3, C98796Gy r4) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
