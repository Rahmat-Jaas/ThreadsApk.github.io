package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.login.LoginClient$Request;
import com.instagram.barcelona.R;
import java.math.BigInteger;
import java.util.Random;

/* renamed from: X.0zN  reason: invalid class name and case insensitive filesystem */
public final class C19150zN extends C34641IcO {
    public LoginClient$Request A00;
    public String A01;
    public AnonymousClass3Z5 A02;
    public String A03;
    public String A04;

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("Request", this.A02.A01);
        bundle.putInt("HandlerIndex", this.A02.A00);
        bundle.putString("challenge", this.A04);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C83314rB r0;
        super.onActivityResult(i, i2, intent);
        AnonymousClass3Z5 r02 = this.A02;
        int i3 = r02.A00;
        C83314rB[] r1 = r02.A04;
        if (i3 < r1.length && (r0 = r1[i3]) != null) {
            r0.Bja(intent, i, i2);
        }
    }

    public final void onCreate(Bundle bundle) {
        String bigInteger;
        int A022 = C14030oh.A02(1782361083);
        super.onCreate(bundle);
        this.A03 = requireActivity().getCallingPackage();
        LoginClient$Request loginClient$Request = (LoginClient$Request) C18190wL.A0C(requireActivity()).getParcelable("Request");
        this.A00 = loginClient$Request;
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("HandlerIndex", -1);
            loginClient$Request = (LoginClient$Request) bundle.getParcelable("Request");
            bigInteger = bundle.getString("challenge");
        } else {
            bigInteger = new BigInteger(100, new Random()).toString(32);
        }
        this.A04 = bigInteger;
        this.A02 = new AnonymousClass3Z5(this, loginClient$Request, bigInteger, i);
        this.A01 = loginClient$Request.A05;
        C14030oh.A09(147861859, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1612693680);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.com_facebook_login_fragment);
        C14030oh.A09(317660332, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(583866848);
        super.onPause();
        requireActivity().findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        C14030oh.A09(1736606090, A022);
    }

    public final void onResume() {
        int i;
        int A022 = C14030oh.A02(832481579);
        super.onResume();
        if (this.A03 == null) {
            Log.e("LoginFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            C18190wL.A1A(this);
            i = -1425557433;
        } else {
            AnonymousClass3Z5 r2 = this.A02;
            if (r2.A00 == -1) {
                r2.A02();
            }
            i = -1297547174;
        }
        C14030oh.A09(i, A022);
    }
}
