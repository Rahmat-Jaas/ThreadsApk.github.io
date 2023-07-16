package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1ce  reason: invalid class name and case insensitive filesystem */
public final class C23191ce extends C34640IcN implements C82424pb, AnonymousClass4tS, C10390iG {
    public static final String __redex_internal_original_name = "AdditionalContactFragment";
    public NotificationBar A00;
    public C24721jv A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public TextView A05;
    public IgdsHeadline A06;
    public final C63873iU A07 = C63873iU.A06(this, 106);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final boolean BXY() {
        return true;
    }

    public final String getModuleName() {
        return "nux_additional_contact";
    }

    public final C313625r Aiy() {
        return C313625r.EMAIL;
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass265.A07;
    }

    public final void CDH(boolean z) {
        this.A05.setEnabled(z);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A02, "additional_contact");
        return false;
    }

    public static void A00(C23191ce r2, boolean z) {
        C82844qM r1;
        FragmentActivity activity = r2.getActivity();
        if (!(activity instanceof C82844qM) || (r1 = (C82844qM) activity) == null) {
            new C67083yq(r2, r2, AnonymousClass0wJ.A0W(r2)).A00();
        } else {
            r1.Ben(z ? 1 : 0);
        }
    }

    public final void C9G() {
        C32165H8c A042 = C63503hc.A04(AnonymousClass0wJ.A0W(this), this.A03, this.A04, false);
        A042.A00 = this.A07;
        schedule(A042);
        C62713aZ.A00.A03(this.A02, "additional_contact");
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(1769440619);
        C54282zC.A00(this.A02, "additional_contact");
        C14030oh.A0A(-1568147908, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-22234090, C14030oh.A03(-2005476464));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-400610349);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0wJ.A0W(this);
        this.A04 = C18190wL.A0j(requireArguments(), C63213h0.A01(145, 17, 112));
        this.A03 = C18190wL.A0j(requireArguments(), C63213h0.A01(94, 12, 11));
        C14030oh.A09(1770111685, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41468MMt A09;
        String str;
        int A022 = C14030oh.A02(-1667755995);
        AnonymousClass3YT.A00.A02(this.A02, "additional_contact");
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0H = AnonymousClass0wJ.A0H(layoutInflater2, viewGroup, R.layout.reg_container);
        layoutInflater2.inflate(R.layout.nux_additional_contact_fragment, C18190wL.A0E(A0H), true);
        this.A00 = C18240wQ.A0U(A0H);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.skip_button);
        this.A05 = A0L;
        A0L.setText(2131835995);
        AnonymousClass0wJ.A16(this.A05, 591, this);
        this.A06 = C18240wQ.A0S(A0H, R.id.field_title_igds);
        String str2 = this.A03;
        try {
            PhoneNumberUtil A012 = PhoneNumberUtil.A01(requireActivity());
            C72344Np A0A = A012.A0A(str2, C60053Nl.A00(requireActivity()).A00);
            StringBuilder sb = new StringBuilder(20);
            sb.setLength(0);
            int i = A0A.A00;
            String A032 = PhoneNumberUtil.A03(A0A);
            if (Arrays.binarySearch(C40579LjF.A01, (short) i) >= 0) {
                String A0B = A012.A0B(i);
                if ("001".equals(A0B)) {
                    A09 = A012.A08(i);
                } else {
                    A09 = A012.A09(A0B);
                }
                A09.A0P.size();
                Iterator it = A09.A0Q.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C41467MMs mMs = (C41467MMs) it.next();
                    List list = mMs.A04;
                    int size = list.size();
                    if (size == 0 || A012.A01.A00(C18190wL.A0p(list, size - 1)).matcher(A032).lookingAt()) {
                        JRM jrm = A012.A01;
                        if (C18240wQ.A1V(A032, jrm.A00(mMs.A03))) {
                            String str3 = mMs.A01;
                            Matcher matcher = jrm.A00(mMs.A03).matcher(A032);
                            String str4 = mMs.A02;
                            if (str4 == null || str4.length() <= 0) {
                                A032 = matcher.replaceAll(str3);
                            } else {
                                Pattern pattern = PhoneNumberUtil.A0A;
                                if (pattern == null) {
                                    pattern = Pattern.compile("(\\$\\d)", 0);
                                }
                                PhoneNumberUtil.A0A = pattern;
                                A032 = matcher.replaceAll(pattern.matcher(str3).replaceFirst(str4));
                            }
                        }
                    }
                }
                sb.append(A032);
                if (A0A.A07) {
                    String str5 = A0A.A04;
                    if (str5.length() > 0) {
                        if (A09.A0d) {
                            str = A09.A0N;
                        } else {
                            str = " ext. ";
                        }
                        sb.append(str);
                        sb.append(str5);
                    }
                }
            } else {
                sb.append(A032);
            }
            str2 = sb.toString();
        } catch (C32122Ah unused) {
            UserSession userSession = this.A02;
            C04220Ms.A0B(userSession, 0);
            double A002 = C18200wM.A00();
            double A003 = AnonymousClass269.A00();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "additional_phone_number_parse_fail"), 10);
            AnonymousClass0wJ.A1B(A0I, A002, A003);
            C63683i7.A05(A0I);
            C18210wN.A17(A0I);
            C18180wK.A1A(A0I, A003);
            AnonymousClass269.A08(A0I, "additional_contact");
            C63683i7.A09(A0I, userSession);
            A0I.Bb4();
        }
        String string = AnonymousClass0wJ.A0B(this).getString(2131821188);
        string.getClass();
        this.A06.setHeadline((CharSequence) String.format((Locale) null, string, new Object[]{str2}));
        this.A06.A08(R.drawable.phone, true);
        C24721jv r0 = new C24721jv((TextView) null, this.A02, this, C18210wN.A0O(A0H));
        this.A01 = r0;
        registerLifecycleListener(r0);
        C691847d.A02(this);
        C14030oh.A09(1069600968, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-934732912);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C691847d.A03(this);
        this.A06 = null;
        this.A00 = null;
        C14030oh.A09(-754821389, A022);
    }
}
