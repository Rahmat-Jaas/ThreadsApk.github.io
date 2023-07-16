package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

/* renamed from: X.1ip  reason: invalid class name and case insensitive filesystem */
public class C24451ip extends C63873iU implements C82824qK {
    public RegFlowExtras A00;
    public final C10300i6 A01;
    public final AnonymousClass265 A02;
    public final C34640IcN A03;
    public final C82824qK A04;
    public final CountryCodeData A05;
    public final RegFlowExtras A06;
    public final C24721jv A07;
    public final String A08;

    public final void A00(C27111rz r20) {
        int A032;
        String str;
        String str2;
        int i;
        C25786Drz A0Q;
        Bundle A062;
        Fragment r0;
        if (this instanceof C27451sX) {
            A032 = C14030oh.A03(-522206666);
            AnonymousClass1ci.A00(((C27451sX) this).A00);
            i = 834228009;
        } else {
            A032 = C14030oh.A03(2117932095);
            C27111rz r9 = r20;
            boolean A1U = C18210wN.A1U(r9.A02);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                String A002 = countryCodeData.A00();
                str2 = this.A08;
                str = C63553hn.A00(A002, str2);
            } else {
                str = this.A08;
                str2 = str;
            }
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            regFlowExtras.A0m = r9.A05;
            regFlowExtras.A0X = r9.A01;
            regFlowExtras.A0C = r9.A00;
            regFlowExtras.A0g = r9.A04;
            RegFlowExtras regFlowExtras2 = this.A06;
            if (regFlowExtras2 != null) {
                regFlowExtras.A0Z = regFlowExtras2.A0Z;
                regFlowExtras.A0P = regFlowExtras2.A0P;
                C313625r A012 = regFlowExtras2.A01();
                A012.getClass();
                regFlowExtras.A03(A012);
                Integer A022 = regFlowExtras2.A02();
                if (A022 != null) {
                    regFlowExtras.A0V = AnonymousClass2TT.A00(A022);
                }
                regFlowExtras.A03 = regFlowExtras2.A03;
                regFlowExtras.A04 = regFlowExtras2.A04;
                regFlowExtras.A0v = regFlowExtras2.A0v;
                regFlowExtras.A06 = regFlowExtras2.A06;
                regFlowExtras.A07 = regFlowExtras2.A07;
                if (C313625r.SAC == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    regFlowExtras.A0J = regFlowExtras2.A0J;
                    regFlowExtras.A0M = regFlowExtras2.A0M;
                    regFlowExtras.A0t = regFlowExtras2.A0t;
                }
            }
            regFlowExtras.A0p = true;
            if (A1U) {
                regFlowExtras.A05 = r9.A02;
                regFlowExtras.A0Q = str;
                C63103bV.A03.A05(this.A03.getContext());
            }
            regFlowExtras2.getClass();
            AnonymousClass3WW.A01(regFlowExtras2, regFlowExtras);
            if (A1U) {
                long currentTimeMillis = System.currentTimeMillis();
                long A013 = AnonymousClass269.A01();
                C10300i6 r14 = this.A01;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r14), "phone_number_auto_confirmed"), 2492);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    C18190wL.A1G(A0I, currentTimeMillis, A013);
                    AnonymousClass269.A08(A0I, this.A02.A01);
                    C18180wK.A1A(A0I, (double) A013);
                    C18210wN.A17(A0I);
                    C18180wK.A1B(A0I, (double) currentTimeMillis);
                    A0I.A0T("autoconfirmation_sources", new C31015GdW(", ").A04(r9.A03));
                    A0I.A0T("source", C18190wL.A0m(r14));
                    A0I.Bb4();
                }
                if (C313625r.SAC == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    if (regFlowExtras2.A0s) {
                        regFlowExtras.A0t = false;
                        A0Q = C18180wK.A0Q(this.A03.getActivity(), r14);
                        A062 = C18180wK.A06();
                        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        r0 = new AnonymousClass1dA();
                    } else if (regFlowExtras.A0t) {
                        regFlowExtras.A0t = false;
                        this.A00 = regFlowExtras;
                        C07530bf r142 = (C07530bf) r14;
                        String str3 = regFlowExtras2.A0Z;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C34640IcN icN = this.A03;
                        C67283zI.A02(AnonymousClass0wJ.A0F(), icN, icN, (C82804qI) null, this, regFlowExtras, this.A07, r142, this.A02, str3, (String) null, false);
                    } else {
                        A0Q = C18180wK.A0Q(this.A03.getActivity(), r14);
                        A062 = C18180wK.A06();
                        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        r0 = new C21261Qa();
                    }
                    C18180wK.A0x(A062, r0, A0Q);
                } else {
                    AnonymousClass0wJ.A0F().post(new C73384Se(this.A03, r14, regFlowExtras));
                }
            } else {
                regFlowExtras.A01 = countryCodeData;
                regFlowExtras.A0R = str2;
                FragmentActivity activity = this.A03.getActivity();
                C10300i6 r02 = this.A01;
                C25786Drz A003 = C63463hW.A00(activity, r02);
                A003.A03 = C61753Vf.A00(C18180wK.A06(), regFlowExtras, (String) null, (String) null, (String) null, (String) null, r02.getToken(), false, false);
                A003.A0B = true;
                A003.A07();
            }
            i = -2115142360;
        }
        C14030oh.A0A(i, A032);
    }

    public final void Cth(String str, Integer num) {
        AnonymousClass3WW.A00(this.A03, this.A00, (C07530bf) this.A01, str);
    }

    public C24451ip(C34640IcN icN, C10300i6 r2, C82824qK r3, CountryCodeData countryCodeData, RegFlowExtras regFlowExtras, C24721jv r6, AnonymousClass265 r7, String str) {
        this.A01 = r2;
        this.A08 = str;
        this.A03 = icN;
        this.A07 = r6;
        this.A05 = countryCodeData;
        this.A02 = r7;
        this.A04 = r3;
        this.A06 = regFlowExtras;
    }

    public final void onFail(AnonymousClass3XX r9) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        int A032 = C14030oh.A03(259336706);
        C10300i6 r2 = this.A01;
        AnonymousClass265 r6 = this.A02;
        C61763Vg A033 = C63313hF.A03(r2, C313625r.PHONE, r6, "next_blocked");
        Object obj = r9.A00;
        if (obj != null) {
            AnonymousClass1j3 r1 = (AnonymousClass1j3) obj;
            List list = r1.mErrorStrings;
            if (list == null || list.isEmpty()) {
                str = r1.getErrorMessage();
            } else {
                str = C18190wL.A0p(r1.mErrorStrings, 0);
            }
        } else {
            str = null;
        }
        if (str != null) {
            C82824qK r12 = this.A04;
            if (obj == null || (str4 = ((AnonymousClass1j3) obj).mErrorSource) == null) {
                num = AnonymousClass006.A00;
            } else {
                num = C32682Cu.A00(str4);
            }
            r12.Cth(str, num);
            str2 = "invalid_number";
        } else {
            this.A04.Cth(C18230wP.A0l(this.A03), AnonymousClass006.A00);
            str2 = "request_failed";
        }
        A033.A03("error", str2);
        if (r6 == AnonymousClass265.A1A) {
            String stripSeparators = PhoneNumberUtils.stripSeparators(this.A08);
            stripSeparators.getClass();
            int length = stripSeparators.length();
            if (length >= 3) {
                stripSeparators = stripSeparators.substring(0, 3);
            }
            A033.A03(C62983bG.A00(), stripSeparators);
            A033.A02("digits", length);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                str3 = countryCodeData.A01;
            } else {
                str3 = "can't tell";
            }
            A033.A03("country_code", str3);
        }
        A033.A01();
        C14030oh.A0A(1031594233, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-432528267);
        super.onFinish();
        this.A07.A00();
        C14030oh.A0A(-1638142396, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1013303443);
        super.onStart();
        this.A07.A01();
        C14030oh.A0A(-463094905, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1434960197);
        A00((C27111rz) obj);
        C14030oh.A0A(853163110, A032);
    }
}
