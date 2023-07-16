package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape8S1200000_1_I2;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.model.reels.Reel;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.4FH  reason: invalid class name */
public final class AnonymousClass4FH implements C85864vt {
    public Activity A00;
    public Fragment A01;
    public LocationDetailFragment A02;
    public UserSession A03;
    public User A04;

    public final void BpS(User user) {
    }

    public final void BpV(BKU bku, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_follow");
        UserSession userSession = this.A03;
        User user = this.A04;
        this.A01.getContext().getClass();
        C23894D0g A0L = C23527Ctp.A00(userSession).A0L(user);
        FollowButton followButton2 = followButton;
        if (user.BRq()) {
            C25791Ds4.A06(userSession, followButton2, (C27950Ew0) null, user, "MAP_PROFILE_BUSINESS_ACTIONS");
        } else if (A0L == C23894D0g.FollowStatusFollowing) {
            C60113Ns.A00();
            throw null;
        } else {
            followButton2.A03.A03((C15680ri) null, (BKU) null, (C20066BMj) null, (SearchContext) null, userSession, (C27950Ew0) null, user, (C145018jf) null, (String) null);
        }
    }

    public final void Bpk(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void Bzi(User user, int i) {
    }

    public final void Bzk(User user) {
    }

    public final void Bzl(User user) {
    }

    public final void Bzm(C23917D1f d1f, User user) {
    }

    public final void CSY(User user, int i) {
    }

    public final void BnJ(User user, String str) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_email");
        Fragment fragment = this.A01;
        String A0L = AnonymousClass00U.A0L("mailto:", user.A1C());
        Intent A05 = C18250wR.A05("android.intent.action.SENDTO");
        A05.setType(HTTP.PLAIN_TEXT_TYPE);
        A05.addFlags(268435456);
        A05.setData(C15430rJ.A00(C1190773k.A00, A0L, true));
        C10650ih.A0C(A05, fragment);
    }

    public final void BnK(User user, String str) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_call");
        Fragment fragment = this.A01;
        String A0z = user.A0z();
        A0z.getClass();
        String A0L = AnonymousClass00U.A0L("tel:", A0z.trim());
        Intent A09 = C18210wN.A09("android.intent.action.DIAL");
        A09.setData(C15430rJ.A00(C1190773k.A00, A0L, true));
        C10650ih.A0C(A09, fragment);
    }

    public final void BnL(User user, String str) {
        FragmentActivity activity;
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_text");
        Fragment fragment = this.A01;
        String A0z = user.A0z();
        A0z.getClass();
        String A0L = AnonymousClass00U.A0L("sms:", A0z);
        Intent A09 = C18210wN.A09("android.intent.action.VIEW");
        A09.setData(Uri.parse(A0L));
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            C10650ih.A01(activity, A09);
        }
    }

    public final void BnM(ArrayList arrayList) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_contact");
        User user = this.A04;
        UserSession userSession = this.A03;
        Context A0A = C18230wP.A0A(this.A01);
        boolean A0A2 = C67353zP.A0A(user);
        AnonymousClass6VR.A00(userSession).A01(user, true);
        String id = user.getId();
        Bundle A06 = C18180wK.A06();
        AnonymousClass1Z0 r3 = new AnonymousClass1Z0();
        C18190wL.A13(A06, userSession.token);
        A06.putString("ContactOptionsFragment.USER_ID", id);
        A06.putIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST", arrayList);
        A06.putBoolean("ContactOptionsFragment.REQUEST_CONTACT_ENABLED", A0A2);
        r3.setArguments(A06);
        r3.A00 = this;
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0O = A0A.getResources().getString(2131824317);
        C18200wM.A16(A0A, r3, A0L);
    }

    public final void BnN(User user, String str) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_business_support");
        C1190773k.A00((C34640IcN) this.A01, this.A03, user, this.A04);
    }

    public final void C7L(String str) {
        LocationDetailFragment locationDetailFragment = this.A02;
        C18230wP.A1L(locationDetailFragment.A02, C18220wO.A0a(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_message");
        UserSession userSession = this.A03;
        User user = this.A04;
        Fragment fragment = this.A01;
        Activity activity = this.A00;
        if (!C25771Drk.A03(userSession) || !C59473Ky.A00(userSession) || !user.A2q()) {
            AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
            throw null;
        }
        String id = user.getId();
        C58963Iu r3 = new C58963Iu(userSession);
        r3.A03(new IDxCListenerShape15S0400000_1_I2(14, activity, fragment, userSession, user), 2131825919);
        r3.A03(new IDxCListenerShape8S1200000_1_I2((Object) userSession, (Object) fragment, id, 13), 2131832175);
        new C62763ag(r3).A04(fragment.requireContext());
    }

    public AnonymousClass4FH(Activity activity, Fragment fragment, LocationDetailFragment locationDetailFragment, UserSession userSession, User user) {
        this.A01 = fragment;
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = activity;
        this.A02 = locationDetailFragment;
    }
}
