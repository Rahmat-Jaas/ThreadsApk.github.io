package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.6KH  reason: invalid class name */
public final class AnonymousClass6KH {
    public static final MonetizationEligibilityDecision A00(String str) {
        MonetizationEligibilityDecision monetizationEligibilityDecision = (MonetizationEligibilityDecision) MonetizationEligibilityDecision.A01.get(str);
        if (monetizationEligibilityDecision == null) {
            return MonetizationEligibilityDecision.UNRECOGNIZED;
        }
        return monetizationEligibilityDecision;
    }
}
