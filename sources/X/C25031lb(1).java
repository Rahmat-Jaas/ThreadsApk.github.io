package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public final class C25031lb extends FR1 {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ AccountManager A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ C10300i6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public final int getRunnableId() {
        return 252;
    }

    public C25031lb(Account account, AccountManager accountManager, C11630kW r3, C10300i6 r4, String str, boolean z) {
        this.A03 = r4;
        this.A01 = accountManager;
        this.A00 = account;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        C15730rn A002;
        C32165H8c A0S;
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            C63633hx.A04(this.A02, this.A03, this.A04, "empty_token", 0.0d, 0.0d);
            return;
        }
        if (this.A05) {
            C10300i6 r5 = this.A03;
            String str2 = this.A04;
            C11630kW r3 = this.A02;
            C15730rn A003 = C15730rn.A00(r3, "cp_confirm_attempt");
            A003.A0D("type", "gmail");
            A003.A0D("flow", str2);
            C18180wK.A1K(A003, r5);
            H1T A0N = AnonymousClass0wJ.A0N(r5);
            A0N.A0J("accounts/confirm_email_with_open_id_token/");
            A0N.A0O("id_token", str);
            A0S = AnonymousClass0wJ.A0S(A0N);
            A0S.A00 = new IDxACallbackShape2S1200000_1_I2(r5, r3, str2, 10);
        } else {
            C38040KHr.A01.CWx(new AnonymousClass45K(str));
            C10300i6 r32 = this.A03;
            if (C18250wR.A01(r32) > 0) {
                String str3 = this.A04;
                C11630kW r1 = this.A02;
                if (r1 == null) {
                    A002 = C63313hF.A00(r32, "confirm_email_after_reg");
                } else {
                    A002 = C15730rn.A00(r1, "confirm_email_after_reg");
                }
                A002.A0D("flow", str3);
                C18180wK.A1K(A002, r32);
                H1T A0N2 = AnonymousClass0wJ.A0N(r32);
                A0N2.A0J("accounts/confirm_email_with_open_id_token/");
                A0N2.A0O("id_token", str);
                A0S = AnonymousClass0wJ.A0S(A0N2);
            } else {
                return;
            }
        }
        C31155GhB.A03(A0S);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C10300i6 r4 = this.A03;
        AccountManager accountManager = this.A01;
        return C63633hx.A00(this.A00, accountManager, this.A02, r4, this.A04);
    }
}
