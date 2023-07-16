package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

/* renamed from: X.3ja  reason: invalid class name and case insensitive filesystem */
public final class C64093ja implements DialogInterface.OnClickListener {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ C07530bf A01;
    public final /* synthetic */ AnonymousClass265 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C64093ja(C34640IcN icN, C07530bf r2, AnonymousClass265 r3, String str, String str2, String str3, String str4) {
        this.A01 = r2;
        this.A00 = icN;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = r3;
        this.A03 = str4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C07530bf r8 = this.A01;
        C34640IcN icN = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        AnonymousClass265 r9 = this.A02;
        Context requireContext = icN.requireContext();
        H1T A0N = AnonymousClass0wJ.A0N(r8);
        A0N.A0J("accounts/vetted_phone_reg_login/");
        A0N.A0O("token", str3);
        C63213h0.A02(requireContext, A0N, "source", "vetted_phone_reg");
        A0N.A0O(FXPFAccessLibraryDebugFragment.UID, str2);
        A0N.A0O("adid", C63883iV.A0H());
        A0N.A0P("phone_id", C18190wL.A0l(r8));
        C32165H8c A0S = C18180wK.A0S(A0N);
        A0S.A00 = new C26951rX(icN, icN, new C70224Dh(icN.requireActivity()), r8, r9, str, str3);
        C31155GhB.A03(A0S);
    }
}
