package com.google.android.gms.phenotype;

import X.AnonymousClass6JA;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens extends AbstractSafeParcelable {
    public static final ExperimentTokens A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(28);
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    public ExperimentTokens(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new ExperimentTokens("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0k = C18240wQ.A0k(r3);
        for (byte[] encodeToString : bArr) {
            A0k.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A0k);
        return A0k;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        if (!AnonymousClass6JA.A00(this.A00, experimentTokens.A00) || !Arrays.equals(this.A01, experimentTokens.A01) || !AnonymousClass6JA.A00(A00(this.A03), A00(experimentTokens.A03)) || !AnonymousClass6JA.A00(A00(this.A04), A00(experimentTokens.A04)) || !AnonymousClass6JA.A00(A00(this.A05), A00(experimentTokens.A05)) || !AnonymousClass6JA.A00(A00(this.A06), A00(experimentTokens.A06))) {
            return false;
        }
        int[] iArr = this.A02;
        if (iArr == null) {
            list = Collections.emptyList();
        } else {
            ArrayList A0k = C18240wQ.A0k(r2);
            for (int A1U : iArr) {
                C18200wM.A1U(A0k, A1U);
            }
            Collections.sort(A0k);
            list = A0k;
        }
        int[] iArr2 = experimentTokens.A02;
        if (iArr2 == null) {
            list2 = Collections.emptyList();
        } else {
            ArrayList A0k2 = C18240wQ.A0k(r2);
            for (int A1U2 : iArr2) {
                C18200wM.A1U(A0k2, A1U2);
            }
            Collections.sort(A0k2);
            list2 = A0k2;
        }
        if (!AnonymousClass6JA.A00(list, list2) || !AnonymousClass6JA.A00(A00(this.A07), A00(experimentTokens.A07))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String A0i;
        StringBuilder A0s = C18190wL.A0s("ExperimentTokens");
        A0s.append("(");
        String str = this.A00;
        if (str == null) {
            A0i = "null";
        } else {
            StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(str) + 2);
            A0s2.append("'");
            A0s2.append(str);
            A0i = C18180wK.A0i("'", A0s2);
        }
        A0s.append(A0i);
        A0s.append(", ");
        byte[] bArr = this.A01;
        A0s.append(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A0s.append("=");
        if (bArr == null) {
            A0s.append("null");
        } else {
            A0s.append("'");
            A0s.append(Base64.encodeToString(bArr, 3));
            A0s.append("'");
        }
        A0s.append(", ");
        A01("GAIA", A0s, this.A03);
        A0s.append(", ");
        A01("PSEUDO", A0s, this.A04);
        A0s.append(", ");
        A01("ALWAYS", A0s, this.A05);
        A0s.append(", ");
        A01("OTHER", A0s, this.A06);
        A0s.append(", ");
        int[] iArr = this.A02;
        A0s.append("weak");
        A0s.append("=");
        if (iArr == null) {
            A0s.append("null");
        } else {
            A0s.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A0s.append(", ");
                }
                A0s.append(i2);
                i++;
                z = false;
            }
            A0s.append(")");
        }
        A0s.append(", ");
        A01("directs", A0s, this.A07);
        return C18180wK.A0i(")", A0s);
    }

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    C86144wL.A1T(sb);
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0L(parcel, this.A01, 3, C122167Ky.A0S(parcel, this.A00));
        C122167Ky.A0O(parcel, this.A03, 4);
        C122167Ky.A0O(parcel, this.A04, 5);
        C122167Ky.A0O(parcel, this.A05, 6);
        C122167Ky.A0O(parcel, this.A06, 7);
        C86144wL.A1B(parcel, this.A02, 8);
        C122167Ky.A0O(parcel, this.A07, 9);
        C122167Ky.A05(parcel, A002);
    }
}
