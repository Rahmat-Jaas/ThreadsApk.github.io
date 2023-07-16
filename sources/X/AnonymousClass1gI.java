package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.FxAccountInfo;
import java.util.Locale;

/* renamed from: X.1gI  reason: invalid class name */
public final class AnonymousClass1gI extends AnonymousClass436 {
    public final Context A00;
    public final C11630kW A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A5K(0);
        }
    }

    public AnonymousClass1gI(Context context, C11630kW r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int i3;
        int A03 = C14030oh.A03(-1784195350);
        int A02 = C18200wM.A02(1, view, obj);
        Context context = this.A00;
        Object tag = view.getTag();
        if (tag != null) {
            C57463Bd r5 = (C57463Bd) tag;
            FxAccountInfo fxAccountInfo = (FxAccountInfo) obj;
            C11630kW r2 = this.A01;
            C04220Ms.A0B(r5, 1);
            C04220Ms.A0B(fxAccountInfo, A02);
            ImageUrl imageUrl = fxAccountInfo.A00;
            if (AnonymousClass3WG.A02(imageUrl)) {
                C18180wK.A0r(context, r5.A02, R.drawable.profile_anonymous_user);
            } else if (imageUrl != null) {
                r5.A02.setUrl(imageUrl, r2);
            }
            IgTextView igTextView = r5.A01;
            String str = fxAccountInfo.A03;
            if (str != null) {
                igTextView.setText(str);
                String str2 = fxAccountInfo.A02;
                if (str2 != null) {
                    FxcalAccountType fxcalAccountType = FxcalAccountType.FACEBOOK;
                    String valueOf = String.valueOf(str2);
                    String obj3 = fxcalAccountType.toString();
                    Locale locale = Locale.ROOT;
                    if (C18190wL.A0r(locale, obj3).equals(C18190wL.A0r(locale, valueOf))) {
                        i2 = R.drawable.fb_badge_color_logo;
                        i3 = 2131826983;
                    } else {
                        if (C18190wL.A0r(locale, FxcalAccountType.INSTAGRAM.toString()).equals(C18190wL.A0r(locale, String.valueOf(fxAccountInfo.A02)))) {
                            i2 = R.drawable.ig_badge_color_logo;
                            i3 = R.string.f0nameremoved;
                        }
                    }
                    C18180wK.A0r(context, r5.A03, i2);
                    r5.A00.setText(i3);
                }
                C14030oh.A0A(1158173990, A03);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A0A(1181593000, A03);
        throw A0b;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-1700252621, viewGroup);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.account_row, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        inflate.setTag(new C57463Bd(inflate));
        C14030oh.A0A(1084354934, A002);
        return inflate;
    }
}
