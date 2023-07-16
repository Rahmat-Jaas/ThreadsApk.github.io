package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;
import java.util.List;

/* renamed from: X.71q  reason: invalid class name and case insensitive filesystem */
public final class C1186271q {
    public static final void A00(C89085Bv r2, C131827ss r3) {
        KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2 = r3.A00;
        if (ktCSuperShape0S3310000_I2.A04 == null && ktCSuperShape0S3310000_I2.A05 == null) {
            r2.A09.setVisibility(8);
            return;
        }
        ClickableTextContainer clickableTextContainer = r2.A09;
        clickableTextContainer.setVisibility(0);
        Resources resources = clickableTextContainer.getResources();
        boolean z = ktCSuperShape0S3310000_I2.A06;
        int i = R.dimen.abc_button_inset_vertical_material;
        if (z) {
            i = R.dimen.abc_action_bar_elevation_material;
        }
        C09860go.A0X(clickableTextContainer, resources.getDimensionPixelSize(i));
        int i2 = R.dimen.abc_button_padding_horizontal_material;
        if (z) {
            i2 = R.dimen.abc_action_bar_elevation_material;
        }
        C09860go.A0W(clickableTextContainer, resources.getDimensionPixelSize(i2));
    }

    public static final void A01(C89085Bv r7, C131827ss r8, boolean z) {
        View view;
        int i;
        int i2;
        boolean A1V = C18210wN.A1V(r8);
        if (z) {
            C86104wH.A1C(r7.itemView, 155, r8);
            C86164wN.A1A(r7.itemView, 7, r7);
            A00(r7, r8);
            KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2 = r8.A00;
            String str = ktCSuperShape0S3310000_I2.A04;
            if (str != null) {
                TextView textView = r7.A04;
                textView.setVisibility(A1V);
                textView.setText(str);
            } else {
                r7.A04.setVisibility(8);
            }
            String str2 = ktCSuperShape0S3310000_I2.A05;
            if (str2 != null) {
                TextView textView2 = r7.A05;
                textView2.setVisibility(A1V);
                textView2.setText(str2);
                return;
            }
            view = r7.A05;
        } else {
            r7.itemView.setVisibility(A1V ? 1 : 0);
            C86104wH.A1C(r7.itemView, 155, r8);
            C86164wN.A1A(r7.itemView, 7, r7);
            KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I22 = r8.A00;
            Object obj = ktCSuperShape0S3310000_I22.A01;
            ImageUrl imageUrl = (ImageUrl) obj;
            IgImageView igImageView = r7.A07;
            if (imageUrl == null) {
                igImageView.setVisibility(8);
            } else {
                igImageView.setVisibility(A1V);
                igImageView.setUrl(imageUrl, r8.A01.A00);
            }
            List list = (List) ktCSuperShape0S3310000_I22.A00;
            boolean isEmpty = list.isEmpty();
            ThumbnailView thumbnailView = r7.A0A;
            if (isEmpty) {
                thumbnailView.setVisibility(8);
            } else {
                thumbnailView.setVisibility(A1V);
                thumbnailView.setGridImages(list, r8.A01.A00);
            }
            List list2 = (List) ktCSuperShape0S3310000_I22.A02;
            boolean isEmpty2 = list2.isEmpty();
            TransitionCarouselImageView transitionCarouselImageView = r7.A08;
            if (isEmpty2) {
                transitionCarouselImageView.setVisibility(8);
            } else {
                transitionCarouselImageView.setVisibility(A1V);
                transitionCarouselImageView.setUrls(list2);
                r8.A01.A02.invoke(transitionCarouselImageView);
            }
            A00(r7, r8);
            String str3 = ktCSuperShape0S3310000_I22.A04;
            if (str3 != null) {
                TextView textView3 = r7.A04;
                textView3.setVisibility(A1V);
                textView3.setText(str3);
            } else {
                r7.A04.setVisibility(8);
            }
            String str4 = ktCSuperShape0S3310000_I22.A05;
            if (str4 != null) {
                TextView textView4 = r7.A05;
                textView4.setVisibility(A1V);
                textView4.setText(str4);
            } else {
                r7.A05.setVisibility(8);
            }
            String str5 = ktCSuperShape0S3310000_I22.A03;
            TextView textView5 = r7.A03;
            if (str5 != null) {
                i2 = 0;
                textView5.setVisibility(A1V);
                textView5.setText(str5);
            } else {
                i2 = 8;
                textView5.setVisibility(8);
            }
            r7.A02.setVisibility(i2);
            if (obj != null || !list.isEmpty() || !list2.isEmpty()) {
                view = r7.A00;
            } else {
                view = r7.A00;
                i = 0;
                view.setVisibility(i);
            }
        }
        i = 8;
        view.setVisibility(i);
    }
}
