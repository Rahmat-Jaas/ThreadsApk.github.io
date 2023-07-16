package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3jS  reason: invalid class name and case insensitive filesystem */
public final class C64043jS implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ C27930Evg A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C64043jS(Activity activity, DialogInterface.OnClickListener onClickListener, C27930Evg evg, UserSession userSession, String str, String str2) {
        this.A01 = onClickListener;
        this.A03 = userSession;
        this.A00 = activity;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = evg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
        AnonymousClass3DW r0 = AnonymousClass30L.A00;
        UserSession userSession = this.A03;
        r0.A00(this.A00, this.A02, userSession, this.A05, this.A04, (String) null, (List) null, false);
    }
}
