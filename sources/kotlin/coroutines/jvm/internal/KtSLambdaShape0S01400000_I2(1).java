package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1YL;
import X.AnonymousClass1p7;
import X.AnonymousClass1p8;
import X.AnonymousClass1p9;
import X.AnonymousClass2O1;
import X.C04220Ms;
import X.C146958n9;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C19340zi;
import X.C25578DoE;
import X.C34640IcN;
import X.C39142Kno;
import X.C61553Tw;
import X.C83224qz;
import X.C86094wG;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsImageCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;

public class KtSLambdaShape0S01400000_I2 extends C39142Kno implements AnonymousClass0YP {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public final int A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S01400000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, C146958n9 r15, int i) {
        super(2, r15);
        this.A0E = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A08 = obj4;
        this.A0A = obj5;
        this.A09 = obj6;
        this.A07 = obj7;
        this.A06 = obj8;
        this.A0D = obj9;
        this.A02 = obj10;
        this.A0C = obj11;
        this.A0B = obj12;
        this.A00 = obj13;
    }

    public final C146958n9 create(Object obj, C146958n9 r19) {
        int i;
        int i2 = this.A0E;
        Object obj2 = this.A05;
        Object obj3 = this.A01;
        Object obj4 = this.A03;
        Object obj5 = this.A08;
        Object obj6 = this.A0A;
        Object obj7 = this.A09;
        Object obj8 = this.A07;
        Object obj9 = this.A06;
        Object obj10 = this.A0D;
        Object obj11 = this.A02;
        Object obj12 = this.A0C;
        Object obj13 = this.A0B;
        Object obj14 = this.A00;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape0S01400000_I2 ktSLambdaShape0S01400000_I2 = new KtSLambdaShape0S01400000_I2(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, r19, i);
        ktSLambdaShape0S01400000_I2.A04 = obj;
        return ktSLambdaShape0S01400000_I2;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A0E;
        AnonymousClass0OU.A00(obj);
        if (i != 0) {
            AnonymousClass2O1 r5 = (AnonymousClass2O1) this.A04;
            if (r5 instanceof AnonymousClass1p9) {
                C34640IcN icN = (C34640IcN) this.A05;
                ((View) this.A03).setVisibility(8);
                ((View) this.A01).setVisibility(0);
                IgdsImageCell igdsImageCell = (IgdsImageCell) this.A08;
                AnonymousClass1p9 r52 = (AnonymousClass1p9) r5;
                String str = r52.A0B;
                boolean z = r52.A0F;
                String str2 = r52.A08;
                String str3 = r52.A09;
                int i2 = 2131833810;
                if (z) {
                    i2 = 2131832786;
                }
                if (str != null) {
                    igdsImageCell.A01(str);
                }
                String A0k = AnonymousClass0wJ.A0k(icN.requireContext(), i2);
                Locale locale = Locale.getDefault();
                C04220Ms.A06(locale);
                String A0u = C18220wO.A0u(locale, A0k);
                int length = A0u.length();
                TextView textView = igdsImageCell.A02;
                if (length == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(A0u);
                    textView.setVisibility(0);
                }
                if (str3 != null) {
                    SimpleImageUrl A0K = C18250wR.A0K(str3);
                    float dimension = igdsImageCell.getResources().getDimension(R.dimen._self_serve_linking_artist_avatar_search_size);
                    IgImageView igImageView = igdsImageCell.A06;
                    int i3 = (int) dimension;
                    igImageView.getLayoutParams().height = i3;
                    igImageView.getLayoutParams().width = i3;
                    igImageView.requestLayout();
                    igImageView.setUrl(A0K, icN);
                } else {
                    if (str2 == null || str2.length() == 0) {
                        str2 = "😀";
                    }
                    Bitmap A012 = C25578DoE.A01(str2, AnonymousClass0wJ.A0B(icN).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size), AnonymousClass0wJ.A0B(icN).getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge_plus), C18250wR.A00(AnonymousClass0wJ.A0B(icN)));
                    if (A012 != null) {
                        igdsImageCell.A06.setImageBitmap(A012);
                    }
                }
                Context requireContext = icN.requireContext();
                TextView textView2 = (TextView) this.A0A;
                ImageView imageView = (ImageView) this.A09;
                String str4 = r52.A06;
                List list = r52.A0D;
                AnonymousClass0wJ.A1O(textView2, imageView);
                C04220Ms.A0B("event_sticker_bottom_sheet_fragment", 5);
                if (str4 != null) {
                    textView2.setText(C61553Tw.A00.A00(requireContext, str4));
                }
                imageView.setImageDrawable(C25578DoE.A02(requireContext, "event_sticker_bottom_sheet_fragment", list));
                IgdsListCell igdsListCell = (IgdsListCell) this.A07;
                String str5 = r52.A05;
                IgdsListCell igdsListCell2 = (IgdsListCell) this.A06;
                String str6 = r52.A04;
                int A022 = C18200wM.A02(0, igdsListCell, igdsListCell2);
                if (!(str5 == null || str5.length() == 0)) {
                    igdsListCell.A0H(str5);
                    igdsListCell.setVisibility(0);
                }
                if (!(str6 == null || str6.length() == 0)) {
                    igdsListCell2.A0H(str6);
                    igdsListCell2.setVisibility(0);
                }
                Context requireContext2 = icN.requireContext();
                View view = (View) this.A0D;
                TextView textView3 = (TextView) this.A02;
                ImageView imageView2 = (ImageView) this.A0C;
                View view2 = (View) this.A0B;
                String str7 = r52.A07;
                List list2 = r52.A0E;
                C04220Ms.A0B(view, 1);
                C04220Ms.A0B(textView3, A022);
                AnonymousClass0wJ.A1R(imageView2, view2);
                if (str7 != null) {
                    textView3.setText(C61553Tw.A00.A00(requireContext2, str7));
                }
                imageView2.setImageDrawable(C25578DoE.A02(requireContext2, "event_sticker_bottom_sheet_fragment", list2));
                view2.setVisibility(8);
                view.setVisibility(0);
                C18210wN.A15(icN, (IgdsBottomButtonLayout) this.A00, C25578DoE.A00(r52.A00));
            } else if (!(r5 instanceof AnonymousClass1p8) && (r5 instanceof AnonymousClass1p7)) {
                ((View) this.A03).setVisibility(0);
                ((View) this.A01).setVisibility(8);
            }
        } else {
            AnonymousClass1YL r3 = (AnonymousClass1YL) this.A05;
            C86094wG r1 = ((C19340zi) r3.A02.getValue()).A01;
            C18230wP.A1T(new KtSLambdaShape0S01400000_I2(r3, this.A01, this.A03, this.A08, this.A0A, this.A09, this.A07, this.A06, this.A0D, this.A02, this.A0C, this.A0B, this.A00, (C146958n9) null, 1), (C83224qz) this.A04, r1);
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S01400000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
