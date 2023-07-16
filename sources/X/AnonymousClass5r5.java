package X;

import android.app.PendingIntent;
import java.util.List;

/* renamed from: X.5r5  reason: invalid class name */
public final class AnonymousClass5r5 extends AnonymousClass6JD {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final PendingIntent A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public AnonymousClass5r5(PendingIntent pendingIntent, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = pendingIntent;
        this.A08 = list3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass6JD) {
                AnonymousClass5r5 r8 = (AnonymousClass5r5) ((AnonymousClass6JD) obj);
                if (this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A04 == r8.A04) {
                    List list = this.A06;
                    List list2 = r8.A06;
                    if (list != null ? list.equals(list2) : list2 == null) {
                        List list3 = this.A07;
                        List list4 = r8.A07;
                        if (list3 != null ? list3.equals(list4) : list4 == null) {
                            PendingIntent pendingIntent = this.A05;
                            PendingIntent pendingIntent2 = r8.A05;
                            if (pendingIntent != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) {
                                List list5 = this.A08;
                                List list6 = r8.A08;
                                if (list5 != null ? list5.equals(list6) : list6 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List list = this.A06;
        int i5 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i6 = (i4 ^ hashCode) * 1000003;
        List list2 = this.A07;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int A032 = (((i6 ^ hashCode2) * 1000003) ^ AnonymousClass0wJ.A03(this.A05)) * 1000003;
        List list3 = this.A08;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return A032 ^ i5;
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        String valueOf = String.valueOf(this.A06);
        String valueOf2 = String.valueOf(this.A07);
        String valueOf3 = String.valueOf(this.A05);
        String valueOf4 = String.valueOf(this.A08);
        int A0A = C86104wH.A0A(valueOf);
        int A0A2 = C86104wH.A0A(valueOf2);
        StringBuilder A0s = C86114wI.A0s(A0A + 251 + A0A2 + C86104wH.A0A(valueOf3) + C86104wH.A0A(valueOf4));
        A0s.append("SplitInstallSessionState{sessionId=");
        A0s.append(i);
        A0s.append(", status=");
        A0s.append(i2);
        A0s.append(", errorCode=");
        A0s.append(i3);
        A0s.append(", bytesDownloaded=");
        A0s.append(j);
        A0s.append(", totalBytesToDownload=");
        A0s.append(j2);
        A0s.append(", moduleNamesNullable=");
        A0s.append(valueOf);
        A0s.append(", languagesNullable=");
        A0s.append(valueOf2);
        A0s.append(", resolutionIntent=");
        A0s.append(valueOf3);
        A0s.append(", splitFileIntents=");
        A0s.append(valueOf4);
        return C18180wK.A0i("}", A0s);
    }
}
