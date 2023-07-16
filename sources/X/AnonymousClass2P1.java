package X;

/* renamed from: X.2P1  reason: invalid class name */
public final class AnonymousClass2P1 {
    public static C319129l A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return C319129l.CHANGE_PROFILE_PICTURE_FIRST_TIME;
        }
        if (intValue == 1) {
            return C319129l.SET_AVATAR_PROFILE_PICTURE;
        }
        if (intValue != 2) {
            return C319129l.REMOVE_PROFILE_PICTURE;
        }
        return C319129l.EDIT_PHOTO_REMINDER;
    }
}
