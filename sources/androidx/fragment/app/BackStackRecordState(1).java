package androidx.fragment.app;

import X.AnonymousClass01J;
import X.AnonymousClass05N;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;
import java.util.ArrayList;

public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(2);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public BackStackRecordState(AnonymousClass01J r12) {
        String str;
        ArrayList arrayList = r12.A0C;
        int size = arrayList.size();
        int[] iArr = new int[(size * 6)];
        this.A0D = iArr;
        if (r12.A0F) {
            ArrayList arrayList2 = new ArrayList(size);
            this.A07 = arrayList2;
            int[] iArr2 = new int[size];
            this.A0C = iArr2;
            int[] iArr3 = new int[size];
            this.A0B = iArr3;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass05N r10 = (AnonymousClass05N) arrayList.get(i2);
                int i3 = i + 1;
                iArr[i] = r10.A00;
                Fragment fragment = r10.A05;
                if (fragment != null) {
                    str = fragment.mWho;
                } else {
                    str = null;
                }
                arrayList2.add(str);
                int i4 = i3 + 1;
                iArr[i3] = r10.A08;
                int i5 = i4 + 1;
                iArr[i4] = r10.A01;
                int i6 = i5 + 1;
                iArr[i5] = r10.A02;
                int i7 = i6 + 1;
                iArr[i6] = r10.A03;
                i = i7 + 1;
                iArr[i7] = r10.A04;
                iArr2[i2] = r10.A07.ordinal();
                iArr3[i2] = r10.A06.ordinal();
            }
            this.A03 = r12.A07;
            this.A06 = r12.A0A;
            this.A02 = r12.A01;
            this.A01 = r12.A02;
            this.A05 = r12.A09;
            this.A00 = r12.A01;
            this.A04 = r12.A08;
            this.A08 = r12.A0D;
            this.A09 = r12.A0E;
            this.A0A = r12.A0G;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackRecordState(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = parcel.readInt() != 0;
    }
}
