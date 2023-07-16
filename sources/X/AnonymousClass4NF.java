package X;

/* renamed from: X.4NF  reason: invalid class name */
public final class AnonymousClass4NF implements C39800L0r {
    public final /* synthetic */ AnonymousClass1dG A00;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public AnonymousClass4NF(AnonymousClass1dG r1) {
        this.A00 = r1;
    }

    public final void Bxw(Integer num) {
        C63813iO.A08(this.A00.getRootActivity());
    }

    public final void onSuccess() {
        AnonymousClass1dG r2 = this.A00;
        if (r2.A08) {
            C83204qx r1 = r2.A05;
            if (r1 != null) {
                r1.CSW(r2.A07);
                return;
            }
            return;
        }
        C25745DrH A0b = C18220wO.A0b(r2.requireActivity());
        if (A0b != null) {
            ((C35189Ipf) A0b).A0B = new C72004Lr(A0b, this);
            A0b.A0C();
        }
    }
}
