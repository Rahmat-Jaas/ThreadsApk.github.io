package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* renamed from: X.1Yp  reason: invalid class name and case insensitive filesystem */
public final class C22571Yp extends C34640IcN {
    public static final String __redex_internal_original_name = "CelebrateBirthdayBottomSheetFragment";
    public IgdsListCell A00;
    public User A01;
    public View A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public C58133Eb A05;
    public String A06;
    public boolean A07;
    public final C04530Oa A08 = C80644m9.A00(this);
    public final View.OnClickListener A09 = C18210wN.A0H(this, 234);
    public final View.OnClickListener A0A = C18210wN.A0H(this, 235);
    public final View.OnClickListener A0B = C18210wN.A0H(this, 236);

    public final void A01(boolean z) {
        IgdsListCell igdsListCell;
        int i = 0;
        View view = this.A02;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
            }
            igdsListCell = this.A03;
            i = 4;
        } else {
            if (view != null) {
                view.setVisibility(8);
            }
            igdsListCell = this.A03;
        }
        if (igdsListCell != null) {
            igdsListCell.setVisibility(i);
        }
        IgdsListCell igdsListCell2 = this.A04;
        if (igdsListCell2 != null) {
            igdsListCell2.setVisibility(i);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object parcelable;
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("DISPLAY_NAME_ARGUMENT");
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.title)).setText(AnonymousClass0wJ.A0l(requireContext(), string, 2131823129));
        IgdsListCell igdsListCell = this.A00;
        if (igdsListCell != null) {
            igdsListCell.A0F(AnonymousClass24V.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell2 = this.A00;
        if (igdsListCell2 != null) {
            String A0l = AnonymousClass0wJ.A0l(requireContext(), string, 2131823131);
            C04220Ms.A06(A0l);
            igdsListCell2.A0H(A0l);
        }
        IgdsListCell igdsListCell3 = this.A00;
        if (igdsListCell3 != null) {
            igdsListCell3.setOnClickListener(this.A0A);
        }
        IgdsListCell igdsListCell4 = this.A03;
        if (igdsListCell4 != null) {
            igdsListCell4.A0F(AnonymousClass24V.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell5 = this.A03;
        if (igdsListCell5 != null) {
            igdsListCell5.setOnClickListener(this.A0B);
        }
        IgdsListCell igdsListCell6 = this.A04;
        if (igdsListCell6 != null) {
            igdsListCell6.A0F(AnonymousClass24V.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell7 = this.A04;
        if (igdsListCell7 != null) {
            igdsListCell7.setOnClickListener(this.A09);
        }
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.celebrate_birthday_profile_pic);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = requireArguments.getParcelable("PROFILE_PIC_URL_ARGUMENT", ImageUrl.class);
        } else {
            parcelable = requireArguments.getParcelable("PROFILE_PIC_URL_ARGUMENT");
        }
        ImageUrl imageUrl = (ImageUrl) parcelable;
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, this);
        }
        User user = this.A01;
        if (user != null) {
            C04530Oa r1 = this.A08;
            if (C25702DqQ.A03(AnonymousClass0wJ.A0X(r1), user)) {
                C10300i6 A0U = AnonymousClass0wJ.A0U(r1);
                if (C63803iN.A0E(C18250wR.A0D(A0U, 1), A0U, 36328100405061915L)) {
                    CircularImageView circularImageView = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.birthday_confetti_circular_imageview);
                    C25702DqQ.A01(requireContext(), circularImageView);
                    C25702DqQ.A02(circularImageView.getDrawable());
                }
            }
        }
        String string2 = requireArguments.getString("USER_ID_ARGUMENT");
        if (string2 != null && !this.A07 && (str = this.A06) != null) {
            C58133Eb r12 = this.A05;
            if (r12 == null) {
                C04220Ms.A0E("birthdayLogger");
                throw null;
            }
            long parseLong = Long.parseLong(string2);
            long A0B2 = C18200wM.A0B(AnonymousClass0wJ.A0X(this.A08));
            String str2 = "story";
            if (!str.equals(str2)) {
                str2 = "profile";
            }
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r12.A00, "ig_birthday_opt_in_impression"), 814);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0S("celebrant_id", Long.valueOf(parseLong));
                A0I.A0S("viewer_id", Long.valueOf(A0B2));
                A0I.A0T("surface", str2);
                A0I.A0T("feature", "bottom_sheet");
                A0I.A0T("option", (String) null);
                A0I.A0T("device_os", "android");
                A0I.Bb4();
            }
            this.A07 = true;
        }
    }

    public static final void A00(C22571Yp r8, String str, String str2) {
        String str3 = r8.A06;
        if (str3 != null) {
            C58133Eb r2 = r8.A05;
            if (r2 == null) {
                C04220Ms.A0E("birthdayLogger");
                throw null;
            }
            long parseLong = Long.parseLong(str);
            long A0B2 = C18200wM.A0B(AnonymousClass0wJ.A0X(r8.A08));
            String str4 = "story";
            if (!str3.equals(str4)) {
                str4 = "profile";
            }
            r2.A00(str4, "bottom_sheet", str2, parseLong, A0B2);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(731374743);
        super.onCreate(bundle);
        this.A05 = new C58133Eb(this, AnonymousClass0wJ.A0X(this.A08));
        this.A06 = requireArguments().getString("ENTRY_POINT");
        C14030oh.A09(-729994909, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-184944767);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.celebrate_birthday_bottomsheet_fragment, viewGroup, false);
        this.A02 = inflate.requireViewById(R.id.loading_spinner);
        this.A00 = (IgdsListCell) inflate.requireViewById(R.id.see_shared_stories);
        this.A03 = (IgdsListCell) inflate.requireViewById(R.id.send_confetti);
        this.A04 = (IgdsListCell) inflate.requireViewById(R.id.manage_settings);
        C04530Oa r4 = this.A08;
        this.A01 = AnonymousClass6VR.A00(AnonymousClass0wJ.A0X(r4)).A03(requireArguments().getString("USER_ID_ARGUMENT"));
        A01(true);
        User user = this.A01;
        if (user != null) {
            C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
            String id = user.getId();
            C04220Ms.A0B(A0U, 0);
            C04220Ms.A0B(id, 1);
            H1T A0P = C18180wK.A0P(A0U);
            C18240wQ.A19(A0P);
            A0P.A0J(C18240wQ.A0h("stories/", "follow_versaries/", "get_shared_memories/"));
            A0P.A0B(AnonymousClass1RA.class, AnonymousClass3KT.class);
            C32165H8c A0T = C18200wM.A0T(A0P, "follower_id", id);
            C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SharedMemoriesResponse>>");
            C63873iU.A0F(A0T, user, this, 38);
            schedule(A0T);
        }
        C14030oh.A09(-2147380250, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1385711226);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        this.A04 = null;
        C14030oh.A09(-826992853, A022);
    }
}
