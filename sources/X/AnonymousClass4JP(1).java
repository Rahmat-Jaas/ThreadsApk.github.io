package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JP  reason: invalid class name */
public final class AnonymousClass4JP implements C82924qU {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass06E A02;
    public final UserSession A03;

    public final void BN1(Uri uri, Bundle bundle) {
        H1T A0N = AnonymousClass0wJ.A0N(this.A03);
        A0N.A0J("notifications/set_message_only_push_notifs/");
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
        C63873iU.A0E(A0S, this, 125);
        Context context = this.A00;
        C31155GhB.A01(context, this.A02, A0S);
        Boolean A012 = AnonymousClass3Zd.A01(context, "ig_direct", true);
        if (A012 != null && !A012.booleanValue()) {
            C25828Dsm A0W = C18190wL.A0W(context);
            A0W.A0L(2131826212);
            A0W.A0K(2131826211);
            C18180wK.A1O(A0W, this, 140, 2131827999);
            A0W.A0O((DialogInterface.OnClickListener) null, 2131831869);
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public AnonymousClass4JP(Fragment fragment, UserSession userSession) {
        this.A03 = userSession;
        Context requireContext = fragment.requireContext();
        this.A00 = requireContext;
        this.A02 = AnonymousClass06E.A00(fragment);
        this.A01 = (FragmentActivity) C10050he.A00(requireContext, FragmentActivity.class);
    }
}
