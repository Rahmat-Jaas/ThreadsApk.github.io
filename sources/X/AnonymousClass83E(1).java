package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.83E  reason: invalid class name */
public final class AnonymousClass83E implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass7r0 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public AnonymousClass83E(Context context, AnonymousClass7r0 r2, Integer num, String str, String str2, String str3, List list) {
        this.A01 = r2;
        this.A00 = context;
        this.A06 = list;
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A05 = str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bb, code lost:
        X.C102596Vu.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r2 == null) goto L_0x0091;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0286 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0263 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0258 A[Catch:{ all -> 0x02ba }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r6 = r34
            X.7r0 r5 = r6.A01
            X.6in r9 = r5.A00
            android.content.Context r0 = r6.A00
            r33 = r0
            java.util.List r0 = r6.A06
            if (r0 == 0) goto L_0x002a
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = X.C18180wK.A0k(r1)
            java.lang.Integer r0 = X.AnonymousClass4n2.A01(r0)
            if (r0 == 0) goto L_0x0016
            r4.add(r0)
            goto L_0x0016
        L_0x002a:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x002c:
            java.lang.String r7 = r6.A04
            r26 = 3
            java.lang.Integer[] r3 = X.AnonymousClass006.A00(r26)
            int r2 = r3.length
            r1 = 0
        L_0x0036:
            if (r1 >= r2) goto L_0x0051
            r13 = r3[r1]
            int r0 = r13.intValue()
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x004f;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r0 = "image"
        L_0x0043:
            boolean r0 = X.C04220Ms.A0I(r0, r7)
            if (r0 != 0) goto L_0x0053
            int r1 = r1 + 1
            goto L_0x0036
        L_0x004c:
            java.lang.String r0 = "video"
            goto L_0x0043
        L_0x004f:
            r0 = 0
            goto L_0x0043
        L_0x0051:
            java.lang.Integer r13 = X.AnonymousClass006.A0C
        L_0x0053:
            java.lang.Integer r0 = r6.A02
            r19 = r0
            java.lang.String r2 = r6.A03
            java.lang.String r3 = r6.A05
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r25 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r1 = r25
            r0 = r26
            r1.<init>(r3, r5, r0)
            java.lang.String r8 = "height"
            java.lang.String r7 = "width"
            r1 = 0
            r0 = r33
            boolean r24 = X.AnonymousClass0wJ.A1Z(r0, r4)
            r0 = 2
            X.C04220Ms.A0B(r13, r0)
            r15 = 5
            android.content.Context r0 = r33.getApplicationContext()
            android.content.ContentResolver r18 = r0.getContentResolver()
            java.lang.String r0 = "external"
            android.net.Uri r6 = android.provider.MediaStore.Files.getContentUri(r0)
            java.util.List r0 = r9.A01
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0116
            java.lang.Integer r0 = r9.A00
            if (r0 != r13) goto L_0x0116
            r3 = 0
            if (r2 != 0) goto L_0x0096
        L_0x0091:
            java.util.List r0 = r9.A02
            r0.clear()
        L_0x0096:
            r9.A01 = r4
            r9.A00 = r13
            X.C04220Ms.A06(r18)
            X.C04220Ms.A06(r6)
            r12 = 0
            if (r3 == 0) goto L_0x00a4
            r2 = r12
        L_0x00a4:
            java.lang.String r11 = "_id"
            java.lang.String r10 = "media_type"
            java.lang.String r3 = "date_added"
            java.lang.String[] r5 = new java.lang.String[]{r11, r10, r7, r8, r3}
            boolean r0 = X.AnonymousClass6G8.A00()
            if (r0 == 0) goto L_0x00bf
            java.lang.String r14 = "duration"
            r0 = 6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            r5[r15] = r14
            java.lang.String[] r5 = (java.lang.String[]) r5
        L_0x00bf:
            java.lang.String r15 = X.AnonymousClass6G9.A00(r13)
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            if (r2 == 0) goto L_0x00d4
            java.lang.String r14 = " AND "
            java.lang.String r0 = "_id < ?"
            java.lang.String r15 = X.AnonymousClass00U.A0V(r15, r14, r0)
            r13.add(r2)
        L_0x00d4:
            boolean r0 = X.AnonymousClass6G8.A00()
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.C18190wL.A1a(r4)
            if (r0 == 0) goto L_0x0129
            java.lang.StringBuilder r14 = X.C18200wM.A0r()
            java.util.Iterator r17 = r4.iterator()
            r16 = 0
        L_0x00ea:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r17.next()
            int r4 = r16 + 1
            if (r16 >= 0) goto L_0x00fc
            X.C06750aI.A1A()
            throw r12
        L_0x00fc:
            int r2 = X.AnonymousClass0wJ.A04(r0)
            if (r16 <= 0) goto L_0x0107
            java.lang.String r0 = " OR "
            r14.append(r0)
        L_0x0107:
            java.lang.String r0 = "bucket_id = ?"
            r14.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r13.add(r0)
            r16 = r4
            goto L_0x00ea
        L_0x0116:
            r3 = 1
            goto L_0x0091
        L_0x0119:
            java.lang.StringBuilder r2 = X.C18200wM.A0r()
            r2.append(r15)
            java.lang.String r0 = " AND ("
            r2.append(r0)
            java.lang.String r15 = X.C86104wH.A0y(r14, r2)
        L_0x0129:
            boolean r0 = X.AnonymousClass6G8.A00()
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = " AND is_pending = ?"
            java.lang.String r15 = X.AnonymousClass00U.A0L(r15, r0)
            java.lang.String r0 = "0"
            r13.add(r0)
        L_0x013a:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r14 = r13.toArray(r0)
            java.lang.String[] r14 = (java.lang.String[]) r14
            java.lang.String r1 = "date_added DESC, _id DESC"
            java.lang.String r16 = "\n      "
            java.lang.String r13 = ",\n        |projection = "
            java.lang.String r2 = "Querying media:\n        |uri = "
            android.os.Bundle r4 = X.C18180wK.A06()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r4.putString(r0, r15)
            r0 = 161(0xa1, float:2.26E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r4.putStringArray(r0, r14)
            java.lang.String r0 = "android:query-arg-sql-sort-order"
            r4.putString(r0, r1)
            if (r19 == 0) goto L_0x0174
            int r1 = r19.intValue()
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r4.putInt(r0, r1)
        L_0x0174:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r1.append(r2)
            r1.append(r6)
            r1.append(r13)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            X.C04220Ms.A06(r0)
            r1.append(r0)
            java.lang.String r0 = "\n        |queryArgs = "
            r1.append(r0)
            r1.append(r4)
            r0 = r16
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.String r0 = "|"
            X.AnonymousClass4n8.A09(r1, r0)
            r2 = -138324669(0xfffffffff7c15543, float:-7.8425204E33)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            java.lang.String r0 = r6.getAuthority()
            X.AnonymousClass0UD.A00(r0, r2, r1)
            r0 = r18
            android.database.Cursor r5 = r0.query(r6, r5, r4, r12)
            if (r5 == 0) goto L_0x02c2
            int r23 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x02b8 }
            int r22 = r5.getColumnIndex(r10)     // Catch:{ all -> 0x02b8 }
            int r21 = r5.getColumnIndex(r7)     // Catch:{ all -> 0x02b8 }
            int r10 = r5.getColumnIndex(r8)     // Catch:{ all -> 0x02b8 }
            int r4 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x02b8 }
            boolean r0 = X.AnonymousClass6G8.A00()     // Catch:{ all -> 0x02b8 }
            java.lang.String r3 = "duration"
            if (r0 == 0) goto L_0x028a
            int r2 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x02b8 }
        L_0x01d2:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x02b8 }
            java.lang.String r14 = "id"
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x028d
            r0 = r23
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x02b8 }
            r11 = r22
            int r15 = r5.getInt(r11)     // Catch:{ all -> 0x02b8 }
            r11 = r21
            int r20 = r5.getInt(r11)     // Catch:{ all -> 0x02b8 }
            int r19 = r5.getInt(r10)     // Catch:{ all -> 0x02b8 }
            long r17 = r5.getLong(r4)     // Catch:{ all -> 0x02b8 }
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r6, r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r12 = X.C18190wL.A0n(r11)     // Catch:{ all -> 0x02b8 }
            r11 = r26
            if (r15 == r11) goto L_0x0210
            r16 = 0
            r11 = r24
            if (r15 == r11) goto L_0x020d
            r11 = r26
            if (r15 == r11) goto L_0x021e
            goto L_0x0220
        L_0x020d:
            java.lang.String r13 = "image"
            goto L_0x0220
        L_0x0210:
            boolean r11 = X.AnonymousClass6G8.A00()     // Catch:{ all -> 0x02b8 }
            if (r11 == 0) goto L_0x026a
            long r15 = r5.getLong(r2)     // Catch:{ all -> 0x02b8 }
            java.lang.Long r16 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x02b8 }
        L_0x021e:
            java.lang.String r13 = "video"
        L_0x0220:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02b8 }
            kotlin.Pair r27 = X.C18180wK.A0p(r14, r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "url"
            kotlin.Pair r28 = X.C18180wK.A0p(r0, r12)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "type"
            kotlin.Pair r29 = X.C18180wK.A0p(r0, r13)     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x02b8 }
            kotlin.Pair r30 = X.C18180wK.A0p(r7, r0)     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x02b8 }
            kotlin.Pair r31 = X.C18180wK.A0p(r8, r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r1 = "creation_datetime"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x02b8 }
            kotlin.Pair r32 = X.C18180wK.A0p(r1, r0)     // Catch:{ all -> 0x02b8 }
            kotlin.Pair[] r0 = new kotlin.Pair[]{r27, r28, r29, r30, r31, r32}     // Catch:{ all -> 0x02b8 }
            java.util.Map r11 = X.AnonymousClass4WJ.A0I(r0)     // Catch:{ all -> 0x02b8 }
            if (r16 == 0) goto L_0x0263
            long r0 = r16.longValue()     // Catch:{ all -> 0x02b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02b8 }
            r11.put(r3, r0)     // Catch:{ all -> 0x02b8 }
        L_0x0263:
            java.util.List r0 = r9.A02     // Catch:{ all -> 0x02b8 }
            r0.add(r11)     // Catch:{ all -> 0x02b8 }
            goto L_0x01d2
        L_0x026a:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x02b8 }
            r15.<init>()     // Catch:{ all -> 0x02b8 }
            r16 = 0
            android.net.Uri r13 = X.C15430rJ.A01(r12)     // Catch:{ all -> 0x0286 }
            r11 = r33
            r15.setDataSource(r11, r13)     // Catch:{ all -> 0x0286 }
            r11 = 9
            java.lang.String r11 = r15.extractMetadata(r11)     // Catch:{ all -> 0x0286 }
            if (r11 == 0) goto L_0x0286
            java.lang.Long r16 = X.AnonymousClass4n2.A02(r11)     // Catch:{ all -> 0x0286 }
        L_0x0286:
            r15.release()     // Catch:{ all -> 0x021e }
            goto L_0x021e
        L_0x028a:
            r2 = -1
            goto L_0x01d2
        L_0x028d:
            java.util.List r0 = r9.A02     // Catch:{ all -> 0x02b8 }
            java.util.List r1 = X.AnonymousClass00J.A0N(r0)     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = X.AnonymousClass00J.A0F(r1)     // Catch:{ all -> 0x02b8 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r2 = r0.get(r14)     // Catch:{ all -> 0x02b8 }
            if (r2 != 0) goto L_0x02a2
        L_0x02a1:
            r2 = r13
        L_0x02a2:
            java.lang.String r0 = "media_items"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r1)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "last_id"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r2)     // Catch:{ all -> 0x02b8 }
            java.util.Map r1 = X.AnonymousClass4WJ.A0G(r1, r0)     // Catch:{ all -> 0x02b8 }
            r0 = r25
            r0.invoke(r1)     // Catch:{ all -> 0x02b8 }
            goto L_0x02bf
        L_0x02b8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02ba }
        L_0x02ba:
            r0 = move-exception
            X.C102596Vu.A00(r5, r1)
            throw r0
        L_0x02bf:
            r5.close()
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83E.run():void");
    }
}
