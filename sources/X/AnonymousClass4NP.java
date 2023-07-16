package X;

import android.view.View;
import com.facebook.redex.IDxDListenerShape435S0100000_1_I2;
import com.instagram.creation.fragment.ShareLaterFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4NP  reason: invalid class name */
public final class AnonymousClass4NP implements C39819L1q {
    public final /* synthetic */ ShareLaterFragment A00;

    public final String AQb() {
        return "caption_repost";
    }

    public final void C4N() {
    }

    public final void CV8() {
    }

    public final void CV9() {
    }

    public AnonymousClass4NP(ShareLaterFragment shareLaterFragment) {
        this.A00 = shareLaterFragment;
    }

    public final void BmO() {
        ShareLaterFragment shareLaterFragment = this.A00;
        shareLaterFragment.A06.clearFocus();
        C18230wP.A0R(shareLaterFragment).setIsLoading(false);
        View view = shareLaterFragment.mView;
        if (view != null) {
            C09860go.A0I(view);
        }
    }

    public final void CR2() {
        this.A00.A06.requestFocus();
    }

    public final void CX0() {
        ShareLaterFragment shareLaterFragment = this.A00;
        C18230wP.A0R(shareLaterFragment).setIsLoading(true);
        shareLaterFragment.A0A = C18230wP.A0w();
        AnonymousClass0hW r1 = new AnonymousClass0hW(AnonymousClass0wJ.A0F(), new IDxDListenerShape435S0100000_1_I2(shareLaterFragment, 1), 15000);
        shareLaterFragment.A01 = r1;
        r1.A01(C18180wK.A0e());
    }

    public final List getContent() {
        return Collections.singletonList(AnonymousClass0wJ.A0n(this.A00.A06));
    }
}
