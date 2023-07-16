package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.bloks.component.textinput.BloksEditText;

/* renamed from: X.7zr  reason: invalid class name and case insensitive filesystem */
public final class C135667zr implements Runnable {
    public final /* synthetic */ BloksEditText A00;

    public C135667zr(BloksEditText bloksEditText) {
        this.A00 = bloksEditText;
    }

    public final void run() {
        for (ViewParent parent = this.A00.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                ((View) parent).setImportantForAutofill(1);
            }
        }
    }
}
