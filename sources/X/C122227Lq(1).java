package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.7Lq  reason: invalid class name and case insensitive filesystem */
public final class C122227Lq implements DialogInterface.OnKeyListener {
    public final /* synthetic */ AnonymousClass55z A00;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        AnonymousClass55z r2 = this.A00;
        Fragment A0L = r2.getChildFragmentManager().A0L(R.id.auth_container_view);
        if ((A0L instanceof C143618h2) && ((C143618h2) A0L).onBackPressed()) {
            return true;
        }
        r2.AMq((Bundle) null, (C120967Dk) null, new C1373088b());
        return true;
    }

    public C122227Lq(AnonymousClass55z r1) {
        this.A00 = r1;
    }
}
