package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.7Lb  reason: invalid class name */
public final class AnonymousClass7Lb implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C37047JjS A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass7Lb(Fragment fragment, C37047JjS jjS, UserSession userSession, String str, String str2) {
        this.A01 = jjS;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A04(this.A00.requireActivity(), this.A02, this.A04, this.A03, false);
    }
}
