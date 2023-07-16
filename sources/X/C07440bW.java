package X;

import com.instagram.service.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0bW  reason: invalid class name and case insensitive filesystem */
public final class C07440bW {
    public boolean A00;
    public final LinkedHashSet A01;
    public final Set A02;

    public final void A01(AnonymousClass0P5 r4) {
        boolean z;
        UserSession userSession;
        LinkedHashSet linkedHashSet = this.A01;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.contains(r4)) {
                linkedHashSet.add(r4);
            }
            z = this.A00;
        }
        if (z) {
            C10300i6 A03 = AnonymousClass0RA.A0C.A03(this);
            if ((A03 instanceof UserSession) && (userSession = (UserSession) A03) != null) {
                ((AnonymousClass0QY) r4.AO4(userSession)).CSb(false);
            }
        }
    }

    public static final void A00(C07440bW r3, boolean z) {
        Set<AnonymousClass0P5> A0c;
        UserSession userSession;
        LinkedHashSet linkedHashSet = r3.A01;
        synchronized (linkedHashSet) {
            if (z) {
                if (!r3.A00) {
                    r3.A00 = true;
                } else {
                    throw new IllegalStateException("We should only call initProviders once");
                }
            }
            A0c = AnonymousClass00J.A0c(linkedHashSet);
        }
        C10300i6 A03 = AnonymousClass0RA.A0C.A03(r3);
        if ((A03 instanceof UserSession) && (userSession = (UserSession) A03) != null) {
            for (AnonymousClass0P5 AO4 : A0c) {
                ((AnonymousClass0QY) AO4.AO4(userSession)).CSb(z);
            }
        }
    }

    public C07440bW() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A01 = linkedHashSet;
        this.A02 = linkedHashSet;
    }
}
