package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.53d  reason: invalid class name and case insensitive filesystem */
public final class C875353d extends AnonymousClass7YG implements C147628pe, C147688pk {
    public AnonymousClass6Av A00 = AnonymousClass6Av.Inactive;

    public final C146948n8 A06() {
        C123417Wv r5 = new C123417Wv();
        AnonymousClass7YG r1 = this.A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A01 = C121847Ik.A01(this);
            loop0:
            while (true) {
                if ((A01.A0a.A02.A00 & 3072) != 0) {
                    while (true) {
                        if (r3 == null) {
                            break;
                        }
                        int i = r3.A01;
                        if ((i & 3072) != 0) {
                            if ((1024 & i) != 0) {
                                break loop0;
                            } else if (r3 instanceof C147708pm) {
                                ((C147708pm) r3).BgV(r5);
                            } else {
                                throw C18180wK.A0a("Check failed.");
                            }
                        }
                        r3 = r3.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 == null) {
                    break;
                }
                AnonymousClass7IW r0 = A01.A0a;
                if (r0 != null) {
                    r3 = r0.A05;
                } else {
                    r3 = null;
                }
            }
            return r5;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final void A07() {
        AnonymousClass6Av r1 = this.A00;
        if (r1 == AnonymousClass6Av.Active || r1 == AnonymousClass6Av.Captured) {
            AnonymousClass0MJ A17 = C86144wL.A17();
            AnonymousClass6F2.A00(this, C86164wN.A0v(A17, this, 18));
            Object obj = A17.A00;
            if (obj == null) {
                C04220Ms.A0E("focusProperties");
                throw null;
            } else if (!((C146948n8) obj).AVV()) {
                ((C123407Wu) ((AndroidComposeView) C121847Ik.A03(this)).A0Q).ADB(true, true);
            }
        }
    }

    public final void A08() {
        AnonymousClass7YG r1 = this.A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A01 = C121847Ik.A01(this);
            while (true) {
                if ((A01.A0a.A02.A00 & 5120) != 0) {
                    while (r3 != null) {
                        int i = r3.A01;
                        if ((i & 5120) != 0 && (1024 & i) == 0) {
                            if (r3 instanceof C147698pl) {
                                AnonymousClass76Z A002 = C123407Wu.A00(this);
                                AnonymousClass76Z.A00(A002, r3, A002.A00);
                            } else {
                                throw C18180wK.A0a("Check failed.");
                            }
                        }
                        r3 = r3.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 != null) {
                    AnonymousClass7IW r0 = A01.A0a;
                    if (r0 != null) {
                        r3 = r0.A05;
                    } else {
                        r3 = null;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw C18180wK.A0a("Check failed.");
        }
    }

    public final /* synthetic */ Object AbB(C104176bM r5) {
        AnonymousClass7YG r1 = this.A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A01 = C121847Ik.A01(this);
            while (true) {
                if ((A01.A0a.A02.A00 & 32) != 0) {
                    while (r3 != null) {
                        if ((r3.A01 & 32) != 0 && (r3 instanceof C147628pe)) {
                            C147628pe r12 = (C147628pe) r3;
                            if (r12.B4y().A01(r5)) {
                                return r12.B4y().A00(r5);
                            }
                        }
                        r3 = r3.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 == null) {
                    return r5.A00.invoke();
                }
                AnonymousClass7IW r0 = A01.A0a;
                if (r0 != null) {
                    r3 = r0.A05;
                } else {
                    r3 = null;
                }
            }
        } else {
            throw C18190wL.A0a("Failed requirement.");
        }
    }

    public final /* synthetic */ C113206qv B4y() {
        return AnonymousClass54M.A00;
    }
}
