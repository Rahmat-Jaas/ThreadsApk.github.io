package X;

import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.service.session.UserSession;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3h9  reason: invalid class name and case insensitive filesystem */
public final class C63273h9 {
    public final boolean A00 = true;

    public C63273h9(boolean z) {
    }

    public static void A02(AbstractCollection abstractCollection) {
        abstractCollection.add(new C63273h9());
    }

    public static void A03(List list) {
        list.add(new C63273h9());
    }

    public static void A00(DevOptionsHelper.Companion companion, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded, UserSession userSession, AnonymousClass4MA r3, List list) {
        companion.addMenuItem(userSession, list, r3, onPinnedDevOptionItemAdded);
        list.add(new C63273h9());
    }

    public static void A01(DevOptionsHelper.Companion companion, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded, UserSession userSession, AnonymousClass4MC r3, List list) {
        companion.addSwitchItem(userSession, list, r3, onPinnedDevOptionItemAdded);
        list.add(new C63273h9());
    }

    public C63273h9() {
    }
}
