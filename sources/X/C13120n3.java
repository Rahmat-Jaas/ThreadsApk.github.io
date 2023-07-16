package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.0n3  reason: invalid class name and case insensitive filesystem */
public final class C13120n3 {
    public Throwable A00 = null;
    public final int A01;
    public final long A02;
    public final C17630vH A03;
    public final C17290ue A04;
    public final String A05;
    public volatile AnonymousClass0C7 A06;
    public volatile C17570vA A07;

    public final void A00() {
        synchronized (this) {
            this.A00 = new TimeoutException();
        }
        if (this.A07 != null) {
            this.A07.onPubAckTimeout(this.A01);
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public final void A01(C17450uv r4) {
        synchronized (this) {
            this.A00 = r4;
        }
        if (this.A07 != null) {
            this.A07.onFailure(this.A01, C17470ux.A01(r4.A00));
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttOperation{mResponseType=");
        sb.append(this.A04);
        sb.append(", mOperationId=");
        sb.append(this.A01);
        sb.append(", mCreationTime=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C13120n3(C17630vH r2, C17290ue r3, String str, int i, long j) {
        this.A03 = r2;
        this.A05 = str;
        this.A04 = r3;
        this.A01 = i;
        this.A02 = j;
    }
}
