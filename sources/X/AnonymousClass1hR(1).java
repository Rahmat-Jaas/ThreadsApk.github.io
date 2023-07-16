package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;

/* renamed from: X.1hR  reason: invalid class name */
public class AnonymousClass1hR extends C63873iU {
    public FragmentActivity A00;
    public C07530bf A01;
    public String A02;
    public boolean A03;

    public AnonymousClass1hR(FragmentActivity fragmentActivity, C07530bf r2, String str, boolean z) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A03 = z;
        this.A02 = str;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int i;
        int A032 = C14030oh.A03(-1867789224);
        super.onFail(r6);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            i = -51765445;
        } else {
            C10450iM.A03("Show error message when fail to validate link's token for shared phone recovery flow on unvetted devices", "Fail to validate token in SMS Link");
            C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
            A0W.A0L(2131836953);
            A0W.A0K(2131834837);
            C18180wK.A1M(A0W);
            C18200wM.A1O(A0W);
            AnonymousClass0wJ.A1K(A0W);
            AnonymousClass01V.A0p.markerAnnotate(725095506, TraceFieldType.FailureReason, "network_error");
            AnonymousClass01V.A0p.markerEnd(725095506, 3);
            i = 1135804677;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = C14030oh.A03(-1973092632);
        AnonymousClass1TO r14 = (AnonymousClass1TO) obj;
        int A033 = C14030oh.A03(-1494460276);
        super.onSuccess(r14);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            i = 943397175;
        } else {
            C07530bf r5 = this.A01;
            AnonymousClass01V.A0p.markerPoint(725095506, "network_complete");
            String str = r14.A01;
            String str2 = this.A02;
            if (C62983bG.A00().equals(str2)) {
                String formatNumber = PhoneNumberUtils.formatNumber(str.replace("+", ""));
                if (formatNumber == null) {
                    formatNumber = "";
                }
                str = C18180wK.A0m(fragmentActivity, formatNumber).toString();
            }
            C63463hW.A03();
            ArrayList arrayList = r14.A02;
            String str3 = r14.A00;
            boolean z = this.A03;
            Bundle A06 = C18180wK.A06();
            AnonymousClass1aS r2 = new AnonymousClass1aS();
            Bundle A062 = C18180wK.A06();
            C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
            A062.putParcelableArrayList("lookup_users", arrayList);
            A062.putString("login_nonce", str3);
            A062.putString("recovery_handle_type", str2);
            A062.putString("recovery_handle", str);
            A062.putBoolean("is_shared_phone_recovery_via_link", z);
            A062.putAll(A06);
            r2.setArguments(A062);
            C18220wO.A1A(r2, C18180wK.A0Q(fragmentActivity, r5));
            i = -2044462089;
        }
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-97425919, A032);
    }
}
