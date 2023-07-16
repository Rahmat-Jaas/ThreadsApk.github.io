package X;

/* renamed from: X.1jn  reason: invalid class name and case insensitive filesystem */
public final class C24661jn extends C19819BBt {
    public final AnonymousClass1cQ A00;
    public final C82394pY A01 = C18220wO.A0P(this, 59);
    public final C82394pY A02 = C18220wO.A0P(this, 60);
    public final C10300i6 A03;
    public final AnonymousClass265 A04;

    public final void onPause() {
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A01, AnonymousClass45A.class);
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18308414790835700L)) {
            kHr.A04(this.A02, AnonymousClass45B.class);
        }
    }

    public final void onResume() {
        String str;
        C38040KHr kHr = C38040KHr.A01;
        kHr.A03(this.A01, AnonymousClass45A.class);
        AnonymousClass44X A002 = AnonymousClass44X.A00();
        C10300i6 r3 = this.A03;
        if (!AnonymousClass44X.A01(r3, A002, "ig_android_growth_fx_access_fb_ig_sso")) {
            AnonymousClass44X.A00().A04(r3, this.A04);
        } else {
            kHr.CWx(new AnonymousClass45A());
        }
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18308414790835700L)) {
            kHr.A03(this.A02, AnonymousClass45B.class);
            C04220Ms.A0B(r3, 1);
            if (C63693i8.A08(r3) || (str = AnonymousClass47l.A02) == null || str.length() == 0) {
                kHr.CWx(new AnonymousClass45B());
                AnonymousClass0gN.A00().AKp(new AnonymousClass1mG(r3));
                return;
            }
            kHr.CWx(new AnonymousClass45B());
        }
    }

    public C24661jn(C10300i6 r2, AnonymousClass1cQ r3, AnonymousClass265 r4) {
        this.A03 = r2;
        this.A00 = r3;
        this.A04 = r4;
    }
}
