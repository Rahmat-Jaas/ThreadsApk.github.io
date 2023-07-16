package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

/* renamed from: X.1r4  reason: invalid class name and case insensitive filesystem */
public final class C26701r4 extends C24331hv {
    public final /* synthetic */ C71854Kn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26701r4(Context context, Handler handler, FragmentActivity fragmentActivity, C12560m7 r12, C71854Kn r13, C07530bf r14) {
        super(context, handler, fragmentActivity, r12, r14, (User) null, false);
        this.A00 = r13;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(1890573254);
        View view = this.A00.A00.mView;
        if (view != null) {
            view.requireViewById(R.id.fragment_user_password_recovery_button_connect_with_facebook).setEnabled(true);
        }
        super.onFail(r4);
        C14030oh.A0A(-513139272, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(934703249);
        View view = this.A00.A00.mView;
        if (view != null) {
            view.requireViewById(R.id.fragment_user_password_recovery_button_connect_with_facebook).setEnabled(false);
        }
        super.onStart();
        C14030oh.A0A(1933272133, A03);
    }
}
