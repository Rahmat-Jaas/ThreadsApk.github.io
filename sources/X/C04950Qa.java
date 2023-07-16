package X;

import java.io.Writer;

/* renamed from: X.0Qa  reason: invalid class name and case insensitive filesystem */
public abstract class C04950Qa implements C05500Tz {
    public static final ThreadLocal A03 = new C02510Bs();
    public static final ThreadLocal A04 = new C02520Bt();
    public final Object A00;
    public final AnonymousClass0AT A01;
    public volatile AnonymousClass0AV A02;

    public abstract int A00();

    public abstract AnonymousClass0AV A01();

    public abstract void A03();

    public abstract void A04();

    public abstract void A05(Writer writer);

    public final boolean BWF() {
        return false;
    }

    public final boolean BOB() {
        boolean z;
        AnonymousClass0AV r2 = this.A02;
        if (r2 != null) {
            synchronized (r2) {
                z = false;
                if (r2.A01 == this) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Beo() {
        if (this.A02 != null) {
            this.A02.A07(this);
            A03();
            AnonymousClass0AV r0 = this.A02;
            r0.A07(this);
            r0.A05();
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{lockKey=");
        sb.append(this.A00);
        sb.append(";hasLock=");
        sb.append(BOB());
        sb.append("}");
        return sb.toString();
    }

    public final void unlock() {
        if (this.A02 != null) {
            this.A02.A07(this);
            this.A02.A08(this);
            A04();
            this.A02.A03();
            this.A02 = null;
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public C04950Qa(AnonymousClass0AT r1, Object obj) {
        this.A01 = r1;
        this.A00 = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025 A[SYNTHETIC, Splitter:B:10:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            X.0AV r0 = r4.A01()
            r4.A02 = r0
            X.0AV r3 = r4.A02
            monitor-enter(r3)
            boolean r0 = r3.A09()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r3.A02     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "BatchLockState"
            java.lang.String r0 = "Attempting to lock a deleted entry: %s (owned by %s)"
            X.AnonymousClass0LU.A0O(r1, r0, r2)     // Catch:{ all -> 0x0032 }
        L_0x001e:
            X.AnonymousClass0AV.A00(r3, r4)     // Catch:{ all -> 0x0032 }
        L_0x0021:
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            r3.wait()     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0021
        L_0x0029:
            r3.A04()     // Catch:{ all -> 0x0032 }
            r3.A01 = r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)
            return
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04950Qa.A02():void");
    }

    public final int Ag8() {
        return A00() + 256;
    }

    /* JADX INFO: finally extract failed */
    public final void DBS(Writer writer) {
        if (!BOB()) {
            A02();
        }
        A05(writer);
        AnonymousClass0AT r2 = this.A01;
        writer.write(93);
        writer.write(44);
        AnonymousClass0KD A022 = r2.A02.A02();
        try {
            r2.A01.A00(A022);
            AnonymousClass0AR r0 = r2.A00;
            if (r0 != null) {
                r0.A00.CXy(A022);
            }
            AnonymousClass0KR.A00().A05(A022, writer);
            A022.A02();
            writer.write(125);
            writer.flush();
        } catch (Throwable th) {
            A022.A02();
            throw th;
        }
    }
}
