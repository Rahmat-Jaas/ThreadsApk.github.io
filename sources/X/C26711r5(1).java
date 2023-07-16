package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.instagram.user.model.User;

/* renamed from: X.1r5  reason: invalid class name and case insensitive filesystem */
public final class C26711r5 extends C24331hv {
    public final /* synthetic */ AccessToken A00;
    public final /* synthetic */ AnonymousClass1aw A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26711r5(Context context, Handler handler, FragmentActivity fragmentActivity, C12560m7 r12, AccessToken accessToken, AnonymousClass1aw r14, C07530bf r15, User user) {
        super(context, handler, fragmentActivity, r12, r15, user, true);
        this.A01 = r14;
        this.A00 = accessToken;
    }

    public final void A00(AnonymousClass1TW r5) {
        int A03 = C14030oh.A03(-1827672332);
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310802792522733L)) {
            AnonymousClass1aw r2 = this.A01;
            C06810aP.A01.A01(r2.A05);
            if (r2.A05.getUserId().equals(r5.A00.getId())) {
                C67363zQ.A0B(this.A00, r2.A05);
            }
        }
        super.A00(r5);
        C14030oh.A0A(-1385728081, A03);
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-805392063);
        AnonymousClass1aw r1 = this.A01;
        if (r1.mView != null) {
            r1.A00.setEnabled(true);
        }
        super.onFail(r4);
        C14030oh.A0A(601967783, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1259624278);
        AnonymousClass1aw r1 = this.A01;
        if (r1.mView != null) {
            r1.A00.setEnabled(false);
        }
        super.onStart();
        C14030oh.A0A(-119447736, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-292215600);
        A00((AnonymousClass1TW) obj);
        C14030oh.A0A(1434140986, A03);
    }
}
