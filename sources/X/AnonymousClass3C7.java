package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3C7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ DialogInterface.OnDismissListener A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ UserSession A04;

    public /* synthetic */ AnonymousClass3C7(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession) {
        this.A00 = context;
        this.A03 = fragment;
        this.A04 = userSession;
        this.A01 = onClickListener;
        this.A02 = onDismissListener;
    }
}
