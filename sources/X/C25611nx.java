package X;

/* renamed from: X.1nx  reason: invalid class name and case insensitive filesystem */
public final class C25611nx extends C12140lP {
    public final /* synthetic */ C32165H8c A00;
    public final /* synthetic */ C67623zr A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25611nx(C32165H8c h8c, C67623zr r8, String str) {
        super(str, 237, 3, true, true);
        this.A01 = r8;
        this.A00 = h8c;
    }

    public final void loggedRun() {
        C32165H8c h8c = this.A00;
        h8c.run();
        h8c.onFinish();
    }

    public final String toString() {
        return this.A00.A0A;
    }
}
