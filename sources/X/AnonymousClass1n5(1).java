package X;

import com.facebook.reliability.ulimit.Ulimit;

/* renamed from: X.1n5  reason: invalid class name */
public final class AnonymousClass1n5 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n5(C697249u r7) {
        super("setFileDescriptorLimit", 379, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        if (Ulimit.sNativeLibLoaded) {
            Ulimit.setNativeMaxUlimit();
        }
    }
}
