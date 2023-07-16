package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass6CE;
import X.C28174Ezk;
import X.C86124wJ;
import X.C972168k;
import android.os.Parcel;
import android.os.Parcelable;

public class InstantExperienceGenericErrorResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(76);

    public InstantExperienceGenericErrorResult(C972168k r2) {
        super(r2, C28174Ezk.A00(55));
    }

    public InstantExperienceGenericErrorResult(AnonymousClass6CE r3) {
        super(r3.A00, r3.getMessage());
    }

    public InstantExperienceGenericErrorResult(Parcel parcel) {
        super(parcel);
    }
}
