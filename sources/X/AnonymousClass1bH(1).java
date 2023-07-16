package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCSpanShape0S1100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1bH  reason: invalid class name */
public final class AnonymousClass1bH extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ConnectContentFragment";
    public C10300i6 A00;
    public C306222g A01;
    public ConnectContent A02;
    public Integer A03;
    public boolean A04 = false;

    public final String getModuleName() {
        return "signup_account";
    }

    private Drawable A00(String str) {
        Context requireContext;
        int i;
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        if (AnonymousClass0hA.A0D(lowerCase, FxcalAccountType.INSTAGRAM.toString().toLowerCase(locale)) || !AnonymousClass0hA.A0D(lowerCase, FxcalAccountType.FACEBOOK.toString().toLowerCase(locale))) {
            requireContext = requireContext();
            i = R.drawable.ig_badge_color_logo;
        } else {
            requireContext = requireContext();
            i = R.drawable.fb_badge_color_logo;
        }
        return requireContext.getDrawable(i);
    }

    public final AnonymousClass265 A01() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 1) {
            return AnonymousClass265.A0N;
        }
        if (ordinal == 2) {
            return AnonymousClass265.A0K;
        }
        if (ordinal == 3) {
            return AnonymousClass265.A0R;
        }
        if (ordinal != 4) {
            return AnonymousClass265.A0z;
        }
        return AnonymousClass265.A10;
    }

    public final boolean onBackPressed() {
        if (this.A04) {
            C10300i6 r3 = this.A00;
            String obj = C306222g.IG_SAC_SIGN_UP.toString();
            AnonymousClass0wJ.A1N(r3, obj);
            C63003bJ.A00(AnonymousClass2AF.A0m, r3, obj, (String) null);
        }
        C306222g r2 = this.A01;
        if (r2 == null || r2 == C306222g.IG_SAC_SIGN_UP) {
            return false;
        }
        return true;
    }

    public final C10300i6 getSession() {
        return C18190wL.A0S(requireArguments());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r2 != X.C306222g.IG_SAC_SIGN_UP) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -485860353(0xffffffffe30a5bff, float:-2.5522797E21)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r5)
            android.os.Bundle r0 = r4.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r0)
            r4.A00 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = X.C18240wQ.A0D(r1, r0)
            com.instagram.nux.cal.model.ConnectContent r0 = (com.instagram.nux.cal.model.ConnectContent) r0
            r4.A02 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.C18190wL.A0j(r1, r0)
            java.lang.Integer r0 = X.C36522Rq.A00(r0)
            r4.A03 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r2 = r1.getSerializable(r0)
            X.22g r2 = (X.C306222g) r2
            r4.A01 = r2
            if (r2 == 0) goto L_0x0047
            X.22g r1 = X.C306222g.IG_SAC_SIGN_UP
            r0 = 1
            if (r2 == r1) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r4.A04 = r0
            r0 = 1980528907(0x760c790b, float:7.1228184E32)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bH.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ImmutableList immutableList;
        String BK7;
        int A022 = C14030oh.A02(2061555633);
        View inflate = layoutInflater.inflate(R.layout.signup_accounts, viewGroup, false);
        TextView textView = (TextView) C18180wK.A0E(inflate, R.id.accountHeader);
        TextView textView2 = (TextView) C18180wK.A0E(inflate, R.id.accountTitle);
        TextView textView3 = (TextView) C18180wK.A0E(inflate, R.id.accountSubtitle);
        View A0E = C18180wK.A0E(inflate, R.id.family_logo);
        View A0E2 = C18180wK.A0E(inflate, R.id.meta_logo);
        View A0E3 = C18180wK.A0E(inflate, R.id.account1_info_row);
        C10300i6 r11 = this.A00;
        FxAccountInfo fxAccountInfo = this.A02.A02;
        if (fxAccountInfo == null) {
            User A0Y = AnonymousClass0wJ.A0Y(C05030Qo.A02(r11));
            String obj = FxcalAccountType.INSTAGRAM.toString();
            if (!TextUtils.isEmpty(A0Y.Ak1())) {
                BK7 = A0Y.Ak1();
            } else {
                BK7 = A0Y.BK7();
            }
            fxAccountInfo = new FxAccountInfo(A0Y.B4M(), obj, BK7, A0Y.getId(), obj);
        }
        IgImageView igImageView = (IgImageView) C18180wK.A0E(A0E3, R.id.avatar_container);
        ImageUrl imageUrl = fxAccountInfo.A00;
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, this);
        } else {
            C18180wK.A0r(requireContext(), igImageView, R.drawable.profile_anonymous_user);
        }
        ((ImageView) C18180wK.A0E(A0E3, R.id.badge_container)).setImageDrawable(A00(fxAccountInfo.A02));
        String str2 = fxAccountInfo.A03;
        str2.getClass();
        ((TextView) C18180wK.A0E(A0E3, R.id.accountTitle)).setText(str2);
        ((TextView) C18180wK.A0E(A0E3, R.id.accountSubtitle)).setText(fxAccountInfo.A04);
        View A0E4 = C18180wK.A0E(inflate, R.id.account2_info_row);
        ConnectContent connectContent = this.A02;
        connectContent.A03.getClass();
        IgImageView igImageView2 = (IgImageView) C18180wK.A0E(A0E4, R.id.avatar_container);
        ImageUrl imageUrl2 = connectContent.A03.A00;
        if (AnonymousClass3WG.A02(imageUrl2)) {
            C18180wK.A0r(requireContext(), igImageView2, R.drawable.profile_anonymous_user);
        } else {
            igImageView2.setUrl(imageUrl2, this);
        }
        ((ImageView) C18180wK.A0E(A0E4, R.id.badge_container)).setImageDrawable(A00(this.A02.A03.A02));
        ((TextView) C18180wK.A0E(A0E4, R.id.accountTitle)).setText(connectContent.A03.A03);
        ((TextView) C18180wK.A0E(A0E4, R.id.accountSubtitle)).setText(connectContent.A03.A04);
        View A0E5 = C18180wK.A0E(inflate, R.id.seeAllRow);
        List list = this.A02.A0J;
        if (!(list == null || ImmutableList.copyOf((Collection) list) == null)) {
            List list2 = this.A02.A0J;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            if (!immutableList.isEmpty()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) A0E4.getLayoutParams();
                layoutParams.bottomMargin = 0;
                A0E4.setLayoutParams(layoutParams);
                A0E5.setVisibility(0);
                AnonymousClass0wJ.A16(A0E5, 571, this);
            }
        }
        TextView textView4 = (TextView) C18180wK.A0E(inflate, R.id.helperText);
        ProgressButton progressButton = (ProgressButton) C18180wK.A0E(inflate, R.id.button1);
        TextView textView5 = (TextView) C18180wK.A0E(inflate, R.id.button2);
        if (this.A04) {
            A0E.setVisibility(8);
            A0E2.setVisibility(0);
        }
        if (!AnonymousClass0hA.A08(this.A02.A08)) {
            if (this.A04) {
                textView3.setVisibility(0);
                String str3 = this.A02.A08;
                str3.getClass();
                textView3.setText(str3);
            } else {
                String str4 = this.A02.A08;
                str4.getClass();
                textView.setText(str4);
            }
        }
        C306222g r2 = this.A01;
        if (r2 != null && r2 == C306222g.PROFILE_PIC) {
            textView.setText(2131828980);
        }
        String str5 = this.A02.A09;
        str5.getClass();
        textView2.setText(str5);
        textView4.setText(C16370sw.A02(new C678240r(this), new String[0]));
        CharSequence text = textView4.getText();
        SpannableStringBuilder A0E6 = C18200wM.A0E(text);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) A0E6.getSpans(0, text.length(), ClickableSpan.class)) {
            if (clickableSpan instanceof URLSpan) {
                str = ((URLSpan) clickableSpan).getURL();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                int spanStart = A0E6.getSpanStart(clickableSpan);
                int spanEnd = A0E6.getSpanEnd(clickableSpan);
                A0E6.removeSpan(clickableSpan);
                A0E6.setSpan(new IDxCSpanShape0S1100000_1_I2(str, this, 1), spanStart, spanEnd, 33);
            }
        }
        textView4.setText(A0E6);
        C18180wK.A0z(textView4);
        String str6 = this.A02.A05;
        str6.getClass();
        progressButton.setText((CharSequence) str6);
        AnonymousClass0wJ.A16(progressButton, 569, this);
        String str7 = this.A02.A06;
        str7.getClass();
        textView5.setText(str7);
        AnonymousClass0wJ.A16(textView5, 570, this);
        AnonymousClass3YT.A00.A02(this.A00, A01().A01);
        if (this.A04) {
            C10300i6 r3 = this.A00;
            String obj2 = C306222g.IG_SAC_SIGN_UP.toString();
            C18200wM.A1S(r3, obj2);
            C63003bJ.A00(AnonymousClass2AF.A0n, r3, obj2, (String) null);
        }
        C14030oh.A09(2123749185, A022);
        return inflate;
    }
}
