package X;

import android.view.View;
import android.widget.ImageView;
import com.facebookpay.widget.accordion.AccordionView;
import com.facebookpay.widget.listcell.ListCell;
import java.util.Iterator;

/* renamed from: X.5Bw  reason: invalid class name and case insensitive filesystem */
public abstract class C89095Bw extends M5O {
    public final void A00() {
        ListCell listCell;
        C89095Bw r1;
        C89095Bw r12;
        ImageView imageView;
        if (this instanceof C91745gj) {
            C872451a r13 = ((C91745gj) this).A01;
            ImageView imageView2 = r13.A04;
            if (imageView2 != null) {
                AnonymousClass7A2.A00(imageView2);
            }
            ImageView imageView3 = r13.A05;
            if (imageView3 != null) {
                AnonymousClass7A2.A00(imageView3);
            }
            ImageView imageView4 = r13.A06;
            if (imageView4 != null) {
                AnonymousClass7A2.A00(imageView4);
            }
            imageView = r13.A07;
        } else if (this instanceof C91735gi) {
            AnonymousClass51J r0 = ((C91735gi) this).A00.A0K;
            if (r0 != null) {
                imageView = r0.A00;
            } else {
                return;
            }
        } else {
            if (this instanceof C91725gh) {
                listCell = ((C91725gh) this).A00;
            } else if (this instanceof C91715gg) {
                AccordionView accordionView = ((C91715gg) this).A00;
                M5O m5o = accordionView.A03;
                if ((m5o instanceof C89095Bw) && (r12 = (C89095Bw) m5o) != null) {
                    r12.A00();
                }
                Iterator A0t = C86134wK.A0t(accordionView.A09.AKR());
                while (A0t.hasNext()) {
                    Object value = C18180wK.A0o(A0t).getValue();
                    if ((value instanceof C89095Bw) && (r1 = (C89095Bw) value) != null) {
                        r1.A00();
                    }
                }
                return;
            } else {
                listCell = ((C91755gk) this).A01;
            }
            imageView = listCell.A08;
        }
        if (imageView != null) {
            AnonymousClass7A2.A00(imageView);
        }
    }

    public C89095Bw(View view) {
        super(view);
    }
}
