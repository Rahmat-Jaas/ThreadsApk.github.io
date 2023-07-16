package X;

/* renamed from: X.7vs  reason: invalid class name and case insensitive filesystem */
public final class C133547vs implements C27686Erc {
    public final /* synthetic */ AnonymousClass5xV A00;

    public C133547vs(AnonymousClass5xV r1) {
        this.A00 = r1;
    }

    public final AnonymousClass38C getState(AnonymousClass38C r3, CharSequence charSequence, boolean z) {
        String str;
        C04220Ms.A0B(r3, 0);
        AnonymousClass8f5 r1 = ((AnonymousClass5IW) AnonymousClass5xV.A00(this.A00).A0G.getValue()).A01;
        if (!C04220Ms.A0I(r1, C133487vm.A00)) {
            if (C04220Ms.A0I(r1, C133477vl.A00)) {
                str = "loading";
            } else if (r1 instanceof C133467vk) {
                r3.A01 = "error";
                r3.A00 = ((C133467vk) r1).A00;
                return r3;
            } else if (C04220Ms.A0I(r1, C133497vn.A00)) {
                str = "confirmed";
            } else {
                throw AnonymousClass4VZ.A00();
            }
            r3.A01 = str;
        }
        return r3;
    }
}
