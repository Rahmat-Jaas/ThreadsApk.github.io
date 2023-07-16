package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.115  reason: invalid class name */
public final class AnonymousClass115 extends C41030Luu {
    public List A00 = AnonymousClass0wJ.A0v();
    public final C11630kW A01;
    public final C22491Yh A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = (KtCSuperShape0S0110000_I2) this.A00.get(i);
        C201513i r11 = (C201513i) m5o;
        int i2 = 0;
        C04220Ms.A0B(ktCSuperShape0S0110000_I2, 0);
        User user = (User) ktCSuperShape0S0110000_I2.A00;
        IgTextView igTextView = r11.A04;
        igTextView.setText(user.BK7());
        boolean BZi = user.BZi();
        String BK7 = user.BK7();
        if (BZi) {
            SpannableStringBuilder A0E = C18200wM.A0E(BK7);
            C63563ho.A03(igTextView.getContext(), A0E, true);
            igTextView.setText(A0E);
        } else {
            igTextView.setText(BK7);
        }
        IgTextView igTextView2 = r11.A05;
        igTextView2.setText(user.Ak2());
        CircularImageView circularImageView = r11.A01;
        ImageUrl B4M = user.B4M();
        AnonymousClass115 r4 = r11.A06;
        circularImageView.setUrl(B4M, r4.A01);
        boolean z = ktCSuperShape0S0110000_I2.A01;
        ImageView imageView = r11.A00;
        if (z) {
            imageView.setImageDrawable(C19557AyI.A04(r11.A03.getContext(), R.drawable.close_friends_star_small, 2));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        AnonymousClass0wJ.A18(igTextView, 196, r4, user);
        AnonymousClass0wJ.A18(igTextView2, 197, r4, user);
        AnonymousClass0wJ.A18(circularImageView, 198, r4, user);
        AnonymousClass0wJ.A18(r11.A02, 199, r4, user);
    }

    public AnonymousClass115(C11630kW r2, C22491Yh r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(563238730);
        int size = this.A00.size();
        C14030oh.A0A(-2142133776, A03);
        return size;
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C201513i(C18220wO.A0I(C18180wK.A0C(viewGroup), viewGroup, R.layout.birthday_center_user_item, C18200wM.A1Y(viewGroup)), this);
    }
}
