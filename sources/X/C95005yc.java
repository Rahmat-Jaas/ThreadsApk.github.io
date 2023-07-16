package X;

import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;

/* renamed from: X.5yc  reason: invalid class name and case insensitive filesystem */
public final class C95005yc extends C63873iU {
    public final /* synthetic */ SupportLinksFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C95005yc(SupportLinksFragment supportLinksFragment, String str, String str2) {
        this.A00 = supportLinksFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Fragment A022;
        int A03 = C14030oh.A03(384152553);
        AnonymousClass5tQ r1 = (AnonymousClass5tQ) obj;
        int A032 = C14030oh.A03(353099871);
        super.onSuccess(r1);
        C109206jd r6 = (C109206jd) r1.A00.get(0);
        SupportLinksFragment supportLinksFragment = this.A00;
        AnonymousClass7IV r7 = supportLinksFragment.A01;
        String str = this.A02;
        USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r7);
        C18190wL.A1I(A002, "fetch_partners");
        AnonymousClass7IV.A03(A002, r7, "success", str, false);
        A002.Bb4();
        C25786Drz A0Q = C18180wK.A0Q(supportLinksFragment.getActivity(), supportLinksFragment.A02);
        String str2 = this.A01;
        C25039DeW A0U = C86144wL.A0U();
        String str3 = supportLinksFragment.A04;
        String str4 = r6.A00;
        String str5 = r6.A01;
        String A033 = C121877Ip.A03(r6);
        String str6 = supportLinksFragment.A03;
        if (str2 != null) {
            A022 = A0U.A08(str3, str4, str5, A033, (String) null, str6, str2);
        } else {
            A022 = A0U.A02(SMBPartnerType.DONATION, str3, str4, str5, A033, (String) null, str6);
        }
        A0Q.A03 = A022;
        A0Q.A07 = SupportLinksFragment.A06;
        A0Q.A05();
        C14030oh.A0A(-1345047269, A032);
        C14030oh.A0A(-1639540284, A03);
    }

    public final void onFail(AnonymousClass3XX r8) {
        int A03 = C14030oh.A03(35253574);
        super.onFail(r8);
        SupportLinksFragment supportLinksFragment = this.A00;
        String A0r = C86104wH.A0r(supportLinksFragment, r8);
        AnonymousClass7IV r4 = supportLinksFragment.A01;
        String str = this.A02;
        USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r4);
        C18190wL.A1I(A002, "fetch_partners");
        AnonymousClass7IV.A03(A002, r4, "error", str, false);
        A002.A1J(A0r);
        A002.Bb4();
        C14030oh.A0A(-1743943152, A03);
    }
}
