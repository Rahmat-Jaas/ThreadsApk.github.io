package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hr  reason: invalid class name and case insensitive filesystem */
public abstract class C24301hr extends C63873iU {
    public final BKU A00;
    public final DialogInterface.OnDismissListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final AnonymousClass1w0 A04;

    public C24301hr(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, BKU bku, UserSession userSession, String str) {
        this.A02 = fragment;
        this.A03 = userSession;
        this.A00 = bku;
        this.A01 = onDismissListener;
        AnonymousClass1w0 r1 = new AnonymousClass1w0();
        Bundle A06 = C18180wK.A06();
        A06.putBoolean(str, true);
        r1.setArguments(A06);
        this.A04 = r1;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int i;
        int A032 = C14030oh.A03(1966610178);
        C04220Ms.A0B(r6, 0);
        if (this.A04.isResumed()) {
            Context context = this.A02.getContext();
            if (context == null) {
                i = -75504357;
                C14030oh.A0A(i, A032);
            }
            C85814vo r0 = (C85814vo) r6.A00;
            if (r0 == null || !r0.isCheckpointRequired()) {
                C63813iO.A0A(context, 2131826851, 0);
            }
        }
        i = 1683645859;
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        int i;
        int A032 = C14030oh.A03(-1609152670);
        AnonymousClass1w0 r1 = this.A04;
        if (!r1.isResumed()) {
            i = 2142083248;
        } else {
            r1.A07();
            DialogInterface.OnDismissListener onDismissListener = this.A01;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
            i = 1081747434;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-1764036774);
        Fragment fragment = this.A02;
        if (fragment.getParentFragmentManager().A0O("ProgressDialog") == null) {
            AnonymousClass1w0 r1 = this.A04;
            if (!r1.isAdded()) {
                C12560m7 parentFragmentManager = fragment.getParentFragmentManager();
                C04220Ms.A0A(parentFragmentManager);
                r1.A0A(parentFragmentManager, "ProgressDialog");
            }
        }
        C14030oh.A0A(-56737798, A032);
    }
}
