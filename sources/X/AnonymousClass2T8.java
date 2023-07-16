package X;

import android.os.Bundle;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2T8  reason: invalid class name */
public final class AnonymousClass2T8 {
    public static Bundle A00(QuickPromotionSlot quickPromotionSlot, String str, boolean z) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL", z);
        A06.putString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT", quickPromotionSlot.name());
        A06.putString("QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION", str);
        return A06;
    }
}
