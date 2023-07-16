package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4LQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4LQ implements C83014qe {
    public final /* synthetic */ ShareLaterFragment A00;
    public final /* synthetic */ AnonymousClass2AI A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass4LQ(ShareLaterFragment shareLaterFragment, AnonymousClass2AI r2, boolean z) {
        this.A00 = shareLaterFragment;
        this.A02 = z;
        this.A01 = r2;
    }

    public final void CGw(boolean z) {
        ShareLaterFragment shareLaterFragment = this.A00;
        boolean z2 = this.A02;
        AnonymousClass2AI r1 = this.A01;
        FragmentActivity activity = shareLaterFragment.getActivity();
        if (activity != null && !z && !z2 && r1.equals(AnonymousClass2AI.A04)) {
            UserSession userSession = shareLaterFragment.A04;
            AnonymousClass2AC r5 = AnonymousClass2AC.A0C;
            Context context = shareLaterFragment.getContext();
            AnonymousClass0wJ.A1O(userSession, r5);
            if (!C60423Oz.A01(activity, context, r5, userSession, (C83004qd) null, 96, false) && C67213zA.A02(shareLaterFragment.A04)) {
                if (C63803iN.A05(AnonymousClass0TJ.A05, shareLaterFragment.A04, 36314923445258470L).booleanValue()) {
                    C67213zA.A00(shareLaterFragment.requireContext(), shareLaterFragment.A04);
                    C17323A5r.A00(shareLaterFragment.A04).A00 = true;
                }
            }
        }
    }
}
