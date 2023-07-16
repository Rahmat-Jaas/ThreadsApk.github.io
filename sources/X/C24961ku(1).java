package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1ku  reason: invalid class name and case insensitive filesystem */
public final class C24961ku extends AnonymousClass1lO {
    public final Context A00;
    public final C11630kW A01;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C04220Ms.A0B((Object) null, 0);
        throw null;
    }

    public final Class modelClass() {
        return C211018x.class;
    }

    public C24961ku(Context context, C11630kW r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0F = C18200wM.A0F(layoutInflater, viewGroup, R.layout.layout_iglive_fundraiser_row, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater));
        A0F.setTag(new C200312v(A0F));
        Object tag = A0F.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.video.live.ui.postlive.IgLivePostLiveSheetFundraiserViewBinder.Holder");
        return (M5O) tag;
    }
}
