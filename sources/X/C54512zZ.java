package X;

import android.content.Context;
import com.instagram.api.schemas.CommentAudienceControlType;

/* renamed from: X.2zZ  reason: invalid class name and case insensitive filesystem */
public final class C54512zZ {
    public static String A00(Context context, CommentAudienceControlType commentAudienceControlType) {
        int i;
        int ordinal = commentAudienceControlType.ordinal();
        if (ordinal == 1) {
            i = 2131835566;
        } else if (ordinal == 3) {
            i = 2131835567;
        } else if (ordinal == 2) {
            i = 2131835569;
        } else if (ordinal != 4) {
            C10450iM.A03("CommentsSettingsUtil", "Invalid Commenter Type setting.");
            return "";
        } else {
            i = 2131835570;
        }
        return context.getString(i);
    }
}
