package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DynamicCreativeOptimizationDoFType implements Parcelable {
    UNRECOGNIZED("DynamicCreativeOptimizationDoFType_unspecified"),
    DISABLED("DISABLED"),
    USER_ENROLLED_AUTOFLOW("USER_ENROLLED_AUTOFLOW"),
    USER_ENROLLED_LWI_ACO("USER_ENROLLED_LWI_ACO"),
    USER_ENROLLED_NON_DCO("USER_ENROLLED_NON_DCO"),
    USER_ENROLLED_IMAGE_CROPPING_NON_DCO("USER_ENROLLED_IMAGE_CROPPING_NON_DCO"),
    USER_ENROLLED("USER_ENROLLED"),
    VIDEO_TEMPLATES("VIDEO_TEMPLATES"),
    FAM_TOGGLE_ON("FAM_TOGGLE_ON"),
    FAM_TOGGLE_OFF("FAM_TOGGLE_OFF"),
    SMART_CROP_ELIGIBLE_ON("SMART_CROP_ELIGIBLE_ON"),
    SMART_CROP_ELIGIBLE_OFF("SMART_CROP_ELIGIBLE_OFF"),
    SMART_CROP_INELIGIBLE_ON("SMART_CROP_INELIGIBLE_ON"),
    SMART_CROP_INELIGIBLE_OFF("SMART_CROP_INELIGIBLE_OFF");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType : values()) {
            A0v.put(dynamicCreativeOptimizationDoFType.A00, dynamicCreativeOptimizationDoFType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DynamicCreativeOptimizationDoFType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
