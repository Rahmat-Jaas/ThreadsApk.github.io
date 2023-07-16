package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxDListenerShape451S0100000_1_I2;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jr  reason: invalid class name and case insensitive filesystem */
public final class C24701jr extends C19819BBt {
    public C313625r A00;
    public Integer A01;
    public Integer A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final C10300i6 A06;
    public final AnonymousClass1cj A07;
    public final C57823Cp A08;
    public final AnonymousClass3GG A09;
    public final AnonymousClass3G6 A0A;
    public final AnonymousClass3G6 A0B;

    public final void A01(Integer num) {
        C29621yy r5;
        AnonymousClass3Ft r0;
        AnonymousClass3YT r52 = AnonymousClass3YT.A00;
        C10300i6 r2 = this.A06;
        AnonymousClass1cj r3 = this.A07;
        r52.A01(r2, this.A00, r3.BDt().A01);
        ViewGroup viewGroup = this.A05;
        viewGroup.setLayoutTransition((LayoutTransition) null);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape451S0100000_1_I2(this, 1));
        boolean z = true;
        this.A0A.A00(C18180wK.A1Z(this.A01, AnonymousClass006.A01));
        AnonymousClass3G6 r53 = this.A0B;
        Integer num2 = this.A01;
        Integer num3 = AnonymousClass006.A00;
        if (num2 != num3) {
            z = false;
        }
        r53.A00(z);
        int intValue = this.A01.intValue();
        Integer num4 = num;
        if (intValue == 0) {
            C04220Ms.A0B(num4, 0);
            AnonymousClass24N r10 = AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE;
            EnumSet of = EnumSet.of(r10);
            C04220Ms.A06(of);
            EnumSet complementOf = EnumSet.complementOf(of);
            C04220Ms.A06(complementOf);
            AnonymousClass3GG r7 = this.A09;
            AutoCompleteTextView autoCompleteTextView = r7.A05;
            if (C09860go.A0p(autoCompleteTextView)) {
                AnonymousClass3YI r9 = r7.A00;
                List A052 = C63573hp.A05(r9.A00, r9.A03, r9.A05, complementOf);
                if (!A052.isEmpty()) {
                    Iterator it = A052.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r5 = (C29621yy) it.next();
                        if (C50692tP.A00(r5.A00) != r10) {
                            break;
                        }
                    }
                }
                r5 = null;
                AnonymousClass3YI.A00(r9, r5, num4);
                r7.A03 = !C09860go.A0p(autoCompleteTextView);
                r7.A02 = AnonymousClass0wJ.A0n(autoCompleteTextView);
            }
        } else if (intValue == 1) {
            C57823Cp r54 = this.A08;
            AutoCompleteTextView autoCompleteTextView2 = r54.A04;
            if (C09860go.A0p(autoCompleteTextView2)) {
                C61333Su r13 = r54.A00;
                C04220Ms.A0B(num4, 0);
                AutoCompleteTextView autoCompleteTextView3 = r13.A01;
                if (C09860go.A0p(autoCompleteTextView3)) {
                    C10300i6 r12 = r13.A02;
                    C54062yq.A00(r12, "android_account_manager");
                    List A002 = C50662tM.A00(r13.A00);
                    if (!A002.isEmpty()) {
                        C54132yx.A00(r12, "android_account_manager");
                        String A0p = C18190wL.A0p(A002, 0);
                        String str = "android_account_manager";
                        C61333Su.A00(r13, num4, "", str, A0p, A002.size(), true);
                        autoCompleteTextView3.setText(A0p);
                    }
                }
                if (C09860go.A0p(autoCompleteTextView3)) {
                    C10300i6 r11 = r13.A02;
                    C54062yq.A00(r11, "fb_first_party");
                    AnonymousClass44X.A00().A03(r11, "ig_android_growth_fx_access_fb_ig_prefill_email");
                }
                if (C09860go.A0p(autoCompleteTextView3)) {
                    C10300i6 r122 = r13.A02;
                    C54062yq.A00(r122, "uig_via_phone_id");
                    String str2 = AnonymousClass2BE.A00;
                    if (!(str2 == null || str2.length() == 0)) {
                        C54132yx.A00(r122, "uig_via_phone_id");
                        C61333Su.A00(r13, num4, "", "uig_via_phone_id", str2, 1, true);
                        autoCompleteTextView3.setText(str2);
                    }
                }
                if (C09860go.A0p(autoCompleteTextView3)) {
                    C61333Su.A00(r13, num4, "no_email", "", (String) null, 0, false);
                } else {
                    autoCompleteTextView3.dismissDropDown();
                }
                r54.A02 = !C09860go.A0p(autoCompleteTextView2);
                r54.A01 = AnonymousClass0wJ.A0n(autoCompleteTextView2);
            }
        }
        if (AnonymousClass1cj.A08(r3)) {
            r0 = r3.A0F;
        } else {
            r0 = r3.A0E;
        }
        if (r0 != null) {
            r0.A04 = true;
        }
        boolean A1Z = C18180wK.A1Z(this.A01, num3);
        AnonymousClass3CP r02 = r3.A0C;
        if (r02 != null) {
            r02.A01 = A1Z;
        }
        AnonymousClass3CP r1 = r3.A0B;
        if (r1 != null) {
            r1.A01 = !A1Z;
        }
        if (A1Z) {
            r3.A0V = !r3.A0D.A03;
        }
    }

    public final void Bsd(View view) {
        AnonymousClass0wJ.A17(this.A03, 34, this);
        AnonymousClass0wJ.A17(this.A04, 35, this);
        Integer num = this.A02;
        C57823Cp r4 = this.A08;
        ImageView imageView = r4.A05;
        AutoCompleteTextView autoCompleteTextView = r4.A04;
        int i = 8;
        if (autoCompleteTextView.getText().length() > 0) {
            i = 0;
        }
        imageView.setVisibility(i);
        AnonymousClass0wJ.A17(imageView, 30, r4);
        autoCompleteTextView.addTextChangedListener(r4.A03);
        AnonymousClass3GG r42 = this.A09;
        r42.A00.A02();
        ImageView imageView2 = r42.A06;
        AutoCompleteTextView autoCompleteTextView2 = r42.A05;
        int i2 = 0;
        if (C09860go.A0p(autoCompleteTextView2)) {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        AnonymousClass0wJ.A17(imageView2, 32, r42);
        AnonymousClass0wJ.A17(r42.A07, 33, r42);
        autoCompleteTextView2.addTextChangedListener(r42.A04);
        A01(num);
    }

    public final void onDestroyView() {
        this.A09.A00 = null;
    }

    public final void onPause() {
        AnonymousClass3GG r1 = this.A09;
        AnonymousClass1XY r0 = r1.A01;
        if (r0 != null) {
            r0.A06();
        }
        C09860go.A0I(r1.A05);
        C57823Cp r02 = this.A08;
        AutoCompleteTextView autoCompleteTextView = r02.A04;
        autoCompleteTextView.removeTextChangedListener(r02.A03);
        C09860go.A0I(autoCompleteTextView);
    }

    public final void onResume() {
        AutoCompleteTextView autoCompleteTextView;
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            autoCompleteTextView = this.A09.A05;
        } else if (intValue == 1) {
            autoCompleteTextView = this.A08.A04;
        } else {
            return;
        }
        C63553hn.A06(autoCompleteTextView);
    }

    public C24701jr(View view, View view2, ViewGroup viewGroup, C10300i6 r4, AnonymousClass1cj r5, AnonymousClass3G6 r6, AnonymousClass3G6 r7, C57823Cp r8, AnonymousClass3GG r9, Integer num, Integer num2) {
        this.A05 = viewGroup;
        this.A03 = view;
        this.A04 = view2;
        this.A01 = num;
        this.A07 = r5;
        this.A08 = r8;
        this.A09 = r9;
        this.A06 = r4;
        this.A0A = r6;
        this.A0B = r7;
        this.A02 = num2;
    }

    public final void A00(C10300i6 r8, Integer num, Integer num2) {
        C313625r r6;
        double A002;
        double A003;
        AnonymousClass0A2 A0M;
        int i;
        if (num2.intValue() != 0) {
            r6 = C313625r.EMAIL;
            this.A00 = r6;
            C13330nS A022 = C13330nS.A02(r8);
            A003 = AnonymousClass269.A00();
            A002 = C18200wM.A00();
            A0M = AnonymousClass0wJ.A0M(A022, "switch_to_email");
            i = 2756;
        } else {
            r6 = C313625r.PHONE;
            this.A00 = r6;
            C13330nS A023 = C13330nS.A02(r8);
            A002 = C18200wM.A00();
            A003 = AnonymousClass269.A00();
            A0M = AnonymousClass0wJ.A0M(A023, "switch_to_phone");
            i = 2758;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(A0M, i);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18180wK.A19(A0I);
        AnonymousClass269.A08(A0I, this.A07.BDt().A01);
        C18180wK.A1A(A0I, A003);
        C18210wN.A19(A0I, r6.A00);
        C18180wK.A1B(A0I, A002);
        C63683i7.A08(A0I);
        A0I.Bb4();
        this.A01 = num2;
        A01(num);
    }
}
