package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Product;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5A6  reason: invalid class name */
public final class AnonymousClass5A6 extends C41030Luu {
    public final C11630kW A00;
    public final C106516fA A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        C88895Bc r8 = (C88895Bc) m5o;
        Product product = (Product) this.A02.get(i);
        C106516fA r3 = this.A01;
        C11630kW r6 = this.A00;
        Context A0B = C18240wQ.A0B(r8);
        ImageInfo A022 = product.A02();
        if (A022 == null && (A022 = product.A01()) == null) {
            r8.A02.A09();
        } else {
            RoundedCornerImageView roundedCornerImageView = r8.A02;
            ImageUrl A012 = C122057Ju.A01(A022, AnonymousClass006.A01);
            A012.getClass();
            roundedCornerImageView.setUrl(A012, r6);
        }
        r8.A01.setText(product.A00.A0g);
        r8.A00.setText(AnonymousClass0wJ.A0l(A0B, product.A00.A0C.A08, 2131832867));
        C86104wH.A1D(r8.itemView, 72, r3, product);
    }

    public AnonymousClass5A6(C11630kW r2, C106516fA r3, List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A02 = A0v;
        this.A01 = r3;
        A0v.addAll(list);
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1283463463);
        int size = this.A02.size();
        C14030oh.A0A(531921867, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C88895Bc(AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.product_share_picker_row));
    }
}
