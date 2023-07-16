package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxLListenerShape382S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5A8  reason: invalid class name */
public final class AnonymousClass5A8 extends C41030Luu {
    public final UserSession A00;
    public final LinkedHashMap A01;
    public final Activity A02;
    public final LinkedHashMap A03;
    public final LinkedHashMap A04;
    public final List A05;

    public AnonymousClass5A8(Activity activity, UserSession userSession, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, List list) {
        C18180wK.A1Q(activity, 1, linkedHashMap2);
        C04220Ms.A0B(userSession, 6);
        this.A02 = activity;
        this.A05 = list;
        this.A03 = linkedHashMap;
        this.A01 = linkedHashMap2;
        this.A04 = linkedHashMap3;
        this.A00 = userSession;
    }

    public final void onBindViewHolder(M5O m5o, int i) {
        Float f;
        C04220Ms.A0B(m5o, 0);
        if (m5o instanceof AnonymousClass5BZ) {
            String A0p = C18190wL.A0p(this.A05, i);
            AnonymousClass5BZ r6 = (AnonymousClass5BZ) m5o;
            IgImageView igImageView = r6.A02;
            int dimensionPixelSize = C86164wN.A0D(igImageView).getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
            Float f2 = (Float) this.A03.get(A0p);
            Bitmap bitmap = null;
            if (f2 != null) {
                float floatValue = ((float) dimensionPixelSize) / f2.floatValue();
                f = Float.valueOf(floatValue);
                if (f != null) {
                    bitmap = C31176Gi6.A0B(A0p, dimensionPixelSize, (int) floatValue);
                }
            } else {
                f = null;
            }
            igImageView.setImageBitmap(bitmap);
            String A0f = C18240wQ.A0f(A0p, this.A04);
            IgTextView igTextView = r6.A01;
            igTextView.setText((CharSequence) this.A01.get(A0f));
            igTextView.setOnClickListener(new AnonymousClass7RC(this, f2, A0p, A0f));
            if (f != null) {
                r6.A00.getLayoutParams().height = (int) (f.floatValue() + ((float) C86164wN.A0D(igTextView).getDimensionPixelSize(R.dimen.alt_text_carousel_input_height)));
            }
            ViewTreeObserver viewTreeObserver = igTextView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new IDxLListenerShape382S0100000_2_I2(m5o, 6));
            }
        }
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new AnonymousClass5BZ(C18200wM.A0F(LayoutInflater.from(this.A02), viewGroup, R.layout.alt_text_carousel_card_layout, false));
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(1575395510);
        int size = this.A05.size();
        C14030oh.A0A(654883563, A032);
        return size;
    }
}
