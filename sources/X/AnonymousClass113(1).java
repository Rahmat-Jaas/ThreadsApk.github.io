package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.113  reason: invalid class name */
public final class AnonymousClass113 extends C41030Luu {
    public List A00 = AnonymousClass0wJ.A0v();
    public boolean A01;
    public final C83674rn A02;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass13S r9 = (AnonymousClass13S) m5o;
        C04220Ms.A0B(r9, 0);
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = (KtCSuperShape0S1200000_I2) this.A00.get(i);
        C83674rn r3 = this.A02;
        boolean z = this.A01;
        C04220Ms.A0B(ktCSuperShape0S1200000_I2, 0);
        ImageUrl imageUrl = (ImageUrl) ktCSuperShape0S1200000_I2.A01;
        String str = ktCSuperShape0S1200000_I2.A02;
        CircularImageView circularImageView = r9.A03;
        if (imageUrl != null) {
            circularImageView.setUrl(imageUrl, new C15720rm("NullAnalyticsModule"));
        } else {
            C18180wK.A0r(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        TextView textView = r9.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        AnonymousClass0wJ.A18(r9.itemView, 145, r3, ktCSuperShape0S1200000_I2);
        View view = r9.A00;
        AnonymousClass0wJ.A18(view, 146, r3, ktCSuperShape0S1200000_I2);
        C18210wN.A0y(view);
        View view2 = r9.A01;
        if (z) {
            view2.setVisibility(8);
        } else {
            AnonymousClass0wJ.A18(view2, 147, r3, ktCSuperShape0S1200000_I2);
        }
    }

    public AnonymousClass113(C83674rn r2) {
        this.A02 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1614273418);
        int size = this.A00.size();
        C14030oh.A0A(-1173568651, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass13S(C18220wO.A0I(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_one_tap_user, C18200wM.A1Y(viewGroup)));
    }
}
