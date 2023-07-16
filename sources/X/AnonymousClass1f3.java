package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.EditBusinessFBPageFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.1f3  reason: invalid class name */
public final class AnonymousClass1f3 extends C24281ho {
    public final /* synthetic */ EditBusinessFBPageFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1f3(Context context, Fragment fragment, EditBusinessFBPageFragment editBusinessFBPageFragment, UserSession userSession, String str) {
        super(context, fragment, userSession, str);
        this.A00 = editBusinessFBPageFragment;
    }

    public final void A00(C21991Sy r3) {
        int A03 = C14030oh.A03(-423964558);
        super.A00(r3);
        EditBusinessFBPageFragment.A02(this.A00);
        C14030oh.A0A(-813130662, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1208896055);
        super.onFinish();
        EditBusinessFBPageFragment editBusinessFBPageFragment = this.A00;
        editBusinessFBPageFragment.A03.A03 = false;
        editBusinessFBPageFragment.A02.setDisplayedChild(0);
        C14030oh.A0A(-711500607, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-91156119);
        super.onStart();
        EditBusinessFBPageFragment editBusinessFBPageFragment = this.A00;
        editBusinessFBPageFragment.A03.A03 = true;
        editBusinessFBPageFragment.A02.setDisplayedChild(1);
        C14030oh.A0A(1833115747, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1734914078);
        A00((C21991Sy) obj);
        C14030oh.A0A(1608196254, A03);
    }
}
