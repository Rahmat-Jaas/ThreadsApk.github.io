package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3td  reason: invalid class name and case insensitive filesystem */
public final class C65563td implements View.OnKeyListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ LLF A01;
    public final /* synthetic */ C121247Ez A02;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        LLF llf = this.A01;
        if (llf.getVisibility() != 0) {
            return false;
        }
        ViewGroup viewGroup = this.A00;
        C121247Ez r1 = this.A02;
        llf.setVisibility(8);
        viewGroup.removeView(llf);
        r1.A03();
        return true;
    }

    public C65563td(ViewGroup viewGroup, LLF llf, C121247Ez r3) {
        this.A01 = llf;
        this.A00 = viewGroup;
        this.A02 = r3;
    }
}
