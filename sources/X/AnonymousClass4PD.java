package X;

/* renamed from: X.4PD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4PD implements Runnable {
    public final /* synthetic */ AnonymousClass1c9 A00;

    public /* synthetic */ AnonymousClass4PD(AnonymousClass1c9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1c9 r3 = this.A00;
        AnonymousClass01V.A0p.markerEnd(725105460, 2);
        C18330wh r0 = r3.A0D;
        if (r0 != null && (r0.getOwnerActivity() == null || !r3.A0D.getOwnerActivity().isDestroyed())) {
            r3.A0D.cancel();
        }
        AnonymousClass1c9.A04(r3);
    }
}
