package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.5yO  reason: invalid class name */
public final class AnonymousClass5yO extends AnonymousClass436 {
    public final C11630kW A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yO(C11630kW r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1488975416);
        AnonymousClass0wJ.A1M(view, 1, obj);
        if (i == 0) {
            Object tag = view.getTag();
            C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.genericsurvey.ui.MediaPreviewViewBinder.Holder");
            C106206ef r1 = (C106206ef) tag;
            BKU bku = (BKU) obj;
            C11630kW r2 = this.A00;
            C18210wN.A0n(1, r1, bku);
            IgProgressImageView igProgressImageView = r1.A00;
            igProgressImageView.setAdjustViewBounds(true);
            ImageUrl A22 = bku.A22();
            if (A22 != null) {
                igProgressImageView.setUrl(A22, r2);
                C14030oh.A0A(360638764, A03);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
        UnsupportedOperationException A0s = C86134wK.A0s(I17.A00(16));
        C14030oh.A0A(-771142939, A03);
        throw A0s;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(1798289546, viewGroup);
        if (i == 0) {
            View A0D = C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.media_preview_view, false);
            A0D.setTag(new C106206ef(A0D));
            C14030oh.A0A(-899350572, A002);
            return A0D;
        }
        UnsupportedOperationException A0s = C86134wK.A0s(I17.A00(43));
        C14030oh.A0A(-671779499, A002);
        throw A0s;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
