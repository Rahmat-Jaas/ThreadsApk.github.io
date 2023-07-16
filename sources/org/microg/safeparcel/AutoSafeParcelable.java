package org.microg.safeparcel;

public abstract class AutoSafeParcelable implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        r9.setAccessible(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r0 == null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        r14 = X.AnonymousClass6WE.A00(r4, r1);
        r4.writeStrongBinder(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r4.writeInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dd, code lost:
        r2 = r4.dataPosition();
        r4.setDataPosition(r14 - 4);
        r4.writeInt(r2 - r14);
        r4.setDataPosition(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f0, code lost:
        if (r14 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f2, code lost:
        r4.writeInt(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r18, int r19) {
        /*
            r17 = this;
            r7 = r17
            java.lang.Class r16 = r7.getClass()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = -45243(0xffffffffffff4f45, float:NaN)
            r4 = r18
            r4.writeInt(r0)
            r4.writeInt(r1)
            int r15 = r4.dataPosition()
        L_0x0018:
            if (r16 == 0) goto L_0x0219
            java.lang.reflect.Field[] r6 = r16.getDeclaredFields()
            int r5 = r6.length
            r3 = 0
        L_0x0020:
            if (r3 >= r5) goto L_0x0213
            r9 = r6[r3]
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r2 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r9.isAnnotationPresent(r2)
            if (r0 == 0) goto L_0x020f
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r2)     // Catch:{ Exception -> 0x0203 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01fd
            int r1 = r0.value()     // Catch:{ Exception -> 0x0203 }
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r2)     // Catch:{ Exception -> 0x0203 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f7
            boolean r14 = r0.mayNull()     // Catch:{ Exception -> 0x0203 }
            boolean r8 = r9.isAccessible()     // Catch:{ Exception -> 0x0203 }
            r0 = 1
            r9.setAccessible(r0)     // Catch:{ Exception -> 0x0203 }
            java.lang.Integer r0 = X.AnonymousClass6WD.A00(r9)     // Catch:{ Exception -> 0x0203 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0203 }
            r11 = r19
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x006f;
                case 2: goto L_0x008b;
                case 3: goto L_0x009c;
                case 4: goto L_0x00fd;
                case 5: goto L_0x010e;
                case 6: goto L_0x0134;
                case 7: goto L_0x0145;
                case 8: goto L_0x0076;
                case 9: goto L_0x0156;
                case 10: goto L_0x0166;
                case 11: goto L_0x0179;
                case 12: goto L_0x0189;
                case 13: goto L_0x01a0;
                case 14: goto L_0x01b7;
                case 15: goto L_0x01ce;
                case 16: goto L_0x00ec;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x0203 }
        L_0x0059:
            r9.setAccessible(r8)     // Catch:{ Exception -> 0x0203 }
            goto L_0x020f
        L_0x005e:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r0.writeToParcel(r4, r11)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x006f:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x0203 }
            goto L_0x0080
        L_0x0076:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            android.os.IInterface r0 = (android.os.IInterface) r0     // Catch:{ Exception -> 0x0203 }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x0203 }
        L_0x0080:
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeStrongBinder(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x008b:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeStringList(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x009c:
            java.lang.Class r2 = X.AnonymousClass7G3.A02(r9)     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x00db
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x00db
            boolean r0 = X.AnonymousClass7G3.A03(r9)     // Catch:{ Exception -> 0x0203 }
            if (r0 != 0) goto L_0x00db
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0203 }
            r10 = 0
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            java.util.Iterator r2 = X.C18200wM.A0v(r4, r0)     // Catch:{ Exception -> 0x0203 }
        L_0x00c1:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0203 }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ Exception -> 0x0203 }
            if (r1 != 0) goto L_0x00d3
            r4.writeInt(r10)     // Catch:{ Exception -> 0x0203 }
            goto L_0x00c1
        L_0x00d3:
            int r0 = r4.dataPosition()     // Catch:{ Exception -> 0x0203 }
            X.C86104wH.A1A(r4, r1, r11, r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x00c1
        L_0x00db:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeList(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x00ec:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeMap(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x00fd:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeBundle(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x010e:
            java.lang.Object r13 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ Exception -> 0x0203 }
            r12 = 0
            if (r13 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            int r10 = r13.length     // Catch:{ Exception -> 0x0203 }
            r4.writeInt(r10)     // Catch:{ Exception -> 0x0203 }
            r2 = 0
        L_0x0120:
            if (r2 >= r10) goto L_0x01dd
            r1 = r13[r2]     // Catch:{ Exception -> 0x0203 }
            if (r1 != 0) goto L_0x012a
            r4.writeInt(r12)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0131
        L_0x012a:
            int r0 = r4.dataPosition()     // Catch:{ Exception -> 0x0203 }
            X.C86104wH.A1A(r4, r1, r11, r0)     // Catch:{ Exception -> 0x0203 }
        L_0x0131:
            int r2 = r2 + 1
            goto L_0x0120
        L_0x0134:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeStringArray(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x0145:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeByteArray(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x0156:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeIntArray(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x01dd
        L_0x0166:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            int r0 = r2.intValue()     // Catch:{ Exception -> 0x0203 }
            goto L_0x019b
        L_0x0179:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            X.C86134wK.A18(r4, r2, r1)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x0189:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x0203 }
        L_0x019b:
            r4.writeInt(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x01a0:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            float r0 = r2.floatValue()     // Catch:{ Exception -> 0x0203 }
            r4.writeFloat(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x01b7:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ Exception -> 0x0203 }
            if (r2 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            double r0 = r2.doubleValue()     // Catch:{ Exception -> 0x0203 }
            r4.writeDouble(r0)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x01ce:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0203 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f0
            int r14 = X.AnonymousClass6WE.A00(r4, r1)     // Catch:{ Exception -> 0x0203 }
            r4.writeString(r0)     // Catch:{ Exception -> 0x0203 }
        L_0x01dd:
            int r2 = r4.dataPosition()     // Catch:{ Exception -> 0x0203 }
            int r1 = r2 - r14
            int r0 = r14 + -4
            r4.setDataPosition(r0)     // Catch:{ Exception -> 0x0203 }
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            r4.setDataPosition(r2)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x01f0:
            if (r14 == 0) goto L_0x0059
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0059
        L_0x01f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0203 }
            r0.<init>()     // Catch:{ Exception -> 0x0203 }
            goto L_0x0202
        L_0x01fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0203 }
            r0.<init>()     // Catch:{ Exception -> 0x0203 }
        L_0x0202:
            throw r0     // Catch:{ Exception -> 0x0203 }
        L_0x0203:
            r1 = move-exception
            java.lang.String r0 = "Error writing field: "
            java.lang.String r1 = X.AnonymousClass0wJ.A0t(r0, r1)
            java.lang.String r0 = "SafeParcel"
            android.util.Log.w(r0, r1)
        L_0x020f:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0213:
            java.lang.Class r16 = r16.getSuperclass()
            goto L_0x0018
        L_0x0219:
            int r2 = r4.dataPosition()
            int r1 = r2 - r15
            int r0 = r15 + -4
            r4.setDataPosition(r0)
            r4.writeInt(r1)
            r4.setDataPosition(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.microg.safeparcel.AutoSafeParcelable.writeToParcel(android.os.Parcel, int):void");
    }
}
