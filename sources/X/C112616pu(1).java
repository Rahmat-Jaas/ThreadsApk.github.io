package X;

/* renamed from: X.6pu  reason: invalid class name and case insensitive filesystem */
public final class C112616pu {
    public AnonymousClass7o4 A00;
    public AnonymousClass55S A01 = new AnonymousClass55S();
    public Object A02;
    public boolean A03;

    public final void finalize() {
        AnonymousClass55S r1;
        AnonymousClass7o4 r2 = this.A00;
        if (r2 != null && !r2.isDone()) {
            AnonymousClass892 r0 = new AnonymousClass892(C18200wM.A0m(this.A02, C18190wL.A0s("The completer object was garbage collected - this future would otherwise never complete. The tag was: ")));
            MJO mjo = r2.A01;
            if (MJO.A01.A02(mjo, new AnonymousClass756(r0))) {
                MJO.A03(mjo);
            }
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A06((Object) null);
        }
    }
}
