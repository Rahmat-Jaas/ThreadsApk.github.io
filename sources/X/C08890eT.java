package X;

/* renamed from: X.0eT  reason: invalid class name and case insensitive filesystem */
public final class C08890eT {
    public int A00 = 24;
    public float A01;
    public C08800eK A02 = new C08800eK();
    public String A03;
    public boolean A04 = false;
    public boolean A05 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r4 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r7 = this;
            X.0eK r6 = r7.A02
            X.0Kk r0 = r6.A04
            long r2 = r0.now()
            X.0eL r0 = r6.A05
            boolean r1 = r0.A02(r2)
            X.0eL r0 = r6.A06
            boolean r0 = r0.A02(r2)
            r5 = 0
            if (r0 != 0) goto L_0x001a
            r4 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r4 = 1
        L_0x001b:
            X.0eL r0 = r6.A07
            boolean r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0026
            r1 = 0
            if (r4 == 0) goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            X.0eL r0 = r6.A08
            boolean r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r5 = 1
        L_0x0032:
            X.C08800eK.A00(r6, r2)
            if (r5 == 0) goto L_0x003a
            r0 = 1
            r7.A04 = r0
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08890eT.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r3 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r4 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(float r7) {
        /*
            r6 = this;
            float r0 = r6.A01
            float r0 = java.lang.Math.max(r0, r7)
            r6.A01 = r0
            X.0eK r5 = r6.A02
            X.0Kk r0 = r5.A04
            long r1 = r0.now()
            X.0eL r0 = r5.A05
            boolean r3 = r0.A01(r7, r1)
            X.0eL r0 = r5.A06
            boolean r0 = r0.A01(r7, r1)
            if (r0 != 0) goto L_0x0021
            r4 = 0
            if (r3 == 0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            X.0eL r0 = r5.A07
            boolean r0 = r0.A01(r7, r1)
            if (r0 != 0) goto L_0x002d
            r3 = 0
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            X.0eL r0 = r5.A08
            boolean r0 = r0.A01(r7, r1)
            if (r0 != 0) goto L_0x0038
            if (r3 == 0) goto L_0x003e
        L_0x0038:
            X.C08800eK.A00(r5, r1)
            r0 = 1
            r6.A04 = r0
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08890eT.A01(float):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainFeedSeenStateMediaInfo{mMediaID='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", mVersion=");
        sb.append(this.A00);
        sb.append(", mPhotoViewedPercentages=");
        sb.append(this.A01);
        sb.append(", mSeenStateTimeInfo=");
        sb.append(this.A02);
        sb.append(", mIsDirty=");
        sb.append(this.A04);
        sb.append('}');
        return sb.toString();
    }

    public C08890eT(C08890eT r3) {
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A02 = new C08800eK(r3.A02);
        this.A05 = r3.A05;
        this.A04 = r3.A04;
    }

    public C08890eT(String str) {
        this.A03 = str;
    }

    public C08890eT() {
    }
}
