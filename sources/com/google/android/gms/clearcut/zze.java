package com.google.android.gms.clearcut;

import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(99);
    public zzr A00;
    public byte[] A01;
    public boolean A02;
    public int[] A03;
    public int[] A04;
    public ExperimentTokens[] A05;
    public String[] A06;
    public byte[][] A07;

    public zze(zzr zzr, byte[] bArr, int[] iArr, int[] iArr2, ExperimentTokens[] experimentTokensArr, String[] strArr, byte[][] bArr2, boolean z) {
        this.A00 = zzr;
        this.A01 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = experimentTokensArr;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zze) {
                zze zze = (zze) obj;
                if (!C117046y2.A01(this.A00, zze.A00) || !Arrays.equals(this.A01, zze.A01) || !Arrays.equals(this.A03, zze.A03) || !Arrays.equals(this.A06, zze.A06) || !Arrays.equals(this.A04, zze.A04) || !Arrays.deepEquals(this.A07, zze.A07) || !Arrays.equals(this.A05, zze.A05) || this.A02 != zze.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A03, this.A06, null, null, null, this.A04, this.A07, this.A05, Boolean.valueOf(this.A02)});
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("LogEventParcelable[");
        A0s.append(this.A00);
        A0s.append(", LogEventBytes: ");
        byte[] bArr = this.A01;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A0s.append(str);
        A0s.append(", TestCodes: ");
        A0s.append(Arrays.toString(this.A03));
        A0s.append(", MendelPackages: ");
        A0s.append(Arrays.toString(this.A06));
        A0s.append(", LogEvent: ");
        A0s.append((Object) null);
        A0s.append(", ExtensionProducer: ");
        A0s.append((Object) null);
        A0s.append(", VeProducer: ");
        A0s.append((Object) null);
        A0s.append(", ExperimentIDs: ");
        A0s.append(Arrays.toString(this.A04));
        A0s.append(", ExperimentTokens: ");
        A0s.append(Arrays.toString(this.A07));
        A0s.append(", ExperimentTokensParcelables: ");
        A0s.append(Arrays.toString(this.A05));
        A0s.append(", AddPhenotypeExperimentTokens: ");
        A0s.append(this.A02);
        return C18180wK.A0i("]", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0L(parcel, this.A01, 3, C122167Ky.A0Q(parcel, this.A00, i));
        C86144wL.A1B(parcel, this.A03, 4);
        C122167Ky.A0N(parcel, this.A06, 5);
        C86144wL.A1B(parcel, this.A04, 6);
        C122167Ky.A0O(parcel, this.A07, 7);
        C122167Ky.A0B(parcel, 8, this.A02);
        C122167Ky.A0M(parcel, this.A05, 9, i);
        C122167Ky.A05(parcel, A002);
    }
}
