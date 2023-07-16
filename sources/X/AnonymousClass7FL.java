package X;

/* renamed from: X.7FL  reason: invalid class name */
public final class AnonymousClass7FL {
    public static final boolean A03(C875353d r3, boolean z, boolean z2) {
        int ordinal = r3.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        throw AnonymousClass4VZ.A00();
                    }
                    return true;
                }
                C875353d A01 = AnonymousClass7FM.A01(r3);
                if (A01 != null && !A03(A01, z, z2)) {
                    return false;
                }
            } else if (!z) {
                return z;
            } else {
                r3.A00 = AnonymousClass6Av.Inactive;
                if (!z2) {
                    return z;
                }
                C115846w0.A01(r3);
                return z;
            }
        }
        r3.A00 = AnonymousClass6Av.Inactive;
        if (z2) {
            C115846w0.A01(r3);
        }
        return true;
    }

    public static final boolean A00(C875353d r5) {
        C147098nO r0;
        if (!r5.A03.A08) {
            throw C18180wK.A0a("Check failed.");
        } else if (!C146948n8.A00(r5)) {
            return AnonymousClass7KH.A06(r5, AnonymousClass8LX.A00, 7);
        } else {
            int ordinal = r5.A00.ordinal();
            if (!(ordinal == 0 || ordinal == 2)) {
                C875353d r2 = null;
                if (ordinal == 1) {
                    C875353d A01 = AnonymousClass7FM.A01(r5);
                    if (A01 != null && !A03(A01, false, true)) {
                        return false;
                    }
                    A01(r5);
                } else if (ordinal == 3) {
                    AnonymousClass7YG A00 = C121847Ik.A00(r5, 1024);
                    if (A00 instanceof C875353d) {
                        r2 = A00;
                    }
                    C875353d r22 = r2;
                    if (r22 != null) {
                        return A02(r22, r5);
                    }
                    AnonymousClass54T r02 = r5.A06;
                    if (r02 == null || (r0 = r02.A0H.A0A) == null) {
                        throw C18180wK.A0a("Owner not initialized.");
                    } else if (!r0.requestFocus()) {
                        return false;
                    } else {
                        A01(r5);
                        C115846w0.A01(r5);
                        return true;
                    }
                } else {
                    throw AnonymousClass4VZ.A00();
                }
            }
            C115846w0.A01(r5);
            return true;
        }
    }

    public static final boolean A01(C875353d r3) {
        AnonymousClass6F2.A00(r3, C86154wM.A13(r3, 13));
        int ordinal = r3.A00.ordinal();
        if (ordinal != 1 && ordinal != 3) {
            return true;
        }
        r3.A00 = AnonymousClass6Av.Active;
        return true;
    }

    public static final boolean A02(C875353d r7, C875353d r8) {
        C147098nO r0;
        AnonymousClass7YG A00 = C121847Ik.A00(r8, 1024);
        C875353d r5 = null;
        if (!(A00 instanceof C875353d)) {
            A00 = null;
        }
        if (C04220Ms.A0I(A00, r7)) {
            int ordinal = r7.A00.ordinal();
            if (ordinal == 0) {
                boolean A01 = A01(r8);
                r7.A00 = AnonymousClass6Av.ActiveParent;
                C115846w0.A01(r8);
                C115846w0.A01(r7);
                return A01;
            } else if (ordinal == 2) {
                return false;
            } else {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        AnonymousClass7YG A002 = C121847Ik.A00(r7, 1024);
                        if (A002 instanceof C875353d) {
                            r5 = A002;
                        }
                        C875353d r52 = r5;
                        if (r52 == null) {
                            AnonymousClass54T r02 = r7.A06;
                            if (r02 == null || (r0 = r02.A0H.A0A) == null) {
                                throw C18180wK.A0a("Owner not initialized.");
                            } else if (!r0.requestFocus()) {
                                return false;
                            } else {
                                r7.A00 = AnonymousClass6Av.Active;
                                C115846w0.A01(r7);
                                return A02(r7, r8);
                            }
                        } else if (!A02(r52, r7)) {
                            return false;
                        } else {
                            boolean A02 = A02(r7, r8);
                            if (r7.A00 == AnonymousClass6Av.ActiveParent) {
                                return A02;
                            }
                            throw C18180wK.A0a("Check failed.");
                        }
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                } else if (AnonymousClass7FM.A01(r7) != null) {
                    C875353d A012 = AnonymousClass7FM.A01(r7);
                    if (A012 != null && !A03(A012, false, true)) {
                        return false;
                    }
                    A01(r8);
                    C115846w0.A01(r8);
                    return true;
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        } else {
            throw C18180wK.A0a("Non child node cannot request focus.");
        }
    }
}
