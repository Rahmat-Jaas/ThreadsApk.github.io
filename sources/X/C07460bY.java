package X;

/* renamed from: X.0bY  reason: invalid class name and case insensitive filesystem */
public final class C07460bY {
    public final int A00;
    public final C09740gb A01;
    public final Integer A02;
    public final boolean A03;

    public final String toString() {
        String str;
        C09740gb r1 = this.A01;
        if (r1.A01()) {
            str = ((Throwable) r1.A00()).getLocalizedMessage();
        } else {
            str = "None";
        }
        StringBuilder sb = new StringBuilder("NetworkState{mConnected=");
        sb.append(this.A03);
        sb.append(", mConnectionType=");
        sb.append(C07630bp.A00(this.A02));
        sb.append(", mNetworkType=");
        sb.append(this.A00);
        sb.append(", mThrowable=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C07460bY(Integer num, Throwable th, int i, boolean z) {
        C09740gb r0;
        this.A03 = z;
        this.A02 = num;
        this.A00 = i;
        if (th == null) {
            r0 = C12730mO.A00;
        } else {
            r0 = new C12760mR(th);
        }
        this.A01 = r0;
    }
}
