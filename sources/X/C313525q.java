package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;

/* renamed from: X.25q  reason: invalid class name and case insensitive filesystem */
public enum C313525q {
    NEXT(0),
    SKIP(1);
    
    public final int A00;

    public static void A00(ImmutableList.Builder builder, ConversionStep conversionStep) {
        builder.add((Object) new BusinessConversionStep(NEXT, conversionStep));
    }

    /* access modifiers changed from: public */
    C313525q(int i) {
        this.A00 = i;
    }
}
