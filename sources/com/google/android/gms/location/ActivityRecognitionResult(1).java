package com.google.android.gms.location;

import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(20);
    public int A00;
    public long A01;
    public long A02;
    public Bundle A03;
    public List A04;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
        if (r10 == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.os.Bundle r9, android.os.Bundle r10) {
        /*
            r8 = 1
            if (r9 != 0) goto L_0x0006
            if (r10 != 0) goto L_0x0006
        L_0x0005:
            return r8
        L_0x0006:
            r7 = 0
            if (r9 != 0) goto L_0x00a2
            if (r10 != 0) goto L_0x0035
        L_0x000b:
            int r1 = r9.size()
            int r0 = r10.size()
            if (r1 != r0) goto L_0x0035
            java.util.Iterator r6 = X.C86144wL.A0x(r9)
        L_0x0019:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.String r2 = X.C18180wK.A0k(r6)
            boolean r0 = r10.containsKey(r2)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r9.get(r2)
            if (r0 != 0) goto L_0x0036
            java.lang.Object r0 = r10.get(r2)
            if (r0 == 0) goto L_0x0019
        L_0x0035:
            return r7
        L_0x0036:
            java.lang.Object r0 = r9.get(r2)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x004d
            android.os.Bundle r1 = r9.getBundle(r2)
            android.os.Bundle r0 = r10.getBundle(r2)
            boolean r0 = A00(r1, r0)
        L_0x004a:
            if (r0 != 0) goto L_0x0019
            return r7
        L_0x004d:
            java.lang.Object r0 = r9.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r10.get(r2)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r10.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r5 = r9.get(r2)
            java.lang.Object r4 = r10.get(r2)
            int r3 = java.lang.reflect.Array.getLength(r5)
            int r0 = java.lang.reflect.Array.getLength(r4)
            if (r3 != r0) goto L_0x0035
            r2 = 0
        L_0x0082:
            if (r2 >= r3) goto L_0x0019
            java.lang.Object r1 = java.lang.reflect.Array.get(r5, r2)
            java.lang.Object r0 = java.lang.reflect.Array.get(r4, r2)
            boolean r0 = X.C117046y2.A01(r1, r0)
            if (r0 == 0) goto L_0x0035
            int r2 = r2 + 1
            goto L_0x0082
        L_0x0095:
            java.lang.Object r1 = r9.get(r2)
            java.lang.Object r0 = r10.get(r2)
            boolean r0 = r1.equals(r0)
            goto L_0x004a
        L_0x00a2:
            if (r10 != 0) goto L_0x000b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.A00(android.os.Bundle, android.os.Bundle):boolean");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                if (!(this.A01 == activityRecognitionResult.A01 && this.A02 == activityRecognitionResult.A02 && this.A00 == activityRecognitionResult.A00 && C117046y2.A01(this.A04, activityRecognitionResult.A04) && A00(this.A03, activityRecognitionResult.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(Long.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), this.A04, this.A03);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A04);
        long j = this.A01;
        long j2 = this.A02;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 124);
        A0s.append("ActivityRecognitionResult [probableActivities=");
        A0s.append(valueOf);
        A0s.append(", timeMillis=");
        A0s.append(j);
        A0s.append(", elapsedRealtimeMillis=");
        A0s.append(j2);
        return C18180wK.A0i("]", A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6.size() <= 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityRecognitionResult(android.os.Bundle r5, java.util.List r6, int r7, long r8, long r10) {
        /*
            r4 = this;
            r4.<init>()
            r3 = 1
            if (r6 == 0) goto L_0x000d
            int r0 = r6.size()
            r1 = 1
            if (r0 > 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "Must have at least 1 detected activity"
            X.C13320nQ.A06(r1, r0)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
        L_0x001d:
            java.lang.String r0 = "Must set times"
            X.C13320nQ.A06(r3, r0)
            r4.A04 = r6
            r4.A01 = r8
            r4.A02 = r10
            r4.A00 = r7
            r4.A03 = r5
            return
        L_0x002d:
            r3 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.<init>(android.os.Bundle, java.util.List, int, long, long):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0K(parcel, this.A04, 1, false);
        C122167Ky.A09(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A02);
        C122167Ky.A08(parcel, 4, this.A00);
        C122167Ky.A02(this.A03, parcel, 5);
        C122167Ky.A05(parcel, A002);
    }
}
