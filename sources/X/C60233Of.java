package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.3Of  reason: invalid class name and case insensitive filesystem */
public final class C60233Of {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        String str2;
        C04220Ms.A0B(userSession, 0);
        if (bundle == null) {
            bundle = C18180wK.A06();
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", fragmentActivity.getString(i));
        if (num != null) {
            str2 = fragmentActivity.getString(num.intValue());
        } else {
            str2 = "";
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", str2);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", str);
        bundle.putParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS", directMessageInteropReachabilityOptionsArr);
        bundle.putParcelable("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL", directMessagesInteropOptionsViewModel);
        bundle.putBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER", z);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT", bundle.getString("entry_point"));
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C18190wL.A10();
        C18180wK.A0x(bundle, new C29171xR(), A0Q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r5 != r2) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        throw X.C18190wL.A0a(X.AnonymousClass00U.A0V("Option[", r9, "] is not implemented"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r8 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r19 == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r8 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        if (r18 == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        if (X.AnonymousClass0wJ.A0Y(r13).A3a() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010b, code lost:
        r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r6.Bh5(r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.service.session.UserSession r13, com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r14, X.C83784rz r15, X.AnonymousClass266 r16, java.lang.String r17, boolean r18, boolean r19, boolean r20) {
        /*
            r12 = 0
            r3 = 1
            r9 = r17
            X.C04220Ms.A0B(r9, r3)
            int r0 = r9.hashCode()
            r7 = r14
            r6 = r15
            switch(r0) {
                case -2143256302: goto L_0x001d;
                case -1890055046: goto L_0x004c;
                case -1839818691: goto L_0x005b;
                case -1275916548: goto L_0x006a;
                case -737267292: goto L_0x0080;
                case -456614348: goto L_0x008c;
                case -371252023: goto L_0x00de;
                case -8227469: goto L_0x009b;
                case 949752640: goto L_0x00aa;
                case 949752738: goto L_0x00c9;
                case 1767124056: goto L_0x0111;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r1 = "Option["
            java.lang.String r0 = "] is not implemented"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r9, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x001d:
            java.lang.String r0 = "fb_friends"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830471(0x7f1126c7, float:1.929394E38)
            X.266 r2 = X.AnonymousClass266.A05
            r5 = r16
            if (r5 != r2) goto L_0x003b
            r1 = 2131830443(0x7f1126ab, float:1.9293883E38)
        L_0x0031:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            if (r18 != 0) goto L_0x0107
            if (r5 != r2) goto L_0x010b
            goto L_0x0107
        L_0x003b:
            X.3Up r0 = X.C61623Up.A00(r13)
            boolean r0 = r0.A01()
            r1 = 2131830442(0x7f1126aa, float:1.9293881E38)
            if (r0 == 0) goto L_0x0031
            r1 = 2131830445(0x7f1126ad, float:1.9293888E38)
            goto L_0x0031
        L_0x004c:
            java.lang.String r0 = "fb_friends_of_friends"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830472(0x7f1126c8, float:1.9293942E38)
            r0 = 2131830444(0x7f1126ac, float:1.9293886E38)
            goto L_0x00d7
        L_0x005b:
            java.lang.String r0 = "people_with_your_phone_number"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830488(0x7f1126d8, float:1.9293975E38)
            r0 = 2131830452(0x7f1126b4, float:1.9293902E38)
            goto L_0x00d7
        L_0x006a:
            java.lang.String r0 = "fb_messaged_your_page"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830479(0x7f1126cf, float:1.9293957E38)
            r0 = 2131830450(0x7f1126b2, float:1.9293898E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06
            goto L_0x0109
        L_0x0080:
            java.lang.String r0 = "eligible_for_bc_partnership"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r15.Bgw()
            return
        L_0x008c:
            java.lang.String r0 = "ig_followers"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830487(0x7f1126d7, float:1.9293973E38)
            r0 = 2131830446(0x7f1126ae, float:1.929389E38)
            goto L_0x00d7
        L_0x009b:
            java.lang.String r0 = "fb_liked_or_followed_your_page"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830480(0x7f1126d0, float:1.9293959E38)
            r0 = 2131830451(0x7f1126b3, float:1.92939E38)
            goto L_0x00c2
        L_0x00aa:
            java.lang.String r0 = "others_on_fb"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830478(0x7f1126ce, float:1.9293954E38)
            if (r20 == 0) goto L_0x00ba
            r11 = 2131830476(0x7f1126cc, float:1.929395E38)
        L_0x00ba:
            r0 = 2131830449(0x7f1126b1, float:1.9293896E38)
            if (r20 == 0) goto L_0x00c2
            r0 = 2131830447(0x7f1126af, float:1.9293892E38)
        L_0x00c2:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            if (r19 == 0) goto L_0x010e
            goto L_0x0107
        L_0x00c9:
            java.lang.String r0 = "others_on_ig"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830477(0x7f1126cd, float:1.9293952E38)
            r0 = 2131830448(0x7f1126b0, float:1.9293894E38)
        L_0x00d7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            if (r18 == 0) goto L_0x010e
            goto L_0x0107
        L_0x00de:
            java.lang.String r0 = "ig_verified"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830463(0x7f1126bf, float:1.9293924E38)
            r0 = 2131830464(0x7f1126c0, float:1.9293926E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342164688642644963(0x20810a6000021be3, double:4.067009893525879E-152)
            boolean r0 = X.C63803iN.A0E(r2, r13, r0)
            if (r0 != 0) goto L_0x010e
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r13)
            boolean r0 = r0.A3a()
            if (r0 == 0) goto L_0x010b
        L_0x0107:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06
        L_0x0109:
            r12 = r3
            goto L_0x011f
        L_0x010b:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A05
            goto L_0x0109
        L_0x010e:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07
            goto L_0x0109
        L_0x0111:
            java.lang.String r0 = "group_message_setting"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0010
            r11 = 2131830460(0x7f1126bc, float:1.9293918E38)
            r8 = 0
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r10 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A04
        L_0x011f:
            r6.Bh5(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60233Of.A01(com.instagram.service.session.UserSession, com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel, X.4rz, X.266, java.lang.String, boolean, boolean, boolean):void");
    }
}
