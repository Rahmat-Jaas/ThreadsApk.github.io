package X;

import android.view.View;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.util.Iterator;

/* renamed from: X.3oL  reason: invalid class name and case insensitive filesystem */
public final class C64573oL implements View.OnClickListener {
    public final /* synthetic */ ProxyFrameLayout A00;

    public C64573oL(ProxyFrameLayout proxyFrameLayout) {
        this.A00 = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1898585963);
        ProxyFrameLayout proxyFrameLayout = this.A00;
        Iterator it = proxyFrameLayout.A02.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        View.OnClickListener onClickListener = proxyFrameLayout.A00;
        if (onClickListener != null && proxyFrameLayout.A01) {
            onClickListener.onClick(view);
        }
        C14030oh.A0C(-1147576667, A05);
    }
}
