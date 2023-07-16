package X;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.service.session.UserSession;

/* renamed from: X.3jH  reason: invalid class name and case insensitive filesystem */
public final class C64013jH implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C84854ty A01;
    public final /* synthetic */ C81224nO A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean[] A04;

    public C64013jH(C84854ty r1, C81224nO r2, String str, boolean[] zArr, int i) {
        this.A00 = i;
        this.A04 = zArr;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String str3;
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (this.A04[i2]) {
                C84854ty r1 = this.A01;
                C81224nO r10 = this.A02;
                Integer num = AnonymousClass006.A00(5)[i2];
                String str4 = this.A03;
                boolean A1Z = AnonymousClass0wJ.A1Z(r10, num);
                UserSession userSession = ((IGDevToolPersistentStateHandler) r1).A01;
                AnonymousClass3YD r6 = new AnonymousClass3YD(AnonymousClass3Zs.A03(userSession).A01(D2R.A1r), userSession.getUserId(), str4);
                String A022 = AnonymousClass1j3.A02(r10);
                int intValue = num.intValue();
                if (intValue != 0) {
                    str = null;
                    if (intValue == A1Z) {
                        str2 = "primaryActionCount";
                        str3 = "primaryActionTime";
                    } else if (intValue == 2) {
                        str2 = "secondaryActionCount";
                        str3 = "secondaryActionTime";
                    } else if (intValue == 4 || intValue == 3) {
                        str2 = "dismissActionCount";
                        str3 = "dismissActionTime";
                        str = "lastDismissForSurface";
                    }
                } else {
                    str2 = "impressionCount";
                    str3 = "lastImpressionTime";
                    str = "lastImpressionForSurface";
                }
                String A002 = AnonymousClass3YD.A00(r6, A022, str2);
                String A003 = AnonymousClass3YD.A00(r6, A022, str3);
                SharedPreferences.Editor edit = r6.A00.edit();
                edit.remove(A002).remove(A003);
                if (str != null) {
                    edit.remove(AnonymousClass00U.A0N(r6.A03, AnonymousClass00U.A0N(r6.A02, str, '/'), '/'));
                }
                edit.apply();
            }
        }
    }
}
