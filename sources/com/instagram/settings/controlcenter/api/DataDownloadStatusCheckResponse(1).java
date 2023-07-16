package com.instagram.settings.controlcenter.api;

import X.AnonymousClass1j3;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;

public class DataDownloadStatusCheckResponse extends AnonymousClass1j3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(47);
    public JobStatus A00;
    public String A01;
    public String A02;
    public String A03;

    public enum JobStatus implements Parcelable {
        NO_VALID_DOWNLOADABLE;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = new PCreatorCreatorShape16S0000000_I2_16(48);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, 0);
    }

    public DataDownloadStatusCheckResponse(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (JobStatus) C18180wK.A0A(parcel, JobStatus.class);
    }

    public DataDownloadStatusCheckResponse() {
    }
}
