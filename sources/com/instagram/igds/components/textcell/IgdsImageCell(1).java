package com.instagram.igds.components.textcell;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C09860go;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C306122d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.base.IgRadioButton;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsImageCell extends LinearLayout {
    public final FrameLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final IgCheckBox A03;
    public final IgRadioButton A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgSwitch A07;
    public final View A08;
    public final TextView A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsImageCell(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    public static /* synthetic */ void A00(C306122d r9, IgdsImageCell igdsImageCell, Integer num) {
        int i;
        int i2;
        IDxCListenerShape201S0100000_1_I2 iDxCListenerShape201S0100000_1_I2 = null;
        C04220Ms.A0B(r9, 0);
        FrameLayout frameLayout = igdsImageCell.A00;
        frameLayout.setOnClickListener((View.OnClickListener) null);
        IgSwitch igSwitch = igdsImageCell.A07;
        igSwitch.setVisibility(8);
        IgCheckBox igCheckBox = igdsImageCell.A03;
        igCheckBox.setVisibility(8);
        IgRadioButton igRadioButton = igdsImageCell.A04;
        igRadioButton.setVisibility(8);
        IgImageView igImageView = igdsImageCell.A05;
        igImageView.setVisibility(8);
        int ordinal = r9.ordinal();
        if (ordinal == 0) {
            igSwitch.setVisibility(0);
            frameLayout.setVisibility(0);
            i = 466;
            iDxCListenerShape201S0100000_1_I2 = C18190wL.A0H(igdsImageCell, i);
        } else if (ordinal == 1) {
            igRadioButton.setVisibility(0);
            frameLayout.setVisibility(0);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                igImageView.setVisibility(0);
                frameLayout.setVisibility(0);
                i2 = R.drawable.instagram_chevron_right_pano_outline_16;
            } else if (ordinal == 4) {
                igImageView.setVisibility(0);
                frameLayout.setVisibility(0);
                if (num != null) {
                    i2 = num.intValue();
                }
            } else {
                return;
            }
            igImageView.setImageResource(i2);
        } else {
            igCheckBox.setVisibility(0);
            frameLayout.setVisibility(0);
            if (igCheckBox.isEnabled()) {
                i = 467;
                iDxCListenerShape201S0100000_1_I2 = C18190wL.A0H(igdsImageCell, i);
            } else {
                return;
            }
        }
        frameLayout.setOnClickListener(iDxCListenerShape201S0100000_1_I2);
    }

    public final void A01(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        if (charSequence.length() > 0) {
            this.A09.setText(charSequence);
            return;
        }
        throw C18190wL.A0a("You must specify non-empty primary text.");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A07.setEnabled(z);
        this.A04.setEnabled(z);
        this.A03.setEnabled(z);
        float f = 1.0f;
        this.A05.setAlpha(C18230wP.A00(z ? 1 : 0));
        this.A09.setAlpha(C18230wP.A00(z));
        this.A01.setAlpha(C18230wP.A00(z));
        this.A02.setAlpha(C18230wP.A00(z));
        IgImageView igImageView = this.A06;
        if (!z) {
            f = 0.3f;
        }
        igImageView.setAlpha(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsImageCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        View inflate = LinearLayout.inflate(getContext(), R.layout.igds_imagecell_layout, this);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (inflate.getId() == -1) {
            inflate.setId(View.generateViewId());
        }
        C09860go.A0d(inflate, R.dimen.abc_floating_window_z, R.dimen.abc_button_padding_horizontal_material, R.dimen.abc_floating_window_z, R.dimen.abc_button_padding_horizontal_material);
        this.A08 = inflate;
        this.A09 = (TextView) AnonymousClass0wJ.A0I(inflate, R.id.title_text);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(inflate, R.id.subtitle_text);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(inflate, R.id.supporting_text);
        this.A06 = (IgImageView) AnonymousClass0wJ.A0I(inflate, R.id.igds_imagecell_image);
        this.A00 = (FrameLayout) AnonymousClass0wJ.A0I(inflate, R.id.imagecell_add_on_button_container);
        this.A07 = (IgSwitch) AnonymousClass0wJ.A0I(inflate, R.id.igds_imagecell_switch);
        this.A04 = (IgRadioButton) AnonymousClass0wJ.A0I(inflate, R.id.igds_imagecell_radio);
        this.A03 = (IgCheckBox) AnonymousClass0wJ.A0I(inflate, R.id.igds_imagecell_checkbox);
        this.A05 = (IgImageView) AnonymousClass0wJ.A0I(inflate, R.id.igds_imagecell_chevron);
    }

    public /* synthetic */ IgdsImageCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
