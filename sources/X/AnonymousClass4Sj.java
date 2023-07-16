package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.4Sj  reason: invalid class name */
public final class AnonymousClass4Sj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1dM A02;

    public AnonymousClass4Sj(AnonymousClass1dM r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A02.A04;
        if (refreshableRecyclerViewLayout == null) {
            C04220Ms.A0E("refreshableRecyclerViewLayout");
            throw null;
        } else {
            refreshableRecyclerViewLayout.A0B(this.A00, refreshableRecyclerViewLayout.A0P.getHeight() - this.A01);
        }
    }
}
