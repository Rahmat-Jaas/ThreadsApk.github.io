package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ak  reason: invalid class name */
public final class AnonymousClass1ak extends C34640IcN implements C82034oy, C81404nj {
    public static final String __redex_internal_original_name = "FeedDefaultPrivacyBottomSheetFragment";
    public Context A00;
    public C83494rT A01;
    public AnonymousClass21z A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public Boolean A07;
    public final C04530Oa A08 = C80644m9.A00(this);

    public final String getModuleName() {
        return "feed_default_privacy_bottom_sheet";
    }

    public static final boolean A00(AnonymousClass1ak r2) {
        String str = r2.A06;
        if ((str == null || !str.equals("video_feed_share_button")) && ((str == null || !str.equals("share_later_share_button")) && (str == null || !str.equals("share_sheet_share_button")))) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AnonymousClass20N r0;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z2;
        boolean z3;
        String str6;
        Iterable<KtCSuperShape0S1200000_I2> iterable;
        int i2;
        SpannableStringBuilder A012;
        CharSequence A022;
        CharSequence A0E;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C04530Oa r22 = this.A08;
        C209416t A013 = C63073bQ.A01(AnonymousClass0wJ.A0X(r22));
        if (A013 != null) {
            z = Boolean.valueOf(A013.A00);
        } else {
            z = false;
        }
        this.A07 = z;
        if (A013 != null) {
            r0 = A013.A02;
        } else {
            r0 = null;
        }
        this.A04 = String.valueOf(r0);
        if (A013 != null) {
            bool = Boolean.valueOf(A013.A05);
        } else {
            bool = null;
        }
        this.A03 = bool;
        if (A013 != null) {
            this.A02 = A013.A01;
        }
        if (A00(this)) {
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = C28161tl.A04(AnonymousClass0wJ.A0X(r22)).getInt("fb_feed_crossposting_default_privacy_consent_times_shown", 0);
            AnonymousClass0wJ.A12(C28161tl.A03(AnonymousClass0wJ.A0X(r22)), "fb_feed_crossposting_default_privacy_consent_time_stamp_ms", currentTimeMillis);
            AnonymousClass0wJ.A11(C28161tl.A02(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r22))), "fb_feed_crossposting_default_privacy_consent_times_shown", i3 + 1);
        }
        KtCSuperShape0S5200000_I2 A032 = C63073bQ.A00(AnonymousClass0wJ.A0X(r22)).A03();
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0K(requireView(), R.id.bottomsheet_header);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r22);
        AnonymousClass0TJ r19 = AnonymousClass0TJ.A05;
        boolean A0E2 = C63803iN.A0E(r19, A0U, 36327447569901592L);
        if (A032 != null) {
            str = A032.A06;
            str2 = A032.A04;
            str3 = A032.A05;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        igdsHeadline.setImageDrawable(requireActivity().getDrawable(R.drawable.ig_illustrations_illo_ig_fb_connection));
        int[] iArr = {R.drawable.instagram_facebook_circle_pano_outline_24, R.drawable.instagram_users_pano_outline_24, R.drawable.instagram_settings_pano_outline_24};
        C62263Ya r6 = new C62263Ya(requireContext(), true, false);
        if (A0E2) {
            Context context = this.A00;
            if (context != null) {
                int A042 = C18230wP.A04(this.A02, 1);
                if (A042 != 2) {
                    i2 = 2131827400;
                    if (A042 != 3) {
                        i2 = 2131827398;
                    }
                } else {
                    i2 = 2131827399;
                }
                str = AnonymousClass0wJ.A0k(context, i2);
                AnonymousClass21z r1 = this.A02;
                if (r1 == AnonymousClass21z.SHRINKING || r1 == AnonymousClass21z.MATCHED) {
                    Context context2 = this.A00;
                    if (context2 != null) {
                        str5 = context2.getString(2131827395);
                        str4 = null;
                    }
                } else {
                    Context context3 = this.A00;
                    if (context3 != null) {
                        str5 = context3.getString(2131827396);
                        Context context4 = this.A00;
                        if (context4 != null) {
                            str4 = context4.getString(2131827397);
                        }
                    }
                }
                AnonymousClass21z r12 = this.A02;
                if (this.A00 != null) {
                    FragmentActivity requireActivity = requireActivity();
                    UserSession A0X = AnonymousClass0wJ.A0X(r22);
                    AnonymousClass21z r3 = AnonymousClass21z.MATCHED;
                    if (r12 == r3) {
                        Context context5 = this.A00;
                        if (context5 != null) {
                            A012 = C18200wM.A0E(context5.getString(2131827402));
                        }
                    } else {
                        Context context6 = this.A00;
                        if (context6 != null) {
                            C04220Ms.A0B(A0X, 2);
                            A012 = C63143c0.A01(context6, requireActivity, A0X, AnonymousClass0wJ.A0k(context6, 2131835669), 2131827403);
                        }
                    }
                    r6.A03((CharSequence) null, A012, iArr[0]);
                    AnonymousClass21z r13 = this.A02;
                    if (this.A00 == null) {
                        C04220Ms.A0E("viewContext");
                        throw null;
                    }
                    FragmentActivity requireActivity2 = requireActivity();
                    UserSession A0X2 = AnonymousClass0wJ.A0X(r22);
                    Context context7 = this.A00;
                    if (r13 == r3) {
                        if (context7 != null) {
                            C04220Ms.A0B(A0X2, 2);
                            A022 = C63143c0.A01(context7, requireActivity2, A0X2, AnonymousClass0wJ.A0k(context7, 2131835669), 2131827403);
                        }
                        C04220Ms.A0E("viewContext");
                        throw null;
                    }
                    if (context7 != null) {
                        A022 = C63143c0.A02(context7, A013);
                    }
                    C04220Ms.A0E("viewContext");
                    throw null;
                    r6.A03((CharSequence) null, A022, iArr[1]);
                    AnonymousClass21z r14 = this.A02;
                    if (this.A00 == null) {
                        C04220Ms.A0E("viewContext");
                        throw null;
                    }
                    requireActivity();
                    r22.getValue();
                    if (r14 == r3) {
                        Context context8 = this.A00;
                        if (context8 != null) {
                            A0E = C63143c0.A02(context8, A013);
                        }
                        C04220Ms.A0E("viewContext");
                        throw null;
                    }
                    Context context9 = this.A00;
                    if (context9 != null) {
                        A0E = C18200wM.A0E(context9.getString(2131827402));
                    }
                    C04220Ms.A0E("viewContext");
                    throw null;
                    r6.A03((CharSequence) null, A0E, iArr[2]);
                }
            }
            C04220Ms.A0E("viewContext");
            throw null;
        } else if (!(A032 == null || (iterable = (Iterable) A032.A00) == null)) {
            ArrayList A0x = AnonymousClass0wJ.A0x(iterable, 10);
            for (KtCSuperShape0S1200000_I2 A002 : iterable) {
                A0x.add(C63143c0.A00(requireActivity(), requireContext(), A002, AnonymousClass0wJ.A0X(r22)));
            }
            int i4 = 0;
            for (Object next : AnonymousClass00J.A0K(AnonymousClass00J.A0N(A0x))) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C06750aI.A1A();
                    throw null;
                }
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) next;
                if (i4 < 3) {
                    r6.A03((CharSequence) null, spannableStringBuilder, iArr[i4]);
                }
                i4 = i5;
            }
        }
        igdsHeadline.setHeadline((CharSequence) str);
        List A023 = r6.A02();
        ArrayList A0w = AnonymousClass0wJ.A0w(A023);
        Iterator it = A023.iterator();
        while (it.hasNext()) {
            C18210wN.A1P(A0w, it);
        }
        igdsHeadline.setBulletList(A0w);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(requireView(), R.id.bottomsheet_buttons);
        if (str5 != null) {
            igdsBottomButtonLayout.setPrimaryActionText(str5);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 322));
        }
        if (str4 != null) {
            igdsBottomButtonLayout.setSecondaryActionText(str4);
            igdsBottomButtonLayout.setSecondaryActionOnClickListener(C18190wL.A0H(this, 323));
        }
        igdsBottomButtonLayout.setDividerVisible(true);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(requireView(), R.id.bottomsheet_footer);
        if (A032 == null || (str6 = A032.A02) == null || str6.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str6);
        }
        if (C63803iN.A0E(r19, AnonymousClass0wJ.A0U(r22), 36325317266121774L)) {
            i = C49222r2.A00(AnonymousClass0wJ.A0X(r22)).A00();
        } else {
            i = C63073bQ.A00(AnonymousClass0wJ.A0X(r22)).A00;
        }
        this.A05 = C63143c0.A05(requireContext(), Integer.valueOf(i));
        C320129v r32 = C320129v.DEFAULT_PRIVAY_CONSENT_BOTTOMSHEET_IMPRESSION;
        UserSession A0X3 = AnonymousClass0wJ.A0X(r22);
        Boolean bool2 = this.A07;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        String str7 = this.A04;
        String str8 = this.A05;
        String str9 = this.A06;
        boolean A003 = C62183Xq.A00(AnonymousClass0wJ.A0X(r22));
        Boolean bool3 = this.A03;
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        C59693Lv.A01(r32, A0X3, str7, str8, str9, this.A02.name(), z2, A003, z3);
    }

    public AnonymousClass1ak() {
        Boolean A0X = C18180wK.A0X();
        this.A07 = A0X;
        this.A03 = A0X;
        this.A02 = AnonymousClass21z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        AnonymousClass4u2.A02(this, r2, 2131836839);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(33750612);
        super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("entry_point");
        } else {
            str = null;
        }
        this.A06 = str;
        C14030oh.A09(-1920904574, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(159642505);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_privacy_education_sheet, viewGroup, false);
        C14030oh.A09(1205638720, A022);
        return inflate;
    }
}
