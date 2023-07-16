package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.urlhandlers.smbeditpartner.SmbEditPartnerUrlHandlerActivity;

/* renamed from: X.5yi  reason: invalid class name and case insensitive filesystem */
public final class C95055yi extends C63873iU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ SMBPartnerType A01;
    public final /* synthetic */ SmbEditPartnerUrlHandlerActivity A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C95055yi(FragmentActivity fragmentActivity, SMBPartnerType sMBPartnerType, SmbEditPartnerUrlHandlerActivity smbEditPartnerUrlHandlerActivity, String str, String str2) {
        this.A02 = smbEditPartnerUrlHandlerActivity;
        this.A00 = fragmentActivity;
        this.A01 = sMBPartnerType;
        this.A04 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(34030080);
        AnonymousClass5tQ r1 = (AnonymousClass5tQ) obj;
        int A033 = C14030oh.A03(2054543433);
        super.onSuccess(r1);
        if (!r1.A00.isEmpty()) {
            C109206jd r12 = (C109206jd) r1.A00.get(0);
            SmbEditPartnerUrlHandlerActivity smbEditPartnerUrlHandlerActivity = this.A02;
            C10300i6 r6 = smbEditPartnerUrlHandlerActivity.A00;
            r6.getClass();
            FragmentActivity fragmentActivity = this.A00;
            Fragment A022 = C86144wL.A0U().A02(this.A01, this.A04, r12.A00, r12.A01, C121877Ip.A03(r12), (String) null, this.A03);
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r6);
            A0Q.A03 = A022;
            A0Q.A0C = false;
            A0Q.A05();
            smbEditPartnerUrlHandlerActivity.A0B();
        } else {
            this.A00.finish();
        }
        C14030oh.A0A(-1059986163, A033);
        C14030oh.A0A(-754641294, A032);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(1263840530);
        super.onFail(r3);
        this.A00.finish();
        C14030oh.A0A(1256073019, A032);
    }
}
