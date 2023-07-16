package X;

import android.content.SharedPreferences;
import android.widget.Toast;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.49K  reason: invalid class name */
public final class AnonymousClass49K implements AnonymousClass0i4 {
    public Toast A00;
    public C63873iU A01;
    public C32165H8c A02;
    public C32165H8c A03;
    public C24471ir A04;
    public String A05;
    public final C28161tl A06;
    public final UserSession A07;
    public final Set A08 = C18200wM.A0u();
    public final Set A09 = C18200wM.A0u();
    public final C63873iU A0A = C63873iU.A06(this, 161);
    public final C49162qw A0B;

    public final synchronized void A01(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        this.A05 = str;
        try {
            C18180wK.A0v(C28161tl.A02(this.A06), "interop_reachability_setting_PENDING", C60223Oe.A00(directMessagesInteropOptionsViewModel));
        } catch (IOException e) {
            C10450iM.A06("DirectMessagesOptionChooserController", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str11 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = directMessageInteropReachabilityOptions.A03;
        } else {
            str2 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str3 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str3 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions3 != null) {
            str4 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str4 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions4 != null) {
            str5 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str5 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions5 != null) {
            str6 = directMessageInteropReachabilityOptions5.A03;
        } else {
            str6 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions6 != null) {
            str7 = directMessageInteropReachabilityOptions6.A03;
        } else {
            str7 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A03;
        if (directMessageInteropReachabilityOptions7 != null) {
            str8 = directMessageInteropReachabilityOptions7.A03;
        } else {
            str8 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A02;
        if (directMessageInteropReachabilityOptions8 != null) {
            str9 = directMessageInteropReachabilityOptions8.A03;
        } else {
            str9 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions9 != null) {
            str10 = directMessageInteropReachabilityOptions9.A03;
        } else {
            str10 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10 = directMessagesInteropOptionsViewModel.A06;
        if (directMessageInteropReachabilityOptions10 != null) {
            str11 = directMessageInteropReachabilityOptions10.A03;
        }
        H1T A0O = AnonymousClass0wJ.A0O(this.A07);
        A0O.A0J("users/set_message_settings_v2/");
        A0O.A0P("ig_followers", str2);
        A0O.A0P("others_on_ig", str3);
        A0O.A0P("fb_friends", str4);
        A0O.A0P("fb_friends_of_friends", str5);
        A0O.A0P("people_with_your_phone_number", str6);
        A0O.A0P("others_on_fb", str7);
        A0O.A0P("fb_messaged_your_page", str8);
        A0O.A0P("fb_liked_or_followed_your_page", str9);
        A0O.A0P("group_message_setting", str10);
        A0O.A0P("ig_verified", str11);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1TE.class, C60273Oj.class);
        this.A03 = A0T;
        A0T.A00 = this.A0A;
        C31155GhB.A03(A0T);
    }

    public final synchronized void onSessionWillEnd() {
        this.A09.clear();
    }

    public static final synchronized void A00(AnonymousClass49K r16, AnonymousClass1TE r17) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel;
        AnonymousClass49K r3 = r16;
        synchronized (r3) {
            try {
                SharedPreferences sharedPreferences = r3.A06.A00;
                String string = sharedPreferences.getString("interop_reachability_setting", "");
                C04220Ms.A06(string);
                MIS mis = C18987Aon.A00;
                MMo A082 = mis.A08(string);
                A082.A0g();
                DirectMessagesInteropOptionsViewModel parseFromJson = C60223Oe.parseFromJson(A082);
                String string2 = sharedPreferences.getString("interop_reachability_setting_PENDING", (String) null);
                if (string2 != null) {
                    MMo A083 = mis.A08(string2);
                    A083.A0g();
                    directMessagesInteropOptionsViewModel = C60223Oe.parseFromJson(A083);
                } else {
                    directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null);
                }
                C18180wK.A0u(sharedPreferences.edit(), "interop_reachability_setting_PENDING");
                for (AnonymousClass36C r0 : r3.A08) {
                    C24471ir r1 = r0.A00;
                    C60213Od.A00(r1.A05);
                    C23411dm.A08(r1);
                }
                for (C83774ry D9A : r3.A09) {
                    String str = r3.A05;
                    C04220Ms.A09(directMessagesInteropOptionsViewModel);
                    D9A.D9A(parseFromJson, directMessagesInteropOptionsViewModel, r17, str);
                }
            } catch (IOException e) {
                C10450iM.A06("DirectMessagesInteropOptionsUpdateHelper", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
            }
        }
        return;
    }

    public AnonymousClass49K(C28161tl r2, UserSession userSession, C49162qw r4) {
        AnonymousClass0wJ.A1O(userSession, r4);
        C04220Ms.A0B(r2, 3);
        this.A07 = userSession;
        this.A0B = r4;
        this.A06 = r2;
    }
}
