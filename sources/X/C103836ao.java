package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6ao  reason: invalid class name and case insensitive filesystem */
public final class C103836ao {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;
    public static final Set A03;
    public static final Set A04;
    public static final Set A05 = Collections.unmodifiableSet(C86114wI.A0t(new String[]{"cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"}));

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(C86114wI.A0t(new String[]{FXPFAccessLibraryDebugFragment.NAME, "given-name", "family-name", "tel", "address-line1", "address-line2", "address-level1", "address-level2", "country", "postal-code", "email"}));
        A02 = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(C86114wI.A0t(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name", "cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"}));
        A04 = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(C86114wI.A0t(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name"}));
        A00 = unmodifiableSet3;
        HashSet A0u = C18200wM.A0u();
        A0u.addAll(unmodifiableSet2);
        A0u.addAll(unmodifiableSet);
        A03 = Collections.unmodifiableSet(A0u);
        HashSet A0u2 = C18200wM.A0u();
        A0u2.addAll(unmodifiableSet);
        A0u2.addAll(unmodifiableSet3);
        A01 = Collections.unmodifiableSet(A0u2);
    }
}
