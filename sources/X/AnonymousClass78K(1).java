package X;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.78K  reason: invalid class name */
public final class AnonymousClass78K {
    public String A00;
    public Set A01 = C18200wM.A0u();
    public Account A02;
    public String A03;
    public String A04;
    public Map A05 = AnonymousClass0wJ.A0y();
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final GoogleSignInOptions A00() {
        Set set = this.A01;
        if (set.contains(GoogleSignInOptions.A0I)) {
            Scope scope = GoogleSignInOptions.A0H;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z = this.A08;
        if (z && (this.A02 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0G);
        }
        ArrayList A0s = C18200wM.A0s(set);
        Account account = this.A02;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        return new GoogleSignInOptions(account, this.A03, this.A04, this.A00, A0s, this.A05, 3, z, z2, z3);
    }

    public AnonymousClass78K(GoogleSignInOptions googleSignInOptions) {
        C13320nQ.A01(googleSignInOptions);
        this.A01 = new HashSet(googleSignInOptions.A08);
        this.A06 = googleSignInOptions.A09;
        this.A07 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A05;
        this.A03 = googleSignInOptions.A01;
        this.A02 = googleSignInOptions.A00;
        this.A04 = googleSignInOptions.A02;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList = googleSignInOptions.A04;
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : arrayList) {
            A0y.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.A00), googleSignInOptionsExtensionParcelable);
        }
        this.A05 = A0y;
        this.A00 = googleSignInOptions.A03;
    }

    public AnonymousClass78K() {
    }
}
