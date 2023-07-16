package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.LinkedHashMap;
import java.util.Map;

public enum INLINE_SURVEY_QUESTION_TYPES implements Parcelable {
    UNRECOGNIZED("INLINE_SURVEY_QUESTION_TYPES_unspecified"),
    SINGLE("single"),
    MULTIPLE("multiple"),
    COMMENT("comment");
    
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
        for (INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types : values()) {
            A0v.put(inline_survey_question_types.A00, inline_survey_question_types);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(18);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    INLINE_SURVEY_QUESTION_TYPES(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
