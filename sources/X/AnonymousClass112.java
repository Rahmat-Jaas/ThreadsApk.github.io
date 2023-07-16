package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.112  reason: invalid class name */
public final class AnonymousClass112 extends C41030Luu {
    public List A00 = AnonymousClass0ZV.A00;
    public final C11630kW A01;
    public final String A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        String str;
        C04220Ms.A0B(m5o, 0);
        Object obj = this.A00.get(i);
        if (KtCSuperShape0S2200000_I2.A00(8, obj)) {
            obj = (KtCSuperShape0S2000000_I2) ((KtCSuperShape0S2200000_I2) obj).A01;
        }
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ThemedImageURL");
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) obj;
        C11630kW r3 = this.A01;
        C04220Ms.A0B(ktCSuperShape0S2000000_I2, 0);
        if (C34822La.A00(C18240wQ.A0B(m5o))) {
            str = ktCSuperShape0S2000000_I2.A00;
        } else {
            str = ktCSuperShape0S2000000_I2.A01;
        }
        C18230wP.A1J(r3, (IgImageView) AnonymousClass0wJ.A0J(m5o.itemView, R.id.image), str);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        boolean A0I = C04220Ms.A0I(this.A02, "insights");
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        int i2 = R.layout.value_props_monetization_h_scroll_card;
        if (A0I) {
            i2 = R.layout.value_props_insights_h_scroll_card;
        }
        return new AnonymousClass11m(C18180wK.A0D(A0C, viewGroup, i2, false));
    }

    public AnonymousClass112(String str, C11630kW r3) {
        this.A02 = str;
        this.A01 = r3;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(312805426);
        int size = this.A00.size();
        C14030oh.A0A(1979494799, A03);
        return size;
    }
}
