package com.facebook.pando;

import X.C86144wL;
import android.os.Parcelable;

public class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(4);
    public final TreeJNI A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.pando.TreeJNI A00(android.os.Parcel r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00a1
            java.lang.String r3 = r8.readString()
            if (r3 == 0) goto L_0x00a1
            java.lang.Class r7 = java.lang.Class.forName(r3)
            java.lang.Class<com.facebook.pando.TreeJNI> r0 = com.facebook.pando.TreeJNI.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L_0x0090
            int r0 = r8.readInt()
            byte[] r0 = new byte[r0]
            r8.readByteArray(r0)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008b }
            r5.<init>(r0)     // Catch:{ all -> 0x008b }
            r0 = 1024(0x400, float:1.435E-42)
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0086 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0086 }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0081 }
        L_0x0031:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x0081 }
            r0 = -1
            if (r1 == r0) goto L_0x003d
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ all -> 0x0081 }
            goto L_0x0031
        L_0x003d:
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0081 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x0081 }
            boolean r2 = X.AnonymousClass0wJ.A1Y(r3, r7)     // Catch:{ all -> 0x0081 }
            boolean r0 = r3.isDirect()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0073
            int r0 = r3.capacity()     // Catch:{ all -> 0x0081 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0081 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0081 }
            boolean r0 = r1.isDirect()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006c
            java.nio.ByteBuffer r0 = r3.duplicate()     // Catch:{ all -> 0x0081 }
            r1.put(r0)     // Catch:{ all -> 0x0081 }
            r1.position(r2)     // Catch:{ all -> 0x0081 }
            r3 = r1
            goto L_0x0073
        L_0x006c:
            java.lang.String r0 = "Direct ByteBuffer is not supported on this platform"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0073:
            com.facebook.pando.TreeJNI r0 = com.facebook.pando.TreeSerializer.deserializeFromBytesNative(r3, r7)     // Catch:{ all -> 0x0081 }
            r6.close()     // Catch:{ all -> 0x0086 }
            r5.close()     // Catch:{ all -> 0x008b }
            r4.close()
            return r0
        L_0x0081:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0
        L_0x0090:
            java.lang.String r2 = "Parcel does not contain valid Pando tree."
            java.lang.String r1 = " "
            java.lang.String r0 = r7.getSimpleName()
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r3, r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.TreeParcelable.A00(android.os.Parcel):com.facebook.pando.TreeJNI");
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            com.facebook.pando.TreeJNI r1 = r3.A00     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = X.C18220wO.A0q(r1)     // Catch:{ Exception -> 0x0041 }
            r4.writeString(r0)     // Catch:{ Exception -> 0x0041 }
            java.nio.ByteBuffer r1 = com.facebook.pando.TreeSerializer.serializeAsBytes(r1)     // Catch:{ IOException -> 0x003f }
            int r0 = r1.limit()     // Catch:{ IOException -> 0x003f }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x003f }
            r1.get(r0)     // Catch:{ IOException -> 0x003f }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x003f }
            r2.<init>()     // Catch:{ IOException -> 0x003f }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            r1.write(r0)     // Catch:{ all -> 0x0035 }
            r1.close()     // Catch:{ all -> 0x003a }
            byte[] r1 = r2.toByteArray()     // Catch:{ all -> 0x003a }
            r2.close()     // Catch:{ IOException -> 0x003f }
            int r0 = r1.length     // Catch:{ Exception -> 0x0041 }
            r4.writeInt(r0)     // Catch:{ Exception -> 0x0041 }
            r4.writeByteArray(r1)     // Catch:{ Exception -> 0x0041 }
            return
        L_0x0035:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "TreeParcelable::writeToParcel"
            java.lang.String r0 = "Failed to write Pando tree to parcel: %s"
            X.AnonymousClass0LU.A0P(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.TreeParcelable.writeToParcel(android.os.Parcel, int):void");
    }

    public TreeParcelable(TreeJNI treeJNI) {
        this.A00 = treeJNI;
    }
}
