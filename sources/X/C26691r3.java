package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.1r3  reason: invalid class name and case insensitive filesystem */
public final class C26691r3 extends C24331hv {
    public final /* synthetic */ AnonymousClass1c9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26691r3(Context context, Handler handler, FragmentActivity fragmentActivity, C12560m7 r12, AnonymousClass1c9 r13, C07530bf r14) {
        super(context, handler, fragmentActivity, r12, r14, (User) null, false);
        this.A00 = r13;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(734029002);
        super.onFail(r4);
        this.A00.A04.setEnabled(true);
        C14030oh.A0A(-1529651594, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1695840202);
        super.onStart();
        this.A00.A04.setEnabled(false);
        C14030oh.A0A(124123769, A03);
    }
}
