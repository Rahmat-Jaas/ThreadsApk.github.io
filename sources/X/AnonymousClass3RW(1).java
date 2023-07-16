package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3RW  reason: invalid class name */
public final class AnonymousClass3RW {
    public static final List A00;
    public static final Set A01;

    public static CharSequence A00(Context context, Map map, int i) {
        int i2;
        String A0j;
        C312024q r3 = null;
        if (map != null) {
            Iterator it = A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C312024q r1 = (C312024q) it.next();
                if (map.keySet().contains(r1)) {
                    r3 = r1;
                    break;
                }
            }
        }
        Resources resources = context.getResources();
        if (r3 == null) {
            return AnonymousClass0wJ.A0m(resources, i, R.plurals.notification_badge);
        }
        Integer num = (Integer) map.get(r3);
        int intValue = num.intValue();
        int ordinal = r3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = R.plurals.comment_badge;
            } else if (ordinal == 2) {
                i2 = R.plurals.follow_badge;
            } else if (ordinal == 3) {
                i2 = R.plurals.like_badge;
            } else if (ordinal != 7) {
                A0j = null;
            } else {
                i2 = R.plurals.new_post_badge;
            }
            A0j = C18230wP.A0j(resources, num, i2, intValue);
        } else {
            i2 = R.plurals.chat_badge;
            A0j = C18230wP.A0j(resources, num, i2, intValue);
        }
        int A04 = i - AnonymousClass0wJ.A04(map.get(r3));
        if (A04 > 0) {
            return resources.getString(2131821331, C18210wN.A1Y(A0j, A04));
        }
        return A0j;
    }

    static {
        C312024q r2 = C312024q.DIRECTS;
        C312024q r3 = C312024q.COMMENTS;
        C312024q r4 = C312024q.RELSTIONSHIPS;
        C312024q r5 = C312024q.LIKES;
        A01 = ImmutableSet.A01(r2, r3, r4, r5, C312024q.COMMENT_LIKES, C312024q.USER_TAGS, C312024q.PHOTOS_OF_YOU, C312024q.ACTIVITY);
        A00 = ImmutableList.of(r2, r3, r4, r5);
    }
}
