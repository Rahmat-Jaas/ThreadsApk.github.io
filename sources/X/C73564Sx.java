package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Sx  reason: invalid class name and case insensitive filesystem */
public final class C73564Sx implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C22191Ts A01;
    public final /* synthetic */ C07530bf A02;
    public final /* synthetic */ boolean A03;

    public C73564Sx(FragmentActivity fragmentActivity, C22191Ts r2, C07530bf r3, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void run() {
        ArrayList A0v;
        C63463hW.A03();
        C22191Ts r1 = this.A01;
        List list = r1.A09;
        if (list != null) {
            A0v = C18200wM.A0s(list);
        } else {
            A0v = AnonymousClass0wJ.A0v();
        }
        String str = r1.A08;
        boolean z = this.A03;
        AnonymousClass1ZI r2 = new AnonymousClass1ZI();
        Bundle A06 = C18180wK.A06();
        A06.putParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS", A0v);
        A06.putString("ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK", str);
        A06.putBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL", z);
        r2.setArguments(A06);
        C25786Drz A0Q = C18180wK.A0Q(this.A00, this.A02);
        A0Q.A03 = r2;
        if (z) {
            A0Q.A0D = true;
        }
        A0Q.A05();
    }
}
