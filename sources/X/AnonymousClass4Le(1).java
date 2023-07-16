package X;

/* renamed from: X.4Le  reason: invalid class name */
public final class AnonymousClass4Le implements C21735BzM {
    public final /* synthetic */ AnonymousClass1lP A00;

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public AnonymousClass4Le(AnonymousClass1lP r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        AnonymousClass1lP r0 = this.A00;
        r0.A01();
        for (C568938y r02 : r0.A07) {
            r02.A00.CeG();
        }
        AnonymousClass0LU.A0C("RageShakeSensorHelper", "onRageshakeDismissed | bottomSheet is dismissed");
    }
}
