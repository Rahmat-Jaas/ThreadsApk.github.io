package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCSpanShape0S1100000_1_I2;
import com.facebook.redex.IDxLListenerShape126S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.SignupContent;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1bw  reason: invalid class name and case insensitive filesystem */
public class C23111bw extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "SignupContentFragment";
    public C19080z7 A00;
    public C19080z7 A01;
    public C10300i6 A02;
    public AnonymousClass3IZ A03;
    public AnonymousClass3UT A04;
    public AnonymousClass22f A05;
    public C306222g A06;
    public SignupContent A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;

    public final String getModuleName() {
        return "signup_content";
    }

    private void A00(IgTextView igTextView, String str) {
        String url;
        igTextView.setText(C16370sw.A02(new C678440t(this, str), new String[0]));
        CharSequence text = igTextView.getText();
        SpannableStringBuilder A0E = C18200wM.A0E(text);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) A0E.getSpans(0, text.length(), ClickableSpan.class)) {
            if ((clickableSpan instanceof URLSpan) && (url = ((URLSpan) clickableSpan).getURL()) != null) {
                int spanStart = A0E.getSpanStart(clickableSpan);
                int spanEnd = A0E.getSpanEnd(clickableSpan);
                A0E.removeSpan(clickableSpan);
                A0E.setSpan(new IDxCSpanShape0S1100000_1_I2(url, this, 3), spanStart, spanEnd, 33);
            }
        }
        igTextView.setText(A0E);
        C18180wK.A0z(igTextView);
    }

    public final AnonymousClass3UT A01() {
        AnonymousClass3UT r2 = this.A04;
        if (r2 != null) {
            return r2;
        }
        return new AnonymousClass3UT(this.A05, this.A07.A07);
    }

    public final AnonymousClass265 A02() {
        int ordinal = this.A06.ordinal();
        if (ordinal == 0) {
            return AnonymousClass265.A0Q;
        }
        if (ordinal == 1) {
            return AnonymousClass265.A0O;
        }
        if (ordinal == 2) {
            return AnonymousClass265.A0L;
        }
        if (ordinal == 3) {
            return AnonymousClass265.A0S;
        }
        if (ordinal != 4) {
            return AnonymousClass265.A0z;
        }
        return AnonymousClass265.A11;
    }

    public void A03(LayoutInflater layoutInflater, View view) {
        A04(layoutInflater, view, AnonymousClass3UT.A00(this.A04).A02);
        ScrollView scrollView = (ScrollView) C18180wK.A0E(view, R.id.page1);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new C65643tz(scrollView, this));
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        AnonymousClass22f r0 = this.A05;
        AnonymousClass22f r2 = AnonymousClass22f.MULTI_SPLIT_SINGLE_BUTTON;
        boolean z = true;
        r4.CtO(C18180wK.A1Z(r0, r2));
        if (this.A05 != r2) {
            z = false;
        }
        r4.CtT(z);
    }

    public final boolean onBackPressed() {
        boolean z = this instanceof C27361sO;
        AnonymousClass3IZ r1 = this.A03;
        boolean z2 = this.A0C;
        if (z) {
            r1.A01(z2);
            if (A01().A00 != 0) {
                View requireView = requireView();
                C18180wK.A0E(requireView, R.id.continueButton).setVisibility(0);
                ((ScrollView) C18180wK.A0E(requireView, R.id.page1)).setVisibility(0);
                ((ProgressButton) C18180wK.A0E(requireView, R.id.registrationButton)).setVisibility(8);
                if (this.A05 == AnonymousClass22f.MULTI_SPLIT_SINGLE_BUTTON) {
                    C18180wK.A0E(requireView, R.id.cancelButton).setVisibility(8);
                }
                AnonymousClass3UT A012 = A01();
                List list = A012.A01;
                int i = A012.A00 - 1;
                A012.A00 = i;
                A04(getLayoutInflater(), requireView, ((AnonymousClass3AR) list.get(i)).A02);
                A05(requireView);
            } else if (this.A08 == AnonymousClass006.A00) {
                C18220wO.A18(this);
            } else {
                C18190wL.A19(this);
            }
            return true;
        }
        r1.A01(z2);
        C306222g r12 = this.A06;
        if (r12 == null || r12 == C306222g.IG_SAC_SIGN_UP) {
            return false;
        }
        return true;
    }

    public final void A04(LayoutInflater layoutInflater, View view, List list) {
        ViewGroup viewGroup = (ViewGroup) C18180wK.A0E(view, R.id.contentText);
        viewGroup.removeAllViews();
        ((ScrollView) C18180wK.A0E(view, R.id.page1)).scrollTo(0, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContentText contentText = (ContentText) it.next();
            if (contentText != null) {
                Integer num = contentText.A01;
                num.getClass();
                int intValue = num.intValue();
                if (intValue == 0) {
                    List list2 = contentText.A02;
                    if (list2 == null) {
                        list2 = C18240wQ.A0k(0);
                    }
                    List unmodifiableList = Collections.unmodifiableList(list2);
                    unmodifiableList.getClass();
                    Iterator it2 = unmodifiableList.iterator();
                    while (it2.hasNext()) {
                        String A0k = C18180wK.A0k(it2);
                        IgTextView igTextView = (IgTextView) layoutInflater.inflate(R.layout.paragraph_header_layout, viewGroup, false);
                        A00(igTextView, A0k);
                        viewGroup.addView(igTextView);
                    }
                } else if (intValue == 1) {
                    List list3 = contentText.A02;
                    if (list3 == null) {
                        list3 = C18240wQ.A0k(0);
                    }
                    List unmodifiableList2 = Collections.unmodifiableList(list3);
                    unmodifiableList2.getClass();
                    Iterator it3 = unmodifiableList2.iterator();
                    while (it3.hasNext()) {
                        String A0k2 = C18180wK.A0k(it3);
                        IgTextView igTextView2 = (IgTextView) layoutInflater.inflate(R.layout.paragraph_layout, viewGroup, false);
                        A00(igTextView2, A0k2);
                        viewGroup.addView(igTextView2);
                    }
                } else if (intValue == 2) {
                    List list4 = contentText.A02;
                    if (list4 == null) {
                        list4 = C18240wQ.A0k(0);
                    }
                    List unmodifiableList3 = Collections.unmodifiableList(list4);
                    unmodifiableList3.getClass();
                    Iterator it4 = unmodifiableList3.iterator();
                    while (it4.hasNext()) {
                        String A0k3 = C18180wK.A0k(it4);
                        View inflate = layoutInflater.inflate(R.layout.bulleted_list_item_layout, viewGroup, false);
                        A00((IgTextView) C18180wK.A0E(inflate, R.id.listItemText), A0k3);
                        viewGroup.addView(inflate);
                    }
                }
            }
        }
    }

    public final void A05(View view) {
        Resources A0B2 = AnonymousClass0wJ.A0B(this);
        AnonymousClass3UT r2 = this.A04;
        ((TextView) C18180wK.A0E(view, R.id.step_label)).setText(A0B2.getString(2131826167, C18210wN.A1Y(Integer.valueOf(r2.A00 + 1), r2.A01.size())));
    }

    public final boolean A06(ScrollView scrollView) {
        int i;
        View childAt = scrollView.getChildAt(scrollView.getChildCount() - 1);
        int bottom = childAt.getBottom();
        int height = scrollView.getHeight() + scrollView.getScrollY();
        if (this instanceof C27401sS) {
            i = C18180wK.A0E(childAt, R.id.pinnedButtons).getHeight();
        } else {
            i = 0;
        }
        int i2 = bottom - (height + i);
        if (scrollView.getVisibility() != 0 || i2 > 0) {
            return false;
        }
        return true;
    }

    public final C10300i6 getSession() {
        return C18190wL.A0S(requireArguments());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0060, code lost:
        if (r3 != X.C306222g.IG_SAC_SIGN_UP) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -695564064(0xffffffffd68a88e0, float:-7.6160239E13)
            int r4 = X.C14030oh.A02(r0)
            super.onCreate(r6)
            android.os.Bundle r0 = r5.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r0)
            r5.A02 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_content"
            android.os.Parcelable r0 = X.C18240wQ.A0D(r1, r0)
            com.instagram.nux.cal.model.SignupContent r0 = (com.instagram.nux.cal.model.SignupContent) r0
            r5.A07 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_flow"
            java.lang.String r0 = X.C18190wL.A0j(r1, r0)
            java.lang.Integer r0 = X.C36522Rq.A00(r0)
            r5.A08 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_entry_point"
            java.io.Serializable r0 = r1.getSerializable(r0)
            X.22g r0 = (X.C306222g) r0
            r5.A06 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_id"
            java.lang.String r0 = r1.getString(r0)
            r5.A09 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_selected_age_account_type"
            java.lang.String r0 = r1.getString(r0)
            r5.A0A = r0
            X.22g r3 = r5.A06
            r2 = 0
            if (r3 == 0) goto L_0x0062
            X.22g r1 = X.C306222g.IG_SAC_SIGN_UP
            r0 = 1
            if (r3 == r1) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r5.A0C = r0
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_disclosure_version"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0090
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.Object r0 = r0.get(r1)
            X.22f r0 = (X.AnonymousClass22f) r0
        L_0x007b:
            r5.A05 = r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "argument_force_disclosure_reading"
            boolean r0 = r1.getBoolean(r0, r2)
            r5.A0B = r0
            r0 = 449957256(0x1ad1cd88, float:8.677243E-23)
            X.C14030oh.A09(r0, r4)
            return
        L_0x0090:
            X.22f r0 = X.AnonymousClass22f.NO_SPLIT
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23111bw.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        AnonymousClass3IZ r6;
        C10300i6 r1;
        String str;
        AnonymousClass2AF r62;
        int A022 = C14030oh.A02(430423270);
        View inflate = layoutInflater.inflate(R.layout.signup_content, viewGroup, false);
        ((TextView) C18180wK.A0E(inflate, R.id.contentTitle)).setText(this.A07.A02);
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity();
        appCompatActivity.setSupportActionBar((Toolbar) inflate.findViewById(R.id.toolbar));
        C41020LuR supportActionBar = appCompatActivity.getSupportActionBar();
        supportActionBar.getClass();
        if (this.A08 == AnonymousClass006.A00) {
            supportActionBar.A07(false);
            supportActionBar.A03();
        }
        supportActionBar.A04();
        supportActionBar.A05();
        AnonymousClass3YT.A00.A02(this.A02, A02().A01);
        AnonymousClass3UT r8 = new AnonymousClass3UT(this.A05, this.A07.A07);
        this.A04 = r8;
        C10300i6 r7 = this.A02;
        AnonymousClass22f r63 = AnonymousClass22f.NO_SPLIT;
        C306222g r0 = this.A06;
        if (r0 == null) {
            obj = "";
        } else {
            obj = r0.toString();
        }
        AnonymousClass22f r12 = this.A05;
        boolean z = this.A0B;
        if (r12 == r63 && !z) {
            r6 = new C27331sL(r7, r8, obj);
        } else if (r12 == r63 || r12 == AnonymousClass22f.NO_SPLIT_HINT_TEXT || r12 == AnonymousClass22f.NO_SPLIT_NON_STICKY_FOOTER) {
            r6 = new C27341sM(r7, r8, obj);
        } else if (r12 == AnonymousClass22f.MULTI_SPLIT_TWO_BUTTON) {
            r6 = new C27391sR(r7, r8, obj);
        } else {
            r6 = new C27381sQ(r7, r8, obj);
        }
        this.A03 = r6;
        boolean z2 = this.A0C;
        if (r6 instanceof C27391sR) {
            r1 = r6.A00;
            str = r6.A02;
            AnonymousClass0wJ.A1N(r1, str);
            r62 = AnonymousClass2AF.A0M;
        } else {
            boolean z3 = r6 instanceof C27341sM;
            r1 = r6.A00;
            if (z3) {
                str = r6.A02;
                AnonymousClass0wJ.A1N(r1, str);
                r62 = AnonymousClass2AF.A0Z;
            } else {
                if (z2) {
                    str = C306222g.IG_SAC_SIGN_UP.toString();
                } else {
                    str = r6.A02;
                }
                AnonymousClass0wJ.A1N(r1, str);
                r62 = AnonymousClass2AF.A0A;
            }
        }
        C63003bJ.A00(r62, r1, str, (String) null);
        A03(layoutInflater, inflate);
        boolean z4 = this instanceof C27371sP;
        if (z4) {
            if (this.A07.A00 != null) {
                ((ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton)).setText((CharSequence) this.A07.A00);
            }
        } else if (this instanceof C27411sT) {
            C27411sT r64 = (C27411sT) this;
            boolean z5 = r64 instanceof C27401sS;
            String str2 = r64.A07.A00;
            if (z5) {
                if (str2 != null) {
                    ((ProgressButton) C18180wK.A0E(inflate, R.id.pinnedRegistrationButton)).setText((CharSequence) r64.A07.A00);
                }
            } else if (str2 != null) {
                ((ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton)).setText((CharSequence) r64.A07.A00);
            }
        } else {
            ProgressButton progressButton = (ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton);
            String str3 = this.A07.A00;
            if (str3 != null) {
                progressButton.setText((CharSequence) str3);
            }
            AnonymousClass0wJ.A16(progressButton, 574, this);
        }
        boolean z6 = this instanceof C27401sS;
        if (z6) {
            TextView textView = (TextView) C18180wK.A0E(inflate, R.id.pinnedCancelButton);
            textView.setText(this.A07.A01);
            AnonymousClass0wJ.A16(textView, 576, this);
        } else {
            TextView textView2 = (TextView) C18180wK.A0E(inflate, R.id.cancelButton);
            textView2.setText(this.A07.A01);
            AnonymousClass0wJ.A16(textView2, 576, this);
        }
        if (z4) {
            SignupContent signupContent = this.A07;
            ProgressButton progressButton2 = (ProgressButton) C18180wK.A0E(inflate, R.id.continueButton);
            String str4 = signupContent.A04;
            if (str4 == null) {
                str4 = AnonymousClass0wJ.A0B(this).getString(2131826168);
            }
            progressButton2.setText((CharSequence) str4);
        }
        A05(inflate);
        this.A01 = C19080z7.A00(requireContext(), this.A07.A05, 0);
        this.A00 = C19080z7.A00(requireContext(), this.A07.A03, 0);
        ((ScrollView) C18180wK.A0E(inflate, R.id.page1)).getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape126S0200000_1_I2(2, inflate, this));
        if (z4) {
            boolean z7 = ((C27371sP) this) instanceof C27361sO;
            View A0E = C18180wK.A0E(inflate, R.id.continueButton);
            if (z7) {
                A0E.setVisibility(0);
                C18180wK.A0E(inflate, R.id.step_label).setVisibility(0);
                ((ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton)).setVisibility(8);
            } else {
                A0E.setVisibility(0);
                C18180wK.A0E(inflate, R.id.cancelButton).setVisibility(0);
                C18180wK.A0E(inflate, R.id.step_label).setVisibility(0);
                ((ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton)).setVisibility(8);
            }
        } else if (this instanceof C27351sN) {
            C18180wK.A0E(inflate, R.id.cancelButton).setVisibility(0);
            View A0E2 = C18180wK.A0E(inflate, R.id.hint_wrapper);
            View A0E3 = C18180wK.A0E(inflate, R.id.divider);
            ((TextView) C18180wK.A0E(inflate, R.id.hint_text)).setText(this.A07.A06);
            A0E2.setVisibility(0);
            A0E3.setVisibility(8);
        } else if (z6) {
            ((ProgressButton) C18180wK.A0E(inflate, R.id.registrationButton)).setVisibility(8);
            C18180wK.A0E(inflate, R.id.pinnedRegistrationButton).setVisibility(0);
            C18180wK.A0E(inflate, R.id.pinnedCancelButton).setVisibility(0);
            C18180wK.A0E(inflate, R.id.divider).setVisibility(8);
        } else {
            C18180wK.A0E(inflate, R.id.cancelButton).setVisibility(0);
        }
        C14030oh.A09(-1771063198, A022);
        return inflate;
    }
}
