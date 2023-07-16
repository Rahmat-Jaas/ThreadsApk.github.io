package com.facebook.redex;

import android.os.Parcelable;
import com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide;
import java.lang.reflect.Array;

public class PCreatorCreatorShape0S0100000_I2 implements Parcelable.Creator {
    public Object A00;
    public final int A01;

    public PCreatorCreatorShape0S0100000_I2(Class cls, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = cls;
        } else {
            this.A00 = cls;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a A[Catch:{ Exception -> 0x0373 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A01
            r7 = r25
            switch(r0) {
                case 0: goto L_0x0402;
                case 1: goto L_0x041c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r1.A00
            java.lang.Class r2 = (java.lang.Class) r2
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.reflect.Constructor r5 = r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            boolean r22 = r5.isAccessible()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r6 = 1
            r5.setAccessible(r6)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object r4 = r5.newInstance(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            org.microg.safeparcel.SafeParcelable r4 = (org.microg.safeparcel.SafeParcelable) r4     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r4.getClass()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Class r12 = r4.getClass()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r23 = r12
            android.util.SparseArray r3 = X.C86154wM.A0D()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
        L_0x0031:
            if (r12 == 0) goto L_0x0069
            java.lang.reflect.Field[] r11 = r12.getDeclaredFields()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r10 = r11.length     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r2 = 0
        L_0x0039:
            if (r2 >= r10) goto L_0x005d
            r9 = r11[r2]     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r9.isAnnotationPresent(r1)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r0 == 0) goto L_0x005a
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r1)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r0 == 0) goto L_0x0062
            int r8 = r0.value()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object r0 = r3.get(r8)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r0 != 0) goto L_0x03ce
            r3.put(r8, r9)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x005d:
            java.lang.Class r12 = r12.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x0031
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r1.<init>()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x03f2
        L_0x0069:
            int r9 = r7.readInt()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r2 = X.AnonymousClass72E.A00(r7, r9)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r8 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r21 = 65535(0xffff, float:9.1834E-41)
            r1 = r9 & r21
            r0 = 20293(0x4f45, float:2.8437E-41)
            if (r1 != r0) goto L_0x03be
            int r2 = r2 + r8
            if (r2 < r8) goto L_0x03b0
            int r0 = r7.dataSize()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r2 > r0) goto L_0x03b0
        L_0x0087:
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r0 >= r2) goto L_0x0399
            int r8 = r7.readInt()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r20 = r8 & r21
            r0 = r20
            java.lang.Object r10 = r3.get(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r19 = "SafeParcel"
            if (r10 != 0) goto L_0x00bd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = r23.getName()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = "Unknown field id %d in %s, skipping."
            java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r1 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r0 = r0 + r1
            r7.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x0087
        L_0x00bd:
            boolean r11 = r10.isAccessible()     // Catch:{ Exception -> 0x0373 }
            r10.setAccessible(r6)     // Catch:{ Exception -> 0x0373 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r10.isAnnotationPresent(r1)     // Catch:{ Exception -> 0x0373 }
            r17 = -1
            if (r0 == 0) goto L_0x0364
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r1)     // Catch:{ Exception -> 0x0373 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0373 }
            long r15 = r0.versionCode()     // Catch:{ Exception -> 0x0373 }
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass6WD.A00(r10)     // Catch:{ Exception -> 0x0373 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0373 }
            java.lang.String r12 = "Version code of %s (%d) is older than object read (%d)."
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x0174;
                case 2: goto L_0x018d;
                case 3: goto L_0x0107;
                case 4: goto L_0x01e0;
                case 5: goto L_0x0155;
                case 6: goto L_0x022e;
                case 7: goto L_0x0247;
                case 8: goto L_0x0328;
                case 9: goto L_0x0260;
                case 10: goto L_0x0279;
                case 11: goto L_0x02a6;
                case 12: goto L_0x02d7;
                case 13: goto L_0x02ec;
                case 14: goto L_0x02fd;
                case 15: goto L_0x030f;
                case 16: goto L_0x01a6;
                default: goto L_0x00e5;
            }     // Catch:{ Exception -> 0x0373 }
        L_0x00e5:
            r10.setAccessible(r11)     // Catch:{ Exception -> 0x0373 }
            goto L_0x0087
        L_0x00e9:
            android.os.Parcelable$Creator r0 = X.AnonymousClass7G3.A01(r10)     // Catch:{ Exception -> 0x0373 }
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x00f5
            r0 = 0
            goto L_0x0103
        L_0x00f5:
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ Exception -> 0x0373 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x0373 }
            int r1 = r1 + r9
            r7.setDataPosition(r1)     // Catch:{ Exception -> 0x0373 }
        L_0x0103:
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0107:
            java.lang.Class r1 = X.AnonymousClass7G3.A02(r10)     // Catch:{ Exception -> 0x0373 }
            if (r1 == 0) goto L_0x0140
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0135
            boolean r0 = X.AnonymousClass7G3.A03(r10)     // Catch:{ Exception -> 0x0373 }
            if (r0 != 0) goto L_0x0135
            android.os.Parcelable$Creator r0 = X.AnonymousClass7G3.A00(r1)     // Catch:{ Exception -> 0x0373 }
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 == 0) goto L_0x0153
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.util.ArrayList r0 = r7.createTypedArrayList(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x012d:
            int r1 = r1 + r9
            r7.setDataPosition(r1)     // Catch:{ Exception -> 0x0373 }
        L_0x0131:
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0135:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0140
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            goto L_0x0144
        L_0x0140:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0373 }
        L_0x0144:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 == 0) goto L_0x0153
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.util.ArrayList r0 = r7.readArrayList(r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x012d
        L_0x0153:
            r0 = 0
            goto L_0x0131
        L_0x0155:
            android.os.Parcelable$Creator r0 = X.AnonymousClass7G3.A01(r10)     // Catch:{ Exception -> 0x0373 }
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x0161
            r0 = 0
            goto L_0x016f
        L_0x0161:
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.lang.Object[] r0 = r7.createTypedArray(r0)     // Catch:{ Exception -> 0x0373 }
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0     // Catch:{ Exception -> 0x0373 }
            int r1 = r1 + r9
            r7.setDataPosition(r1)     // Catch:{ Exception -> 0x0373 }
        L_0x016f:
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0174:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x017c
            r1 = 0
            goto L_0x0188
        L_0x017c:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            android.os.IBinder r1 = r7.readStrongBinder()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x0188:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x018d:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x0195
            r1 = 0
            goto L_0x01a1
        L_0x0195:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.util.ArrayList r1 = r7.createStringArrayList()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x01a1:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x01a6:
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r1)     // Catch:{ Exception -> 0x0373 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x01c3
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x0373 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x01c3
            if (r1 == 0) goto L_0x01c3
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x01c3
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            goto L_0x01c7
        L_0x01c3:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0373 }
        L_0x01c7:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x01cf
            r1 = 0
            goto L_0x01db
        L_0x01cf:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.util.HashMap r1 = r7.readHashMap(r1)     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x01db:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x01e0:
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r1)     // Catch:{ Exception -> 0x0373 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0200
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x0373 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x0200
            if (r1 == 0) goto L_0x0200
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0200
            boolean r0 = X.AnonymousClass7G3.A03(r10)     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0204
        L_0x0200:
            java.lang.Class r1 = r10.getDeclaringClass()     // Catch:{ Exception -> 0x0373 }
        L_0x0204:
            if (r1 == 0) goto L_0x0211
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            if (r0 == 0) goto L_0x0211
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0373 }
            goto L_0x0215
        L_0x0211:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0373 }
        L_0x0215:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x021d
            r1 = 0
            goto L_0x0229
        L_0x021d:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            android.os.Bundle r1 = r7.readBundle(r1)     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x0229:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x022e:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x0236
            r1 = 0
            goto L_0x0242
        L_0x0236:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.lang.String[] r1 = r7.createStringArray()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x0242:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0247:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x024f
            r1 = 0
            goto L_0x025b
        L_0x024f:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            byte[] r1 = r7.createByteArray()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x025b:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0260:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x0268
            r1 = 0
            goto L_0x0274
        L_0x0268:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            int[] r1 = r7.createIntArray()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x0274:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0279:
            r0 = 4
            X.AnonymousClass72E.A01(r7, r8, r0)     // Catch:{ Exception -> 0x0373 }
            int r9 = r7.readInt()     // Catch:{ Exception -> 0x0373 }
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x029d
            long r0 = (long) r9     // Catch:{ Exception -> 0x0373 }
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x029d
            java.lang.Class r0 = r10.getDeclaringClass()     // Catch:{ Exception -> 0x0373 }
            java.lang.String r1 = r0.getName()     // Catch:{ Exception -> 0x0373 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0373 }
            java.lang.Object[] r0 = X.C86134wK.A1b(r1, r0, r9)     // Catch:{ Exception -> 0x0373 }
            java.lang.String.format(r12, r0)     // Catch:{ Exception -> 0x0373 }
        L_0x029d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0373 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x02a6:
            r0 = 8
            X.AnonymousClass72E.A01(r7, r8, r0)     // Catch:{ Exception -> 0x0373 }
            long r13 = r7.readLong()     // Catch:{ Exception -> 0x0373 }
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x02ce
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ce
            java.lang.Class r0 = r10.getDeclaringClass()     // Catch:{ Exception -> 0x0373 }
            java.lang.String r9 = r0.getName()     // Catch:{ Exception -> 0x0373 }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0373 }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0373 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r1, r0}     // Catch:{ Exception -> 0x0373 }
            java.lang.String.format(r12, r0)     // Catch:{ Exception -> 0x0373 }
        L_0x02ce:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0373 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x02d7:
            r0 = 4
            X.AnonymousClass72E.A01(r7, r8, r0)     // Catch:{ Exception -> 0x0373 }
            int r0 = r7.readInt()     // Catch:{ Exception -> 0x0373 }
            boolean r0 = X.C18180wK.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0373 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x02ec:
            r0 = 4
            X.AnonymousClass72E.A01(r7, r8, r0)     // Catch:{ Exception -> 0x0373 }
            float r0 = r7.readFloat()     // Catch:{ Exception -> 0x0373 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x0373 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x02fd:
            r0 = 8
            X.AnonymousClass72E.A01(r7, r8, r0)     // Catch:{ Exception -> 0x0373 }
            double r0 = r7.readDouble()     // Catch:{ Exception -> 0x0373 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0373 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x030f:
            int r9 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0373 }
            if (r9 != 0) goto L_0x0317
            r1 = 0
            goto L_0x0323
        L_0x0317:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0373 }
            java.lang.String r1 = r7.readString()     // Catch:{ Exception -> 0x0373 }
            int r0 = r0 + r9
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0373 }
        L_0x0323:
            r10.set(r4, r1)     // Catch:{ Exception -> 0x0373 }
            goto L_0x00e5
        L_0x0328:
            java.lang.Class r0 = r10.getType()     // Catch:{ Exception -> 0x0373 }
            java.lang.Class[] r14 = r0.getDeclaredClasses()     // Catch:{ Exception -> 0x0373 }
            int r13 = r14.length     // Catch:{ Exception -> 0x0373 }
            r12 = 0
        L_0x0332:
            if (r12 >= r13) goto L_0x0368
            r9 = r14[r12]     // Catch:{ Exception -> 0x0373 }
            java.lang.String r1 = "asInterface"
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ Exception -> 0x0361 }
            java.lang.reflect.Method r15 = r9.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x0361 }
            r9 = 0
            int r16 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ Exception -> 0x0361 }
            if (r16 != 0) goto L_0x034b
            r1 = 0
            goto L_0x0358
        L_0x034b:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0361 }
            android.os.IBinder r1 = r7.readStrongBinder()     // Catch:{ Exception -> 0x0361 }
            int r0 = r0 + r16
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0361 }
        L_0x0358:
            java.lang.Object r0 = X.C86154wM.A0Z(r1, r9, r15)     // Catch:{ Exception -> 0x0361 }
            r10.set(r4, r0)     // Catch:{ Exception -> 0x0361 }
            goto L_0x00e5
        L_0x0361:
            int r12 = r12 + 1
            goto L_0x0332
        L_0x0364:
            r15 = -1
            goto L_0x00d8
        L_0x0368:
            java.lang.String r0 = "Field has broken interface: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r10)     // Catch:{ Exception -> 0x0373 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ Exception -> 0x0373 }
            throw r0     // Catch:{ Exception -> 0x0373 }
        L_0x0373:
            r9 = move-exception
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = r23.getName()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = "Error reading field: %d in %s, skipping."
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r0 = r19
            android.util.Log.w(r0, r1, r9)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r1 = X.AnonymousClass72E.A00(r7, r8)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            int r0 = r0 + r1
            r7.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x0087
        L_0x0399:
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            if (r0 > r2) goto L_0x03a5
            r0 = r22
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            return r4
        L_0x03a5:
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r2)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x03f2
        L_0x03b0:
            java.lang.String r1 = "Size read is invalid start="
            java.lang.String r0 = " end="
            java.lang.String r0 = X.AnonymousClass00U.A01(r8, r2, r1, r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            X.88T r1 = new X.88T     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x03f2
        L_0x03be:
            java.lang.String r1 = "Expected object header. Got 0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r9)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            X.88T r1 = new X.88T     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            goto L_0x03f2
        L_0x03ce:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r2 = r12.getName()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r1 = r9.getName()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object r0 = r3.get(r8)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = r0.getName()     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1, r0}     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.String r0 = "Field number %d is used twice in %s for fields %s and %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
        L_0x03f2:
            throw r1     // Catch:{ NoSuchMethodException -> 0x03fb, Exception -> 0x03f3 }
        L_0x03f3:
            r1 = move-exception
            java.lang.String r0 = "Can't construct object"
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)
            throw r0
        L_0x03fb:
            java.lang.String r0 = "createObject() requires a default constructor"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0402:
            java.lang.Object r0 = r1.A00     // Catch:{ Exception -> 0x040b }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x040b }
            java.lang.Object r4 = r0.newInstance()     // Catch:{ Exception -> 0x040b }
            return r4
        L_0x040b:
            java.lang.Object r0 = r1.A00
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x041c:
            com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide r4 = new com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.PCreatorCreatorShape0S0100000_I2.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        if (1 - this.A01 != 0) {
            return (Object[]) Array.newInstance((Class) this.A00, i);
        }
        return new DirectInteropVideoSlide[i];
    }

    public PCreatorCreatorShape0S0100000_I2(DirectInteropVideoSlide directInteropVideoSlide) {
        this.A01 = 1;
        this.A00 = directInteropVideoSlide;
    }
}
