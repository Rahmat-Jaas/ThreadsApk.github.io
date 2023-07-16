package X;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Telephony;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape5S1300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.InviteFollowersV2Fragment;
import com.instagram.service.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Va  reason: invalid class name and case insensitive filesystem */
public final class C61713Va {
    public InviteFollowersV2Fragment A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final boolean A05;
    public final Set A06 = new HashSet(AnonymousClass006.A00(10).length);

    public static void A00(C61713Va r6, Object obj, String str) {
        Integer num;
        InviteFollowersV2Fragment inviteFollowersV2Fragment = r6.A00;
        if (inviteFollowersV2Fragment != null) {
            C04220Ms.A0B(str, 0);
            Integer[] A002 = AnonymousClass006.A00(10);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = null;
                    break;
                }
                num = A002[i];
                if (C04220Ms.A0I(AnonymousClass2QD.A00(num), str)) {
                    break;
                }
                i++;
            }
            int intValue = num.intValue();
            if (intValue == 6) {
                FragmentActivity activity = inviteFollowersV2Fragment.getActivity();
                UserSession userSession = inviteFollowersV2Fragment.A04;
                AnonymousClass2KV.A00(inviteFollowersV2Fragment.requireContext(), activity, userSession, AnonymousClass006.A0u, inviteFollowersV2Fragment.getString(2131829225));
            } else if (intValue == 7 && (obj instanceof AnonymousClass3HW)) {
                String str2 = ((AnonymousClass3HW) obj).A00.A02;
                String str3 = inviteFollowersV2Fragment.A05;
                C22951bf r2 = new C22951bf();
                Bundle A062 = C18180wK.A06();
                C18210wN.A0x(A062, str3);
                A062.putString("ARG_TARGET_USER_ID", str2);
                r2.setArguments(A062);
                AnonymousClass0wJ.A19(r2, inviteFollowersV2Fragment.getActivity(), inviteFollowersV2Fragment.A04);
            }
            InviteFollowersV2Fragment.A0B(inviteFollowersV2Fragment, str);
            inviteFollowersV2Fragment.A06 = true;
            inviteFollowersV2Fragment.A01.setEnabled(true);
        }
    }

    public final void A01(List list) {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A04;
        if (!C34832Lb.A00(fragmentActivity, userSession)) {
            AnonymousClass4MA A012 = AnonymousClass4MA.A01(C18210wN.A0H(this, 164), fragmentActivity.getString(2131827592));
            if (this.A05) {
                A012.A01 = R.drawable.instagram_user_follow_pano_outline_24;
            }
            list.add(A012);
        }
        Fragment fragment = this.A01;
        try {
            fragment.getContext().getPackageManager().getPackageInfo("com.whatsapp", 128);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313793868859073L)) {
                AnonymousClass4MA A013 = AnonymousClass4MA.A01(C18210wN.A0H(this, 161), fragmentActivity.getString(2131829226));
                if (this.A05) {
                    A013.A01 = R.drawable.instagram_app_whatsapp_pano_outline_24;
                }
                list.add(A013);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        A02(list, fragmentActivity.getString(2131829214));
        if (Telephony.Sms.getDefaultSmsPackage(fragment.getContext()) != null) {
            A03(list, fragmentActivity.getString(2131829215));
        }
        AnonymousClass4MA A014 = AnonymousClass4MA.A01(C18210wN.A0H(this, 162), fragmentActivity.getString(2131829213));
        if (this.A05) {
            A014.A01 = R.drawable.instagram_share_android_pano_outline_24;
        }
        list.add(A014);
    }

    public final void A02(List list, String str) {
        Integer num = AnonymousClass006.A0j;
        int i = 0;
        if (this.A05) {
            i = R.drawable.instagram_mail_pano_outline_24;
        }
        AnonymousClass4MA A012 = AnonymousClass4MA.A01(new IDxCListenerShape5S1300000_1_I2(new AnonymousClass4Q4(this), this, num, "invite_email_entered", 8), str);
        A012.A01 = i;
        list.add(A012);
    }

    public final void A03(List list, String str) {
        Integer num = AnonymousClass006.A0Y;
        int i = 0;
        if (this.A05) {
            i = R.drawable.instagram_sms_pano_outline_24;
        }
        AnonymousClass4MA A012 = AnonymousClass4MA.A01(new IDxCListenerShape5S1300000_1_I2(new AnonymousClass4Q5(this), this, num, "invite_sms_entered", 8), str);
        A012.A01 = i;
        list.add(A012);
    }

    public C61713Va(Fragment fragment, C11630kW r4, UserSession userSession, boolean z) {
        this.A01 = fragment;
        this.A03 = r4;
        this.A04 = userSession;
        this.A02 = fragment.getActivity();
        this.A05 = z;
    }
}
