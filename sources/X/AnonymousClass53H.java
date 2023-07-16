package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.53H  reason: invalid class name */
public final class AnonymousClass53H extends Snapshot {
    public final Snapshot A00;
    public final AnonymousClass0YY A01;
    public final Snapshot A02;
    public final boolean A03;

    public final void A0A() {
        Snapshot snapshot;
        this.A01 = true;
        if (this.A03 && (snapshot = this.A00) != null) {
            snapshot.A0A();
        }
    }

    public AnonymousClass53H(Snapshot snapshot, AnonymousClass0YY r4, boolean z) {
        super(C134947yd.A04, 0);
        this.A00 = snapshot;
        this.A03 = z;
        this.A01 = r4 == null ? null : r4;
        this.A02 = this;
    }
}
