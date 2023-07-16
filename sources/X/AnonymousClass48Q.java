package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.user.model.User;

/* renamed from: X.48Q  reason: invalid class name */
public final class AnonymousClass48Q implements C41882MfV {
    public final FanClubCategoryType A00;
    public final User A01;
    public final User A02;
    public final String A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48Q r3 = (AnonymousClass48Q) obj;
        C04220Ms.A0B(r3, 0);
        if (this.A00 != r3.A00 || !C04220Ms.A0I(this.A03, r3.A03)) {
            return false;
        }
        return true;
    }

    public AnonymousClass48Q(FanClubCategoryType fanClubCategoryType, User user, User user2, String str, String str2) {
        AnonymousClass0wJ.A1O(fanClubCategoryType, str);
        AnonymousClass0wJ.A1R(str2, user);
        C04220Ms.A0B(user2, 5);
        this.A00 = fanClubCategoryType;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = user;
        this.A01 = user2;
    }
}
