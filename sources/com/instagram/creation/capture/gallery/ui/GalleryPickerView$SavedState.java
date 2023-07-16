package com.instagram.creation.capture.gallery.ui;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import java.util.Iterator;
import java.util.Map;

public class GalleryPickerView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(17);
    public int A00;
    public String A01;
    public String A02;
    public Map A03 = AnonymousClass0wJ.A0y();
    public boolean A04;
    public boolean A05;
    public float[] A06 = new float[9];
    public String[] A07;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("GalleryPickerView.SavedState{");
        A0s.append(C86144wL.A0u(this));
        A0s.append(" folderId=");
        A0s.append(this.A00);
        A0s.append(" folderName=");
        A0s.append(this.A01);
        A0s.append(" mediumId=");
        A0s.append(this.A02);
        return C18180wK.A0i("}", A0s);
    }

    public GalleryPickerView$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        boolean z = true;
        this.A04 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        parcel.readFloatArray(this.A06);
        this.A07 = parcel.createStringArray();
        this.A05 = parcel.readInt() != 1 ? false : z;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.A03.put(parcel.readString(), C18180wK.A0A(parcel, GalleryPreviewInfo.class));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeStringArray(this.A07);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03.size());
        Iterator A0z = AnonymousClass0wJ.A0z(this.A03);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            parcel.writeString(C18200wM.A0p(A0o));
            parcel.writeParcelable((Parcelable) A0o.getValue(), i);
        }
    }

    public GalleryPickerView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
