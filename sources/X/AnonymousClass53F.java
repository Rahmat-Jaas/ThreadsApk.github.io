package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.53F  reason: invalid class name */
public final class AnonymousClass53F extends Snapshot {
    public final Snapshot A00;
    public final AnonymousClass0YY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53F(Snapshot snapshot, C134947yd r5, AnonymousClass0YY r6, int i) {
        super(r5, i);
        C18180wK.A1Q(r5, 2, snapshot);
        this.A00 = snapshot;
        snapshot.A0B();
        if (r6 != null) {
            AnonymousClass0YY A08 = snapshot.A08();
            if (A08 != null) {
                r6 = new KtLambdaShape40S0200000_I2_1(r6, A08, 3);
            }
        } else {
            r6 = snapshot.A08();
        }
        this.A01 = r6;
    }

    public final void A0A() {
        if (!this.A01) {
            int A04 = A04();
            Snapshot snapshot = this.A00;
            if (A04 != snapshot.A04()) {
                A0F();
            }
            snapshot.A0C();
            super.A0A();
        }
    }
}
