package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1kX  reason: invalid class name */
public final class AnonymousClass1kX extends AnonymousClass1lO {
    public final AnonymousClass0YY A00;

    public final Class modelClass() {
        return C69974Bs.class;
    }

    public AnonymousClass1kX(AnonymousClass0YY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        TextView A0A = C18250wR.A0A(layoutInflater.inflate(R.layout.muted_word_list_item, viewGroup, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
        A0A.setText(2131825704);
        Context context = A0A.getContext();
        A0A.setCompoundDrawablePadding(C18220wO.A03(context.getResources()));
        A0A.setCompoundDrawablesRelativeWithIntrinsicBounds(C63403hQ.A01(context, R.drawable.instagram_eye_off_pano_outline_24, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), (Drawable) null, (Drawable) null, (Drawable) null);
        return new AnonymousClass126(A0A, this.A00);
    }
}
