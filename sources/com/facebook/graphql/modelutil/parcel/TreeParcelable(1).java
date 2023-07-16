package com.facebook.graphql.modelutil.parcel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(80);
    public Tree A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public static TreeParcelable A00(Parcel parcel) {
        if (parcel != null) {
            String readString = parcel.readString();
            if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(readString)) {
                readString = parcel.readString();
            }
            if (readString != null) {
                int readInt = parcel.readInt();
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new TreeParcelable(bArr, readInt, readString);
            }
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.graphservice.interfaces.Tree A02() {
        /*
            r7 = this;
            com.facebook.graphservice.interfaces.Tree r0 = r7.A00
            if (r0 != 0) goto L_0x0071
            java.lang.String r3 = r7.A02
            java.lang.Class r6 = java.lang.Class.forName(r3)
            java.lang.Class<com.facebook.graphservice.interfaces.Tree> r0 = com.facebook.graphservice.interfaces.Tree.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L_0x005b
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            byte[] r0 = r7.A03     // Catch:{ all -> 0x0056 }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0056 }
            r5.<init>(r0)     // Catch:{ all -> 0x0056 }
            r0 = 1024(0x400, float:1.435E-42)
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0051 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0051 }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x004c }
        L_0x0027:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x004c }
            r0 = -1
            if (r1 == r0) goto L_0x0033
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ all -> 0x004c }
            goto L_0x0027
        L_0x0033:
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x004c }
            com.facebook.graphservice.interfaces.TreeSerializer r2 = X.AnonymousClass7D7.A00()     // Catch:{ all -> 0x004c }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x004c }
            int r0 = r7.A01     // Catch:{ all -> 0x004c }
            com.facebook.graphservice.interfaces.Tree r0 = r2.deserializeTreeFromByteBuffer(r1, r6, r0)     // Catch:{ all -> 0x004c }
            r3.close()     // Catch:{ all -> 0x0051 }
            r5.close()     // Catch:{ all -> 0x0056 }
            goto L_0x006c
        L_0x004c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        L_0x005b:
            java.lang.String r2 = "Parcel does not contain valid GraphQL Tree "
            java.lang.String r1 = " "
            java.lang.String r0 = r6.getSimpleName()
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r3, r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x006c:
            r4.close()
            r7.A00 = r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.modelutil.parcel.TreeParcelable.A02():com.facebook.graphservice.interfaces.Tree");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            String str = this.A02;
            int i2 = this.A01;
            byte[] bArr = this.A03;
            parcel.writeString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            parcel.writeString(str);
            parcel.writeInt(i2);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public TreeParcelable(byte[] bArr, int i, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A03 = bArr;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(com.facebook.graphservice.interfaces.Tree r2) {
        /*
            com.facebook.graphservice.interfaces.TreeSerializer r0 = X.AnonymousClass7D7.A00()     // Catch:{ IOException -> 0x0033 }
            java.nio.ByteBuffer r1 = r0.serializeTreeToByteBuffer(r2)     // Catch:{ IOException -> 0x0033 }
            int r0 = r1.limit()     // Catch:{ IOException -> 0x0033 }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0033 }
            r1.get(r0)     // Catch:{ IOException -> 0x0033 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0033 }
            r2.<init>()     // Catch:{ IOException -> 0x0033 }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            r1.write(r0)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x002e }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x002e }
            r2.close()     // Catch:{ IOException -> 0x0033 }
            return r0
        L_0x0029:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = "Exception during serialization of TreeModel"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.modelutil.parcel.TreeParcelable.A01(com.facebook.graphservice.interfaces.Tree):byte[]");
    }
}
