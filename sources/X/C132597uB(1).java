package X;

/* renamed from: X.7uB  reason: invalid class name and case insensitive filesystem */
public final class C132597uB implements C33841Hva {
    public final /* synthetic */ AnonymousClass7M8 A00;

    public final String getName() {
        return "EncryptedSharedPrefs_readFromDiskAsync";
    }

    public final int getRunnableId() {
        return 232;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C132597uB(AnonymousClass7M8 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = X.AnonymousClass0wJ.A0y();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0093 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.7M8 r5 = r8.A00     // Catch:{ IOException -> 0x00dd }
            X.6ob r3 = r5.A00     // Catch:{ IOException -> 0x00dd }
            android.content.Context r2 = r5.A03     // Catch:{ IOException -> 0x00dd }
            r0 = 36323977236848849(0x810c77000820d1, double:3.0347676972749504E-306)
            boolean r0 = X.C18210wN.A1S(r0)     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x0098
            X.8lq r0 = r3.A00     // Catch:{ IOException -> 0x00dd }
            java.io.InputStream r2 = r0.CwL(r2)     // Catch:{ IOException -> 0x00dd }
            if (r2 != 0) goto L_0x0022
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException -> 0x00dd }
        L_0x001d:
            java.lang.Object r1 = r5.A06     // Catch:{ IOException -> 0x00dd }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00dd }
            goto L_0x00d6
        L_0x0022:
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x00dd }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x00dd }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00dd }
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            r3.beginArray()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
        L_0x0035:
            boolean r0 = r3.hasNext()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x008f
            r3.beginObject()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            r7 = 0
            r6 = r7
            r2 = r7
        L_0x0041:
            boolean r0 = r3.hasNext()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r3.nextName()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            java.lang.String r0 = "n"
            boolean r0 = r1.equals(r0)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = r3.nextString()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x0041
        L_0x0058:
            java.lang.String r0 = "v"
            boolean r0 = r1.equals(r0)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r6 = r3.nextString()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x0041
        L_0x0065:
            java.lang.String r0 = "t"
            boolean r0 = r1.equals(r0)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r7 = r3.nextString()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x0041
        L_0x0072:
            r3.skipValue()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x0041
        L_0x0076:
            if (r7 == 0) goto L_0x008b
            if (r6 == 0) goto L_0x008b
            java.util.Map r0 = X.AnonymousClass69G.A03     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            X.69G r0 = (X.AnonymousClass69G) r0     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r0.A00(r6)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            r4.put(r2, r0)     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
        L_0x008b:
            r3.endObject()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x0035
        L_0x008f:
            r3.endArray()     // Catch:{ EOFException | IllegalStateException -> 0x0093 }
            goto L_0x001d
        L_0x0093:
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException -> 0x00dd }
            goto L_0x001d
        L_0x0098:
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException -> 0x00dd }
            X.8lq r0 = r3.A00     // Catch:{ IOException -> 0x00dd }
            java.io.InputStream r1 = r0.CwL(r2)     // Catch:{ IOException -> 0x00dd }
            if (r1 == 0) goto L_0x001d
            X.MIS r0 = X.C18987Aon.A00     // Catch:{ IOException -> 0x00dd }
            X.MMo r3 = r0.A07(r1)     // Catch:{ IOException -> 0x00dd }
            r3.A0g()     // Catch:{ IOException -> 0x00dd }
        L_0x00ad:
            X.LcR r1 = r3.A0g()     // Catch:{ IOException -> 0x00dd }
            if (r1 == 0) goto L_0x001d
            X.LcR r0 = X.C40318LcR.END_ARRAY     // Catch:{ IOException -> 0x00dd }
            if (r1 == r0) goto L_0x001d
            X.LcR r1 = r3.A0f()     // Catch:{ IOException -> 0x00dd }
            X.LcR r0 = X.C40318LcR.START_OBJECT     // Catch:{ IOException -> 0x00dd }
            if (r1 != r0) goto L_0x00ad
            X.6jv r0 = X.C101606Rx.parseFromJson(r3)     // Catch:{ IOException -> 0x00dd }
            r0.getClass()     // Catch:{ IOException -> 0x00dd }
            X.69G r2 = r0.A00     // Catch:{ IOException -> 0x00dd }
            if (r2 == 0) goto L_0x00ad
            java.lang.String r1 = r0.A01     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = r0.A02     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r0 = r2.A00(r0)     // Catch:{ IOException -> 0x00dd }
            r4.put(r1, r0)     // Catch:{ IOException -> 0x00dd }
            goto L_0x00ad
        L_0x00d6:
            r5.A02 = r4     // Catch:{ all -> 0x00da }
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            r1 = move-exception
            java.lang.String r0 = "EncryptedSharedPrefs_readFromDisk_error"
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x00eb }
        L_0x00e3:
            X.7M8 r0 = r8.A00
            java.util.concurrent.CountDownLatch r0 = r0.A08
            r0.countDown()
            return
        L_0x00eb:
            r1 = move-exception
            X.7M8 r0 = r8.A00
            java.util.concurrent.CountDownLatch r0 = r0.A08
            r0.countDown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132597uB.run():void");
    }
}
