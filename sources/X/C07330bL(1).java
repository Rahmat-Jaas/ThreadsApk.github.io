package X;

import com.facebook.perf.background.BackgroundStartupDetector;

/* renamed from: X.0bL  reason: invalid class name and case insensitive filesystem */
public final class C07330bL implements AnonymousClass0PC {
    public final C04100Mg A00;
    public final C07220b8 A01;

    public final void A00() {
        String str;
        AnonymousClass0ON r2 = AnonymousClass0MU.A4o;
        int i = BackgroundStartupDetector.A0C;
        if (i == 0) {
            str = "unknown";
        } else if (i == 1) {
            str = "def_bg";
        } else if (i == 2) {
            str = "pro_bg";
        } else if (i != 3) {
            str = "pro_fg";
        } else {
            str = "def_fg";
        }
        C04520Nz.A00(new C07320bK(r2, this, str));
    }

    public final void A01(Boolean bool) {
        String obj;
        byte b;
        C07220b8 r1 = this.A01;
        if (r1 != null) {
            if (bool != null && bool.booleanValue()) {
                C07220b8.A00();
            }
            C06150Xw r5 = r1.A0D;
            if (r5 != null) {
                synchronized (r5) {
                    if (bool != null) {
                        b = 2;
                        if (bool.booleanValue()) {
                            b = 1;
                        }
                    } else {
                        b = 0;
                    }
                    C06150Xw.A02(r5, AnonymousClass006.A0D, b);
                }
            }
        }
        AnonymousClass0ON r2 = AnonymousClass0MU.A5c;
        if (bool == null) {
            obj = "unknown";
        } else {
            obj = bool.toString();
        }
        C04520Nz.A00(new C07320bK(r2, this, obj));
    }

    public final void start() {
        synchronized (BackgroundStartupDetector.class) {
            if (BackgroundStartupDetector.A07 == null) {
                BackgroundStartupDetector.A07 = this;
                A00();
                A01(BackgroundStartupDetector.A0E);
            } else {
                throw new UnsupportedOperationException("Only one reliability listener is supported at this time.");
            }
        }
    }

    public C07330bL(C04100Mg r1, C07220b8 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.BACKGROUND;
    }
}
