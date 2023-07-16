package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.3R3  reason: invalid class name */
public final class AnonymousClass3R3 {
    public static final Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3.A00.getBoolean("shopping_has_tapped_orders_navbar_icon", false) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(com.instagram.service.session.UserSession r6, int r7) {
        /*
            r5 = 1
            if (r7 > 0) goto L_0x0048
            r4 = 0
            if (r6 != 0) goto L_0x0007
            return r4
        L_0x0007:
            X.1tl r3 = X.AnonymousClass3WS.A01(r6)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r6)
            X.MeW r0 = r0.A05
            java.lang.Boolean r0 = r0.Am8()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0028
            android.content.SharedPreferences r1 = r3.A00
            java.lang.String r0 = "shopping_has_tapped_orders_navbar_icon"
            boolean r0 = r1.getBoolean(r0, r4)
            r2 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            android.content.SharedPreferences r1 = r3.A00
            java.lang.String r0 = "has_tapped_on_shopping_bag_menu_option"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "has_used_shopping_bag"
            boolean r0 = r1.getBoolean(r0, r4)
            r1 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            boolean r0 = X.C59363Kn.A01(r6)
            if (r2 != 0) goto L_0x0048
            if (r1 != 0) goto L_0x0048
            if (r0 != 0) goto L_0x0048
            r5 = 0
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R3.A00(com.instagram.service.session.UserSession, int):boolean");
    }

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(Integer.valueOf(R.drawable.instagram_alert_filled_16), AnonymousClass2AP.A0A.toString());
        builder.put(Integer.valueOf(R.drawable.notification_comment_icon), "comments");
        builder.put(Integer.valueOf(R.drawable.notification_like_icon), "likes");
        builder.put(Integer.valueOf(R.drawable.notification_people_icon), AnonymousClass2AP.A0W.toString());
        builder.put(Integer.valueOf(R.drawable.notification_story_mention_icon), "story_mentions");
        builder.put(Integer.valueOf(R.drawable.notification_tag_icon), AnonymousClass2AP.A0R.toString());
        builder.put(Integer.valueOf(R.drawable.instagram_shopping_bag_filled_16), "shopping_notifications");
        A00 = builder.build();
    }
}
