package X;

import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6Ey  reason: invalid class name and case insensitive filesystem */
public final class C98296Ey {
    public static final int A00(C104166bL r7, AnonymousClass54K r8) {
        AnonymousClass54K r6;
        long j;
        int A07;
        boolean z = r8 instanceof AnonymousClass54T;
        if (z) {
            r6 = ((AnonymousClass54T) r8).A06;
        } else {
            AnonymousClass54T r0 = ((AnonymousClass54S) r8).A03.A06;
            if (r0 != null) {
                r6 = r0.A05;
            }
            StringBuilder A0s = C18190wL.A0s("Child of ");
            A0s.append(r8);
            throw C18180wK.A0a(C18180wK.A0i(" cannot be null when calculating alignment line", A0s));
        }
        if (r6 != null) {
            if (r8.A0G().AQ9().containsKey(r7)) {
                Number A0j = C86124wJ.A0j(r7, r8.A0G().AQ9());
                if (A0j != null) {
                    return A0j.intValue();
                }
                return Process.WAIT_RESULT_TIMEOUT;
            }
            int ANp = r6.ANp(r7);
            if (ANp == Integer.MIN_VALUE) {
                return Process.WAIT_RESULT_TIMEOUT;
            }
            r6.A01 = true;
            r8.A00 = true;
            if (z) {
                AnonymousClass54T r4 = (AnonymousClass54T) r8;
                long j2 = r4.A01;
                r4.A0E(r4.A0A, r4.A00, j2);
            } else {
                AnonymousClass54S r42 = (AnonymousClass54S) r8;
                r42.A0E((AnonymousClass0YY) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r42.A00);
            }
            r6.A01 = false;
            r8.A00 = false;
            boolean z2 = r7 instanceof AnonymousClass54E;
            if (r6 instanceof AnonymousClass54T) {
                j = ((AnonymousClass54T) r6).A01;
            } else {
                j = ((AnonymousClass54S) r6).A00;
            }
            if (z2) {
                A07 = C86104wH.A08(j);
            } else {
                A07 = C86104wH.A07(j);
            }
            return ANp + A07;
        }
        StringBuilder A0s2 = C18190wL.A0s("Child of ");
        A0s2.append(r8);
        throw C18180wK.A0a(C18180wK.A0i(" cannot be null when calculating alignment line", A0s2));
    }
}
