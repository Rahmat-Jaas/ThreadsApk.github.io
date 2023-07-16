package com.facebook.avatar.autogen.flow;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;

public class AESelfieCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(92);
    public final FaceTrackerModelsProvider A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final ResourcesProvider A04;

    public AESelfieCaptureConfig(FaceTrackerModelsProvider faceTrackerModelsProvider, String str) {
        this.A00 = faceTrackerModelsProvider;
        this.A04 = null;
        this.A01 = str;
        this.A02 = false;
        this.A03 = true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AESelfieCaptureConfig) {
                AESelfieCaptureConfig aESelfieCaptureConfig = (AESelfieCaptureConfig) obj;
                if (!AnonymousClass3ZT.A03(this.A00, aESelfieCaptureConfig.A00) || !AnonymousClass3ZT.A03(this.A04, aESelfieCaptureConfig.A04) || !AnonymousClass3ZT.A03(this.A01, aESelfieCaptureConfig.A01) || this.A02 != aESelfieCaptureConfig.A02 || this.A03 != aESelfieCaptureConfig.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass3ZT.A00(AnonymousClass3ZT.A00((((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01), this.A02), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C86114wI.A13(parcel, this.A00, i);
        C86114wI.A13(parcel, this.A04, i);
        C18190wL.A16(parcel, this.A01, 0, 1);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public AESelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        ResourcesProvider resourcesProvider = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FaceTrackerModelsProvider) parcel.readParcelable(A0Z);
        }
        this.A04 = parcel.readInt() != 0 ? (ResourcesProvider) parcel.readParcelable(A0Z) : resourcesProvider;
        this.A01 = C86114wI.A0l(parcel);
        boolean z = false;
        this.A02 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A03 = parcel.readInt() == 1 ? true : z;
    }
}
