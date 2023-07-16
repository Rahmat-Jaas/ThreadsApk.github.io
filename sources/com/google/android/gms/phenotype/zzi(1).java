package com.google.android.gms.phenotype;

import X.AnonymousClass6JA;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzi extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(29);
    public final int A00;
    public final String A01;
    public final double A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final boolean A06;
    public final byte[] A07;

    public zzi(String str, String str2, byte[] bArr, double d, int i, int i2, long j, boolean z) {
        this.A01 = str;
        this.A04 = j;
        this.A06 = z;
        this.A02 = d;
        this.A05 = str2;
        this.A07 = bArr;
        this.A03 = i;
        this.A00 = i2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.A01.compareTo(zzi.A01);
        if (compareTo == 0) {
            int i = this.A03;
            int i2 = zzi.A03;
            if (i < i2) {
                return -1;
            }
            if (i != i2) {
                return 1;
            }
            int i3 = 0;
            compareTo = 1;
            if (i != 1) {
                if (i == 2) {
                    boolean z = this.A06;
                    if (z != zzi.A06) {
                        if (z) {
                            return 1;
                        }
                    }
                } else if (i == 3) {
                    return Double.compare(this.A02, zzi.A02);
                } else {
                    if (i == 4) {
                        String str = this.A05;
                        String str2 = zzi.A05;
                        if (str != str2) {
                            if (str != null) {
                                if (str2 != null) {
                                    return str.compareTo(str2);
                                }
                            }
                        }
                    } else if (i == 5) {
                        byte[] bArr = this.A07;
                        byte[] bArr2 = zzi.A07;
                        if (bArr != bArr2) {
                            if (bArr != null) {
                                if (bArr2 != null) {
                                    while (true) {
                                        int length = bArr.length;
                                        int length2 = bArr2.length;
                                        if (i3 < Math.min(length, length2)) {
                                            compareTo = bArr[i3] - bArr2[i3];
                                            if (compareTo != 0) {
                                                break;
                                            }
                                            i3++;
                                        } else if (length < length2) {
                                            return -1;
                                        } else {
                                            compareTo = 0;
                                            if (length != length2) {
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw new AssertionError(C86104wH.A10("Invalid enum value: ", C86114wI.A0s(31), i));
                    }
                }
                return 0;
            }
            long j = this.A04;
            long j2 = zzi.A04;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
            }
            return -1;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zzi = (zzi) obj;
        if (!AnonymousClass6JA.A00(this.A01, zzi.A01) || (i = this.A03) != zzi.A03 || this.A00 != zzi.A00) {
            return false;
        }
        if (i == 1) {
            i2 = (this.A04 > zzi.A04 ? 1 : (this.A04 == zzi.A04 ? 0 : -1));
        } else if (i != 2) {
            if (i == 3) {
                i2 = (this.A02 > zzi.A02 ? 1 : (this.A02 == zzi.A02 ? 0 : -1));
            } else if (i == 4) {
                return AnonymousClass6JA.A00(this.A05, zzi.A05);
            } else {
                if (i == 5) {
                    return Arrays.equals(this.A07, zzi.A07);
                }
                throw new AssertionError(C86104wH.A10("Invalid enum value: ", C86114wI.A0s(31), i));
            }
        } else if (this.A06 == zzi.A06) {
            return true;
        } else {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("Flag(");
        String str2 = this.A01;
        A0s.append(str2);
        A0s.append(", ");
        int i = this.A03;
        if (i == 1) {
            A0s.append(this.A04);
        } else if (i == 2) {
            A0s.append(this.A06);
        } else if (i != 3) {
            if (i == 4) {
                A0s.append("'");
                str = this.A05;
            } else if (i == 5) {
                byte[] bArr = this.A07;
                if (bArr == null) {
                    A0s.append("null");
                } else {
                    A0s.append("'");
                    str = Base64.encodeToString(bArr, 3);
                }
            } else {
                StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(str2) + 27);
                A0s2.append("Invalid type: ");
                A0s2.append(str2);
                throw new AssertionError(C86104wH.A10(", ", A0s2, i));
            }
            A0s.append(str);
            A0s.append("'");
        } else {
            A0s.append(this.A02);
        }
        A0s.append(", ");
        A0s.append(i);
        A0s.append(", ");
        A0s.append(this.A00);
        return C18180wK.A0i(")", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0S = C122167Ky.A0S(parcel, this.A01);
        C122167Ky.A09(parcel, 3, this.A04);
        C122167Ky.A0B(parcel, 4, this.A06);
        double d = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        C122167Ky.A0H(parcel, this.A05, 6, A0S);
        C122167Ky.A0L(parcel, this.A07, 7, A0S);
        C122167Ky.A08(parcel, 8, this.A03);
        C122167Ky.A08(parcel, 9, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
